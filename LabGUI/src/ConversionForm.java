import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.utils.converter.TemperatureConversion;


public class ConversionForm extends TemperatureConversion {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton convertButton;
    private JButton convertButton1;
    private JButton convertButton2;
    private JButton convertButton3;
    private JButton convertButton4;
    private JButton convertButton5;
    private JPanel temp;

    public ConversionForm() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double celsius = Double.parseDouble(textField1.getText());
                    double result = celsiusToFahrenheit(celsius);
                    displayResult("Celsius to Fahrenheit", result + " °F", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception err){
                    displayResult("ERROR", "Please input numeric only",JOptionPane.ERROR_MESSAGE);
                }

            }

        });

        convertButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textField2.getText());
                    double result = fahrenheitToCelsius(fahrenheit);
                    displayResult("Fahrenheit to Celsius", result + " °C", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        convertButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double C2k = Double.parseDouble(textField3.getText());
                    double result = celsiusToKelvin(C2k);
                    displayResult("Celsius to Kevin", result + " °K", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        convertButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double F2k = Double.parseDouble(textField4.getText());
                    double result = fahrenheitToKelvin(F2k);
                    displayResult("Fahrenheit to Kevin", result + " °K", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        convertButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double K2c = Double.parseDouble(textField5.getText());
                    double result = kelvinToCelsius(K2c);
                    displayResult("Kevin to Celsius", result + " °C", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        convertButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double K2f = Double.parseDouble(textField6.getText());
                    double result = kelvinToFahrenheit(K2f);
                    displayResult("Kevin to Fahrenheit", result + " °F", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
    private double doC2F(double n1){
        return n1;
    }
    private void displayResult(String title,String msg,int type){
        JOptionPane.showMessageDialog(null,msg,title,type);
    }
    public JPanel getMainPanel(){
        return this.temp;
    }
}

