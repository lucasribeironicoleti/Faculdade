/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetoproduto.model;

/**
 *
 * @author Human
 */
public class TipoCarro {
    
    private Integer idTipoCarro;
    private String nomeTipoCarro;

    public TipoCarro() {
    }

    public TipoCarro(Integer idTipoCarro) {
        this.idTipoCarro = idTipoCarro;
    }

    public TipoCarro(Integer idTipoCarro, String nomeTipoCarro) {
        this.idTipoCarro = idTipoCarro;
        this.nomeTipoCarro = nomeTipoCarro;
    }

    public Integer getIdTipoCarro() {
        return idTipoCarro;
    }

    public void setIdTipoCarro(Integer idTipoCarro) {
        this.idTipoCarro = idTipoCarro;
    }

    public String getNomeTipoCarro() {
        return nomeTipoCarro;
    }

    public void setNomeTipoCarro(String nomeTipoCarro) {
        this.nomeTipoCarro = nomeTipoCarro;
    }
    
}
