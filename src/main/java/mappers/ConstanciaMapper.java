package mappers;
import dominio.Constancia;
import dto.ConstanciaDTO;

/**
 * The type Constancia mapper.
 *
 * @author Cortez, Manuel;
 */
public class ConstanciaMapper {

    /**
     * To dto constancia dto.
     *
     * @param constancia the constancia
     * @return the constancia dto
     */
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
