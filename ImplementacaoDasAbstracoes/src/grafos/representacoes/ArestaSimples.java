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

/**
 *
 * @author Willian Soares
 */
public class ArestaSimples extends Aresta{

    public ArestaSimples(int destino, int origem, double peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }
    
    @Override
    public int getOrigem() {
        return this.origem;
    }

    @Override
    public void setOrigem(int origem) {
        this.origem = origem;
    }

    @Override
    public int getDestino() {
        return this.destino;
    }

    @Override
    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
