package dominio;
import java.util.List;

/**
 * The type Estudiante.
 */
public class Estudiante {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private int semestreInscrito;
    private List<Materia> materias;

    /**
     * Instantiates a new Estudiante.
     */
    public Estudiante() {}

    /**
     * Instantiates a new Estudiante.
     *
     * @param id               the id
     * @param nombre           the nombre
     * @param correo           the correo
     * @param carrera          the carrera
     * @param semestreInscrito the semestre inscrito
     * @param materias         the materias
     */
    public Estudiante(int id, String nombre, String correo, String carrera, int semestreInscrito, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.semestreInscrito = semestreInscrito;
        this.materias = materias;
    }

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
    public List<Materia> getMaterias() {
        return materias;
    }

    /**
     * Sets materias.
     *
     * @param materias the materias
     */
    public void setMaterias(List<Materia> materias) {
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
}
