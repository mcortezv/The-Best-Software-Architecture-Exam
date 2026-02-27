package assembler;
import mvc.Controlador;
import mvc.Modelo;
import mvc.VistaConstancias;

/**
 * The type Main.
 */
public class Main {

    /**
     * Main.
     */
    static void main() {

        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        VistaConstancias vistaConstancias = new VistaConstancias(controlador, modelo);
        modelo.suscribir(vistaConstancias);
        vistaConstancias.update(modelo);
        vistaConstancias.setVisible(true);
    }
}
