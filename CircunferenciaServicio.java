package Ejercicio2;


import java.util.Scanner;

public class CircunferenciaServicio {
    public void crearcircunferencia(Circunferencia circunferencia){
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese radio");
        circunferencia.setradio(scan.nextDouble()); 
      
    }
    public void perimetro (Circunferencia circunferencia){
        double perimetro = 2* Math.PI * circunferencia.getradio();
        System.out.println("El perímetro de la circunferencia es:  " + perimetro);
        
    }
    
    public void area(Circunferencia circunferencia){
        double area = Math.PI * Math.pow(circunferencia.getradio(), 2);
        System.out.println("El área de la circunferencia es:  " + area);
        
    }   
   
}
