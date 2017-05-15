/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
