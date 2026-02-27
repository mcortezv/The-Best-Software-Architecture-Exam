package mvc;
import dto.EstudianteDTO;

/**
 * The interface Modelo escritura.
 *
 * @author Cortez, Manuel;
 */
public interface IModeloEscritura {

    /**
     * Sets filtro estudiantes.
     *
     * @param filtro the filtro
     */
    void setFiltroEstudiantes(String filtro);

    /**
     * Sets estudiante selecionado.
     *
     * @param dto the dto
     */
    void setEstudianteSelecionado(EstudianteDTO dto);

    /**
     * Generar constancia.
     */
    void generarConstancia();
}
