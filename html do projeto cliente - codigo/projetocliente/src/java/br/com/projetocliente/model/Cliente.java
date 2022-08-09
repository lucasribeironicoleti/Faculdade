package br.com.projetocliente.model;

public class Cliente {
    private Integer idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private Double rendaCliente;

    public Cliente() {
    }

    //SET atribui os valores
    //GET retorna os valores
    //variavel contante é uma variavel q nunca muda o valor dela. Exemplo equacao de Pi = 3.14159
    public Cliente(Integer idCliente, String nomeCliente, String cpfCliente, String enderecoCliente, Double rendaCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.rendaCliente = rendaCliente;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idProduto to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomecliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the cpfcliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the marcaProduto to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    /**
     * @return the enderecoCliente
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     * @param enderecoClient the modeloProduto to set
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     * @return the rendaCliente
     */
    public Double getRendaCliente() {
        return rendaCliente;
    }

    /**
     * @param rendaCliente the rendaCliente to set
     */
    public void setRendaCliente(Double rendaCliente) {
        this.rendaCliente = rendaCliente;
    }
    
    
}
