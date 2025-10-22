package pckg_V1_Z1b;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;

    private PresentationPanel presentationPanel;

    private CalculationStrategy calculationStrategy;


    public MainFrame() {
        super("Simple Calculator");

        setSize(600,350);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponenst();
        layoutComponents();
        activateMainFrame();


    }

    private void initComponenst() {
        this.inputPanel = new InputPanel();
        this.presentationPanel = new PresentationPanel();
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);
    }

    private void activateMainFrame() {

        inputPanel.setInputPanelListener((new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(InputPanelData ipd) {
                CalculationStrategy calculationStrategy = resolveAlgOperation(ipd.getAlgOperation());
                Double result = calculationStrategy.performCalculation(ipd.getFstNum(), ipd.getSndNum());


                try {
                    presentationPanel.setResult(result.toString());
                    presentationPanel.addResultToAll(ipd.getFstNum() + " " + ipd.getAlgOperation().toString()+ " " + ipd.getSndNum() + " = " + result.toString());
                }catch (NullPointerException npe){
                    presentationPanel.setResult("Error - division by 0!");
                }





            }

        }));
    }
    private CalculationStrategy resolveAlgOperation(ALG_OPERATION alg_operation){
        switch(alg_operation.toString()){
            case "Addition" : return new AdditionStrategy();
            case "Substraction" : return new SubstractionStrategy();
            case "Multiplication" : return new MultiplicationStrategy();
            case "Division" : return new DivisionStrategy();
            default: return null;

        }
    }


}
