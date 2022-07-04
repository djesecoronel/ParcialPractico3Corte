
package co.edu.unicesar.listas;

import co.edu.unicesar.modelo.Publicacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import co.edu.unicesar.persistencia.IPublicacion;

public class ArrayListPublicacion implements IPublicacion {
    private List<Publicacion> listaPublicacion;

    public ArrayListPublicacion() {
        this.listaPublicacion = new ArrayList();
    }
    
    
    @Override
    public void insertarPublicacion(Publicacion p) {
        this.listaPublicacion.add(p);
    }

    @Override
    public List<Publicacion> leerPublicaciones() {
       List<Publicacion> lista = new ArrayList(this.listaPublicacion);
       return lista;
    }

    @Override
    public Publicacion buscarPublicacion(Publicacion p) {
        Publicacion buscar=null;
        for(Publicacion i: this.listaPublicacion){
            if(i.getIdbn().equalsIgnoreCase(p.getIdbn())){
                buscar = i;
                break;
            }
        }
        return buscar;
        
    }

    @Override
    public Publicacion eliminarPublicacion(Publicacion p) {
        Iterator<Publicacion> i = this.listaPublicacion.iterator();
        Publicacion eliminado=null;
        while(i.hasNext()){
            Publicacion aux = i.next();
            if(aux.getIdbn().equalsIgnoreCase(p.getIdbn())){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }
    
}
