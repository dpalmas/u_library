package modeloDao;

import modeloConnection.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.Aluno;

public class DaoAluno
{
    ConexaoDB conexao = new ConexaoDB();
    Aluno modelo = new Aluno();

    public void Salvar(Aluno modelo)
    {
        conexao.conexao();
        try
        {
            PreparedStatement pst = conexao.connection.prepareStatement("insert into Alunos(Nome,"
                    + "Curso, Estado, NumeroRA) values(?,?,?,?)");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getCurso());
            pst.setString(3, modelo.getEstado());
            pst.setInt(4, modelo.getNumero_ra());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\nErro:" + ex);
        }
        conexao.desconecta();
    }

    public void Editar(Aluno modelo)
    {
        conexao.conexao();
        try
        {
            PreparedStatement pst = conexao.connection.prepareStatement("update Alunos set Nome = ?, Curso = ?, Estado = ?, "
                    + "NumeroRA = ? where AlunoID = ?");
            pst.setString(1, modelo.getNome());
            pst.setString(2, modelo.getCurso());
            pst.setString(3, modelo.getEstado());
            pst.setInt(4, modelo.getNumero_ra());
            pst.setInt(5, modelo.getCodigo());
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Dados alterados com sucesso!");
        }
        catch (SQLException ex)
        {
            JOptionPane.showConfirmDialog(null, "Erro na alteração dos dados!\nErro:" + ex);
        }

        conexao.desconecta();
    }

    public void Excluir(Aluno modelo)
    {
        conexao.conexao();
        try
        {
            PreparedStatement pst = conexao.connection.prepareStatement("delete from Alunos where AlunoID = ?");
            pst.setInt(1, modelo.getCodigo());
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Dados excluídos com sucesso!");
        }
        catch (SQLException ex)
        {
            JOptionPane.showConfirmDialog(null, "Erro ao excluir dados!\nErro:" + ex);
        }
        conexao.desconecta();
    }

    public Aluno buscaAluno(Aluno modelo)
    {
        conexao.conexao();
        conexao.executaSQL("select * from Alunos where Nome like'%" +
                modelo.getPesquisa() + "%'");
        try
        {

            conexao.resultset.first();
            modelo.setEstado(conexao.resultset.getString("Estado"));
            modelo.setNome(conexao.resultset.getString("Nome"));
            modelo.setCurso(conexao.resultset.getString("Curso"));
            modelo.setCodigo(conexao.resultset.getInt("AlunoID"));
            modelo.setNumero_ra(conexao.resultset.getInt("NumeroRA"));
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar aluno!\nErro:" + ex);
        }
        conexao.desconecta();
        return modelo;
    }
}
