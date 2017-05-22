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

import java.util.List;

/**
 *
 * @author Willian Soares
 */
public interface Grafo {

    public int getNumeroDeVertices();

    public void addAresta(int origem, int destino);

    public void addAresta(int origem, int destino, double peso);

    public void setAresta(int origem, int destino);

    public void setAresta(int origem, int destino, double peso);

    public void removeAresta(int origem, int destino);

    public boolean isAdjacente(int origem, int destino);

    public List getAdjacentes(int vertice);

    public double getPeso(int origem, int destino);
    
    public void addVertice();
    
}
