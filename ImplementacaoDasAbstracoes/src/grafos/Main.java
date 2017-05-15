/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;
import grafos.representacoes.MatrizDeAdjacencia;
import grafos.representacoes.MatrizDeIncidencia;
import java.util.List;
/**
 *
 * @author a14034
 */
public class Main {
    public static void main(String[] args) {
        MatrizDeIncidencia g = new MatrizDeIncidencia(6);
        g.addAresta(1, 3);
        g.addAresta(1, 5);
        System.out.println(g.getPeso(0, 1));
        System.out.println(g.getPeso(1, 3));
        System.out.println(g.isAdjacente(1, 5));
        System.out.println(g.isAdjacente(5, 1));
        List<Integer> adjs = g.getAdjacentes(1);
        System.out.println(adjs.size());
        System.out.println("---------------\nadjs de 1:");
        for (Integer adj : adjs) {
            System.out.println("\t"+adj);
        }
    }
}
