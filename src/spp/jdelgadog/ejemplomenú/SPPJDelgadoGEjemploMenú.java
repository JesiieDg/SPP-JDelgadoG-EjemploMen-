/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.ejemplomenú;
import java.util.Scanner; //Cuando pediremos datos por teclado
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGEjemploMenú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada;//variables con minúsculas,SIEMPRE
        Scanner kb=new Scanner (System.in);//Siempre para usar el teclado de la librería
        double lado, resultado;
        //Desplegamos el menú
        System.out.println("Calculadora de áreas,perímetros y volúmenes");
        System.out.println("Introduce la opción deseada");
        System.out.println("1.Calcular áreas");
        System.out.println("2.Calcular perímetros");
        System.out.println("3.Calcular volúmenes");
        System.out.println("4.Salir");
        opEntrada=kb.nextInt();
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                System.out.println("Introduce el lado del cuadrado");
                lado=kb.nextDouble();
                resultado=Math.pow(lado,2);
                System.out.println("El área del cuadrado es "+resultado);
                break;
            case 2:
                  System.out.println("Bienvenido al cálculo de perímetros");
                  System.out.println("Introduce el lado del cuadrado");
                  lado=kb.nextDouble();
                  resultado=lado*4;
                  System.out.println("El perímetro del cuadrado es "+resultado);
                  
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                System.out.println("Introduce el lado del cuadrado");
                lado=kb.nextDouble();
                resultado=Math.pow(lado,3);
                System.out.println("El volúmen del cubo es "+resultado);
                break;
            default:
                System.out.println("Adiós.");
                
        }                
                
        
    }
    
}
