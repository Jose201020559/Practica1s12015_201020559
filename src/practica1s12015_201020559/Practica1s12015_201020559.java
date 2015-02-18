/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201020559;

import java.io.IOException;

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
