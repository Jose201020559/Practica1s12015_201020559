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
public class NodoDatos {
    public String dato;
    public NodoDatos Siguiente;
    
    public NodoDatos(String d){
        this.dato=d;
        this.Siguiente = null;
    }
}
