import it.util.shapes.CircularCylinder;
import it.util.shapes.RectangularPrism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangularPrismForm {
    private JButton calculateButton;
    private JButton closeButton;
    private JLabel rectangularPrismLabel;
    private JPanel rectangularPrismPanel;
    private JTextField textwidth;
    private JTextField textHeight;
    private JTextField textlength;
    private JDialog frame;

    public RectangularPrismForm() {
        rectangularPrismLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/rectangularprism2.png")));
        frame = new JDialog((Frame) null, "Circular Cylinder Shape Area", true);
        frame.setContentPane(rectangularPrismPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doCalculate();

            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public void show() {
        frame.setVisible(true);
    }
    public void dispose() {
        frame.setVisible(false);
        frame.dispose();
    }
    public void doCalculate() {
        try{

            RectangularPrism cc = new RectangularPrism(Double.parseDouble(textwidth.getText()),
                    Double.parseDouble(textHeight.getText()),
                    Double.parseDouble(textlength.getText()));

            double volume = cc.getVolume();

            double totalSurfaceArea = cc.getTotalSurfaceArea();
            String result = "Volume = " + volume + "\n" +   "Total Surface Area = " + totalSurfaceArea;
            displayResult(result, "Result of Rectangular Prism Shape", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            displayResult("Please enter numeric only!","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void displayResult(String resultMsg, String title, int type) {
        JOptionPane.showMessageDialog(null, resultMsg, title, type);
    }
}


