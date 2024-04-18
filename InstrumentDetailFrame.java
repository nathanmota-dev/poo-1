import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

public class InstrumentDetailFrame extends JInternalFrame {
    private DataLoader dataLoader;  // DataLoader para carregar os dados do instrumento

    public InstrumentDetailFrame(String instrumento, DataLoader dataLoader) {
        super("Detalhes do Instrumento - " + instrumento, true, true, true, true);
        this.dataLoader = dataLoader; // Armazena o DataLoader fornecido

        // Configuração da janela interna
        configureFrame(instrumento);
    }

    private void configureFrame(String instrumento) {
        JPanel contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Título do Instrumento
        JLabel titleLabel = new JLabel(instrumento);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));

        // Carrega a descrição do instrumento
        dataLoader.loadData();  // Carrega os dados usando o DataLoader
        String description = dataLoader.getData();  // Obtém os dados carregados

        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setLineWrap(true);
        descriptionArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(descriptionArea);

        // Botão para Ações (Exemplo: ouvir som)
        JButton actionButton = new JButton("Ouvir Exemplo");
        actionButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this, "Aqui poderia abrir um player de música para o instrumento " + instrumento);
        });

        contentPane.add(titleLabel, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(actionButton, BorderLayout.SOUTH);

        setContentPane(contentPane);
        pack(); // Ajusta o tamanho do frame baseado nos componentes
        setVisible(true);
    }
}
