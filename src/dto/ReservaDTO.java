/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author josec
 */
public class ReservaDTO {
    private String datahoraentrada;
    private String datahorasaida;
    private float preco;
    private int nhospedes;

    /**
     * @return the datahoraentrada
     */
    public String getDatahoraentrada() {
        return datahoraentrada;
    }

    /**
     * @param datahoraentrada the datahoraentrada to set
     */
    public void setDatahoraentrada(String datahoraentrada) {
        this.datahoraentrada = datahoraentrada;
    }

    /**
     * @return the datahorasaida
     */
    public String getDatahorasaida() {
        return datahorasaida;
    }

    /**
     * @param datahorasaida the datahorasaida to set
     */
    public void setDatahorasaida(String datahorasaida) {
        this.datahorasaida = datahorasaida;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the nhospedes
     */
    public int getNhospedes() {
        return nhospedes;
    }

    /**
     * @param nhospedes the nhospedes to set
     */
    public void setNhospedes(int nhospedes) {
        this.nhospedes = nhospedes;
    }
    
    
}
