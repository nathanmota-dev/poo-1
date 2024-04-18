import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cards = new JPanel(cardLayout);
    private DataLoader dataLoader1;
    private DataLoader dataLoader2;
    private DataLoader dataLoader3;	
    private DataLoader dataLoader4;

    public Main() {
        dataLoader1 = new FileDataLoader("instrumentos.txt");
        dataLoader2 = new FileDataLoader("detalhesHistoricos.txt");
        dataLoader3 = new FileDataLoader("violino.txt");
        dataLoader4 = new FileDataLoader("classicos.txt");
        dataLoader1.loadData(); // Carrega os dados
        dataLoader2.loadData(); 
        dataLoader3.loadData(); 
        dataLoader4.loadData();
      
        setTitle("Música Clássica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        initComponents();
    }

    private void initComponents() {
        // Adiciona os cartões/painéis
        cards.add(new InstrumentsInfoPanel(dataLoader1), "Instrumentos");
        cards.add(new UserFeedbackPanel(), "TextArea");
        cards.add(new DetailsToggleButtonPanel(dataLoader2), "ToggleButton");
        cards.add(new MusicStylesToolbar(), "ToolBar");
        cards.add(new InstrumentsDisplayPanel(), "LayeredPane");
        cards.add(new InstrumentDetailFrame("Violino", dataLoader3), "InternalFrame");
        cards.add(new ClassicInstrumentsPanel(dataLoader4), "GridBagLayout");
        cards.add(new InstrumentsManagementPanel(), "EditorInstrumentos");


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

    public static void main(String[] args) {        
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}
