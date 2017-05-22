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
public class MatrizDeAdjacencia implements Grafo{

    private int[][] matriz;

    public MatrizDeAdjacencia(int numeroDeVertices) {
        this.matriz = new int[numeroDeVertices][numeroDeVertices];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    @Override
    public int getNumeroDeVertices() {
        return this.matriz.length;
    }

    @Override
    public void addAresta(int origem, int destino) {
        if (origem != destino) {
            this.matriz[origem][destino] = 1;
            this.matriz[destino][origem] = 1;
        }
    }

    @Override
    public void addAresta(int origem, int destino, double peso) {
        if (origem != destino) {
            this.matriz[origem][destino] = (int)peso;
            this.matriz[destino][origem] = (int)peso;
        }
    }

    @Override
    public void setAresta(int origem, int destino) {
        this.addAresta(origem, destino);
    }

    @Override
    public void setAresta(int origem, int destino, double peso) {
        this.addAresta(origem, destino, peso);
    }

    @Override
    public void removeAresta(int origem, int destino) {
        this.setAresta(origem, destino, 0);
    }

    @Override
    public boolean isAdjacente(int origem, int destino) {
        return this.matriz[origem][destino] != 0
                || this.matriz[destino][origem] != 0;
    }

    @Override
    public List getAdjacentes(int vertice) {
        List<Integer> adj = new LinkedList<>();
        for (int coluna = 0; coluna < this.matriz[vertice].length; coluna++) {
            if (isAdjacente(vertice, coluna)) {
                adj.add(coluna);
            }
        }
        return adj;
    }

    @Override
    public double getPeso(int origem, int destino) {
        return this.matriz[origem][destino];
    }

    @Override
    public void addVertice() {
        int numeroVertice = this.matriz.length;
        int[][] newMatriz = new int[numeroVertice + 1][numeroVertice + 1];
        for (int i = 0; i < numeroVertice; i++)
            for (int j = 0; j < numeroVertice; j++)
                newMatriz[i][j] = this.matriz[i][j];
        this.matriz = newMatriz;
    }

    public void getVertices(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(this.matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
