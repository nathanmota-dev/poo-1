import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    private JPanel formPanel;
    private JButton enviarButton;

    public TextAreaPanel() {
        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(formPanel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Configuração do layout do TextAreaPanel para adicionar o JScrollPane
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // Adicionando perguntas e JTextAreas ao formPanel
        addQuestion("Qual seu instrumento clássico favorito e por quê?");
        addQuestion("Quem é o compositor que você mais admira?");
        addQuestion("Há alguma peça musical específica que tenha significado especial para você? Descreva.");

        // Botão para enviar as respostas
        enviarButton = new JButton("Enviar");
        enviarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        enviarButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Respostas enviadas!"));
        formPanel.add(enviarButton);
    }

    private void addQuestion(String question) {
        JLabel questionLabel = new JLabel(question);
        JTextArea answerArea = new JTextArea(3, 20);
        answerArea.setLineWrap(true);
        answerArea.setWrapStyleWord(true);
        JScrollPane answerScroll = new JScrollPane(answerArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        formPanel.add(questionLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 5))); // Espaçamento entre a pergunta e a área de texto
        formPanel.add(answerScroll);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaçamento entre as perguntas
    }
}
