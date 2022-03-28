/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.FuncionarioDTO;
import conexao.ConexaoBD;
import java.sql.SQLException;
        
public class Login {
    
 FuncionarioDTO funcionariodto = new FuncionarioDTO();
  ConexaoBD conexao = new ConexaoBD();  
  
    public boolean Login(String user, String senha) throws SQLException{
       boolean sessao = false;
       
       
            String query = "select user,senha from tb_funcionario where user='"+user+"' and senha='"+senha+"'";
       conexao.conectar();
       
        funcionariodto.setConsulta(conexao.consultar(query));
       if( funcionariodto.getConsulta()!=null){
           
           while(funcionariodto.getConsulta().next()){
            funcionariodto.setUser( funcionariodto.getConsulta().getString(1));
             funcionariodto.setSenha( funcionariodto.getConsulta().getString(2));
            sessao=true;
       
                
           }
       }
     return sessao;
        
    
           
       }
    
}


