/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package02;

/**
 *
 * @author USUARIO 2020
 */
public class Ciudad {
    private String nombreC;
    private String provinciaC;
    
    public Ciudad(String nbc, String prC){
        nombreC = nbc;
        provinciaC = prC;
    }
    
    public void establecerNombreC(String e){
        nombreC = e;
    }
    public void establecerProvinciaC(String e){
        provinciaC = e;
    }
    //---------------------------------------------
    public String obtenerNombreC(){
        return nombreC;
    }
    public String obtenerProvinciaC(){
        return provinciaC;
    }
}
