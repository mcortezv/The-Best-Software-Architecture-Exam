package mvc;
import dto.EstudianteDTO;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.List;

/**
 * The type Ui tabla estudiantes.
 */
public class UITablaEstudiantes extends AbstractTableModel {
    private List<EstudianteDTO> estudiantes;
    private final String[] columnas = {"Matricula", "Nombre", "Carrera"};

    /**
     * Instantiates a new Ui tabla estudiantes.
     */
    public UITablaEstudiantes() {}

    @Override
    public int getRowCount() {
        return estudiantes.size();
    }

    /**
     * Get columnas string [ ].
     *
     * @return the string [ ]
     */
    public String[] getColumnas() {
        return columnas;
    }

    /**
     * Gets estudiantes.
     *
     * @return the estudiantes
     */
    public List<EstudianteDTO> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Sets estudiantes.
     *
     * @param estudiantes the estudiantes
     */
    public void setEstudiantes(List<EstudianteDTO> estudiantes) {
        this.estudiantes = estudiantes;
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstudianteDTO estudianteDTO = estudiantes.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> estudianteDTO.getId();
            case 1 -> estudianteDTO.getNombre();
            case 2 -> estudianteDTO.getCarrera();
            default -> null;
        };
    }

    /**
     * Gets estudiante at.
     *
     * @param rowIndex the row index
     * @return the estudiante at
     */
    public EstudianteDTO getEstudianteAt(int rowIndex) {
        return estudiantes.get(rowIndex);
    }
}