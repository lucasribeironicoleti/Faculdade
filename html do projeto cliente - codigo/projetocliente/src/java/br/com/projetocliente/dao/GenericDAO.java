

package br.com.projetocliente.dao;

import java.util.List;

public interface GenericDAO {
    
    public Boolean cadastrar(Object object);
    public List<Object> listar();
    public Boolean excluir(int idObject);    
    public Boolean carregar(int idObject);    
    public Boolean alterar(Object Object);    
}
