/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetobicicleta.model;

/**
 *
 * @author lucas
 */
public class TipoBebida {

    private Integer idtipobebida;
    private String nometipobebida;

    public TipoBebida() {
    }

    public TipoBebida(Integer idtipobebida, String nometipobebida) {
        this.idtipobebida = idtipobebida;
        this.nometipobebida = nometipobebida;
    }

    public Integer getIdtipobebida() {
        return idtipobebida;
    }

    public void setIdtipobebida(Integer idtipobebida) {
        this.idtipobebida = idtipobebida;
    }

    public String getNometipobebida() {
        return nometipobebida;
    }

    public void setNometipobebida(String nometipobebida) {
        this.nometipobebida = nometipobebida;
    }
    
    
}
