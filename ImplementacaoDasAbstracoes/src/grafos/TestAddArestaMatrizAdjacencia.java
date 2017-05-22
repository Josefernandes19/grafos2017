/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import grafos.representacoes.MatrizDeAdjacencia;

/**
 *
 * @author wills
 */
public class TestAddArestaMatrizAdjacencia {
    MatrizDeAdjacencia grafo;
    
    public TestAddArestaMatrizAdjacencia() {
        this.grafo = new MatrizDeAdjacencia(0);
    }
    
    public long[] testSequencial(){
        long[] values = {1, 13, 130, 500, 1300, 2600, 5000, 8000, 13000, 26000, 50000, 130000};
        long inicio;
        for (int i = 0; i < values.length; i++) {
            this.grafo = new MatrizDeAdjacencia((int)values[i]);
            inicio = System.nanoTime();
            grafo.addAresta((int)values[i]-1, (int)values[i]-1);
            values[i] = System.nanoTime() - inicio;
            System.out.println(values[i]);
        }
        return values;
    }
}
