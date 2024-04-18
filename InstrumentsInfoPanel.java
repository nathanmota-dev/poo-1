import javax.swing.*;
import java.awt.BorderLayout;

public class InstrumentsInfoPanel extends JPanel {
    private DataLoader dataLoader; // Referência para DataLoader

    public InstrumentsInfoPanel(DataLoader dataLoader) {
        // Armazena a referência para o DataLoader passado no construtor
        this.dataLoader = dataLoader;
        initComponentes();
    }

    private void initComponentes() {
        setLayout(new BorderLayout());
        dataLoader.loadData(); // Carrega os dados usando o DataLoader

        // Cria a JTextArea e define o texto para o conteúdo carregado
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText(dataLoader.getData()); // Obtém os dados carregados
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        // Cria um JScrollPane e adiciona a JTextArea a ele
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Adiciona o JScrollPane ao centro do painel
        add(scrollPane, BorderLayout.CENTER);
    }
}
