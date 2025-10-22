package pckg_V1_Z1b;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextField resultField;
    private JTextArea allResults;
    private JScrollPane resultsScrollPane;



    public PresentationPanel() {
        initComponents();
        layoutComps();
    }

    private void initComponents() {
        this.resultField = new JTextField(15);
        resultField.setEditable(false);
        this.allResults = new JTextArea(10, 15);
        this.allResults.setEditable(false); // Ako želiš da korisnik ne može uređivati rezultate

        // ispravno inicijaliziran JScrollPane
        this.resultsScrollPane = new JScrollPane(
                allResults,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5); // dodaj razmak za bolji izgled

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result:"), gbc);

        gbc.gridy = 1;
        add(resultField, gbc);

        gbc.gridy = 2;
        add(new JLabel("All results:"), gbc);

        gbc.gridy = 3;
        add(resultsScrollPane, gbc);
    }

    public void setResult(String result) {

        resultField.setText(result);

    }

    public void addResultToAll(String res){
        allResults.append(res+"\n");

    }
}
