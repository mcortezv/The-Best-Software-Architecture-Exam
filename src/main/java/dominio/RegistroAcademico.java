package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Registro academico.
 *
 * @author Cortez, Manuel;
 */
public class RegistroAcademico implements IDominio {
    private List<Estudiante> estudiantes;
    private final int cicloLectivo = 6;
    private final LocalDate cicloFechaInicio = LocalDate.of(2026, 1, 19);
    private final LocalDate cicloFechaFin = LocalDate.of(2026, 5, 23);
    private final LocalDate fechaConstancia = LocalDate.now();

    /**
     * Instantiates a new Registro academico.
     *
     * @param estudiantes the estudiantes
     * Mock
     */
    public RegistroAcademico(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public List<Estudiante> getEstudiantesFiltro(String filtro) {
        List<Estudiante> filtrados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (String.valueOf(estudiante.getId()).contains(filtro) ||
                estudiante.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                filtrados.add(estudiante);
            }
        }
        return filtrados;
    }

    @Override
    public Constancia generarConstancia(Estudiante estudiante) {
        return new Constancia(estudiante, cicloLectivo, cicloFechaInicio, cicloFechaFin, fechaConstancia);
    }
}
