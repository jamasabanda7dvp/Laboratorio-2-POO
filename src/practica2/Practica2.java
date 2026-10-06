/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int n;
        double valora,subtotal = 0,total = 0;
        
        System.out.print("Ingrese el numero de articulos:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrse el precio del producto "+(i+1)+":");
            valora = sc.nextDouble();
            subtotal += valora;
        }
        if (subtotal >= 300){
            total = subtotal * 0.85;
            System.out.println("Subtotal:"+(subtotal));
            System.out.println("Descuento del 15%");
            System.out.println("total: "+(total));
        }else if (subtotal >= 200){
            total = subtotal * 0.90;
            System.out.println("Subtotal:"+(subtotal));
            System.out.println("Descuento del 10%");
            System.out.println("total: "+(total));
        }else if (subtotal >= 100){
            total = subtotal * 0.95;
            System.out.println("Subtotal:"+(subtotal));
            System.out.println("Descuento del 5%");
            System.out.println("total: "+(total));
        }else{
            total = subtotal;
            System.out.println("No tiene descuento total:"+(total));
        }
        System.out.println("Gracias por comprar");
    }    
}
