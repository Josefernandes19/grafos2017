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
public abstract class Aresta{
    //implementar uma classe abstrata e substituir as implementações anteriores.    
    int origem, destino;
    double peso;

    public abstract int getOrigem();

    public abstract void setOrigem(int origem);

    public abstract int getDestino();

    public abstract void setDestino(int destino);

    public abstract double getPeso();

    public abstract void setPeso(double peso);
    

}
