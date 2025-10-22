package pckg_V1_Z1b;

import javax.swing.*;

public class TestCalc {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();

            }
        });
    }
}
