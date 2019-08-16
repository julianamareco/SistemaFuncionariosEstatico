/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Aline
 */
public class Docente extends Funcionario{
    
    private float rt;

    public Docente(String n){
        super(n);
        rt = 0;
    }
    
    @Override
    public float getSalarioLiquido() {
        return salarioBase + rt;
    }

    /**
     * @return the rt
     */
    public float getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(float rt) {
        this.rt = rt;
    }
    
    @Override
    public String toString(){
        return super.toString() + "RT: "+ rt +"\n";
    }
    
}
