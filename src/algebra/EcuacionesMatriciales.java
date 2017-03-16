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
    
    
    
    //meto que calcule la determinante
    
  public Fraction Determinante(int i, Matriz matriz)
  {
      Fraction deter = new Fraction();
                

      if (matriz.cantidadColumnas()==2) 
      {
          
          Fraction mult1 = new Fraction();
          Fraction mult2 = new Fraction();
          Fraction resul = new Fraction();
          
          mult1 = matriz.getElemento(0, 0).multiply(matriz.getElemento(1, 1));
          //System.out.println("mult1:"+ mult1);
          mult2 = matriz.getElemento(0, 1).multiply(matriz.getElemento(1, 0));
          //System.out.println("mult2:"+ mult2);
          resul = mult1.subtract(mult2);
          //resul = resul.add(Signo(i,j).mult1.substract(mult2));
          //System.out.println("resul:"+ resul);
          
          //deter.setValue(resul.getNumerator(), resul.getDenominator());
          
          //deter.setValue(matriz.getElemento(0, 0).multiply(matriz.getElemento(1, 1).subtract(matriz.getElemento(0, 1)).multiply(matriz.getElemento(1, 0))).getNumerator(), matriz.getElemento(0, 0).multiply(matriz.getElemento(1, 1).subtract(matriz.getElemento(0, 1)).multiply(matriz.getElemento(1, 0))).getDenominator());       
          //System.out.println("DeterminantePrimero:"+ deter);
          return  deter;
      }
      
      else
      {
        //deter.setValue(0,1);
        
          for (int j = 0; j < matriz.getColumnas(); j++) 
          {
              Fraction[][] elementos = new Fraction[matriz.cantidadFilas()][matriz.cantidadColumnas()];
              Matriz temp = new Matriz(elementos);
              temp = SubMatriz(i, j, matriz);
              System.out.println("Soy submatriz:");
              temp.imprime();
              Fraction mult1 = new Fraction();
              mult1 = matriz.getElemento(i, j).multiply(Determinante(0,temp));
              System.out.println("mult1:"+ mult1);
              deter.add(Signo(i,j)).setValue(mult1.getNumerator(), mult1.getDenominator());
              System.out.println("Determinante:"+deter);
             //deter.add(Signo(i,j)).multiply(mult1);  
          }
          //System.out.println("Determinante:"+deter);
          return deter;
      }
  }
  
   //claculo de submatriz eliminado i, j
  
  
 private Matriz SubMatriz(int i,int j,Matriz matriz)
 {
 
     Fraction[][] elementos = new Fraction[matriz.cantidadFilas()-1][matriz.cantidadColumnas()-1];
     Matriz temp = new Matriz(elementos);
     
     int count1=0;
     int count2=0;
     
     
     for (int k = 0; k < matriz.getFilas(); k++) 
     {
         if (k!=i) 
         {
             count2=0;
            for (int l = 0; l < matriz.getColumnas(); l++) 
            {
                if (l!=j) 
                {
                    temp.setElemento(count1, count2,matriz.getElemento(k, l) );
                    
                    count2++;
                }
               
            }
            
            count1++;
         }             
         
         
     }
     
     
     return temp;
 
 
 
 }
 
 
 
 //metodo para calcular la adjunta de una matrzi
 
public Matriz AdjuntaMatriz(Matriz matriz)

{
   Fraction[][] elementos = new Fraction[matriz.cantidadFilas()-1][matriz.cantidadColumnas()-1];
   Matriz tempAdjunta = new Matriz(elementos);
  
    for (int i = 0; i < tempAdjunta.getFilas(); i++) 
    {
        for (int j = 0; j < tempAdjunta.getColumnas(); j++) 
        {
            Matriz temp  = SubMatriz(i, j, matriz) ;
            
            Fraction elementoAdjunto= new Fraction();
            elementoAdjunto = elementoAdjunto.add(Signo(i,j).multiply(Determinante(0, temp)));
 
            tempAdjunta.setElemento(i, j, elementoAdjunto);
            
        }
        
    }
    
    
    return tempAdjunta;

}

public Matriz Inversa(Matriz matriz)
{
   Fraction[][] elementos = new Fraction[matriz.cantidadFilas()-1][matriz.cantidadColumnas()-1];
   Matriz minversa = new Matriz(elementos);
    
    Fraction determinate = Determinante(0, matriz); //calculando la determinate
    for (int i = 0; Transpuesta(matriz).getFilas()-1 < i; i++) 
            {
                for (int j = 0; j < Transpuesta(matriz).getColumnas()-1; j++) 
                {
                    minversa.setElemento(i,j,matriz.getElemento(i, j).divide(determinate));
                    
                }
                
            }
    minversa.imprime();
    return minversa;
}


public Fraction Signo(int i,int j){
        Fraction unon= new Fraction(-1, 1);
        Fraction unop= new Fraction(1, 1);
        
        if ((i+j)%2 == 0){
            return unop;
        }
        else{
            return unon;
        }
    }



}