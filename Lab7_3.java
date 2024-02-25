import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnDot, btnBs, btnAdd, btnSub, btnMul,
            btnDiv, btneq, btnsqrt, btnmod, btnpow;
    JFrame window;
    boolean dot = false;
    Double fOperand, sOperand;
    String operator = "";
    NumberNew cal = new NumberNew();

    public Lab7_3() {

        window = new JFrame("Calculator");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());

        numberField = new JTextField(25);
        numberField.setHorizontalAlignment(JTextField.RIGHT);
        numberField.setFont(new Font("Courier New", Font.BOLD, 20));
        numberField.setEditable(false);
        container.add(numberField);

        btnBs = new JButton("       Backspace      ");
        btnBs.setFont(new Font("Courier New", Font.BOLD, 20));
        btnBs.addActionListener(this);
        container.add(btnBs);

        btnsqrt = new JButton(" √ ");
        btnsqrt.setFont(new Font("Courier New", Font.BOLD, 20));
        btnsqrt.addActionListener(this);
        container.add(btnsqrt);

        btnmod = new JButton("MOD");
        btnmod.setFont(new Font("Courier New", Font.BOLD, 20));
        btnmod.addActionListener(this);
        container.add(btnmod);

        btnpow = new JButton(" ^ ");
        btnpow.setFont(new Font("Courier New", Font.BOLD, 20));
        btnpow.addActionListener(this);
        container.add(btnpow);

        btnDiv = new JButton(" / ");
        btnDiv.setFont(new Font("Courier New", Font.BOLD, 20));
        btnDiv.addActionListener(this);
        container.add(btnDiv);

        btn7 = new JButton(" 7 ");
        btn7.setFont(new Font("Courier New", Font.BOLD, 20));
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton(" 8 ");
        btn8.setFont(new Font("Courier New", Font.BOLD, 20));
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton(" 9 ");
        btn9.setFont(new Font("Courier New", Font.BOLD, 20));
        btn9.addActionListener(this);
        container.add(btn9);

        btnMul = new JButton(" * ");
        btnMul.setFont(new Font("Courier New", Font.BOLD, 20));
        btnMul.addActionListener(this);
        container.add(btnMul);

        btn4 = new JButton(" 4 ");
        btn4.setFont(new Font("Courier New", Font.BOLD, 20));
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton(" 5 ");
        btn5.setFont(new Font("Courier New", Font.BOLD, 20));
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton(" 6 ");
        btn6.setFont(new Font("Courier New", Font.BOLD, 20));
        btn6.addActionListener(this);
        container.add(btn6);

        btnSub = new JButton(" - ");
        btnSub.setFont(new Font("Courier New", Font.BOLD, 20));
        btnSub.addActionListener(this);
        container.add(btnSub);

        btn1 = new JButton(" 1 ");
        btn1.setFont(new Font("Courier New", Font.BOLD, 20));
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton(" 2 ");
        btn2.setFont(new Font("Courier New", Font.BOLD, 20));
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton(" 3 ");
        btn3.setFont(new Font("Courier New", Font.BOLD, 20));
        btn3.addActionListener(this);
        container.add(btn3);

        btnAdd = new JButton(" + ");
        btnAdd.setFont(new Font("Courier New", Font.BOLD, 20));
        btnAdd.addActionListener(this);
        container.add(btnAdd);

        btnDot = new JButton(" . ");
        btnDot.setFont(new Font("Courier New", Font.BOLD, 20));
        btnDot.addActionListener(this);
        container.add(btnDot);

        btn0 = new JButton(" 0 ");
        btn0.setFont(new Font("Courier New", Font.BOLD, 20));
        btn0.addActionListener(this);
        container.add(btn0);

        btnClear = new JButton(" C ");
        btnClear.setFont(new Font("Courier New", Font.BOLD, 20));
        btnClear.addActionListener(this);
        container.add(btnClear);

        btneq = new JButton(" = ");
        btneq.setFont(new Font("Courier New", Font.BOLD, 20));
        btneq.addActionListener(this);
        container.add(btneq);

        window.setSize(330, 310);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        } else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);
        } else if (event.getSource() == btnClear) {
            str = "";
            numberField.setText(str);
            dot = false;
        } else if (event.getSource() == btnDot) {
            if (dot == false) {
                str += ".";
                numberField.setText(str);
                dot = true;
            }

        } else if (event.getSource() == btnBs) {
            if (str.charAt(str.length() - 1) == '.') {
                dot = false;
            }
            str = str.substring(0, str.length() - 1);
            numberField.setText(str);
        } else if (event.getSource() == btnAdd && operator.isEmpty()) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "+";
            dot = false;
        } else if (event.getSource() == btnSub) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "-";
            dot = false;
        } else if (event.getSource() == btnMul) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "*";
            dot = false;
        } else if (event.getSource() == btnDiv) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "/";
            dot = false;
        } else if (event.getSource() == btnmod) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "%";
            dot = false;
        } else if (event.getSource() == btnpow) {
            cal.setValue(Double.parseDouble(numberField.getText()));
            numberField.setText("");
            operator = "^";
            dot = false;
        } else if (event.getSource() == btnsqrt) {
            cal.sqr(Double.parseDouble(numberField.getText()));
            numberField.setText(cal.toString());
        } else if (event.getSource() == btneq) {
            dot = true;
            if (operator == "+") {
                cal.add(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            } else if (operator == "-") {
                cal.subtract(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            } else if (operator == "*") {
                cal.multiply(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            } else if (operator == "/") {
                cal.divide(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            } else if (operator == "%") {
                cal.mod(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            } else if (operator == "^") {
                cal.power(Double.parseDouble(numberField.getText()));
                operator = "";
                numberField.setText(cal.toString());
            }
        } else if (event.getSource() == btnAdd && operator != "") {
            if (operator == "+") {
                cal.add(Double.parseDouble(numberField.getText()));
                operator = "+";

            } else if (operator == "-") {
                cal.subtract(Double.parseDouble(numberField.getText()));
                operator = "+";

            } else if (operator == "*") {
                cal.multiply(Double.parseDouble(numberField.getText()));
                operator = "+";

            } else if (operator == "/") {
                cal.divide(Double.parseDouble(numberField.getText()));
                operator = "+";

            } else if (operator == "%") {
                cal.mod(Double.parseDouble(numberField.getText()));
                operator = "+";

            } else if (operator == "^") {
                cal.power(Double.parseDouble(numberField.getText()));
                operator = "+";

            }
            numberField.setText("");
        } else if (event.getSource() == btnSub && operator != "") {
            if (operator == "+") {
                cal.add(Double.parseDouble(numberField.getText()));

            } else if (operator == "-") {
                cal.subtract(Double.parseDouble(numberField.getText()));

            } else if (operator == "*") {
                cal.multiply(Double.parseDouble(numberField.getText()));

            } else if (operator == "/") {
                cal.divide(Double.parseDouble(numberField.getText()));

            } else if (operator == "%") {
                cal.mod(Double.parseDouble(numberField.getText()));

            } else if (operator == "^") {
                cal.power(Double.parseDouble(numberField.getText()));

            }
            operator = "-";
            numberField.setText("");
        }

    }

    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}