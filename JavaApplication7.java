/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7actividad7;
import java.util.*;
/**
 *
 * @author jaime
 */
public class JavaApplication7Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]arr = tamañoArreglo();
        arr = llenarArreglo(arr);
        mostrarResultados(arr);
    }
    public static int [][]llenarArreglo(int [][] a){
        Scanner entrada= new Scanner(System.in);
        for (int i=0; i<a.length; ++i){
            for (int j=0; j<a[0].length; ++j){
                System.out.println("Introduce la posicion [" + i +"]" + "[" + j +"]" );
                a[i][j]=j + 1;
            }
        }
        return a;
    }
    
    public static int[][]tamañoArreglo() {
         int x, y;
          Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero la columna vertical");
        y = entrada.nextInt();
        System.out.println("Introduce el numero la columna horizontal");
        x =  entrada.nextInt();
        int[][] a = new int[y][x];
    return a;
}
    
   public static void mostrarResultados(int[][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length;j++){
                System.out.print(i*j+"\t");
            } System.out.println("\n");
        }
    }
}





