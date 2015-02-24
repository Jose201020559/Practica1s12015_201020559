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
public class Practica1s12015_201020559 {

    /**
     * @param args the command line arguments
     */
    
    public static String hola = "";
    public static int cp=0;
    public static int cz=0;
    public static boolean vp=false;
    public static boolean vz=false;
    public static ListaJugadores jugadores = new ListaJugadores();
    public static ListaCatalogo plantas = new ListaCatalogo();
    public static ListaCatalogo zombis = new ListaCatalogo();
    
    
    public static void graficarcatalogo()throws IOException{
    @SuppressWarnings("UnusedAssignment")
    FileWriter archivo = null;
    PrintWriter printwriter = null;
    try{
        archivo = new FileWriter("C:\\Users\\Public\\Documents\\catalogos.dot");
        printwriter = new PrintWriter(archivo);
        printwriter.println("digraph g\n{\n");
        printwriter.println("node[shape=box,  color=gray]\n");
        printwriter.println("edge[color=black];\n");
        printwriter.println("rankdir=UD;\n");
        printwriter.println(plantas.graficard(plantas.inicio)); 
        printwriter.println(zombis.graficard(zombis.inicio)); 
        printwriter.println(  "INICIO -> " + plantas.inicio.Nombre +"; \n"); 
        printwriter.println(  "INICIO -> " + zombis.inicio.Nombre +"; \n"); 
        printwriter.println("}");
        printwriter.close();
    } catch (IOException ex) {
            }
    try{

            String dotPath="C:\\Program Files\\Graphviz 2.28\\bin\\dot.exe";
            String fileInputPath ="C:\\Users\\Public\\Documents\\catalogos.dot";
            String fileOutputPath="C:\\Users\\Public\\Documents\\catalogos.jpg";

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
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        
        
        /*jugadores.insertarJ("PLANTA");
        jugadores.insertarJ("ZOMBI");
        jugadores.insertarJ ("NADA");
        
        jugadores.InsertarDato(jugadores.buscar("ZOMBI"),"Jose");
        jugadores.InsertarDato(jugadores.buscar("ZOMBI"),"Pablo");
        jugadores.InsertarDato(jugadores.buscar("ZOMBI"),"Araiz");
        jugadores.InsertarDato(jugadores.buscar("ZOMBI"),"Lopez");
        
        jugadores.InsertarDato(jugadores.buscar("PLANTA"),"SEBAS");
        jugadores.InsertarDato(jugadores.buscar("PLANTA"),"ALEX");
        jugadores.InsertarDato(jugadores.buscar("PLANTA"),"LOPEZ");
        jugadores.InsertarDato(jugadores.buscar("PLANTA"),"CALDERON");
        
        jugadores.imprimir();
        jugadores.GraficarLista();*/
        
        Principal ventana = new Principal();
        ventana.show();
        
    }
    
}
