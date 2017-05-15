/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.representacoes;

/**
 *
 * @author a14034
 */
public class ArestaSimples extends Aresta{

    public ArestaSimples(int destino, int origem, int peso) {
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
