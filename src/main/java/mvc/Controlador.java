package mvc;
import dto.EstudianteDTO;
import mvc.excepciones.ControladorException;
import mvc.excepciones.ModeloException;

/**
 * The type Controlador.
 */
public class Controlador implements IControlador {
    private IModeloEscritura modelo;

    /**
     * Instantiates a new Controlador.
     *
     * @param modelo the modelo
     */
    public Controlador(IModeloEscritura modelo) {
        this.modelo = modelo;
    }

    public void setFiltroEstudiantes(String filtro){
        modelo.setFiltroEstudiantes(filtro);
    }

    public void setEstudianteSelecionado(EstudianteDTO dto){
        modelo.setEstudianteSelecionado(dto);
    }

    public void generarConstancia(){
        try {
            modelo.generarConstancia();
        } catch (ModeloException ex) {
            throw new ControladorException(ex.getMessage());
        }
    }
}
