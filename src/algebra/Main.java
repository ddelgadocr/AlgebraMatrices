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
        
        //Lo que hice fue hacer una matriz y a todas les puse un solo valor "5/6"
        Fraction fraccion = new Fraction();
        fraccion.setValue(45, 19);
         for (int i = 0; i < matrizA.getFilas(); i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                matrizA.setElemento(i,j, fraccion);
            }
        }
        
       
        //Primero imprime la matriz 
        System.out.println("Soy la matriz A:");
        matrizA.imprime();
       
        //Se hace una nueva operacion
        EcuacionesMatriciales ecu = new EcuacionesMatriciales(matrizA, matrizA,  matrizA);
        ecu.Determinante(1, matrizA);
       // Falta validar que sean 5x5

        // Inicia VentanaPrincipal.
        VentanaPrincipal VentanaPrincipal_ = new VentanaPrincipal();
        VentanaPrincipal_.setVisible(true);
        VentanaPrincipal_.setResizable(false); // Tamaño de ventana no variable.
        VentanaPrincipal_.setLocationRelativeTo(null); // Centra ventana.
    }
    
}
