import javax.swing.*;

public class TestGUIConversion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Conversion");
        frame.setContentPane(new ConversionForm().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

