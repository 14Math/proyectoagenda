import java.util.ArrayList;

public interface GestionAgenda {

    ArrayList<Contacto> buscarTodos();
    boolean altacontacto(Contacto contacto );
    boolean eliminarcontacto(Contacto contacto);
    Contacto buscaruno(String nombre);
    Contacto buscartelefono(String telefono);
    Contacto buscaremail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);
    boolean cambiardatos(Contacto contacto);
    ArrayList<Contacto> buscarContactosPorEmpresa(String empresa);
    void exportarcontactos(String nombreFichero);
    void importarcontactos(String nombreFichero);
}
