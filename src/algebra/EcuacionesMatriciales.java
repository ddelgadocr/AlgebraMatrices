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

    public EcuacionesMatriciales(Matriz matrizA, Matriz matrizB, Matriz matrizC) {
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

    public Matriz SumaMatriz(Matriz matrizA, Matriz matrizB, Matriz matrizC) {
        Fraction elementos[][] = new Fraction[matrizA.getFilas()][matrizA.getColumnas()];
        Matriz nuevamatriz = new Matriz(elementos);
        Fraction resultadoSuma = new Fraction();

        for (int i = 0; i < matrizA.getFilas(); i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                resultadoSuma = matrizA.getElemento(i, j).add(matrizB.getElemento(i, j).add(matrizC.getElemento(i, j)));
                nuevamatriz.setElemento(i, j, resultadoSuma);
            }
        }
        nuevamatriz.imprime();
        return nuevamatriz;
    }

    public Matriz RestaMatriz(Matriz matrizA, Matriz matrizB, Matriz matrizC) {
        Fraction elementos[][] = new Fraction[matrizA.getFilas()][matrizA.getColumnas()];
        Matriz nuevamatriz = new Matriz(elementos);
        Fraction resultadoSuma = new Fraction();

        for (int i = 0; i < matrizA.getFilas(); i++) {
            for (int j = 0; j < matrizA.getColumnas(); j++) {
                resultadoSuma = matrizA.getElemento(i, j).subtract(matrizB.getElemento(i, j).subtract(matrizC.getElemento(i, j)));
                nuevamatriz.setElemento(i, j, resultadoSuma);
            }
        }
        nuevamatriz.imprime();
        return nuevamatriz;
    }

    public Matriz Multiplicacion(Matriz matrizA, Matriz matrizB) {
        Fraction[][] multiplicacion = new Fraction[matrizA.getFilas()][matrizB.getColumnas()];
        Matriz nuevaMatriz = new Matriz(multiplicacion);
        if (matrizA.getColumnas() != matrizB.getFilas()) {
            System.out.println("No se puede realizar la multiplicacion");
        } else {
            for (int x = 0; x < multiplicacion.length; x++) {
                for (int y = 0; y < multiplicacion[x].length; y++) {
                    Fraction nuevonumero = new Fraction();
                    for (int z = 0; z < matrizA.getColumnas(); z++) {
                        nuevonumero = nuevonumero.add(matrizA.getElemento(x, z).multiply(matrizB.getElemento(z, y)));
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

    public Matriz Transpuesta(Matriz matriz) {
        Fraction elemento[][] = new Fraction[matriz.getFilas()][matriz.getColumnas()];
        Matriz mInvertida = new Matriz(elemento);

        for (int j = 0; j < matriz.getColumnas(); j++) {
            for (int i = 0; i < matriz.getFilas(); i++) {
                Fraction nuevoElem;
                nuevoElem = matriz.getElemento(i, j);
                elemento[i][j] = nuevoElem;
            }
            //setear la nueva matriz en sentido contrarios
            for (int m = 0; m < matriz.getFilas(); m++) {
                for (int n = 0; n < matriz.getColumnas(); n++) {
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
                    elemento[i][j] = resultado;
                }
                //setear la nueva matriz con los 
                for (int m = 0; m < matriz.getColumnas(); m++) {
                    for (int n = 0; n < matriz.getFilas(); n++) {
                        nuevaMatriz.setElemento(n, m, elemento[m][n]);
                    }
                }

            }
        }
        nuevaMatriz.imprime();
        return nuevaMatriz;
    }

    public Matriz matrizCofactores(Matriz matriz) {
        Fraction[][] elementos = new Fraction[matriz.cantidadFilas()][matriz.cantidadColumnas()];
        Matriz miadj = new Matriz(elementos);
        for (int i = 0; i < matriz.cantidadFilas(); i++) {
            for (int j = 0; j < matriz.cantidadColumnas(); j++) {
                Fraction[][] elementos2 = new Fraction[matriz.cantidadFilas() - 1][matriz.cantidadColumnas() - 1];
                Matriz det = new Matriz(elementos2);
                Fraction detValor = new Fraction();
                for (int k = 0; k < matriz.cantidadFilas(); k++) {
                    if (k != i) {
                        for (int l = 0; l < matriz.cantidadFilas(); l++) {
                            if (l != j) {
                                int indice1 = k < i ? k : k - 1;
                                int indice2 = l < j ? l : l - 1;
                                det.setElemento(indice1, indice2, matriz.getElemento(k, l));
                            }
                        }

                    }
                }
                detValor = det.Determinante(det.cantidadFilas());
                miadj.setElemento(i, j, detValor.multiply(Signo(i, j)));
            }
        }
        return miadj;
    }

    public Fraction Signo(int i, int j) {
        Fraction unon = new Fraction(-1, 1);
        Fraction unop = new Fraction(1, 1);

        if ((i + j) % 2 == 0) {
            return unop;
        } else {
            return unon;
        }
    }

    public Matriz AdjuntaMatriz(Matriz matriz) {
        return Transpuesta(matrizCofactores(matriz));
    }

    public Matriz Inversa1(Matriz matriz) {
        Fraction[][] elementos = new Fraction[matriz.cantidadFilas()][matriz.cantidadColumnas()];
        Matriz minversa = new Matriz(elementos);
        Fraction uno = new Fraction(1, 1);
        Fraction cero = new Fraction(0, 1);
        for (int i = 0; i < minversa.cantidadFilas(); i++) {
            for (int j = 0; j < minversa.getColumnas(); j++) {

                if (matriz.Determinante(matriz.cantidadFilas()) != cero) {
                    minversa.setElemento(i, j, uno.divide(matriz.Determinante(matriz.cantidadFilas())).multiply(AdjuntaMatriz(matriz).getElemento(i, j)));
                }
            }
        }
        //minversa.imprime();
        return minversa;
    }
}
