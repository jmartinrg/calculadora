/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author usuario
 */
public class calculadora {
        // Atributos de la clase 
   private double numero1;
   private double numero2;
   private String marca;
   private String modelo;
     
    
    // M�todos de la clase
    // Constructor por defecto
    
    public calculadora (double num1, double num2, String marca, String modelo ){
        this.numero1=num1;
        this.numero2=num2;
        this.marca=marca;
        this.modelo=modelo;
        
    }
     // Constructor sobrecargado
    public calculadora(String marca, String modelo ){
        this.marca=marca;
        this.modelo=modelo;
    }
    // Constructor sobrecargado
    public calculadora(){
        
    }
    
}
