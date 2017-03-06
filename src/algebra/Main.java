/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

        
/**
 *
 * @author Melissa
 */
public class Main {
    // Se utilizan en VentanaOperaciones para crear matriz.
    public static short matrizCol;
    public static short matrizFil; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //Se realizan pruebas
        //------Se crea la matriz------
       /*
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
        OperacionesElementales SumaMultiplo= new OperacionesElementales(matrizA);
        Fraction multiplo = new Fraction(1,3);
        SumaMultiplo.SumaFilaMultiplo(3,2,multiplo);
        
        //operacione fila por ecalar 
        Fraction multiplicando = new Fraction(2,1);
        SumaMultiplo.MultiplicarFilaPorEscalar(1,multiplicando);
        SumaMultiplo.IntercabiarFilas(3,1);
        */
       

        // Inicia VentanaPrincipal.
        VentanaPrincipal VentanaPrincipal_ = new VentanaPrincipal();
        VentanaPrincipal_.setVisible(true);
        VentanaPrincipal_.setResizable(false); // Tamaño de ventana no variable.
        VentanaPrincipal_.setLocationRelativeTo(null); // Centra ventana.

    }
    
}
