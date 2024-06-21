package Cal;

import javax.swing.*;  // Importing Swing components for GUI
import java.awt.*;     // Importing AWT components for layout and color
import java.awt.event.ActionEvent;  // Importing ActionEvent class for handling actions
import java.awt.event.ActionListener;  // Importing ActionListener interface for handling events

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;  // Display field for showing the input and result
    private double num1, num2, result;  // Variables for storing numbers and result
    private char operator;  // Variable for storing the operator

    public Calculator() {
        // Setting the title of the frame
        setTitle("JAVCAL");

        // Setting the size of the frame
        setSize(400, 400);

        // Setting the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the layout of the frame
        setLayout(new BorderLayout());

        // Set the dark theme colors
        Color backgroundColor = new Color(0, 0, 0);  // Background color for the frame
        Color foregroundColor = new Color(255, 255, 255);  // Text color
        Color buttonColor = new Color(0, 0, 0);  // Button background color
        Color displayBackgroundColor = Color.BLACK;  // Display background color
        Color displayForegroundColor = Color.GREEN;  // Display text color

        // Creating the display field
        display = new JTextField();
        display.setEditable(false);  // Making the display field non-editable
        display.setFont(new Font("Times New Roman", Font.BOLD, 30));  // Setting the font of the display text
        display.setBackground(displayBackgroundColor);  // Setting the background color of the display to white
        display.setForeground(displayForegroundColor);  // Setting the text color of the display to black
        add(display, BorderLayout.NORTH);  // Adding the display field to the top of the frame

        // Creating a panel for the number buttons
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 3));  // Setting the layout of the panel to a 4x3 grid
        numberPanel.setBackground(backgroundColor);  // Setting the background color of the panel

        // Array of number button labels
        String[] numbers = {
            "7", "8", "9",
            "4", "5", "6",
            "1", "2", "3",
            "0", "C", "="
        };

        // Creating and adding number buttons to the panel
        for (String text : numbers) {
            JButton button = new JButton(text);
            button.setFont(new Font("Times New Roman", Font.BOLD, 20));  // Setting the font of the button text
            button.setBackground(buttonColor);  // Setting the background color of the button
            button.setForeground(foregroundColor);  // Setting the text color of the button to foreground color
            button.addActionListener(this);  // Adding action listener to the button
            numberPanel.add(button);  // Adding the button to the panel
        }

        // Creating a panel for the operator buttons
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(5, 1));  // Setting the layout of the panel to a 5x1 grid
        operatorPanel.setBackground(backgroundColor);  // Setting the background color of the panel

        // Array of operator button labels
        String[] operators = {
            "/", "*", "-", "+", "%"
        };

        // Creating and adding operator buttons to the panel
        for (String text : operators) {
            JButton button = new JButton(text);
            button.setFont(new Font("Times New Roman", Font.BOLD, 20));  // Setting the font of the button text
            button.setBackground(buttonColor);  // Setting the background color of the button
            button.setForeground(foregroundColor);  // Setting the text color of the button to foreground color
            button.addActionListener(this);  // Adding action listener to the button
            operatorPanel.add(button);  // Adding the button to the panel
        }

        // Adding the number panel to the center of the frame
        add(numberPanel, BorderLayout.CENTER);

        // Adding the operator panel to the east side of the frame
        add(operatorPanel, BorderLayout.EAST);

        // Making the frame visible
        setVisible(true);
    }

    // Overriding the actionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  // Getting the action command (button label)

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            // If the button is a number, append it to the display text
            display.setText(display.getText() + command);
        } else if (command.charAt(0) == 'C') {
            // If the button is 'C', clear the display
            display.setText("");
        } else if (command.charAt(0) == '=') {
            // If the button is '=', perform the calculation
            num2 = Double.parseDouble(display.getText());  // Get the second number
            switch (operator) {  // Perform the operation based on the operator
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }
            display.setText(String.valueOf(result));  // Display the result
            num1 = result;  // Set the result as the first number for the next operation
        } else {
            // If the button is an operator, store the first number and operator
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());  // Get the first number
                operator = command.charAt(0);  // Get the operator
                display.setText("");  // Clear the display for the next input
            }
        }
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        new Calculator();  // Create a new instance of the Calculator class
    }
}
