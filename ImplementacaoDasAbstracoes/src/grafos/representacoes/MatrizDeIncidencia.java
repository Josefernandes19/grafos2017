/*
 * Copyright 2017 Willian Soares.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grafos.representacoes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Willian Soares
 */
public class MatrizDeIncidencia implements Grafo{
    /**
     * 
     *  e1|e2|e3|e4
     *  a  a  a  a
     *  b  b  b  b
     *  c  c  c  c
     */
    private double[][] matriz;
    private final int numeroVertices;
   
    
    public MatrizDeIncidencia(int numeroVertices){
        this.matriz = new double[0][numeroVertices];
        this.numeroVertices = numeroVertices;
    }
    
    public double[][] getMatriz(){
        return this.matriz;
    }
    
    @Override
    public int getNumeroDeVertices() {
        return this.numeroVertices;
    }

    private double[][] addElemento(double[][] matriz, double[]e){
        matriz  = Arrays.copyOf(matriz, matriz.length + 1);
        matriz[matriz.length - 1] = e;
        return matriz;
    }
    private double[][] removeElemento(double[][]matriz, int aresta){
        double[][] n = new double[matriz.length - 1][this.numeroVertices];
        System.arraycopy(matriz, 0, n, 0, aresta);
        System.arraycopy(matriz, aresta+1, n, aresta, matriz.length - aresta-1);
        return n;
    }
    
    @Override
    public void addAresta(int origem, int destino) {
        double[] aresta = new double[this.numeroVertices];
        Arrays.fill(aresta, Double.NEGATIVE_INFINITY);
        aresta[origem] = 1;
        aresta[destino] = 1;
        this.matriz = addElemento(matriz, aresta);
    }

    @Override
    public void addAresta(int origem, int destino, double peso) {
        double[] aresta = new double[this.numeroVertices];
        Arrays.fill(aresta, Double.NEGATIVE_INFINITY);
        aresta[origem] = peso;
        aresta[destino] = peso;
        this.matriz = addElemento(matriz, aresta);
    }
    /**
     * 
     * @param origem
     * @param destino
     * @return índice da aresta na matriz. Se NEGATIVE_INFINITY, nao existe aresta
     */
    public double getArestaIndex(int origem, int destino){
        int k = 0 ;
        for (int i = 0; i < this.matriz.length; i++) {
            if((this.matriz[i][origem] != Double.NEGATIVE_INFINITY)
                && (this.matriz[i][destino] != 0))
                return i;
        }
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public void setAresta(int origem, int destino) {
        double i = getArestaIndex(origem, destino);
        if(i != Double.NEGATIVE_INFINITY){
            addAresta(origem, destino);
        }
    }

    @Override
    public void setAresta(int origem, int destino, double peso) {
        double i = getArestaIndex(origem, destino);
        if(i != Double.NEGATIVE_INFINITY)
            addAresta(origem, destino, peso);
    }

    @Override
    public void removeAresta(int origem, int destino) {
        double i = getArestaIndex(origem, destino);
        if(i != Double.NEGATIVE_INFINITY)
            removeElemento(matriz, (int)i);
    }

    @Override
    public boolean isAdjacente(int origem, int destino) {
        double i = getArestaIndex(origem, destino);
        return i != -1;
    }

    @Override
    public List getAdjacentes(int vertice) {
        List adjacentes = new LinkedList();
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.numeroVertices; j++) {
                if(j != vertice && j != 0)
                    adjacentes.add(j);
            }
        }
        return adjacentes;
    }

    @Override
    public double getPeso(int origem, int destino) {
        double i = getArestaIndex(origem, destino);
        if (i == Double.NEGATIVE_INFINITY)
            return Double.NEGATIVE_INFINITY;
        else
            return this.matriz[(int)i][destino];
    }
}
