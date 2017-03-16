/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.util.ArrayList;

        
/**
 *
 * @author Melissa
 */
public class Main {
    // Se utilizan en VentanaOperaciones para crear matriz.
    public static short matrizCol; // Cantidad de columnas seleccionada por usuario.
    public static short matrizFil; // Cantidad de filas seleccionada por usuario.
    public static ArrayList<Matriz> arrayOperaciones = new ArrayList<>(); // Se agregan matrices al aplicar operaciones elementales.
    public static ArrayList<String> arrayOperacionesString = new ArrayList<>(); // Array para almacenar la indicación de la operación.

    public static void main(String[] args) {        
        //Se realizan pruebas
        //------Se crea la matriz------
        Fraction elementos[][]= new Fraction[4][4];
        Matriz matrizA = new Matriz(elementos);
        
        Fraction elemen[][]= new Fraction[2][2];
        Matriz matrizB = new Matriz(elemen);
        
        Fraction fraccion7 = new Fraction();
        fraccion7.setValue(5, 1);
        
        Fraction fraccion8 = new Fraction();
        fraccion8.setValue(6, 1);
        
         Fraction fraccion9 = new Fraction();
        fraccion9.setValue(7, 1);
        
         Fraction fraccion10 = new Fraction();
        fraccion10.setValue(8, 1);
        
        for (int i = 0; i < matrizB.getFilas(); i++) {
            for (int j = 0; j < matrizB.getColumnas(); j++) {
                matrizB.setElemento(0, 0, fraccion7);
                matrizB.setElemento(0, 1, fraccion8);
                matrizB.setElemento(1, 0, fraccion9);
                matrizB.setElemento(1, 1, fraccion10);
                
            }
        }
        
        //Lo que hice fue hacer una matriz y a todas les puse un solo valor "5/6"
        Fraction fraccion = new Fraction();
        fraccion.setValue(5, 1);
        
        Fraction fraccion1 = new Fraction();
        fraccion1.setValue(45, 1);
        
        Fraction fraccion2 = new Fraction();
        fraccion2.setValue(4, 1);
        
        Fraction fraccion3 = new Fraction();
        fraccion3.setValue(9, 1);
        
        Fraction fraccion4 = new Fraction();
        fraccion4.setValue(20, 1);
        
        Fraction fraccion5 = new Fraction();
        fraccion4.setValue(35, 1);
        
        
        
        
        
        
        for (int i = 0; i < matrizA.getFilas(); i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                matrizA.setElemento(i, j, fraccion);
                /////////////////////////////7
                matrizA.setElemento(0, 0, fraccion);
                matrizA.setElemento(0, 1, fraccion1);
                matrizA.setElemento(0, 2, fraccion2);
                matrizA.setElemento(0, 3, fraccion3);
                matrizA.setElemento(1, 1, fraccion4);
                matrizA.setElemento(1, 2, fraccion);
                matrizA.setElemento(1, 3, fraccion1);
                matrizA.setElemento(2, 0, fraccion2);
                matrizA.setElemento(2, 1, fraccion3);
                matrizA.setElemento(2, 2, fraccion4);
                matrizA.setElemento(3, 0, fraccion2);
                matrizA.setElemento(3, 1, fraccion3);
                matrizA.setElemento(3, 2, fraccion5);

            }
        }
        
        
        
        //Matriz 3x3
        Fraction ele[][]= new Fraction[4][4];
        Matriz matrizC = new Matriz(ele);
        for (int i = 0; i < matrizC.getFilas(); i++) {
            for (int j = 0; j < matrizC.getColumnas(); j++) {
                matrizC.setElemento(i, j, fraccion);
                /////////////////////////////7
                matrizC.setElemento(0, 0, fraccion);
                matrizC.setElemento(0, 1, fraccion1);
                matrizC.setElemento(0, 2, fraccion2);
                matrizC.setElemento(0, 3, fraccion3);
                matrizC.setElemento(1, 1, fraccion4);
                matrizC.setElemento(1, 2, fraccion);
                matrizC.setElemento(1, 3, fraccion1);
                matrizC.setElemento(2, 0, fraccion2);
                matrizC.setElemento(2, 1, fraccion3);
                matrizC.setElemento(2, 2, fraccion4);
            }
        }

        
       
        //Primero imprime la matriz 
        System.out.println("Soy la matriz C:");
        matrizA.imprime();
       
        //Se hace una nueva operacion
        EcuacionesMatriciales ecu = new EcuacionesMatriciales(matrizA, matrizA,  matrizA);
        ecu.Determinante(1, matrizC);
        //ecu.AdjuntaMatriz(matrizB);
       // Falta validar que sean 5x5

        // Inicia VentanaPrincipal.
        VentanaPrincipal VentanaPrincipal_ = new VentanaPrincipal();
        VentanaPrincipal_.setVisible(true);
        VentanaPrincipal_.setResizable(false); // Tamaño de ventana no variable.
        VentanaPrincipal_.setLocationRelativeTo(null); // Centra ventana.
    }
    
}
