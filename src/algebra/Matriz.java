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
public class Matriz {

    //atributos de una matriz
    private Fraction elementos[][]; //Los elementos son de tipo Fraction(la que estaba en internet)
    private int filas, columnas;

    //constructor y se inicializa la matriz
    public Matriz(Fraction elementos[][]) {
        filas = elementos.length;     //Las filas dependen de la entrada de los elementos
        columnas = elementos[0].length;// Depende de la cantidad de columnas
        this.elementos = new Fraction[filas][columnas]; //Se crea un nuevo elemento de tipo Fracciones 
        for (int i = 0; i < filas; i++) {   //Se crea espacio para una nueva matriz 
            for (int j = 0; j < columnas; j++) {
                this.elementos[i][j] = elementos[i][j];
            }
        }
    }

    public Fraction Determinante(int tam) { // tam = tamaño
        Fraction det = new Fraction(); // Determinante.

        switch (tam) {
            case 2:
                det = this.Determinante22(this);
                break;
            case 3:
                det = this.Determinante33(this);
                break;
            case 4:
                det = this.Determinante44(this);
                break;
            case 5:
                det = this.Determinante55(this);
                break;
            default:
                break;
        }

        return det;
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
    public Fraction getElemento(int filas, int columnas) {
        return elementos[filas][columnas];
    }

    //metodo setter dada una cordenada
    public void setElemento(int filas, int columnas, Fraction fraccion) {
        elementos[filas][columnas] = fraccion;
    }

    // Obtiene el valor de una fila de la matriz en forma de array (Sirve para multiplicar una fila por un numero o asi)
    public Fraction[] getFila(int i) {
        Fraction[] fila = new Fraction[columnas];
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

    public int cantidadColumnas() {
        int contador = 0;
        for (int j = 0; j < columnas; j++) {
            contador++;
        }
        return contador;

    }

    //Validar tamano
    public boolean valiarTamano() {
        int fila = cantidadFilas();
        int columna = cantidadColumnas();
        if (fila <= 5 || columna <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valiarMatCuadrada() {
        int fila = cantidadFilas();
        int columna = cantidadColumnas();
        if (fila == columna) {
            return true;
        } else {
            return false;
        }
    }

    //Imprimir la matriz
    public void imprime() {

        String borde = "|";
        System.out.println();

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(borde);
            Fraction[] filai = elementos[i];
            for (int j = 0; j < filai.length; j++) {
                imprimeElemento(elementos[i][j]);
            }
            System.out.print(borde);
            System.out.println();
        }
        System.out.println();
    }

    public void imprimeElemento(Fraction d) {
        System.out.print(d.getNumerator() + "/" + d.getDenominator() + "  ");
    }

    private Fraction Determinante22(Matriz matriz22) {
        ArrayList<Fraction> arrayResSumar = new ArrayList<>(); // Resultados para sumar.
        Fraction det = new Fraction(); // Determinante.

        int num = this.getElemento(0, 0).getNumerator() * this.getElemento(1, 1).getNumerator();
        int den = this.getElemento(0, 0).getDenominator() * this.getElemento(1, 1).getDenominator();
        Fraction fraccion = new Fraction();
        fraccion.setValue(num, den);
        arrayResSumar.add(fraccion);

        num = this.getElemento(0, 1).getNumerator() * this.getElemento(1, 0).getNumerator() * -1;
        den = this.getElemento(0, 1).getDenominator() * this.getElemento(1, 0).getDenominator();
        Fraction fraccion2 = new Fraction();
        fraccion2.setValue(num, den);
        arrayResSumar.add(fraccion2);

        det = arrayResSumar.get(0).add(arrayResSumar.get(1));
        return det;
    }

    private Fraction Determinante33(Matriz matriz33) {
        Fraction elementos[][] = new Fraction[2][2];
        Matriz matriz1 = new Matriz(elementos);
        Matriz matriz2 = new Matriz(elementos);
        Matriz matriz3 = new Matriz(elementos);

        matriz1.setElemento(0, 0, matriz33.getElemento(1, 1));
        matriz1.setElemento(0, 1, matriz33.getElemento(1, 2));
        matriz1.setElemento(1, 0, matriz33.getElemento(2, 1));
        matriz1.setElemento(1, 1, matriz33.getElemento(2, 2));

        matriz2.setElemento(0, 0, matriz33.getElemento(1, 0));
        matriz2.setElemento(0, 1, matriz33.getElemento(1, 2));
        matriz2.setElemento(1, 0, matriz33.getElemento(2, 0));
        matriz2.setElemento(1, 1, matriz33.getElemento(2, 2));

        matriz3.setElemento(0, 0, matriz33.getElemento(1, 0));
        matriz3.setElemento(0, 1, matriz33.getElemento(1, 1));
        matriz3.setElemento(1, 0, matriz33.getElemento(2, 0));
        matriz3.setElemento(1, 1, matriz33.getElemento(2, 1));

        Fraction det = new Fraction(); // Determinante.

        det = ((matriz33.getElemento(0, 0).multiply(matriz1.Determinante(2))).subtract(
                (matriz33.getElemento(0, 1).multiply(matriz2.Determinante(2))))).add(
                (matriz33.getElemento(0, 2).multiply(matriz3.Determinante(2))));

        return det;
    }

    private Fraction Determinante44(Matriz matriz44) {
        Fraction elementos[][] = new Fraction[3][3];
        Matriz matriz1 = new Matriz(elementos);
        Matriz matriz2 = new Matriz(elementos);
        Matriz matriz3 = new Matriz(elementos);
        Matriz matriz4 = new Matriz(elementos);

        matriz1.setElemento(0, 0, matriz44.getElemento(1, 1));
        matriz1.setElemento(0, 1, matriz44.getElemento(1, 2));
        matriz1.setElemento(0, 2, matriz44.getElemento(1, 3));
        matriz1.setElemento(1, 0, matriz44.getElemento(2, 1));
        matriz1.setElemento(1, 1, matriz44.getElemento(2, 2));
        matriz1.setElemento(1, 2, matriz44.getElemento(2, 3));
        matriz1.setElemento(2, 0, matriz44.getElemento(3, 1));
        matriz1.setElemento(2, 1, matriz44.getElemento(3, 2));
        matriz1.setElemento(2, 2, matriz44.getElemento(3, 3));

        matriz2.setElemento(0, 0, matriz44.getElemento(1, 0));
        matriz2.setElemento(0, 1, matriz44.getElemento(1, 2));
        matriz2.setElemento(0, 2, matriz44.getElemento(1, 3));
        matriz2.setElemento(1, 0, matriz44.getElemento(2, 0));
        matriz2.setElemento(1, 1, matriz44.getElemento(2, 2));
        matriz2.setElemento(1, 2, matriz44.getElemento(2, 3));
        matriz2.setElemento(2, 0, matriz44.getElemento(3, 0));
        matriz2.setElemento(2, 1, matriz44.getElemento(3, 2));
        matriz2.setElemento(2, 2, matriz44.getElemento(3, 3));

        matriz3.setElemento(0, 0, matriz44.getElemento(1, 0));
        matriz3.setElemento(0, 1, matriz44.getElemento(1, 1));
        matriz3.setElemento(0, 2, matriz44.getElemento(1, 3));
        matriz3.setElemento(1, 0, matriz44.getElemento(2, 0));
        matriz3.setElemento(1, 1, matriz44.getElemento(2, 1));
        matriz3.setElemento(1, 2, matriz44.getElemento(2, 3));
        matriz3.setElemento(2, 0, matriz44.getElemento(3, 0));
        matriz3.setElemento(2, 1, matriz44.getElemento(3, 1));
        matriz3.setElemento(2, 2, matriz44.getElemento(3, 3));

        matriz4.setElemento(0, 0, matriz44.getElemento(1, 0));
        matriz4.setElemento(0, 1, matriz44.getElemento(1, 1));
        matriz4.setElemento(0, 2, matriz44.getElemento(1, 2));
        matriz4.setElemento(1, 0, matriz44.getElemento(2, 0));
        matriz4.setElemento(1, 1, matriz44.getElemento(2, 1));
        matriz4.setElemento(1, 2, matriz44.getElemento(2, 2));
        matriz4.setElemento(2, 0, matriz44.getElemento(3, 0));
        matriz4.setElemento(2, 1, matriz44.getElemento(3, 1));
        matriz4.setElemento(2, 2, matriz44.getElemento(3, 2));

        Fraction det = new Fraction(); // Determinante.

        det = (((matriz44.getElemento(0, 0).multiply(matriz1.Determinante(3))).subtract(
                (matriz44.getElemento(0, 1).multiply(matriz2.Determinante(3))))).add(
                (matriz44.getElemento(0, 2).multiply(matriz3.Determinante(3))))).subtract(
                (matriz44.getElemento(0, 3).multiply(matriz4.Determinante(3))));
        return det;
    }

    private Fraction Determinante55(Matriz matriz55) {
        Fraction elementos[][] = new Fraction[4][4];
        Matriz matriz1 = new Matriz(elementos);
        Matriz matriz2 = new Matriz(elementos);
        Matriz matriz3 = new Matriz(elementos);
        Matriz matriz4 = new Matriz(elementos);
        Matriz matriz5 = new Matriz(elementos);

        matriz1.setElemento(0, 0, matriz55.getElemento(1, 1));
        matriz1.setElemento(0, 1, matriz55.getElemento(1, 2));
        matriz1.setElemento(0, 2, matriz55.getElemento(1, 3));
        matriz1.setElemento(0, 3, matriz55.getElemento(1, 4));
        matriz1.setElemento(1, 0, matriz55.getElemento(2, 1));
        matriz1.setElemento(1, 1, matriz55.getElemento(2, 2));
        matriz1.setElemento(1, 2, matriz55.getElemento(2, 3));
        matriz1.setElemento(1, 3, matriz55.getElemento(2, 4));
        matriz1.setElemento(2, 0, matriz55.getElemento(3, 1));
        matriz1.setElemento(2, 1, matriz55.getElemento(3, 2));
        matriz1.setElemento(2, 2, matriz55.getElemento(3, 3));
        matriz1.setElemento(2, 3, matriz55.getElemento(3, 4));
        matriz1.setElemento(3, 0, matriz55.getElemento(4, 1));
        matriz1.setElemento(3, 1, matriz55.getElemento(4, 2));
        matriz1.setElemento(3, 2, matriz55.getElemento(4, 3));
        matriz1.setElemento(3, 3, matriz55.getElemento(4, 4));

        matriz2.setElemento(0, 0, matriz55.getElemento(1, 0));
        matriz2.setElemento(0, 1, matriz55.getElemento(1, 2));
        matriz2.setElemento(0, 2, matriz55.getElemento(1, 3));
        matriz2.setElemento(0, 3, matriz55.getElemento(1, 4));
        matriz2.setElemento(1, 0, matriz55.getElemento(2, 0));
        matriz2.setElemento(1, 1, matriz55.getElemento(2, 2));
        matriz2.setElemento(1, 2, matriz55.getElemento(2, 3));
        matriz2.setElemento(1, 3, matriz55.getElemento(2, 4));
        matriz2.setElemento(2, 0, matriz55.getElemento(3, 0));
        matriz2.setElemento(2, 1, matriz55.getElemento(3, 2));
        matriz2.setElemento(2, 2, matriz55.getElemento(3, 3));
        matriz2.setElemento(2, 3, matriz55.getElemento(3, 4));
        matriz2.setElemento(3, 0, matriz55.getElemento(4, 0));
        matriz2.setElemento(3, 1, matriz55.getElemento(4, 2));
        matriz2.setElemento(3, 2, matriz55.getElemento(4, 3));
        matriz2.setElemento(3, 3, matriz55.getElemento(4, 4));

        matriz3.setElemento(0, 0, matriz55.getElemento(1, 0));
        matriz3.setElemento(0, 1, matriz55.getElemento(1, 1));
        matriz3.setElemento(0, 2, matriz55.getElemento(1, 3));
        matriz3.setElemento(0, 3, matriz55.getElemento(1, 4));
        matriz3.setElemento(1, 0, matriz55.getElemento(2, 0));
        matriz3.setElemento(1, 1, matriz55.getElemento(2, 1));
        matriz3.setElemento(1, 2, matriz55.getElemento(2, 3));
        matriz3.setElemento(1, 3, matriz55.getElemento(2, 4));
        matriz3.setElemento(2, 0, matriz55.getElemento(3, 0));
        matriz3.setElemento(2, 1, matriz55.getElemento(3, 1));
        matriz3.setElemento(2, 2, matriz55.getElemento(3, 3));
        matriz3.setElemento(2, 3, matriz55.getElemento(3, 4));
        matriz3.setElemento(3, 0, matriz55.getElemento(4, 0));
        matriz3.setElemento(3, 1, matriz55.getElemento(4, 1));
        matriz3.setElemento(3, 2, matriz55.getElemento(4, 3));
        matriz3.setElemento(3, 3, matriz55.getElemento(4, 4));

        matriz4.setElemento(0, 0, matriz55.getElemento(1, 0));
        matriz4.setElemento(0, 1, matriz55.getElemento(1, 1));
        matriz4.setElemento(0, 2, matriz55.getElemento(1, 2));
        matriz4.setElemento(0, 3, matriz55.getElemento(1, 4));
        matriz4.setElemento(1, 0, matriz55.getElemento(2, 0));
        matriz4.setElemento(1, 1, matriz55.getElemento(2, 1));
        matriz4.setElemento(1, 2, matriz55.getElemento(2, 2));
        matriz4.setElemento(1, 3, matriz55.getElemento(2, 4));
        matriz4.setElemento(2, 0, matriz55.getElemento(3, 0));
        matriz4.setElemento(2, 1, matriz55.getElemento(3, 1));
        matriz4.setElemento(2, 2, matriz55.getElemento(3, 2));
        matriz4.setElemento(2, 3, matriz55.getElemento(3, 4));
        matriz4.setElemento(3, 0, matriz55.getElemento(4, 0));
        matriz4.setElemento(3, 1, matriz55.getElemento(4, 1));
        matriz4.setElemento(3, 2, matriz55.getElemento(4, 2));
        matriz4.setElemento(3, 3, matriz55.getElemento(4, 4));

        matriz5.setElemento(0, 0, matriz55.getElemento(1, 0));
        matriz5.setElemento(0, 1, matriz55.getElemento(1, 1));
        matriz5.setElemento(0, 2, matriz55.getElemento(1, 2));
        matriz5.setElemento(0, 3, matriz55.getElemento(1, 3));
        matriz5.setElemento(1, 0, matriz55.getElemento(2, 0));
        matriz5.setElemento(1, 1, matriz55.getElemento(2, 1));
        matriz5.setElemento(1, 2, matriz55.getElemento(2, 2));
        matriz5.setElemento(1, 3, matriz55.getElemento(2, 3));
        matriz5.setElemento(2, 0, matriz55.getElemento(3, 0));
        matriz5.setElemento(2, 1, matriz55.getElemento(3, 1));
        matriz5.setElemento(2, 2, matriz55.getElemento(3, 2));
        matriz5.setElemento(2, 3, matriz55.getElemento(3, 3));
        matriz5.setElemento(3, 0, matriz55.getElemento(4, 0));
        matriz5.setElemento(3, 1, matriz55.getElemento(4, 1));
        matriz5.setElemento(3, 2, matriz55.getElemento(4, 2));
        matriz5.setElemento(3, 3, matriz55.getElemento(4, 3));

        Fraction det = new Fraction(); // Determinante.

        det = ((((matriz55.getElemento(0, 0).multiply(matriz1.Determinante(4))).subtract(
                (matriz55.getElemento(0, 1).multiply(matriz2.Determinante(4))))).add(
                (matriz55.getElemento(0, 2).multiply(matriz3.Determinante(4))))).subtract(
                (matriz55.getElemento(0, 3).multiply(matriz4.Determinante(4))))).add(
                (matriz55.getElemento(0, 4).multiply(matriz5.Determinante(4))));
        return det;
    }
}
