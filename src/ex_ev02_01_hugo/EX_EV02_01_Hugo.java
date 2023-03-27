/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_ev02_01_hugo;

/**
 *
 * @author HUGO MARTIN MORALES DAM1B
 */
import java.util.Arrays;
import java.util.Scanner;
public class EX_EV02_01_Hugo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {2, 5, 5, -3, 0}; //creamos la tabla
        int ignorados = rellenarPares(t); //rellenamos los numeros pares
        //Indicamos el número total de número impares
        System.out.println("El número total de impares es de: " + ignorados);
        //mostramos la tabla
        System.out.println(Arrays.toString(t));
    }
    
    // los pares se guardan en la tabla, ignora los impares
    static int rellenarPares(int pares[]){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int imparesIgnorados = 0;
        //cuando los pares ocupen toda la tabla
        while (i < pares.length){
            System.out.println("Introduzca número: ");
            int num = sc.nextInt();
            if (num % 2 == 0){
                pares[i] = num; //guarda el par
                i++;
            } else {
                imparesIgnorados++; //si el número es impar entonces incrementa
            
            }
        }
        //devuelve impar
        return (imparesIgnorados);
        
    }
    
}
