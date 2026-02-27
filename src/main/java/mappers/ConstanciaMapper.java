package mappers;
import dominio.Constancia;
import dto.ConstanciaDTO;

public class ConstanciaMapper {

    public static ConstanciaDTO toDTO(Constancia constancia){
        ConstanciaDTO dto = new ConstanciaDTO();
        dto.setEstudiante(EstudianteMapper.toDTO(constancia.getEstudiante()));
        dto.setCicloLectivo(constancia.getCicloLectivo());
        dto.setCicloFechaInicio(constancia.getCicloFechaInicio());
        dto.setCicloFechaFin(constancia.getCicloFechaFin());
        dto.setFechaConstancia(constancia.getFechaConstancia());
        return dto;
    }
}
