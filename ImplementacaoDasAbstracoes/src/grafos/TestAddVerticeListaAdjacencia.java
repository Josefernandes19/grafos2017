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
package grafos;

import grafos.representacoes.ListaDeAdjacencia;

/**
 *
 * @author Willian Soares
 */
public class TestAddVerticeListaAdjacencia {
    ListaDeAdjacencia grafo;

    public TestAddVerticeListaAdjacencia() {
        this.grafo = new ListaDeAdjacencia(0);
    }
    
    public long test(int numeroVertices){
        long inicio = System.nanoTime();
        for (int i = 0; i < numeroVertices; i++) {
            this.grafo.addVertice();
        }
        return System.nanoTime() - inicio;
    }
    public long[] testSequencial(){
        long[] values = {3, 13, 130, 500, 1300, 2600, 5000, 8000, 13000, 26000};
        long inicio;
        for (int i = 0; i < values.length; i++) {
            this.grafo = new ListaDeAdjacencia((int)values[i]);
            inicio = System.nanoTime();
            this.grafo.addVertice();
            values[i] = System.nanoTime() - inicio;
            System.out.println(values[i]);
        }
        this.grafo = new ListaDeAdjacencia(0);
        return values;
    }
    
    
}
