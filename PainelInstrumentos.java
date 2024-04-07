import javax.swing.*;
import java.awt.BorderLayout;

public class PainelInstrumentos extends JPanel {
    public PainelInstrumentos() {
        initComponentes();
    }

    private void initComponentes() {
        setLayout(new BorderLayout());

      String texto = "Informações sobre instrumentos típicos da música clássica:\n\n" +
        "1. Piano:\n" +
        "   O piano é indiscutivelmente um dos instrumentos mais icônicos da música clássica. Sua versatilidade permite que seja usado tanto como instrumento solo quanto em conjunto com outros instrumentos em formações diversas, como o piano solo, o piano de câmara e o piano concertante.\n\n" +
        "2. Violino:\n" +
        "   O violino, com sua sonoridade expressiva e aguda, desempenha um papel central na música clássica. É frequentemente utilizado como instrumento solo em concertos e também integra as seções de cordas em orquestras.\n\n" +
        "3. Violoncelo:\n" +
        "   O violoncelo, com sua voz profunda e calorosa, é um dos pilares das seções de cordas na música clássica. Tanto em performances solistas quanto em conjuntos de câmara e orquestras, o violoncelo contribui com sua sonoridade melódica e rica.\n\n" +
        "4. Flauta:\n" +
        "   A flauta, com sua pureza tonal e sua capacidade de criar melodias delicadas, é um dos instrumentos de sopro mais proeminentes na música clássica. Desde solos virtuosos até partes em conjunto, a flauta desempenha um papel vital em uma variedade de obras clássicas.\n\n" +
        "5. Oboé:\n" +
        "   O oboé, com seu timbre único e sua habilidade de expressar emoção intensa, é um dos instrumentos de sopro mais distintos na música clássica. Sua presença é marcante tanto em orquestras quanto em formações de câmara.\n\n" +
        "Estes são apenas alguns dos muitos instrumentos que contribuem para a riqueza e diversidade da música clássica. A interação entre esses instrumentos e seus diferentes estilos e épocas cria um panorama fascinante de influências e relações dentro do mundo da música clássica.";

        // Crie e adicione os componentes específicos deste painel
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText(texto);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER); // 'this' refere-se ao PainelInstrumentos JPanel

        // Supondo que ToggleButtonPanel seja um componente que você já definiu
        ToggleButtonPanel toggleButtonPanel = new ToggleButtonPanel();
      
        add(toggleButtonPanel, BorderLayout.SOUTH);
    }
}
