package mappers;
import dominio.Materia;
import dto.MateriaDTO;

/**
 * The type Materia mapper.
 *
 * @author Cortez, Manuel;
 */
public class MateriaMapper {

    /**
     * To dto materia dto.
     *
     * @param materia the materia
     * @return the materia dto
     */
    public static MateriaDTO toDTO(Materia materia){
        MateriaDTO dto = new MateriaDTO();
        dto.setCodigo(materia.getCodigo());
        dto.setNombre(materia.getNombre());
        dto.setHoraInicio(materia.getHoraInicio());
        dto.setHoraFin(materia.getHoraFin());
        dto.setDias(materia.getDias());
        return  dto;
    }

    /**
     * To entity materia.
     *
     * @param dto the dto
     * @return the materia
     */
    public static Materia toEntity(MateriaDTO dto){
        Materia materia = new Materia();
        materia.setCodigo(dto.getCodigo());
        materia.setNombre(dto.getNombre());
        materia.setHoraInicio(dto.getHoraInicio());
        materia.setHoraFin(dto.getHoraFin());
        materia.setDias(dto.getDias());
        return  materia;
    }
}
