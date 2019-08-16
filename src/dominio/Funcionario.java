package dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
public abstract class Funcionario {
    protected String nome;
    protected float salarioBase;
    
    public Funcionario(String n){
        nome = n;
        salarioBase = 0;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract float getSalarioLiquido();
    
    @Override
    public String toString(){
        return "Nome: " + nome + "\nSalario Liquido: "+getSalarioLiquido() + "\n";
    }
}
