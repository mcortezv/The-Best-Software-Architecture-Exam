package dto;
import java.time.LocalDate;

/**
 * The type Constancia dto.
 */
public class ConstanciaDTO {
    private EstudianteDTO estudiante;
    private int cicloLectivo;
    private LocalDate cicloFechaInicio;
    private LocalDate cicloFechaFin;
    private LocalDate fechaConstancia;
    private final String firma = "Ing. Jose Felizardo Acosta Quintero";
    private final String localidad = "Ciudad Obregón, Sonora";

    /**
     * Instantiates a new Constancia dto.
     */
    public ConstanciaDTO() {}

    /**
     * Sets ciclo fecha fin.
     *
     * @param cicloFechaFin the ciclo fecha fin
     */
    public void setCicloFechaFin(LocalDate cicloFechaFin) {
        this.cicloFechaFin = cicloFechaFin;
    }

    /**
     * Sets ciclo fecha inicio.
     *
     * @param cicloFechaInicio the ciclo fecha inicio
     */
    public void setCicloFechaInicio(LocalDate cicloFechaInicio) {
        this.cicloFechaInicio = cicloFechaInicio;
    }

    /**
     * Sets ciclo lectivo.
     *
     * @param cicloLectivo the ciclo lectivo
     */
    public void setCicloLectivo(int cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

    /**
     * Sets estudiante.
     *
     * @param estudiante the estudiante
     */
    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Sets fecha constancia.
     *
     * @param fechaConstancia the fecha constancia
     */
    public void setFechaConstancia(LocalDate fechaConstancia) {
        this.fechaConstancia = fechaConstancia;
    }

    @Override
    public String toString() {
        if (estudiante == null) {
            return "Constancia sin estudiante asignado.";
        }
        String materiasTexto = "";
        if (estudiante.getMaterias() != null && !estudiante.getMaterias().isEmpty()) {
            for (MateriaDTO materia : estudiante.getMaterias()) {
                materiasTexto += "- "
                        + materia.getCodigo() + " "
                        + materia.getNombre() + " "
                        + materia.getHoraInicio() + " - "
                        + materia.getHoraFin() + " "
                        + materia.getDias()
                        + "\n";
            }
        } else {
            materiasTexto = "No tiene materias registradas.\n";
        }

        return "Instituto Tecnológico de Sonora\n"
                + "Departamento de Registro Escolar\n\n"
                + "El suscrito Administrador de Servicios Escolares del Instituto Tecnológico de Sonora,\n"
                + "según la información que existe en las bases de datos escolares, hace constar que:\n\n"
                + "Con ID: " + estudiante.getId()
                + " está inscrito en el ciclo lectivo " + cicloLectivo + ".\n"
                + "Periodo comprendido del "
                + cicloFechaInicio.getDayOfMonth() + "/"
                + cicloFechaInicio.getMonthValue() + "/"
                + cicloFechaInicio.getYear()
                + " al "
                + cicloFechaFin.getDayOfMonth() + "/"
                + cicloFechaFin.getMonthValue() + "/"
                + cicloFechaFin.getYear()
                + ".\n\n"
                + "Programa: " + estudiante.getCarrera() + ".\n\n"
                + "Cursando las siguientes asignaturas:\n"
                + materiasTexto
                + "\nSe extiende la presente constancia en "
                + localidad + ", el "
                + fechaConstancia.getDayOfMonth() + "/"
                + fechaConstancia.getMonthValue() + "/"
                + fechaConstancia.getYear()
                + ".\n\n"
                + firma + "\n"
                + "Administrador de Servicios Escolares";
    }
}
