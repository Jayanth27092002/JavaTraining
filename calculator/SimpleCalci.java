package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleCalci implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, eqButton, clearButton;
    String currentInput = ""; 
    String previousInput = ""; 
    String operator = "";

    public SimpleCalci(){
      frame=new JFrame("MyCalci");
      textField=new JTextField();
      textField.setBounds(30,40,280,30);
      textField.setFont(new Font("Arial", Font.PLAIN, 20));
      textField.setEditable(false);

      for(int i=0;i<10;i++){
        numberButtons[i]=new JButton(String.valueOf(i));
        numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
        numberButtons[i].addActionListener(this);

      }

      addButton = new JButton("+");
      subButton = new JButton("-");
      mulButton = new JButton("*");
      divButton = new JButton("/");
      eqButton = new JButton("=");
      clearButton = new JButton("C");

    addButton.setFont(new Font("Arial", Font.PLAIN, 20));
        subButton.setFont(new Font("Arial", Font.PLAIN, 20));
        mulButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divButton.setFont(new Font("Arial", Font.PLAIN, 20));
        eqButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clearButton.addActionListener(this);

        frame.setLayout(new BorderLayout());
        frame.add(textField,BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(numberButtons[i]);
        };

        buttonPanel.add(addButton);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(eqButton);
        buttonPanel.add(subButton);
        
        buttonPanel.add(mulButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(divButton);

        frame.add(buttonPanel,BorderLayout.CENTER);
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9')) {
            
            currentInput += command;
            textField.setText(currentInput);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            
            previousInput = currentInput;
            currentInput = "";
            operator = command;
        } else if (command.equals("=")) {
            
            double result = 0;
            double num1 = Double.parseDouble(previousInput);
            double num2 = Double.parseDouble(currentInput);

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
            currentInput = String.valueOf(result); 
            operator = "";
        } else if (command.equals("C")) {
            
            currentInput = "";
            previousInput = "";
            operator = "";
            textField.setText("");
        }
    }


    public static void main(String[] args) {
        
        new SimpleCalci();
    }


    

}
