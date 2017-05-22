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
public class ListaDeAdjacencia implements Grafo{

    List<ArestaSimples>[] vet = null; 
    
    public ListaDeAdjacencia(int numeroDeVertices){
        this.vet = new LinkedList[numeroDeVertices];
        for (int i = 0; i < numeroDeVertices; i++)
            this.vet[i] = new LinkedList<>();
    }
    
    @Override
    public int getNumeroDeVertices() {
        return this.vet.length;
    }

    @Override
    public void addAresta(int origem, int destino) {
        ArestaSimples a = new ArestaSimples(origem, destino, 1);
        this.vet[origem].add(a);
    }

    @Override
    public void addAresta(int origem, int destino, double peso) {
        ArestaSimples a = new ArestaSimples(origem, destino, peso);
        this.vet[origem].add(a);
    }

    @Override
    public void setAresta(int origem, int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAresta(int origem, int destino, double peso) {
        List<ArestaSimples> adjs = this.vet[origem];
        ArestaSimples a = new ArestaSimples(destino, origem, peso);
        for (int i = 0; i < adjs.size(); i++) {
            if(adjs.get(i).getDestino() == destino){
                this.vet[origem].set(i, a);
            }
        }
    }

    @Override
    public void removeAresta(int origem, int destino) {
        List<ArestaSimples> adjs = this.vet[origem];
        for (int i = 0; i < adjs.size(); i++) {
            if(adjs.get(i).getDestino() == destino){
                this.vet[origem].remove(i);
            }
        }
    }
    
    @Override
    public boolean isAdjacente(int origem, int destino) {
        List<ArestaSimples> adjs = this.vet[origem];
        for (int i = 0; i < adjs.size(); i++) {
            if(adjs.get(i).getDestino() == destino){
                return true;
            }
        }
        return false;
    }

    @Override
    public List getAdjacentes(int vertice) {
        return this.vet[vertice];
    }

    @Override
    public double getPeso(int origem, int destino) {
        return this.isAdjacente(origem, destino) == true ? 1 : Integer.MAX_VALUE;
    }

    @Override
    public void addVertice() {
        this.vet = Arrays.copyOf(this.vet, this.vet.length+1);
        this.vet[vet.length-1] = null;
    }

}
