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
public class MinhaLista implements Lista{
    private Funcionario [] funcionarios;
    private int indice;
    private int MAX_SIZE;

    public MinhaLista(int tamanho){
        funcionarios = new Funcionario[tamanho];
        indice = 0;
        MAX_SIZE = tamanho;
    }
    
    @Override
    public void incluir(Funcionario f) {
        if(indice != MAX_SIZE ){
            funcionarios[indice] = f;
            indice++;
        }
    }

    @Override
    public String listar() {
        String dados = "";
        for(int i =0; i< indice; i++){
            if(funcionarios[i] instanceof Funcionario)
                dados += funcionarios[i].toString() + "\n";
        }
        return dados;
    }
    
}
