import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cards = new JPanel(cardLayout);

    public Main() {
        setTitle("Música Clássica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        initComponents();
    }

    private void initComponents() {
        // Adiciona os cartões/painéis
        cards.add(new PainelInstrumentos(), "Instrumentos");
        cards.add(new TextAreaPanel(), "TextArea");
        cards.add(new ToggleButtonPanel(), "ToggleButton");
        cards.add(new ToolBarPanel(), "ToolBar");
        cards.add(new LayeredPanel(), "LayeredPane");
        cards.add(new InternalFramePanel("Violino"), "InternalFrame");
        cards.add(new GridBagLayoutPanel(), "GridBagLayout");
        cards.add(new InstrumentosEditorPanel(), "EditorInstrumentos");


        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(cards, BorderLayout.CENTER);

        // Barra de ferramentas para navegação
        JToolBar toolBar = new JToolBar("Navegação");
        toolBar.setFloatable(false);
        addNavigationButton(toolBar, "Instrumentos", "Instrumentos");
        addNavigationButton(toolBar, "TextArea", "Questões");
        addNavigationButton(toolBar, "ToggleButton", "Detalhes Históricos");
        addNavigationButton(toolBar, "ToolBar", "Pesquisa");
        addNavigationButton(toolBar, "LayeredPane", "Galeria");
        addNavigationButton(toolBar, "InternalFrame", "Violino");
        addNavigationButton(toolBar, "GridBagLayout", "Clássicos");
        addNavigationButton(toolBar, "EditorInstrumentos", "Funções");

        getContentPane().add(toolBar, BorderLayout.NORTH);
    }

    private void addNavigationButton(JToolBar toolBar, String command, String buttonText) {
        JButton button = new JButton(buttonText);
        button.addActionListener(e -> cardLayout.show(cards, command));
        toolBar.add(button);
    }

    private void toggleDescription() {
        System.out.println("ToggleButton acionado. Implemente a lógica conforme necessário.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
