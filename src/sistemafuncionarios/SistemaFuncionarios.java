/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import dominio.Terceirizado;
import dominio.Tecnico;
import dominio.Docente;

/**
 *
 * @author Aline
 */
public class SistemaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista listaFuncionarios = new MinhaLista(10);
        
        Docente d1 = new Docente("Aline");
        d1.setRt(1000);
        d1.setSalarioBase(3000);
        listaFuncionarios.incluir(d1);
        
        Docente d2 = new Docente("Amanda");
        d2.setRt(3000);
        d2.setSalarioBase(4000);
        listaFuncionarios.incluir(d2);
        
        Docente d3 = new Docente("Alice");
        d3.setRt(3000);
        d3.setSalarioBase(3000);
        listaFuncionarios.incluir(d3);
        
        Tecnico t1 = new Tecnico("Gustavo");
        t1.setNroHorasExtras(100);
        t1.setValorHoraExtra(30);
        t1.setSalarioBase(2000);
        listaFuncionarios.incluir(t1);
        
        Terceirizado t2 = new Terceirizado("Rose");
        t2.setNroHorasExtras(10);
        t2.setValorHoraExtra(10);
        t2.setSalarioBase(1000);
        t2.setEmpresa("Empresa ABC");
        listaFuncionarios.incluir(t2);
        
        System.out.println("Lista Funcionarios\n"+listaFuncionarios.listar());
    }
    
}
