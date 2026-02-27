package dominio;
import java.time.LocalTime;

/**
 * The type Materia.
 *
 * @author Cortez, Manuel;
 */
public class Materia {
    private int codigo;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String dias;

    /**
     * Instantiates a new Materia.
     */
    public Materia() {}

    /**
     * Instantiates a new Materia.
     *
     * @param codigo     the codigo
     * @param nombre     the nombre
     * @param horaInicio the hora inicio
     * @param horaFin    the hora fin
     * @param dias       the dias
     */
    public Materia(int codigo, String nombre, LocalTime horaInicio, LocalTime horaFin, String dias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dias = dias;
    }

    /**
     * Gets codigo.
     *
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Sets codigo.
     *
     * @param codigo the codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Gets dias.
     *
     * @return the dias
     */
    public String getDias() {
        return dias;
    }

    /**
     * Sets dias.
     *
     * @param dias the dias
     */
    public void setDias(String dias) {
        this.dias = dias;
    }

    /**
     * Gets hora fin.
     *
     * @return the hora fin
     */
    public LocalTime getHoraFin() {
        return horaFin;
    }

    /**
     * Sets hora fin.
     *
     * @param horaFin the hora fin
     */
    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * Gets hora inicio.
     *
     * @return the hora inicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets hora inicio.
     *
     * @param horaInicio the hora inicio
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
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
}
