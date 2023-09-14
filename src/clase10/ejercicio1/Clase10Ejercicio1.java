
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class Clase10Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean condicion= false;
        if (condicion) {
            System.out.println("Condicion Verdadera");
        }
        else{
            System.out.println("Condicion Falsa");
            
        }
        System.out.println("digite un numero del 1 al 4");
        int numero= leer.nextInt();
        String numeroTexto= "Numero desconocido";
        
        if (numero == 1) {
            numeroTexto= "numero uno";
        }
        else if(numero==2){
            numeroTexto= "numero dos";
        }
        else if(numero==3){
            numeroTexto= "numero tres";
        }
        else if(numero==4){
            numeroTexto= "numero cuatro";
        }
        else{
            numeroTexto= "Numero no encontrado";
        }
        System.out.println("NumeroTexto= "+ numeroTexto);
        
    }
    
}
