/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public class CircunferenciaApp {

    
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        CircunferenciaServicio flor = new CircunferenciaServicio();
        flor.crearcircunferencia(c1);
        flor.perimetro(c1);
        flor.area(c1);
    }    
}
