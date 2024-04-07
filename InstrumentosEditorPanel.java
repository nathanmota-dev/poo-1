import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.BorderLayout;

public class InstrumentosEditorPanel extends JPanel {
    public InstrumentosEditorPanel() {
        setLayout(new BorderLayout());

        String[] columnNames = {"Instrumento", "Descrição"};
        Object[][] data = {
            {"Violino", "Usado em orquestras e música solo."},
            {"Piano", "Instrumento de cordas percussivas."},
            {"Flauta", "Instrumento de sopro de madeira."}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Configurando um editor de células para a coluna "Descrição"
        TableColumn descriptionColumn = table.getColumnModel().getColumn(1);
        descriptionColumn.setCellEditor(new DefaultCellEditor(new JTextField()));
    }
}
