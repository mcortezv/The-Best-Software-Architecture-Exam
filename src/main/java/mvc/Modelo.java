package mvc;
import dominio.*;
import dto.EstudianteDTO;
import mappers.ConstanciaMapper;
import mappers.EstudianteMapper;
import mvc.excepciones.ModeloException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Modelo.
 *
 * @author Cortez, Manuel;
 */
public class Modelo implements IModeloLectura, IModeloEscritura {
    private IDominio registroAcademico;
    private String filtroActual;
    private Estudiante estudianteSelecionado;
    private Constancia constanciaGenerada;
    private final List<ISuscriptor> suscriptores = new ArrayList<>();
    
    // Cache de datos pre-procesados
    private List<EstudianteDTO> estudiantesDTOCache;
    private String contenidoDetalleCache;
    private boolean cacheEstudiantesValida = false;
    private boolean cacheContenidoValida = false;

    /**
     * Instantiates a new Modelo.
     * Mock
     */
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

        this.registroAcademico = new RegistroAcademico(estudiantes);
        
        // Inicializar cache con datos iniciales
        regenerarCacheEstudiantes();
        regenerarCacheContenido();
    }

    @Override
    public void setFiltroEstudiantes(String filtro) {
        filtroActual = filtro;
        regenerarCacheEstudiantes();
        notificarSuscriptores();
    }

    @Override
    public void setEstudianteSelecionado(EstudianteDTO dto) {
        constanciaGenerada = null;
        estudianteSelecionado = EstudianteMapper.toEntity(dto);
        regenerarCacheContenido();
        notificarSuscriptores();
    }

    @Override
    public void generarConstancia() {
        if (estudianteSelecionado == null) {
            throw new ModeloException("No se selecciono ningun estudiante");
        }
        constanciaGenerada = registroAcademico.generarConstancia(estudianteSelecionado);
        regenerarCacheContenido();
        notificarSuscriptores();
    }

    @Override
    public List<EstudianteDTO> getEstudiantes() {
        if (!cacheEstudiantesValida) {
            regenerarCacheEstudiantes();
        }
        return estudiantesDTOCache;
    }

    @Override
    public String getContenidoDetalle() {
        if (!cacheContenidoValida) {
            regenerarCacheContenido();
        }
        return contenidoDetalleCache;
    }

    /**
     * Suscribir.
     *
     * @param suscriptor the suscriptor
     */
    public void suscribir(ISuscriptor suscriptor) {
        suscriptores.add(suscriptor);
    }

    /**
     * Notificar suscriptores.
     */
    public void notificarSuscriptores() {
        for (ISuscriptor suscriptor : suscriptores) {
            suscriptor.update(this);
        }
    }
    
    /**
     * Regenerar cache de estudiantes.
     */
    private void regenerarCacheEstudiantes() {
        List<Estudiante> estudiantesFiltrados;
        if (filtroActual != null && !filtroActual.isEmpty()) {
            estudiantesFiltrados = registroAcademico.getEstudiantesFiltro(filtroActual);
        } else {
            estudiantesFiltrados = registroAcademico.getEstudiantes();
        }
        
        estudiantesDTOCache = new ArrayList<>();
        for (Estudiante estudiante : estudiantesFiltrados) {
            estudiantesDTOCache.add(EstudianteMapper.toDTO(estudiante));
        }
        cacheEstudiantesValida = true;
    }
    
    /**
     * Regenerar cache de contenido detalle.
     */
    private void regenerarCacheContenido() {
        if (constanciaGenerada != null) {
            contenidoDetalleCache = ConstanciaMapper.toDTO(constanciaGenerada).toString();
        } else if (estudianteSelecionado != null) {
            contenidoDetalleCache = EstudianteMapper.toDTO(estudianteSelecionado).toString();
        } else {
            contenidoDetalleCache = null;
        }
        cacheContenidoValida = true;
    }
}
