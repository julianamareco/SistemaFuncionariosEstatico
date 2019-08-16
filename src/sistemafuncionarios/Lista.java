/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import dominio.Funcionario;

/**
 *
 * @author Aline
 */
public interface Lista {
    
    public void incluir(Funcionario f);
    
    public String listar();
    
}
