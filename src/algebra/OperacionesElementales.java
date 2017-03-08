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
public class OperacionesElementales {
    private Matriz matrizA;

    public OperacionesElementales(Matriz matrizA){
        this.matrizA = matrizA;
    }

    public Matriz getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(Matriz matrizA) {
        this.matrizA = matrizA;
    }

   
    @Override
    public String toString() {
        return "OperacionesElementales{" + "matrizA=" + matrizA ;
    }
    
    public Matriz SumaFilaMultiplo(int numeroFila1,int numeroFila2, Fraction multiplo){
        Fraction nuevafila[]   = new Fraction[matrizA.getColumnas()];
        
        //crear un array con una nueva fila( la que se modifico)
        if (matrizA.getColumnas() <= 5 || matrizA.getFilas() <= 5 ){
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                Fraction resultado = matrizA.getFila(numeroFila1-1)[j].add(multiplo.multiply(matrizA.getFila(numeroFila2-1)[j]));
                nuevafila[j] = resultado; 
            }
        }
        
        //Se setea la fila que fue modificada lo demas sigue igual
        for (int m = 0; m < matrizA.getColumnas(); m++) {
            matrizA.setElemento(numeroFila1-1, m, nuevafila[m]);
        }
        
        System.out.println("Suma de fila: "+numeroFila1+ " + " + multiplo + " * " + " fila: " + numeroFila2);
        matrizA.imprime();
        return matrizA;
    }
    
    //Usuario ingresa filas, las tomo de la matriz las guardo en aux y las seteo 
    //en la misma matriz difetente fila
        public Matriz IntercabiarFilas(int fila1, int fila2) {
        if (matrizA.getColumnas() <= 5 || matrizA.getFilas() <= 5) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                Fraction aux = matrizA.getFila(fila1 - 1)[j];
                Fraction aux2 = matrizA.getFila(fila2 - 1)[j];
                matrizA.setElemento(fila1 - 1, j, aux2);
                matrizA.setElemento(fila2 - 1, j, aux);
            } 
        }

        System.out.println("Intercambiar filas"+"\n"+"Fila1: " + fila1 + "\n" + "Fila2: " + fila2);
        matrizA.imprime();
        return matrizA;
    }

    public Matriz MultiplicarFilaPorEscalar(int fila, Fraction escalar) { 
        Fraction[] nuevaFila = new Fraction[matrizA.getColumnas()];

        if (matrizA.getColumnas() <= 5 || matrizA.getFilas() <= 5) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                Fraction resultado;
                resultado = escalar.multiply(matrizA.getFila(fila - 1)[j]);
                nuevaFila[j] = resultado;
            }

            for (int m = 0; m < matrizA.getColumnas(); m++) {
                matrizA.setElemento(fila - 1, m, nuevaFila[m]);

            }

        }
        System.out.println("Fila: " + fila + "\n" + "Multiplicada por: " + escalar);
        matrizA.imprime();
        return matrizA;

    }
}