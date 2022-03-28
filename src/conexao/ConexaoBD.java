/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;

public class ConexaoBD {
    public static String server = "localhost";
    public static String bd = "db_syshotel";
    public static String username = "root";
    public static String senha = "";
    Connection conexao;

   public void conectar() throws SQLException{
      
        try {
            //Class.forName(driver);
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://"+server+"/"+bd+"?user="+username+"&password="+senha);
            this.conexao = con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro em ConexaoBD: "+e);
        }
   
   }
   public ResultSet consultar(String query) throws SQLException{
        Statement ps;
        ps = this.conexao.createStatement();
        ResultSet rs = ps.executeQuery(query);
        return rs;
   }
}
