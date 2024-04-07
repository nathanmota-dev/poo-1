import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

public class InternalFramePanel extends JInternalFrame {

    public InternalFramePanel(String instrumento) {
        super("Detalhes do Instrumento", true, true, true, true);

        JPanel contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Título do Instrumento
        JLabel titleLabel = new JLabel(instrumento);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));

        // Descrição Histórica
        String descricaoViolino = "O Violino na Música Clássica:\n\n" +
                                "O violino é indiscutivelmente um dos instrumentos mais emblemáticos e influentes da música clássica. Sua história remonta ao início do século XVI, quando os primeiros modelos rudimentares começaram a ser desenvolvidos na Itália. Ao longo dos séculos, o violino evoluiu para se tornar o instrumento que conhecemos hoje, com sua forma distintiva, quatro cordas afinadas em quintas e um arco com crina de cavalo.\n\n" +
                                "Durante o período barroco (c. 1600 - 1750), o violino emergiu como um dos principais protagonistas da música instrumental. Compositores como Antonio Vivaldi, Johann Sebastian Bach e Arcangelo Corelli exploraram as capacidades expressivas do violino em suas obras, criando peças virtuosísticas e emocionantes que ainda ressoam nos repertórios clássicos até os dias de hoje.\n\n" +
                                "No período clássico (c. 1750 - 1820), o violino continuou a desempenhar um papel central na música orquestral e de câmara. Compositores como Wolfgang Amadeus Mozart e Ludwig van Beethoven integraram o violino de forma magistral em suas sinfonias, concertos e quartetos de cordas, explorando sua capacidade de transmitir uma ampla gama de emoções e atmosferas.\n\n" +
                                "Durante o período romântico (c. 1820 - 1900), o violino atingiu novos patamares de expressividade e virtuosismo. Compositores como Johannes Brahms, Pyotr Ilyich Tchaikovsky e Felix Mendelssohn escreveram obras desafiadoras e apaixonadas para violino solo e orquestra, elevando o instrumento a novas alturas de popularidade e reconhecimento.\n\n" +
                                "No século XX e além, o violino continuou a desempenhar um papel vital na música clássica, adaptando-se a novas tendências e estilos. Desde as composições impressionistas de Claude Debussy até as experimentações do século XXI, o violino continua a ser uma fonte de inspiração e inovação para músicos e compositores em todo o mundo.\n\n" +
                                "Em suma, o violino é muito mais do que apenas um instrumento na música clássica - é um símbolo de beleza, paixão e excelência artística. Sua capacidade de transcender fronteiras culturais e emocionais torna-o verdadeiramente incomparável e essencial para a riqueza e vitalidade do gênero clássico.";      

        JTextArea descriptionArea = new JTextArea(descricaoViolino);
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