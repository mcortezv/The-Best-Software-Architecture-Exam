package dominio;
import java.util.List;

/**
 * The interface Dominio.
 */
public interface IDominio {

    /**
     * Gets estudiantes.
     *
     * @return the estudiantes
     */
    List<Estudiante> getEstudiantes();

    /**
     * Gets estudiantes filtro.
     *
     * @param filtro the filtro
     * @return the estudiantes filtro
     */
    List<Estudiante> getEstudiantesFiltro(String filtro);

    /**
     * Generar constancia constancia.
     *
     * @param estudiante the estudiante
     * @return the constancia
     */
    Constancia generarConstancia(Estudiante estudiante);
}
