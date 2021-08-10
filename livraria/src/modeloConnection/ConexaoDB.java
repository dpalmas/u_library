package modeloConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDB
{
    public Statement statement;
    public ResultSet resultset;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/Livraria";
    private String usuario = "administrator";
    private String senha = "U1ibr@ry";
    public Connection connection;

    public void conexao()
    {
        try
        {
            System.setProperty("jdbc.Drivers", driver);
            connection = DriverManager.getConnection(caminho, usuario, senha);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar no banco de dados:\n" + ex);

        }
    }

    public void executaSQL(String sql)
    {
        try
        {
            statement = (Statement) connection.createStatement(resultset.TYPE_SCROLL_INSENSITIVE, resultset.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSQL:\n" + ex);
        }
    }

    public void desconecta()
    {
        try
        {
            connection.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n" +
                    ex.getMessage());
        }
    }
}
