/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201020559;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jose
 */
public class ListaJugadores {
    
    public NodoJugadores inicio;
    public NodoJugadores fin;
    public int t;
    
    public ListaJugadores(){
        this.inicio=null;
        this.fin = null;
        this.t = 0;
    }
    
    public void insertarJ(String tipo){
        NodoJugadores nuevo = new NodoJugadores(tipo);
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
    
    public void imprimir(){
        NodoJugadores aux;
        aux = this.inicio;
        while(aux!=null){
            System.out.println("TIPO: "+ aux.Tipo);
            aux.datos.imprimir(aux.datos.inicio);
            aux = aux.Siguiente;
        }
    }

   public NodoJugadores buscar(String t){
       NodoJugadores aux ;
       NodoJugadores aux1 ;
       aux = this.inicio;
       aux1=null;
       while(aux!=null ){
           if(aux.Tipo.equalsIgnoreCase(t)){
               aux1=aux;
           }
           aux=aux.Siguiente;
       }
        return aux1;
   }

   public void InsertarDato(NodoJugadores jugador, String t){
       jugador.datos.insertarDatos(t);
       
   }

   public void GraficarLista() throws IOException{
    @SuppressWarnings("UnusedAssignment")
    FileWriter archivo = null;
    PrintWriter printwriter = null;
    try{
        archivo = new FileWriter("C:\\Users\\Public\\Documents\\jugadores.dot");
        printwriter = new PrintWriter(archivo);
        printwriter.println("digraph g\n{\n");
        printwriter.println("node[shape=box,  color=Black]\n");
        printwriter.println("edge[color=black];\n");
        printwriter.println("rankdir=UD;\n");
        NodoJugadores aux;
        aux = this.inicio;
        NodoDatos aux1;
        aux1=aux.datos.inicio;
        while(aux!=null){
            /*if(aux.Siguiente!=null){
            printwriter.println( aux.Tipo + " -> " + aux.Siguiente.Tipo +"; \n"); 
            }
            printwriter.println( aux.Tipo + " -> " + aux.datos.inicio.dato +"; \n");*/
            printwriter.println(aux.datos.graficard(aux.datos.inicio)); 
            aux = aux.Siguiente;
        }    
        aux = this.inicio;
        printwriter.println(  "INICIO -> " + aux.Tipo +"; \n"); 
        while(aux!=null){
            if(aux.Siguiente!=null){
            printwriter.println( aux.Tipo + " -> " + aux.Siguiente.Tipo +"; \n"); 
            }
            if(aux.datos.inicio!=null){
                printwriter.println( aux.Tipo + " -> " + aux.datos.inicio.dato +"; \n");
            }
            aux = aux.Siguiente;
        }   
        printwriter.println("}");
        printwriter.close();
    } catch (IOException ex) {
            }
    try{

            String dotPath="C:\\Program Files\\Graphviz 2.28\\bin\\dot.exe";
            String fileInputPath ="C:\\Users\\Public\\Documents\\jugadores.dot";
            String fileOutputPath="C:\\Users\\Public\\Documents\\jugadores.jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";
       
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;
                  
            Runtime rt = Runtime.getRuntime();
      
            rt.exec( cmd );
      
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
            }
   }
}

