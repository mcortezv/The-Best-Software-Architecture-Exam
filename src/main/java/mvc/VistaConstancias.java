package mvc;
import dto.EstudianteDTO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class VistaConstancias extends JFrame implements ISuscriptor {
    private IControlador controlador;
    private IModeloLectura modeloLectura;
    private JPanel northPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JTextField inputId;
    private JTextArea textArea;
    private JTable table;
    private UITablaEstudiantes uiTablaEstudiantes;
    private JButton btnGenerar;

    public VistaConstancias(IControlador controlador, IModeloLectura modeloLectura) {
        this.controlador = controlador;
        this.modeloLectura = modeloLectura;

        setTitle("Registro Académico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        construirNorthPanel();
        construirLeftPanel();
        construirRightPanel();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setResizeWeight(0.8);
        splitPane.setContinuousLayout(true);
        splitPane.setEnabled(false);

        add(northPanel, BorderLayout.NORTH);
        add(splitPane, BorderLayout.CENTER);

        setSize(1100, 800);
        setLocationRelativeTo(null);
    }

    private void construirNorthPanel() {
        northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        northPanel.setPreferredSize(new Dimension(0, 120));

        JLabel titulo = new JLabel("Registro Academico");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 48));

        northPanel.add(titulo);
    }

    private void construirLeftPanel() {
        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labelId = new JLabel("Ingrese la Matricula del Estudiante:");
        labelId.setFont(new Font("Segoe UI", Font.BOLD, 18));
        labelId.setAlignmentX(Component.CENTER_ALIGNMENT);

        inputId = new JTextField();
        inputId.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        inputId.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane textAreaScroll = new JScrollPane(textArea);

        btnGenerar = new JButton("Generar Constancia");
        btnGenerar.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnGenerar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnGenerar.setUI(new BasicButtonUI());
        btnGenerar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        leftPanel.add(labelId);
        leftPanel.add(Box.createVerticalStrut(15));
        leftPanel.add(inputId);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(textAreaScroll);
        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(btnGenerar);

        inputId.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { onChange(); }
            @Override
            public void removeUpdate(DocumentEvent e) { onChange(); }
            @Override
            public void changedUpdate(DocumentEvent e) { onChange(); }

            private void onChange() {
                String id = inputId.getText().trim();
                controlador.setFiltroEstudiantes(id);
            }
        });

        btnGenerar.addActionListener(e -> {
            controlador.generarConstancia();
        });
    }

    private void construirRightPanel() {
        rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        uiTablaEstudiantes = new UITablaEstudiantes();
        table = new JTable(uiTablaEstudiantes);
        JScrollPane tableScroll = new JScrollPane(table);
        rightPanel.add(tableScroll, BorderLayout.CENTER);

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int fila = table.getSelectedRow();
                if (fila >= 0) {
                    EstudianteDTO estudianteSeleccionado = uiTablaEstudiantes.getEstudianteAt(fila);
                    controlador.setEstudianteSelecionado(estudianteSeleccionado);
                }
            }
        });
    }

    @Override
    public void update(IModeloLectura modeloLectura) {
        this.modeloLectura = modeloLectura;
        refrescar();
    }

    private void refrescar() {
        uiTablaEstudiantes.setEstudiantes(modeloLectura.getEstudiantes());
        textArea.setText(modeloLectura.getContenidoDetalle());
    }
}