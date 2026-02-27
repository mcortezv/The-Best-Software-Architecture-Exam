package mvc;
import dto.EstudianteDTO;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.List;

public class UITablaEstudiantes extends AbstractTableModel {
    private List<EstudianteDTO> estudiantes;
    private final String[] columnas = {"Matricula", "Nombre", "Carrera"};

    public UITablaEstudiantes() {}

    @Override
    public int getRowCount() {
        return estudiantes.size();
    }

    public String[] getColumnas() {
        return columnas;
    }

    public List<EstudianteDTO> getEstudiantes() {
        return estudiantes;
    }

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

    public EstudianteDTO getEstudianteAt(int rowIndex) {
        return estudiantes.get(rowIndex);
    }
}