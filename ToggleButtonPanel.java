import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ToggleButtonPanel extends JPanel {
    private JToggleButton toggleButton;
    private JLabel infoLabel;

    public ToggleButtonPanel() {
        toggleButton = new JToggleButton("Mostrar Detalhes Históricos");
        infoLabel = new JLabel("<html>Informações detalhadas sobre instrumentos clássicos serão exibidas aqui.</html>");
        infoLabel.setVisible(false); // Inicialmente oculta

        // Configura o comportamento do toggleButton
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    toggleButton.setText("Ocultar Detalhes Históricos");
                    infoLabel.setText("<html>Detalhes históricos selecionados. <br>Por exemplo, o violino, originário do início do século XVI na Itália, tem uma rica história na música clássica, evoluindo em design e técnica de execução ao longo dos séculos.</html>");
                    infoLabel.setVisible(true);
                } else {
                    toggleButton.setText("Mostrar Detalhes Históricos");
                    infoLabel.setVisible(false);
                }
            }
        });

        this.add(toggleButton);
        this.add(infoLabel);
    }
}
