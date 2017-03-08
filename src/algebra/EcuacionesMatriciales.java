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
public class EcuacionesMatriciales {
    private Matriz matrizA;
    private Matriz matrizB;
    private Matriz matrizC;
    
    public EcuacionesMatriciales(Matriz matrizA, Matriz matrizB, Matriz matrizC){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
        this.matrizC = matrizC; 
    }

    public Matriz getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(Matriz matrizA) {
        this.matrizA = matrizA;
    }

    public Matriz getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(Matriz matrizB) {
        this.matrizB = matrizB;
    }

    public Matriz getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(Matriz matrizC) {
        this.matrizC = matrizC;
    }
    
    public Matriz SumaMatriz(Matriz matrizA, Matriz matrizB, Matriz matrizC){
        Fraction elementos[][]= new Fraction[matrizA.getFilas()][matrizA.getColumnas()];
        Matriz   nuevamatriz  = new Matriz(elementos);
        Fraction resultadoSuma= new Fraction();
        
        for (int i = 0; i < matrizA.getFilas() ; i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                resultadoSuma = matrizA.getElemento(i, j).add(matrizB.getElemento(i, j).add(matrizC.getElemento(i, j)));
                nuevamatriz.setElemento(i, j, resultadoSuma);
            }
        }
        nuevamatriz.imprime();
        return nuevamatriz;
    }
    public Matriz RestaMatriz(Matriz matrizA, Matriz matrizB, Matriz matrizC){
        Fraction elementos[][]= new Fraction[matrizA.getFilas()][matrizA.getColumnas()];
        Matriz   nuevamatriz  = new Matriz(elementos);
        Fraction resultadoSuma= new Fraction();
        
        for (int i = 0; i < matrizA.getFilas() ; i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                resultadoSuma = matrizA.getElemento(i, j).subtract(matrizB.getElemento(i, j).subtract(matrizC.getElemento(i, j)));
                nuevamatriz.setElemento(i, j, resultadoSuma);
            }
        }
        nuevamatriz.imprime();
        return nuevamatriz;
    }
    
    public Matriz Multiplicacion(Matriz matrizA,Matriz matrizB){
        Fraction[][] multiplicacion = new Fraction[matrizA.getFilas()][matrizB.getColumnas()];
        Matriz nuevaMatriz          = new Matriz(multiplicacion);
        if (matrizA.getColumnas() != matrizB.getFilas())
            System.out.println("No se puede realizar la multiplicacion");
        else{
            for (int x=0; x < multiplicacion.length; x++) {
                for (int y=0; y < multiplicacion[x].length; y++) {
                    Fraction     nuevonumero    = new Fraction();
                    for (int z=0; z< matrizA.getColumnas() ; z++) {
                        nuevonumero= nuevonumero.add(matrizA.getElemento(x, z).multiply(matrizB.getElemento(z,y)));
                        multiplicacion[x][y] = nuevonumero;
                    }
                }
            }
            
            for (int i = 0; i < multiplicacion.length; i++) {
                for (int j = 0; j < multiplicacion[i].length; j++) {
                    nuevaMatriz.setElemento(i, j, multiplicacion[i][j]);
                }
            }
            
            System.out.println("Soy la multiplicacion de matrices");
            nuevaMatriz.imprime();
        }

    System.out.println("Soy la multiplicacion de matrices");
    return nuevaMatriz;
    }
}