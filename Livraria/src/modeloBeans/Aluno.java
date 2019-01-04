/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author davijp
 */
public class Aluno {

   /**
    * @return the pesquisa
    */
   public String getPesquisa() {
      return pesquisa;
   }

   /**
    * @param pesquisa the pesquisa to set
    */
   public void setPesquisa(String pesquisa) {
      this.pesquisa = pesquisa;
   }

   /**
    * @return the numero_ra
    */
   public Integer getNumero_ra() {
      return numero_ra;
   }

   /**
    * @param numero_ra the numero_ra to set
    */
   public void setNumero_ra(Integer numero_ra) {
      this.numero_ra = numero_ra;
   }

   /**
    * @return the codigo
    */
   public Integer getCodigo() {
      return codigo;
   }

   /**
    * @param codigo the codigo to set
    */
   public void setCodigo(Integer codigo) {
      this.codigo = codigo;
   }

   /**
    * @return the nome
    */
   public String getNome() {
      return nome;
   }

   /**
    * @param nome the nome to set
    */
   public void setNome(String nome) {
      this.nome = nome;
   }

   /**
    * @return the curso
    */
   public String getCurso() {
      return curso;
   }

   /**
    * @param curso the curso to set
    */
   public void setCurso(String curso) {
      this.curso = curso;
   }

   /**
    * @return the estado
    */
   public String getEstado() {
      return estado;
   }

   /**
    * @param estado the estado to set
    */
   public void setEstado(String estado) {
      this.estado = estado;
   }

   private Integer codigo;
   private String nome;
   private String curso;
   private String estado;
   private Integer numero_ra;
   private String pesquisa;
}
