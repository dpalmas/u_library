/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConnection;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author davijp
 */
public class ConexaoDB 
{
   public Statement statement;
   public ResultSet resultset;
   private String driver = "com.mysql.jdbc.Driver";
   private String caminho = "jdbc:mysql://localhost:3306/Livraria";
   private String usuario = "root";
   private String senha = "admin";
   public Connection connection;
   
   public void conexao() // metodo responsavel por realizar conexao com o banco de dados
   {
      try {
         System.setProperty("jdbc.Drivers", driver);
         connection = DriverManager.getConnection(caminho, usuario, senha);
         //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!!!");
                 } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao se conectar no banco de dados:\n" + ex);
         
      }
   }
   
   public void executaSQL(String sql)
   {
      try {
         statement = (Statement) connection.createStatement(resultset.TYPE_SCROLL_INSENSITIVE,resultset.CONCUR_READ_ONLY);
         resultset = statement.executeQuery(sql);
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ExecutaSQL:\n" + ex);
      }
   }
   public void desconecta()
   {
      try {
         connection.close();
         //JOptionPane.showMessageDialog(null, "Desconectado do banco de dados com sucesso!!!");
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n" +
                 ex.getMessage());
      }
   }
}
