
import it.util.shapes.CircularCylinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircularCylinderForm {
    private JButton calculateButton;
    private JButton closeButton;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel circularCylinderLabel;
    private JPanel CircularCylinderPanel;
    private JDialog frame;

    public CircularCylinderForm() {
        circularCylinderLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/circularcylinder2.png")));
        frame = new JDialog((Frame) null, "Circular Cylinder Shape Area", true);
        frame.setContentPane(CircularCylinderPanel);
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


            CircularCylinder cy = new CircularCylinder(Double.parseDouble(textField1.getText()),
                    Double.parseDouble(textField2.getText()));
            double volume = cy.getVolume();
            double LateralSurfaceArea = cy.getLateralSurfaceArea();
            double TopSurfaceArea = cy.getTopSurfaceArea();
            double BottomSurfaceArea=cy.getBottomSurfaceArea();

            double totalSurfaceArea = cy.getTotalSurfaceArea();
            String result = "Volume = " + volume + "\n" + "LateralSurfaceArea ="+ LateralSurfaceArea +"\n"+"TopSurfaceArea ="
                    +TopSurfaceArea +"\n"+ "TotalSurface Area = " + totalSurfaceArea+"\n";
            displayResult(result, "Result of Circular Cylinder Shape", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            displayResult("Please enter numeric only!","ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void displayResult(String resultMsg, String title, int type) {
        JOptionPane.showMessageDialog(null, resultMsg, title, type);
    }
}



