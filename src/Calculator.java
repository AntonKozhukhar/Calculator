import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private JTextField textDisplay;
    private JButton btnDivision;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnZero;
    private JButton btnPlusMinus;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMulti;
    private JButton btnClear;
    private JButton btnEquals;
    private JPanel Calculator;

    double num1;
    double num2;
    double result;
    String operation;

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(inputNum);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operation = "+";
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operation = "-";
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operation = "*";
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("");
                operation = "/";
            }
        });
        btnPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double plusMinus = Double.parseDouble(String.valueOf(textDisplay.getText()));
                plusMinus = plusMinus * (-1);
                textDisplay.setText(String.valueOf(plusMinus));
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textDisplay.getText());
                String total;
                if (operation == "+") {
                    result = num1 + num2;
                    total = String.format("%.2f",result);
                    textDisplay.setText(total);
                }
                else if (operation == "-") {
                    result = num1 - num2;
                    total = String.format("%.2f",result);
                    textDisplay.setText(total);
                }
                else if (operation == "*") {
                    result = num1 * num2;
                    total = String.format("%.2f",result);
                    textDisplay.setText(total);
                }
                else if (operation == "/") {
                    result = num1 / num2;
                    total = String.format("%.2f",result);
                    textDisplay.setText(total);
                }

            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputNum = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(inputNum);
            }
        });
    }
}
