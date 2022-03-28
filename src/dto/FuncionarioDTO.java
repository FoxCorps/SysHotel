/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.ResultSet;
public class FuncionarioDTO {
    private String dataadm;
    private String cpf;
    private String nome;
    private String genero;
    private String datanascimento;
    private int idade;
    private String user;
    private String senha;
    private ResultSet consulta;

    /**
     * @return the dataadm
     */
    public String getDataadm() {
        return dataadm;
    }

    /**
     * @param dataadm the dataadm to set
     */
    public void setDataadm(String dataadm) {
        this.dataadm = dataadm;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the datanascimento
     */
    public String getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the consulta
     */
    public ResultSet getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(ResultSet consulta) {
        this.consulta = consulta;
    }
}
