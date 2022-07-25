/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetobicicleta.model;

/**
 *
 * @author Win 10
 */
public class Produto {
    
    private Integer idProduto;
    private String estoque;
    private String unidade;

    public Produto() {
    }

    public Produto(Integer idProduto, String estoque, String unidade) {
        this.idProduto = idProduto;
        this.estoque = estoque;
        this.unidade = unidade;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
}
