package dto;

import dominio.Estudiante;
import dominio.Materia;

import java.time.LocalDate;

public class ConstanciaDTO {
    private Estudiante estudiante;
    private int cicloLectivo;
    private LocalDate cicloFechaInicio;
    private LocalDate cicloFechaFin;
    private LocalDate fechaConstancia;
    private final String firma = "Ing. Jose Felizardo Acosta Quintero";
    private final String localidad = "Ciudad Obregón, Sonora";

    public ConstanciaDTO() {}

    public ConstanciaDTO(Estudiante estudiante, int cicloLectivo, LocalDate cicloFechaInicio,  LocalDate cicloFechaFin, LocalDate fechaConstancia) {
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

    @Override
    public String toString() {
        if (estudiante == null) {
            return "Constancia sin estudiante asignado.";
        }
        String materiasTexto = "";
        if (estudiante.getMaterias() != null && !estudiante.getMaterias().isEmpty()) {
            for (Materia materia : estudiante.getMaterias()) {
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
