package dto;
import java.util.List;

/**
 * The type Estudiante dto.
 *
 * @author Cortez, Manuel;
 */
public class EstudianteDTO {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private int semestreInscrito;
    private List<MateriaDTO> materias;

    /**
     * Instantiates a new Estudiante dto.
     */
    public EstudianteDTO() {}

    /**
     * Gets correo.
     *
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets correo.
     *
     * @param correo the correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets carrera.
     *
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Sets carrera.
     *
     * @param carrera the carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Gets materias.
     *
     * @return the materias
     */
    public List<MateriaDTO> getMaterias() {
        return materias;
    }

    /**
     * Sets materias.
     *
     * @param materias the materias
     */
    public void setMaterias(List<MateriaDTO> materias) {
        this.materias = materias;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets semestre inscrito.
     *
     * @return the semestre inscrito
     */
    public int getSemestreInscrito() {
        return semestreInscrito;
    }

    /**
     * Sets semestre inscrito.
     *
     * @param semestreInscrito the semestre inscrito
     */
    public void setSemestreInscrito(int semestreInscrito) {
        this.semestreInscrito = semestreInscrito;
    }

    /**
     * Gets cantidad materias.
     *
     * @return the cantidad materias
     */
    public int getCantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return nombre + "\n" +
                id + "\n" +
                correo + "\n" +
                "Programa: " + carrera + "\n" +
                "Semestre: " + semestreInscrito + "\n" +
                "Numero Materias: " + getCantidadMaterias() + "\n";
    }
}
