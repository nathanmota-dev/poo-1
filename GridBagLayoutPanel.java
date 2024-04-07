import javax.swing.*;
import java.awt.*;

public class GridBagLayoutPanel extends JPanel {
    public GridBagLayoutPanel() {
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Espaçamento uniforme entre os componentes
        gbc.insets = new Insets(4, 4, 4, 4);

        // Componente 1: Título
        JLabel titleLabel = new JLabel("Instrumentos Clássicos");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0; // Coluna
        gbc.gridy = 0; // Linha
        gbc.gridwidth = 2; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(titleLabel, gbc);

        // Componente 2: Descrição

      String descricao = "Evolução dos Instrumentos na Música Clássica:\n\n" +
                         "A história da música clássica é intrinsecamente ligada à evolução dos instrumentos musicais ao longo do tempo. Desde os primeiros instrumentos de sopro e percussão até os sofisticados instrumentos de cordas e teclas, cada período na história da música clássica testemunhou avanços significativos na construção e no design dos instrumentos.\n\n" +
                         "Período Barroco:\n" +
                         "   Durante o período barroco (c. 1600 - 1750), os instrumentos musicais passaram por uma série de inovações e desenvolvimentos. Surgiram novos instrumentos, como o cravo e a viola da gamba, que desempenharam papéis importantes na música da época. A precisão na construção de instrumentos de cordas, como o violino, também alcançou novos patamares, permitindo uma maior expressividade e virtuosismo na execução musical.\n\n" +
                         "Período Clássico:\n" +
                         "   No período clássico (c. 1750 - 1820), houve uma refinada padronização e aprimoramento dos instrumentos existentes. O piano, por exemplo, foi amplamente desenvolvido durante esse período, resultando no instrumento que conhecemos hoje. Além disso, os instrumentos de sopro, como o clarinete e a flauta moderna, foram aprimorados e ganharam maior proeminência na música clássica.\n\n" +
                         "Período Romântico:\n" +
                         "   No período romântico (c. 1820 - 1900), os avanços tecnológicos e a busca por novas expressões musicais levaram a mudanças significativas nos instrumentos. O desenvolvimento de instrumentos de metal, como a tuba e o trombone, ampliou o alcance e a sonoridade das orquestras. Além disso, os instrumentos de teclas, como o piano, foram aprimorados para atender às demandas dos compositores românticos por maior dinâmica e expressividade.\n\n" +
                         "Século XX e Além:\n" +
                         "   No século XX e além, a evolução dos instrumentos na música clássica continuou a avançar em ritmo acelerado. A eletrificação de instrumentos, como o violino elétrico e o teclado digital, abriu novas possibilidades sonoras para os músicos. Além disso, a experimentação com novos materiais e técnicas de construção resultou em instrumentos híbridos e inovadores, expandindo ainda mais o horizonte da música clássica.\n\n" +
                         "Essa constante evolução dos instrumentos na música clássica reflete não apenas o progresso tecnológico, mas também a criatividade e a busca incessante dos músicos por novas formas de expressão e comunicação através da música.";      

        JTextArea descriptionArea = new JTextArea(descricao);
        descriptionArea.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; // Dá mais espaço horizontal
        gbc.weighty = 1.0; // Dá mais espaço vertical
        this.add(new JScrollPane(descriptionArea), gbc);

        // Componente 3: Botão para ação
        JButton actionButton = new JButton("Mais Informações");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.LINE_START; // Alinha o botão à esquerda
        this.add(actionButton, gbc);

        // Componente 4: Outro botão (exemplo)
        JButton anotherButton = new JButton("Fechar");
        gbc.gridx = 1; // Coluna ao lado do primeiro botão
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END; // Alinha o botão à direita
        this.add(anotherButton, gbc);
    }
}
