import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstDemo {
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JButton addButton;
    private JButton subButton;
    private JButton multiplyButton;
    private JPanel mainform;

    public FirstDemo() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add
                try{
                    double result = doAdd(Double.parseDouble(textNumber1.getText()),
                            Double.parseDouble(textNumber2.getText()));
                    displayResult("Add Result", result+"",JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception err){
                    displayResult("ERROR", "Please input numeric only",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = dosub(Double.parseDouble(textNumber1.getText()),
                            Double.parseDouble(textNumber2.getText()));
                    displayResult("Sub Result", result + "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = domul(Double.parseDouble(textNumber1.getText()),
                            Double.parseDouble(textNumber2.getText()));
                    displayResult("Multiply Result", result + "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    displayResult("ERROR", "Please input numeric only", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });
    }
    private double dosub(double n1,double n2) {
        return n1 - n2;
    }
    private double doAdd(double n1,double n2){
        return n1+n2;
    }
    private double domul(double n1,double n2){
        return n1*n2;
    }
    private void displayResult(String title,String msg,int type){
        JOptionPane.showMessageDialog(null,msg,title,type);
    }
    public JPanel getMainPanel(){
        return this.mainform;
        }
    }


