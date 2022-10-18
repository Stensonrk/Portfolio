/* Robert Stenson
 * GUI for the calculator application
 * October 13, 2022
 */

 import javax.swing.*;
 import java.awt.*;

 public class CalculatorGui extends JFrame{

    private JFrame calculatorFrame = new JFrame("Calculator");
    private JPanel calculatorPanel = new JPanel();
    private GridBagConstraints gbConstraints = new GridBagConstraints();

    //Operand Buttons
    private JButton additionButton = new JButton("+");
    private JButton subtractionButton = new JButton("-");
    private JButton multiplicationButton = new JButton("X");
    private JButton divisionButton = new JButton("/");
    private JButton modulusButton = new JButton("MOD");
    private JButton exponentButton = new JButton("xʸ");
    private JButton equalsButton = new JButton("=");
    private JButton rootButton = new JButton("√");
    private JButton clearEntryButton = new JButton("CE");
    private JButton clearButton = new JButton("C");
    private JButton percentButton = new JButton("%");
    private JButton factorialButton = new JButton("n!");
    private JButton reciprocalButton = new JButton("1/x");
    private JButton absoluteValueButton = new JButton("|x|");
    private JButton logButton = new JButton("log");
    private JButton naturalLogButton = new JButton("ln");
    private JButton powerOfTwoButton = new JButton("2ˣ");
    private JButton powerOfTenButton = new JButton("10ˣ");
    private JButton openParenthesis = new JButton ("(");
    private JButton closeParenthesis = new JButton (")");
    private JButton scientificNotationButton = new JButton("EXP");

    

    //Numeral Buttons
    private JButton zeroButton = new JButton("0");
    private JButton oneButton = new JButton("1");
    private JButton twoButton = new JButton("2");
    private JButton threeButton = new JButton("3");
    private JButton fourButton = new JButton("4");
    private JButton fiveButton = new JButton("5");
    private JButton sixButton = new JButton("6");
    private JButton sevenButton = new JButton("7");
    private JButton eightButton = new JButton("8");
    private JButton nineButton = new JButton("9");
    private JButton decimalButton = new JButton(".");
    private JButton negativeButton = new JButton("+/-");
    private JButton piButton = new JButton("π");
    private JButton eulerButton = new JButton("e");
    private JButton backspaceButton = new JButton("←");
    private JButton randomButton = new JButton("RAND");

    //TextFields
    private JTextField inputOutputBox = new JTextField("00000");
    private JTextField historyBox = new JTextField("History");
    
    public void GUI() {
        
        //Frame setup       
        calculatorFrame.setPreferredSize(new Dimension(650, 625));
        calculatorFrame.setMinimumSize(new Dimension(450,550));
        calculatorFrame.setVisible(true);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel Layout setup
        calculatorPanel.setLayout(new GridBagLayout());
        gbConstraints.fill = GridBagConstraints.BOTH;
        gbConstraints.anchor = GridBagConstraints.NORTH;
        gbConstraints.insets = new Insets(1,1,1,1);

        calculatorPanel.setBackground(Color.darkGray);
        calculatorFrame.add(calculatorPanel);

        //Operand Button setup
        addComponent(additionButton,7,6,1,1,1,1);
        addComponent(subtractionButton,6,6,1,1,1,1);
        addComponent(multiplicationButton,5,6,1,1,1,1);
        addComponent(divisionButton,4,6,1,1,1,1);
        addComponent(modulusButton,4,7,1,1,1,1);
        addComponent(exponentButton,3,3,1,1,1,1);
        addComponent(equalsButton,6,7,2,1,1,1);
        addComponent(rootButton,3,4,1,1,1,1);
        addComponent(clearEntryButton,6,0,2,1,1,1);
        addComponent(clearButton,4,0,2,1,1,1);
        addComponent(percentButton,4,2,1,1,1,1);
        addComponent(factorialButton,3,2,1,1,1,1);
        addComponent(reciprocalButton,4,1,1,1,1,1);
        addComponent(absoluteValueButton,7,2,1,1,1,1);
        addComponent(logButton,7,1,1,1,1,1);
        addComponent(naturalLogButton,6,1,1,1,1,1);
        addComponent(powerOfTwoButton,3,0,1,1,1,1);
        addComponent(powerOfTenButton,3,1,1,1,1,1);
        addComponent(openParenthesis,3,5,1,1,1,1);
        addComponent(closeParenthesis,3,6,1,1,1,1);
        addComponent(scientificNotationButton,5,7,1,1,1,1);

        //Numeral Button setup
        addComponent(zeroButton,7,4,1,1,1,1);
        addComponent(oneButton,6,3,1,1,1,1);
        addComponent(twoButton,6,4,1,1,1,1);
        addComponent(threeButton,6,5,1,1,1,1);
        addComponent(fourButton,5,3,1,1,1,1);
        addComponent(fiveButton,5,4,1,1,1,1);
        addComponent(sixButton,5,5,1,1,1,1);
        addComponent(sevenButton,4,3,1,1,1,1);
        addComponent(eightButton,4,4,1,1,1,1);
        addComponent(nineButton,4,5,1,1,1,1);
        addComponent(decimalButton,7,5,1,1,1,1);
        addComponent(negativeButton,7,3,1,1,1,1);
        addComponent(piButton,5,1,1,1,1,1);
        addComponent(eulerButton,5,2,1,1,1,1);
        addComponent(backspaceButton, 3,7,1,1,1,1);
        addComponent(randomButton, 6,2,1,1,1,1);

        //Textfield setup
        addComponent(inputOutputBox, 1,0,1,8,1,5);
        addComponent(historyBox, 1, 8, 10, 10, 5, 5);
        inputOutputBox.setEditable(false);
        historyBox.setEditable(false);


        calculatorFrame.pack();

        calculatorFrame.setLocationRelativeTo(null);

    }

    //Method for positioning components
    private void addComponent(Component comp, int row, int column,
                                int numberOfRows, int numberOfColumns,
                                double weightx, double weighty) {

        gbConstraints.gridx = column;
        gbConstraints.gridy = row;
        gbConstraints.gridwidth = numberOfColumns;
        gbConstraints.gridheight = numberOfRows;
        gbConstraints.weightx = weightx;
        gbConstraints.weighty = weighty;
        calculatorPanel.add(comp, gbConstraints);
    }
}
