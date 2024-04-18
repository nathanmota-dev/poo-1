import javax.swing.*;
import java.awt.*;

public class InstrumentsDisplayPanel extends JLayeredPane {

    public InstrumentsDisplayPanel() {
        setPreferredSize(new Dimension(600, 400));

        // Saxofone
        ImageIcon saxofoneIcon = new ImageIcon(new ImageIcon("imagens/saxofone.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel saxofoneLabel = new JLabel(saxofoneIcon);
        saxofoneLabel.setBounds(0, 0, 250, 250);

        // Violino
        ImageIcon violinoIcon = new ImageIcon(new ImageIcon("imagens/violino.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel violinoLabel = new JLabel(violinoIcon);
        violinoLabel.setBounds(175, 75, 250, 250); // Posicionado para sobrepor parcialmente o saxofone

        // Piano
        ImageIcon pianoIcon = new ImageIcon(new ImageIcon("imagens/piano.png").getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        JLabel pianoLabel = new JLabel(pianoIcon);
        pianoLabel.setBounds(350, 150, 250, 250); // Posicionado para sobrepor parcialmente o violino

        // Adiciona os componentes ao JLayeredPane com diferentes profundidades
        add(saxofoneLabel, Integer.valueOf(1));
        add(violinoLabel, Integer.valueOf(2));
        add(pianoLabel, Integer.valueOf(3));

        // Texto sobre os Instrumentos (como uma camada de descrição)
        JLabel textLabel = new JLabel("<html>Saxofone: Som encantador<br>Violino: cordas afinadas vibrantes.<br>Piano: teclas que produzem harmonia.</html>");
        textLabel.setBounds(5, 300, 590, 95); // Ajustado para caber na parte inferior do painel
        textLabel.setBackground(new Color(255, 255, 255, 123)); // Semi-transparente
        textLabel.setOpaque(true);
        add(textLabel, Integer.valueOf(4)); // Texto explicativo na camada superior

        validate();
    }
}
