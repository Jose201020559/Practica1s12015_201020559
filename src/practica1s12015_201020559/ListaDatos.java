/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201020559;

/**
 *
 * @author Jose
 */
public class ListaDatos {
    public NodoDatos inicio;
    public NodoDatos fin;
    public int t;
    
    public ListaDatos(){
        this.inicio=null;
        this.fin = null;
        this.t = 0;
    }
    
    public void insertarDatos(String D){
        NodoDatos nuevo = new NodoDatos(D);
        if(this.t ==0){
            this.inicio=nuevo;
            this.fin =nuevo;
            this.t++;
        }
        else{
            this.fin.Siguiente=nuevo;
            this.fin=nuevo;
            this.t++;
        }
        
    }
    public void imprimir(NodoDatos aux){
        
        while(aux!=null){
            System.out.println("DATO: "+ aux.dato);
            aux = aux.Siguiente;
        }
    }
    
    public String graficard(NodoDatos aux){
        String dato = "";
        dato+="subgraph { \n";
        dato+="style=filled; \n";
        dato+="color=lightgrey; \n";
        dato+="node [shape=circle, color=orange]; \n";
        while(aux!=null){
            if(aux.Siguiente!=null){
                dato+= aux.dato + " -> " + aux.Siguiente.dato +"; \n";
            }
            aux=aux.Siguiente;
        }
        dato+="}";
        return dato;
    }
}
