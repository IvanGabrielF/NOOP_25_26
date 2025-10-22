package pckg_V1_Z1b;

import javax.swing.*;

public class DivisionStrategy implements CalculationStrategy {
    @Override
    public Double performCalculation(Double fst, Double snd) {
        if (snd == 0) {
            JOptionPane.showMessageDialog(null, "Division by zero!", "Error division", JOptionPane.ERROR_MESSAGE);
        } else {
            return fst / snd;
        }
        return null;





    }
}
