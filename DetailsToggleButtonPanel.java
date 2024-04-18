import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DetailsToggleButtonPanel extends JPanel {
    private JToggleButton toggleButton;
    private JLabel infoLabel;
    private DataLoader dataLoader;

    public DetailsToggleButtonPanel(DataLoader dataLoader) {
        this.dataLoader = dataLoader;  // Recebe a instância do DataLoader
        setLayout(new BorderLayout());

        toggleButton = new JToggleButton("Mostrar Detalhes Históricos");
        infoLabel = new JLabel();
        infoLabel.setHorizontalAlignment(SwingConstants.LEFT);
        infoLabel.setVerticalAlignment(SwingConstants.TOP);
        infoLabel.setVisible(false);

        // Carrega o texto do arquivo e configura como texto do infoLabel
        dataLoader.loadData(); // Carrega os dados
        infoLabel.setText(dataLoader.getData()); // Configura o texto carregado no JLabel

        // Configura o comportamento do toggleButton
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                infoLabel.setVisible(e.getStateChange() == ItemEvent.SELECTED);
                toggleButton.setText(infoLabel.isVisible() ? "Ocultar Detalhes Históricos" : "Mostrar Detalhes Históricos");
            }
        });

        add(toggleButton, BorderLayout.NORTH);
        add(infoLabel, BorderLayout.CENTER);
    }
}
