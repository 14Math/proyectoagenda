
import java.util.Scanner;

public class Testing {

    private static AgendaContactos adao;
    private static Scanner leer;

    static {
        adao = new AgendaContactos();
        leer = new Scanner(System.in);
    }
    public static void main(String[] args) {
        leerUno();
        leerTelefono();
        leerEmail();
        altaContacto();


    }
    public static void altaContacto() {

        Contacto contactoNew = new Contacto("crustacio","Krujiente","7895213", "crus@yahoot.com", "microsoft") ;
        System.out.println("Contacto insertado : " + adao.altacontacto(contactoNew));
        for (Contacto con: adao.buscarTodos()) {
            System.out.println(con);
        }
    }

    public static void leerUno() {
        String nombre = leer.next();
        Contacto con = adao.buscaruno(nombre);
        if (con != null)
            System.out.println(con);
        else
            System.out.println("Este contacto no existe");
    }

    public static void leerTelefono() {
        String telefono = leer.next();
        Contacto con = adao.buscaruno(telefono);
        if (con != null)
            System.out.println(con);
        else
            System.out.println("Este numero de telefono no existe");
    }

    public static void leerEmail() {
        String email = leer.next();
        Contacto con = adao.buscaruno(email);
        if (con != null)
            System.out.println(con);
        else
            System.out.println("Este correo electronico no existe");
    }
}
