package mvc;
import dto.EstudianteDTO;

public class Controlador implements IControlador {
    private IModeloEscritura modelo;

    public Controlador(IModeloEscritura modelo) {
        this.modelo = modelo;
    }

    public void setFiltroEstudiantes(int filtro){
        modelo.setFiltroEstudiantes(filtro);
    }

    public void setEstudianteSelecionado(EstudianteDTO dto){
        modelo.setEstudianteSelecionado(dto);
    }

    public void generarConstancia(){
        modelo.generarConstancia();
    }
}
