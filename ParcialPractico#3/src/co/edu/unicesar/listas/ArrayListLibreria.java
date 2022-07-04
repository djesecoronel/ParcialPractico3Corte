package co.edu.unicesar.listas;

import co.edu.unicesar.excepciones.Excepciones;
import java.util.List;
import co.edu.unicesar.modelo.Libro;

public interface ArrayListLibreria {
    
    void registrar(Libro h) throws Excepciones;
    List<Libro> leer() throws Excepciones;
    Libro buscar(Libro h) throws Excepciones;
    Libro eliminar(Libro h)throws Excepciones;
    
}
