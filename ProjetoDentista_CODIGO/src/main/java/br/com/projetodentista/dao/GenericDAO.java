/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetodentista.dao;

/**
 *
 * @author Lucas
 */
import java.util.List;

public interface GenericDAO {
    
    public Boolean cadastrar(Object object);
    public List<Object> listar();  
}