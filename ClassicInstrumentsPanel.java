import javax.swing.*;
import java.awt.*;

public class ClassicInstrumentsPanel extends JPanel {
    private DataLoader dataLoader;  // Referência para DataLoader

    public ClassicInstrumentsPanel(DataLoader dataLoader) {
        this.dataLoader = dataLoader;  // Recebe a instância do DataLoader
        initializeComponents();
    }

    private void initializeComponents() {
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Espaçamento uniforme entre os componentes
        gbc.insets = new Insets(4, 4, 4, 4);

        // GridBagLayout
        JLabel titleLabel = new JLabel("Instrumentos Clássicos");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0; // Coluna
        gbc.gridy = 0; // Linha
        gbc.gridwidth = 2; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(titleLabel, gbc);

        // Carrega os dados usando DataLoader
        dataLoader.loadData();
        String classicInstrumentsText = dataLoader.getData();

        // Criando a JTextArea e definindo as propriedades
        JTextArea descriptionArea = new JTextArea(classicInstrumentsText);
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true); // Habilita a quebra de linha
        descriptionArea.setWrapStyleWord(true); // Quebra as palavras corretamente

        // Adicionando JTextArea dentro de um JScrollPane
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        this.add(scrollPane, gbc);

        // Primeiro Botão
        JButton actionButton = new JButton("Mais Informações");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        this.add(actionButton, gbc);

        // Segundo Botão
        JButton anotherButton = new JButton("Fechar");
        gbc.gridx = 1; // Coluna ao lado do primeiro botão
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        this.add(anotherButton, gbc);
    }
}
