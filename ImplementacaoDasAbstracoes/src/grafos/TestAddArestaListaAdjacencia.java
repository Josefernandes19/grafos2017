/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import grafos.representacoes.ListaDeAdjacencia;

/**
 *
 * @author wills
 */
public class TestAddArestaListaAdjacencia {
    ListaDeAdjacencia grafo;

    public TestAddArestaListaAdjacencia() {
        this.grafo = new ListaDeAdjacencia(0);
    }
    
    public long[] testSequencial(){
        long[] values = {1, 13, 130, 500, 1300, 2600, 5000, 8000, 13000, 26000, 50000, 130000};
        long inicio;
        for (int i = 0; i < values.length; i++) {
            this.grafo = new ListaDeAdjacencia((int)values[i]);
            for (int j = 0; j < values[i]; j++) {
                this.grafo.addAresta(1, j);
            }
            inicio = System.nanoTime();
            this.grafo.addAresta(1, (int)values[i]+1);
            values[i] = System.nanoTime() - inicio;
            System.out.println(values[i]);
        }
        return values;
    }
}
