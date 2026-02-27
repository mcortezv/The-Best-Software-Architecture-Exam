package dominio;
import java.time.LocalDate;
import java.util.List;

/**
 * The type Registro estudiantes.
 */
public class RegistroEstudiantes implements IDominio {
    private List<Estudiante> estudiantes;
    private final int cicloLectivo = 6;
    private final LocalDate cicloFechaInicio = LocalDate.of(2026, 1, 19);
    private final LocalDate cicloFechaFin = LocalDate.of(2026, 5, 23);
    private final LocalDate fechaConstancia = LocalDate.now();

    /**
     * Instantiates a new Registro estudiantes.
     *
     * @param estudiantes the estudiantes
     * Mock
     */
    public RegistroEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public List<Estudiante>  getEstudiantesFiltro(String filtro) {
        return estudiantes.stream().filter(e -> String.valueOf(e.getId()).contains(String.valueOf(filtro))).toList();
    }

    @Override
    public Constancia generarConstancia(Estudiante estudiante) {
        return new Constancia(estudiante, cicloLectivo, cicloFechaInicio, cicloFechaFin, fechaConstancia);
    }
}
