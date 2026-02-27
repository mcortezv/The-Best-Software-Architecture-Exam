package mvc;
import dominio.Constancia;
import dominio.Estudiante;
import dominio.Materia;
import dominio.RegistroEstudiantes;
import dto.EstudianteDTO;
import mappers.ConstanciaMapper;
import mappers.EstudianteMapper;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Modelo implements IModeloLectura, IModeloEscritura {
    private RegistroEstudiantes registroEstudiantes;
    private Integer filtroActual;
    private Estudiante estudianteSelecionado;
    private Constancia constanciaGenerada;
    private final List<ISuscriptor> suscriptores = new ArrayList<>();

    // Mock
    public Modelo() {

        List<Estudiante> estudiantes = new ArrayList();
        List<Materia> materias = new ArrayList();

        materias.add(new Materia(8103, "Seguridad Informatica", LocalTime.of(15, 0, 0), LocalTime.of(16, 30, 0),"MaJu"));
        materias.add(new Materia(8103, "Administracion de Proyectos", LocalTime.of(13, 30, 0), LocalTime.of(15, 0, 0),"Vi"));
        materias.add(new Materia(8103, "Administracion de Proyectos", LocalTime.of(13, 30, 0), LocalTime.of(15, 0, 0),"Lu"));
        materias.add(new Materia(8103, "Modelado de Procesos", LocalTime.of(16, 30, 0), LocalTime.of(18, 0, 0),"Vi"));
        materias.add(new Materia(8103, "Modelado de Procesos", LocalTime.of(16, 30, 0), LocalTime.of(18, 0, 0),"Lu"));
        materias.add(new Materia(8103, "Arquitectura de Software", LocalTime.of(15, 0, 0), LocalTime.of(16, 30, 0),"LuMi"));
        materias.add(new Materia(8103, "Aplicaciones Web", LocalTime.of(18, 0, 0), LocalTime.of(19, 30, 0),"MaJu"));

        estudiantes.add(new Estudiante(258835, "Manuel Cortez", "manuel@gmail.com", "Ingenieria en Software", 4, materias));
        estudiantes.add(new Estudiante(252321, "German Morelli", "german@gmail.com", "Ingenieria en Software", 2, materias));
        estudiantes.add(new Estudiante(254276, "Cristian Devora", "cristian@gmail.com", "Ingenieria en Software", 6, materias));

        this.registroEstudiantes = new RegistroEstudiantes(estudiantes);
    }

    @Override
    public void setFiltroEstudiantes(int filtro) {
        filtroActual = filtro;
        notificarSuscriptores();
    }

    @Override
    public void setEstudianteSelecionado(EstudianteDTO dto) {
        estudianteSelecionado = EstudianteMapper.toEntity(dto);
        notificarSuscriptores();
    }

    @Override
    public void generarConstancia() {
        if (estudianteSelecionado != null) {
            constanciaGenerada = registroEstudiantes.generarConstancia(estudianteSelecionado);
        }
        notificarSuscriptores();
    }

    @Override
    public List<EstudianteDTO> getEstudiantes() {
        List<Estudiante> estudiantesFiltrados;
        if (filtroActual != null){
            estudiantesFiltrados = registroEstudiantes.getEstudiantesFiltro(filtroActual);
        } else {
            estudiantesFiltrados = registroEstudiantes.getEstudiantes();
        }
        List<EstudianteDTO> estudiantesDTO = new ArrayList();
        for (Estudiante estudiante : estudiantesFiltrados) {
            estudiantesDTO.add(EstudianteMapper.toDTO(estudiante));
        }
        return estudiantesDTO;
    }

    @Override
    public String getContenidoDetalle() {
        if (constanciaGenerada != null) {
            return ConstanciaMapper.toDTO(constanciaGenerada).toString();
        }
        if (estudianteSelecionado != null) {
            return EstudianteMapper.toDTO(estudianteSelecionado).toString();
        }
        return null;
    }

    public void suscribir(ISuscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    public void notificarSuscriptores() {
        for (ISuscriptor suscriptor : suscriptores) {
            suscriptor.update(this);
        }
    }
}
