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
public class NodoJugadores {
    public String Tipo;
    public NodoJugadores Siguiente;
    public ListaDatos datos;
    
    public NodoJugadores(String tipo){
        this.Tipo=tipo;
        this.Siguiente = null;
        this.datos=new ListaDatos();
    }
    
 
}
