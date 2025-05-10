/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author o12317
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] lista ={1,2,3,4,5,6};
        int resultado;
        int sumaP = 0;
        int sumaI = 0;
        for(int i=0; i < lista.length; i++){
            if(lista[i]%2 ==0){
                sumaP= sumaP+lista[i];
            }    
            else {
                sumaI= sumaI +lista[i];
            }
        }
        resultado = sumaP-sumaI;
        System.out.println("El resultado:"+ resultado);
    }
}


