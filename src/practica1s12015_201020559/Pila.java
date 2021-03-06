/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201020559;

import javax.swing.Icon;

/**
 *
 * @author jpara_000
 */
public class Pila {
     public NodoCatalogo inicio;
    public NodoCatalogo fin;
    public int tama;
    
    public Pila(){
        this.inicio=null;
        this.fin = null;
        this.tama=0;
    }
    
    public void insertarDatos(String n, String t, int a, int v, Icon i){
        NodoCatalogo nuevo = new NodoCatalogo(n,t,a,v,i);
        if(this.tama ==0){
            this.inicio=nuevo;
            this.fin =nuevo;
            this.tama++;
        }
        else{
            nuevo.Siguiente=this.inicio;
            this.inicio.Aterior=nuevo;
            this.inicio=nuevo;
            this.tama++;
        }
        
    }
    
    public void eliminar(){
        if(this.tama>0){
            this.inicio.Siguiente.Aterior=null;
            this.inicio = this.inicio.Siguiente;
            this.tama--;
        }
        else if(this.tama==1){
            this.inicio=null;
            this.fin=null;
            tama =0;
        }
    }
    public void imprimir(){
        
       NodoCatalogo aux;
        aux = this.inicio;
        while(aux!=null){
            System.out.println("TIPO: "+ aux.Nombre);
            aux = aux.Siguiente;
        }
    }
    
    public String graficard(NodoCatalogo aux){
        String dato = "";
        dato+="subgraph { \n";
        dato+="style=filled; \n";
        dato+="color=lightgrey; \n";
        dato+="node [shape=circle, color=green]; \n";
        while(aux!=null){
            if(aux.Siguiente!=null){
                dato+= aux.Nombre + " -> " + aux.Siguiente.Nombre +"; \n";
            }
            aux=aux.Siguiente;
        }
        dato+="}";
        return dato;
    }
    
}
