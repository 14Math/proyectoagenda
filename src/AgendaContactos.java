import java.util.ArrayList;

public class AgendaContactos {

    private String nombreAgenda;
    private ArrayList<Contacto> lista;

    public AgendaContactos() {

        lista = new ArrayList<>();
        cargarContactos();
    }

    private void cargarContactos() {
        lista.add(new Contacto("Keven", "Goat", "59997233", "keven@ifp.com", "sime"));
        lista.add(new Contacto("Bob", "esponj", "63389953", "bob@yahoot.com", "bbva"));
        lista.add(new Contacto("Patricio", "estrella", "63389953", "estrella@yahoot.com", "samsung"));
        lista.add(new Contacto("Patricia", "estrella", "63389953", "estrella@yahoot.com", "samsung"));

    }

    public ArrayList<Contacto> buscarTodos() {
        // TODO Auto-generated method stub
        return lista;
    }


    public boolean altacontacto(Contacto contacto) {
        if (!lista.contains(contacto)) {
            return lista.add(contacto);
        }else
            return false;
    }


    public boolean eliminarcontacto(Contacto contacto) {
        return lista.remove(contacto);
    }


    public Contacto buscaruno(String nombre) {
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        int pos = lista.indexOf(contacto);
        if (pos == -1)
            return null;
        else
            return lista.get(pos);
    }


    public Contacto buscartelefono(String telefono) {
        for(Contacto con :lista) {
            if(con.getTelefono().equals(telefono)) {
                return con;
            }
        }
        return null;
    }



    public Contacto buscaremail(String email) {
        for(Contacto con :lista) {
            if(con.getEmail().equals(email)) {
                return con;
            }
        }
        return null;
    }


    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> aux = new ArrayList<>();
        for(Contacto con :lista) {
            if(con.getNombre().substring(0,3).equals(nombre.substring(0,3))) {
                aux.add(con);
            }
        }
        return aux;
    }


    public boolean cambiardatos(Contacto contacto) {
        return false;
    }


    public ArrayList<Contacto> buscarContactosPorEmpresa(String empresa) {
        ArrayList<Contacto> emp = new ArrayList<>();
        for(Contacto con :lista) {
            if(con.getEmpresa().equals(empresa)) {
                emp.add(con);
            }
        }
        return emp;
    }


    public void exportarcontactos(String nombreFichero) {
        // TODO Auto-generated method stub

    }


    public void importarcontactos(String nombreFichero) {
        // TODO Auto-generated method stub

    }
}
