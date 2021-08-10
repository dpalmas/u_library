package modeloBeans;

public class Aluno
{

    public String getPesquisa()
    {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa)
    {
        this.pesquisa = pesquisa;
    }

    public Integer getNumero_ra()
    {
        return numero_ra;
    }

    public void setNumero_ra(Integer numero_ra)
    {
        this.numero_ra = numero_ra;
    }

    public Integer getCodigo()
    {
        return codigo;
    }

    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    private Integer codigo;
    private String nome;
    private String curso;
    private String estado;
    private Integer numero_ra;
    private String pesquisa;
}
