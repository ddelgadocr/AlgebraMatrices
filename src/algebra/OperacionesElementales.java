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
    
}
