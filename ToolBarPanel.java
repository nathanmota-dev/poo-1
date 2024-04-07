import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JToolBar {

    public ToolBarPanel() {
        super("Ferramentas Musicais");
        setFloatable(false);
        addComponents();
    }

    private void addComponents() {
        // Seleção de Estilos Musicais
        JComboBox<String> stylesComboBox = new JComboBox<>(new String[]{"Barroco", "Clássico", "Romântico", "Moderno"});
        stylesComboBox.setToolTipText("Selecione o Estilo Musical");
        add(stylesComboBox);

        // Campo de Pesquisa de Instrumentos
        JTextField searchField = new JTextField(10);
        searchField.setToolTipText("Pesquisar Instrumento");
        add(searchField);

        // Botão de Pesquisa
        JButton searchButton = new JButton("Pesquisar");
        searchButton.setToolTipText("Clique para pesquisar o instrumento");
        searchButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Pesquisando: " + searchField.getText()));
        add(searchButton);

        // Botões Temáticos
        addButton("Adicionar", "Adicionar Instrumento", "Adicionar um novo instrumento típico");
        addButton("Explorar", "Explorar História", "Explorar a história e as raízes do instrumento selecionado");
        addButton("Salvar", "Salvar Favoritos", "Salvar sua lista de instrumentos favoritos");
    }

    private void addButton(String text, String actionCommand, String toolTipText) {
        JButton button = new JButton(text);
        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTipText);
        button.addActionListener(createButtonListener(actionCommand));
        add(button);
    }

    private ActionListener createButtonListener(String actionCommand) {
        // Substitua essa lógica placeholder pela implementação específica para cada ação
        return (ActionEvent e) -> {
            switch (actionCommand) {
                case "Adicionar Instrumento":
                    JOptionPane.showMessageDialog(null, "Adicionando um novo instrumento.");
                    break;
                case "Explorar História":
                    JOptionPane.showMessageDialog(null, "Explorando as raízes e influências.");
                    break;
                case "Salvar Favoritos":
                    JOptionPane.showMessageDialog(null, "Salvando sua lista de favoritos.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ação desconhecida: " + actionCommand);
                    break;
            }
        };
    }
}
