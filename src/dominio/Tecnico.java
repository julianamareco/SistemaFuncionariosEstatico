/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Funcionario;

/**
 *
 * @author Aline
 */
public class Tecnico extends Funcionario{

    private int nroHorasExtras;
    private float valorHoraExtra;
    public Tecnico(String n) {
        super(n);
        nroHorasExtras = 0;
        valorHoraExtra = 0;
    }

    @Override
    public float getSalarioLiquido() {
        return salarioBase + (nroHorasExtras * valorHoraExtra);
    }

    /**
     * @return the nroHorasExtras
     */
    public int getNroHorasExtras() {
        return nroHorasExtras;
    }

    /**
     * @param nroHorasExtras the nroHorasExtras to set
     */
    public void setNroHorasExtras(int nroHorasExtras) {
        this.nroHorasExtras = nroHorasExtras;
    }

    /**
     * @return the valorHoraExtra
     */
    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    /**
     * @param valorHoraExtra the valorHoraExtra to set
     */
    public void setValorHoraExtra(float valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Numero de Horas Extras: "+ nroHorasExtras + " Valor da Hora Extra:" + valorHoraExtra+"\n";
    }
}
