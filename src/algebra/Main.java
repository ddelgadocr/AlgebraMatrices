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
    public static ArrayList<Matriz> arrayEcuaciones = new ArrayList<>(); // Para agregar las tres matrices de ecuaciones.

    public static void main(String[] args) {        
        //Se realizan pruebas
        //------Se crea la matriz------
        
        
        VentanaPrincipal VentanaPrincipal_ = new VentanaPrincipal();
        VentanaPrincipal_.setVisible(true);
        VentanaPrincipal_.setResizable(false); // Tamaño de ventana no variable.
        VentanaPrincipal_.setLocationRelativeTo(null); // Centra ventana.
    }
    
}
