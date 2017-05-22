/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;
import grafos.representacoes.ListaDeAdjacencia;
import grafos.representacoes.MatrizDeAdjacencia;
import grafos.representacoes.MatrizDeIncidencia;
import java.util.List;
/**
 *
 * @author a14034
 */
public class Main {
    public static void main(String[] args) {
        //TestAddArestaListaAdjacencia testAddArestaListaAdjacencia = new TestAddArestaListaAdjacencia();
        //TestAddArestaMatrizAdjacencia testAddArestaMatrizAdjacencia = new TestAddArestaMatrizAdjacencia();
        
        //TestAddVerticeListaAdjacencia testAddVerticeListaAdjacencia = new TestAddVerticeListaAdjacencia();
        TestAddVerticeMatrizAdjacencia testAddVerticeMatrizAdjacencia = new TestAddVerticeMatrizAdjacencia();
        
        //testAddArestaListaAdjacencia.testSequencial();
        //testAddArestaMatrizAdjacencia.testSequencial();
        //testAddVerticeListaAdjacencia.testSequencial();
        testAddVerticeMatrizAdjacencia.testSequencial();
    }
}
