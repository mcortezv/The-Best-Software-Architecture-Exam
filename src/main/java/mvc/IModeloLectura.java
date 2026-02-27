package mvc;
import dto.EstudianteDTO;
import java.util.List;

/**
 * The interface Modelo lectura.
 *
 * @author Cortez, Manuel;
 */
public interface IModeloLectura {

    /**
     * Gets estudiantes.
     *
     * @return the estudiantes
     */
    List<EstudianteDTO> getEstudiantes();

    /**
     * Gets contenido detalle.
     *
     * @return the contenido detalle
     */
    String getContenidoDetalle();
}
