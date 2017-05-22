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
        long[] values = {3, 13, 130, 1300, 13000, 130000, 1300000, 13000000};
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
