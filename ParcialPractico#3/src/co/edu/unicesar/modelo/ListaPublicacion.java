/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.modelo;

import co.edu.unicesar.listas.ArrayListPublicacion;
import java.util.List;
import co.edu.unicesar.persistencia.IPublicacion;

/**
 *
 * @author JAIRO
 */
public class ListaPublicacion implements IPublicacion {
    
    private IPublicacion registroPublicaciones;

    public ListaPublicacion() {
        this.registroPublicaciones = new ArrayListPublicacion();
    }
    
    
    @Override
    public void insertarPublicacion(Publicacion p) {
        
        this.registroPublicaciones.insertarPublicacion(p);
        
    }

    @Override
    public List<Publicacion> leerPublicaciones() {
        
        return this.registroPublicaciones.leerPublicaciones();
        
    }

    @Override
    public Publicacion buscarPublicacion(Publicacion p) {
        
        return this.registroPublicaciones.buscarPublicacion(p);
        
    }

    @Override
    public Publicacion eliminarPublicacion(Publicacion p) {
        
        return this.registroPublicaciones.eliminarPublicacion(p);
        
    }
    
}
