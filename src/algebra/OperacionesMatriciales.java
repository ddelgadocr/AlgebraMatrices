/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author camila
 */
public class OperacionesMatriciales {

    private Matriz matrizA;
    private Matriz matrizB;
    private Matriz matrizC;

    //Constructores
    public OperacionesMatriciales(Matriz matrizA, Matriz matrizB, Matriz matrizC) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.matrizC = matrizC;
    }

    /**
     * @return the matrizA
     */
    public Matriz getMatrizA() {
        return matrizA;
    }

    /**
     * @param matrizA the matrizA to set
     */
    public void setMatrizA(Matriz matrizA) {
        this.matrizA = matrizA;
    }

    /**
     * @return the matrizB
     */
    public Matriz getMatrizB() {
        return matrizB;
    }

    /**
     * @param matrizB the matrizB to set
     */
    public void setMatrizB(Matriz matrizB) {
        this.matrizB = matrizB;
    }

    /**
     * @return the matrizC
     */
    public Matriz getMatrizC() {
        return matrizC;
    }

    /**
     * @param matrizC the matrizC to set
     */
    public void setMatrizC(Matriz matrizC) {
        this.matrizC = matrizC;
    }
    
    public Matriz Transpuesta(Matriz matriz){
        Fraction elemento [][] = new Fraction[matriz.getFilas()][matriz.getColumnas()];
        Matriz mInvertida = new Matriz(elemento);
        
        for(int j=0; j< matriz.getColumnas();j++){
            for(int i=0; i< matriz.getFilas();i++){
                Fraction nuevoElem ;
                nuevoElem = matriz.getElemento(i,j);
                elemento[i][j] = nuevoElem;   
            }
            //setear la nueva matriz en sentido contrarios
            for(int m=0; m<matriz.getFilas(); m++){
                for(int n=0; n<matriz.getColumnas();n++){
                    mInvertida.setElemento(m, n, elemento[n][m]);
                    
                }
            }
        }
        mInvertida.imprime();
       return mInvertida;
    }
    
    public Matriz MultPorEscalar(Fraction escalar, Matriz matriz) {
        Fraction elemento[][] = new Fraction[matriz.getFilas()][matriz.getColumnas()];
        Matriz nuevaMatriz = new Matriz(elemento);
        
        //Validar que la matriz sea 5x5
        if (matrizA.valiarTamano()) {
            //For para recorrer la matriz y multiplicar el escalar por cada entrada 
            for (int i = 0; i < matriz.getFilas(); i++) {
                for (int j = 0; j < matriz.getColumnas(); j++) {
                    Fraction resultado;
                    resultado = escalar.multiply(matriz.getElemento(i, j));
                    elemento [i][j]= resultado; 
                }
                //setear la nueva matriz con los 
                for(int m=0; m < matriz.getColumnas(); m++){
                    for(int n=0; n < matriz.getFilas(); n++){
                        nuevaMatriz.setElemento(n, m, elemento[m][n]);
                    }
                }

            }
        }
        nuevaMatriz.imprime();
        return nuevaMatriz;
    }

}