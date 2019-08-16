/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import dominio.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aline
 */
public class ListaFuncionarios implements Lista{
    
    List<Funcionario> funcionarios;
    
    public ListaFuncionarios(){
        funcionarios = new ArrayList();
    }
    
    public void incluir(Funcionario f){
        funcionarios.add(f);
    }
    
    public String listar(){
        String dados = "";
        for(Funcionario f : funcionarios){
            dados += f.toString() +"\n";
        }
        return dados;
    }

    
    
    
}
