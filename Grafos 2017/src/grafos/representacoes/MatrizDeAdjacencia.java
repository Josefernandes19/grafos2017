package grafos.representacoes;

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

}
