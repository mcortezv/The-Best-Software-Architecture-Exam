package assembler;
import mvc.Controlador;
import mvc.Modelo;
import mvc.VistaConstancias;

/**
 * The type Main.
 *
 * @author Cortez, Manuel;
 */
public class Main {

    /**
     * Main.
     */
    public static void main(String[] args) {

        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        VistaConstancias vistaConstancias = new VistaConstancias(controlador, modelo);
        modelo.suscribir(vistaConstancias);
        vistaConstancias.update(modelo);
        vistaConstancias.setVisible(true);
    }
}
