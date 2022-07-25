/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetobicicleta.model;

/**
 *
 * @author lucas
 */
public class Bebida {
    
    private Integer idbebida;
    private Integer valor;
    private Integer litros;
    private Integer idproduto;
    private Integer idtipobebida;

    public Bebida() {
    }

    public Bebida(Integer idbebida, Integer valor, Integer litros, Integer idproduto, Integer idtipobebida) {
        this.idbebida = idbebida;
        this.valor = valor;
        this.litros = litros;
        this.idproduto = idproduto;
        this.idtipobebida = idtipobebida;
    }

    public Integer getIdbebida() {
        return idbebida;
    }

    public void setIdbebida(Integer idbebida) {
        this.idbebida = idbebida;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getLitros() {
        return litros;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getIdtipobebida() {
        return idtipobebida;
    }

    public void setIdtipobebida(Integer idtipobebida) {
        this.idtipobebida = idtipobebida;
    }
    
    
}
