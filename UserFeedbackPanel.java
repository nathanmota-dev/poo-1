import javax.swing.*;
import java.awt.*;

public class UserFeedbackPanel extends JPanel {
    private JPanel formPanel;
    private JButton enviarButton;

    public UserFeedbackPanel() {
        super(new BorderLayout()); // Inicia o layout como BorderLayout

        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

        JScrollPane mainScrollPane = new JScrollPane(formPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        add(mainScrollPane, BorderLayout.CENTER); // Adiciona o JScrollPane no centro

        // Adicionando perguntas e JTextAreas ao formPanel
        addQuestion("Qual seu instrumento clássico favorito e por quê?");
        addQuestion("Quem é o compositor que você mais admira?");
        addQuestion("Há alguma peça musical específica que tenha significado especial para você? Descreva.");

        // Botão para enviar as respostas
        enviarButton = new JButton("Enviar");
        enviarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel.add(enviarButton);
    }

    private void addQuestion(String question) {
        JLabel questionLabel = new JLabel(question);
        questionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        JTextArea answerArea = new JTextArea(3, 20);
        answerArea.setLineWrap(true);
        answerArea.setWrapStyleWord(true);

        JScrollPane answerScroll = new JScrollPane(answerArea, 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        formPanel.add(questionLabel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        formPanel.add(answerScroll);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    }
}
