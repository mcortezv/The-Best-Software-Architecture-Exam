package dominio;
import java.time.LocalDate;

/**
 * The type Constancia.
 */
public class Constancia {
    private Estudiante estudiante;
    private int cicloLectivo;
    private LocalDate cicloFechaInicio;
    private LocalDate cicloFechaFin;
    private LocalDate fechaConstancia;
    private final String firma = "Ing. Jose Felizardo Acosta Quintero";
    private final String localidad = "Ciudad Obregón, Sonora";

    /**
     * Instantiates a new Constancia.
     */
    public Constancia() {}

    /**
     * Instantiates a new Constancia.
     *
     * @param estudiante       the estudiante
     * @param cicloLectivo     the ciclo lectivo
     * @param cicloFechaInicio the ciclo fecha inicio
     * @param cicloFechaFin    the ciclo fecha fin
     * @param fechaConstancia  the fecha constancia
     */
    public Constancia(Estudiante estudiante, int cicloLectivo, LocalDate cicloFechaInicio,  LocalDate cicloFechaFin, LocalDate fechaConstancia) {
        this.estudiante = estudiante;
        this.cicloLectivo = cicloLectivo;
        this.cicloFechaInicio = cicloFechaInicio;
        this.cicloFechaFin = cicloFechaFin;
        this.fechaConstancia = fechaConstancia;
    }

    /**
     * Gets ciclo fecha fin.
     *
     * @return the ciclo fecha fin
     */
    public LocalDate getCicloFechaFin() {
        return cicloFechaFin;
    }

    /**
     * Gets ciclo fecha inicio.
     *
     * @return the ciclo fecha inicio
     */
    public LocalDate getCicloFechaInicio() {
        return cicloFechaInicio;
    }

    /**
     * Gets ciclo lectivo.
     *
     * @return the ciclo lectivo
     */
    public int getCicloLectivo() {
        return cicloLectivo;
    }

    /**
     * Gets estudiante.
     *
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Gets fecha constancia.
     *
     * @return the fecha constancia
     */
    public LocalDate getFechaConstancia() {
        return fechaConstancia;
    }
}
