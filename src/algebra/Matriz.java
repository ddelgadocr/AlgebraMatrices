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
public class Matriz {
    //atributos de una matriz
    private Fraction elementos[][]; //Los elementos son de tipo Fraction(la que estaba en internet)
    private int      filas,columnas;
    
    //constructor y se inicializa la matriz
    
    public Matriz(Fraction elementos[][]){
        filas= elementos.length;     //Las filas dependen de la entrada de los elementos
        columnas= elementos[0].length;// Depende de la cantidad de columnas
        this.elementos = new Fraction[filas][columnas]; //Se crea un nuevo elemento de tipo Fracciones 
        for (int i = 0; i < filas; i++) {   //Se crea espacio para una nueva matriz 
            for (int j = 0; j < columnas; j++) {
                 this.elementos[i][j] = elementos[i][j];
            }         
        }
    }
    
    //Getter and setter
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    //metodo accesor dada una cordenada
    public Fraction getElemento(int filas,int columnas){
        return elementos[filas][columnas];
    }
    //metodo setter dada una cordenada
    public void setElemento(int filas, int columnas, Fraction fraccion){
        elementos[filas][columnas]= fraccion;
    }
    // Obtiene el valor de una fila de la matriz en forma de array (Sirve para multiplicar una fila por un numero o asi)
    public Fraction[] getFila(int i){
        Fraction[] fila= new Fraction[columnas];
        for (int j = 0; j < columnas; j++) {
            fila[j] = elementos[i][j];
        }
        return fila;
    }
    
    public int cantidadFilas() {
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            contador++;
        }
        return contador;
    }
    
    public int cantidadColumnas(){
        int contador = 0;
        for( int j=0; j < columnas; j++){
            contador ++;  
        }
        return contador;  
        
    }
    
    //Validar tamano
    public boolean valiarTamano(){
        int fila = cantidadFilas();
        int columna = cantidadColumnas();
        if(fila <= 5 || columna <= 5){
            return true;
        }else{
            return false;
        }  
    }
    
     public boolean valiarMatCuadrada(){
        int fila = cantidadFilas();
        int columna = cantidadColumnas();
        if(fila == columna ){
            return true;
        }else{
            return false;
        }  
    }
    
    //Imprimir la matriz
    public void imprime() {

       String borde = "|";
       System.out.println();
        
       for (int i=0; i<elementos.length; i++) {
            System.out.print(borde); 
            Fraction[] filai = elementos[i];
            for (int j=0; j< filai.length; j++) {
                imprimeElemento(elementos[i][j]); 
            }            
            System.out.print(borde);
            System.out.println(); 
        }
        System.out.println();
    }
    
    public void imprimeElemento(Fraction d) {
        System.out.print(d.getNumerator() +"/"+ d.getDenominator()+ "  ");
    }
}




