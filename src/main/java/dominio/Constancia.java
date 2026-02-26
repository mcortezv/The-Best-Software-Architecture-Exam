package dominio;
import java.time.LocalDate;

public class Constancia {
    private Estudiante estudiante;
    private int cicloLectivo;
    private LocalDate cicloFechaInicio;
    private LocalDate cicloFechaFin;
    private LocalDate fechaConstancia;
    private final String firma = "Ing. Jose Felizardo Acosta Quintero";
    private final String localidad = "Ciudad Obregón, Sonora";

    public Constancia() {}

    public Constancia(Estudiante estudiante, int cicloLectivo, LocalDate cicloFechaInicio,  LocalDate cicloFechaFin, LocalDate fechaConstancia) {
        this.estudiante = estudiante;
        this.cicloLectivo = cicloLectivo;
        this.cicloFechaInicio = cicloFechaInicio;
        this.cicloFechaFin = cicloFechaFin;
        this.fechaConstancia = fechaConstancia;
    }

    public LocalDate getCicloFechaFin() {
        return cicloFechaFin;
    }

    public void setCicloFechaFin(LocalDate cicloFechaFin) {
        this.cicloFechaFin = cicloFechaFin;
    }

    public LocalDate getCicloFechaInicio() {
        return cicloFechaInicio;
    }

    public void setCicloFechaInicio(LocalDate cicloFechaInicio) {
        this.cicloFechaInicio = cicloFechaInicio;
    }

    public int getCicloLectivo() {
        return cicloLectivo;
    }

    public void setCicloLectivo(int cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaConstancia() {
        return fechaConstancia;
    }

    public void setFechaConstancia(LocalDate fechaConstancia) {
        this.fechaConstancia = fechaConstancia;
    }

    public String getFirma() {
        return firma;
    }

    public String getLocalidad() {
        return localidad;
    }
}
