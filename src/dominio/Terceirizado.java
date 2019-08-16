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
public class Terceirizado extends Tecnico{
    private String empresa;
    
    public Terceirizado(String n){
        super(n);
        empresa = "";
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Empresa: "+ empresa + "\n";
    }
}
