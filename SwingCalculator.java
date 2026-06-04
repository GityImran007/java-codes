import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton plus, minus, multiply, divide;

    public SwingCalculator() {

        setTitle("Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Number 1:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Number 2:"));
        num2 = new JTextField();
        add(num2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        JPanel panel = new JPanel();

        plus = new JButton("Plus");
        minus = new JButton("Minus");
        multiply = new JButton("Multiplication");
        divide = new JButton("Division");

        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double ans = 0;

            if (e.getSource() == plus) {
                ans = a + b;
            }
            else if (e.getSource() == minus) {
                ans = a - b;
            }
            else if (e.getSource() == multiply) {
                ans = a * b;
            }
            else if (e.getSource() == divide) {

                if (b == 0) {
                    throw new ArithmeticException("Division by zero not allowed");
                }

                ans = a / b;
            }

            result.setText(String.valueOf(ans));
        }

        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers!");
        }

        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}