import it.util.shapes.CircularCylinder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm extends  JFrame{
    private JPanel mainPanel;
    private JButton circularConeButton;
    private JButton circularCylinderButton;
    private JButton rectangularPrismButton;
    private JLabel circularConeLabel;
    private JLabel circularCylinderLabel;
    private JLabel rectangularPrismLabel;

    public static final String CIRCULARCONE ="CIRCULARCONE";
    public static final String CIRCULARCYLINDER = "CIRCULARCYLINDER";
    public static final String RECTANGULARPRISM = "RECTANGULARPRISM";

    public MainForm() {
        initialFormProperties();
        circularConeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openForm(MainForm.CIRCULARCONE);
            }

        });
        circularCylinderLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openForm(MainForm.CIRCULARCYLINDER);
            }

        });
        rectangularPrismLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openForm(MainForm.RECTANGULARPRISM);
            }

        });


        circularConeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openForm(MainForm.CIRCULARCONE);
            }
        });
    }
    private void openForm(String formName) {
        switch (formName) {
            case MainForm.CIRCULARCONE:
                CircularConeForm circularConeForm = new CircularConeForm();
                circularConeForm.show();
                break;
            case MainForm.CIRCULARCYLINDER:
                CircularCylinderForm circularCylinderForm = new CircularCylinderForm();
                circularCylinderForm.show();
                break;
            case MainForm.RECTANGULARPRISM:
                RectangularPrismForm rectangularPrismForm = new RectangularPrismForm();
                rectangularPrismForm.show();
                break;
        }
    }
    private void displayError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void initialFormProperties() {
        try {
            circularConeLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/circularcone.png")));
            circularCylinderLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/circularcylinder.png")));
            rectangularPrismLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/rectangularprism.png")));
            // set cursor hover on images
            circularConeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            circularCylinderLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            rectangularPrismLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        } catch (Exception e) {
            displayError(e.getMessage());
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setTitle("Geometric Shape Calculator");
        mainForm.setContentPane(mainForm.mainPanel);
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainForm.pack();
        mainForm.setVisible(true);
    }


}


