/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetodentista.model;

/**
 *
 * @author Lucas
 */
public class Dentista {
    private Integer iddentista;
    private String nome_dentista;
    private String telefone;
    private String especialidade;
    private String cro;

    public Dentista() {
    }

    //SET atribui os valores
    //GET retorna os valores
    //variavel contante é uma variavel q nunca muda o valor dela. Exemplo equacao de Pi = 3.14159

    public Dentista(Integer iddentista, String nome_dentista, String telefone, String especialidade, String cro) {
        this.iddentista = iddentista;
        this.nome_dentista = nome_dentista;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.cro = cro;
    }

    /**
     * @return the iddentista
     */
    public Integer getiddentista() {
        return iddentista;
    }

    /**
     * @param iddentista the iddentista to set
     */
    public void setiddentista(Integer iddentista) {
        this.iddentista = iddentista;
    }

    /**
     * @return the nome_dentista
     */
    public String getnome_dentista() {
        return nome_dentista;
    }

    /**
     * @param nome_dentista the nome_dentista to set
     */
    public void setnome_dentista(String nome_dentista) {
        this.nome_dentista = nome_dentista;
    }

    /**
     * @return the telefone
     */
    public String gettelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the especialidade
     */
    public String getespecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setespecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the cro
     */
    public String getcro() {
        return cro;
    }

    /**
     * @param cro the cro to set
     */
    public void setcro(String cro) {
        this.cro = cro;
    }
    
    
}
