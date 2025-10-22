package pckg_V1_Z1a;

import javax.swing.*;

public class DivStrategy implements CalcStrategy {

    @Override
    public Double performCalculation(Double fst, Double snd) {
        try {
            if (snd == 0) {
                throw new ArithmeticException("Division by zero!");
            }

            return fst / snd;

        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage(),
                    "Error division",
                    JOptionPane.ERROR_MESSAGE
            );
            return null;
        }
    }
}
