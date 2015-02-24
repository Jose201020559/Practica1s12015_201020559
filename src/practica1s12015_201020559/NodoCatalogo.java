/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201020559;

import javax.swing.Icon;

/**
 *
 * @author Jose
 */
public class NodoCatalogo {
    
    public String Nombre;
    public String Tipo;
    public int ataque;
    public int vida;
    public Icon imagen;
    public NodoCatalogo Siguiente;
    public NodoCatalogo Aterior;

    
    public NodoCatalogo(String n, String t, int a, int v, Icon i){
        this.Nombre = n;
        this.Tipo = t;
        this.ataque = a;
        this.vida = v;
        this.imagen = i;
        this.Siguiente = null;
        this.Aterior = null;
    }
    
}
