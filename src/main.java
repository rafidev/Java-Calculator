import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {

    private JFrame mainFrame;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JTextField jTextField;

    public calc Calc = new calc();

    private boolean inputingFirstNum = true;
    private boolean inputingSecondNum = false;


    public void Main() {
        JSplitPane splitPane = new JSplitPane();

        mainFrame = new JFrame("Calculator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 500);
        mainFrame.setLocationRelativeTo(null);


        textPanel = new JPanel(new BorderLayout());
        jTextField = new JTextField();
        jTextField.setFont(new Font("font", Font.PLAIN, 30));
        jTextField.setEditable(false);
        textPanel.add(jTextField, BorderLayout.CENTER);


        buttonPanel = new JPanel(new GridLayout(5,4));
        addButtonAc();
        addButtonPercent();
        addButtonExponent();
        addButtonBack();
        addButton1();
        addButton2();
        addButton3();
        addButtonSummation();
        addButton4();
        addButton5();
        addButton6();
        addButtonSubtraction();
        addButton7();
        addButton8();
        addButton9();
        addButtonMultiplication();
        addButtonComa();
        addButton0();
        addButtonEquals();
        addButtonDivision();


        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(150);
        splitPane.setTopComponent(textPanel);
        splitPane.setBottomComponent(buttonPanel);


        mainFrame.add(splitPane);


        mainFrame.setVisible(true);
    }

    public void addButton1(){

        Button button1 = new Button("1");
        buttonPanel.add(button1);
        button1.setFont(new Font("font", Font.PLAIN, 30));

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(1);
                }
                if(inputingSecondNum){
                    InputSecondNumber(1);
                }
            }
        });
    }

    public void addButton2(){

        Button button2 = new Button("2");
        buttonPanel.add(button2);
        button2.setFont(new Font("font", Font.PLAIN, 30));

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(2);
                }
                if(inputingSecondNum){
                    InputSecondNumber(2);
                }
            }
        });
    }

    public void addButton3(){

        Button button3 = new Button("3");
        buttonPanel.add(button3);
        button3.setFont(new Font("font", Font.PLAIN, 30));

        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(3);
                }
                if(inputingSecondNum){
                    InputSecondNumber(3);
                }
            }
        });
    }

    public void addButtonAc(){

        Button buttonAc = new Button("ac");
        buttonPanel.add(buttonAc);
        buttonAc.setFont(new Font("font", Font.PLAIN, 30));

        buttonAc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                inputingFirstNum = true;
                inputingSecondNum = false;
                Calc.setNum1(0);
                Calc.setNum2(0);
                Calc.setOutcome(0);
                Calc.setWhatCalc("");
            }
        });
    }

    public void addButtonPercent(){

        Button buttonPercent = new Button("%");
        buttonPanel.add(buttonPercent);
        buttonPercent.setFont(new Font("font", Font.PLAIN, 30));

        buttonPercent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void addButtonExponent(){

        Button buttonExponent = new Button("^");
        buttonPanel.add(buttonExponent);
        buttonExponent.setFont(new Font("font", Font.PLAIN, 30));

        buttonExponent.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void addButtonBack(){

        Button buttonBack = new Button("del");
        buttonPanel.add(buttonBack);
        buttonBack.setFont(new Font("font", Font.PLAIN, 30));

        buttonBack.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void addButtonSummation(){

        Button buttonSummation = new Button("+");
        buttonPanel.add(buttonSummation);
        buttonSummation.setFont(new Font("font", Font.PLAIN, 30));

        buttonSummation.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc.setWhatCalc("+");
                if(Calc.getNum2()==0){
                    inputingFirstNum = false;
                    inputingSecondNum = true;
                }
                else{
                    Calc.setNum1(Calc.getNum1() + Calc.getNum2());
                    Calc.setNum2(0);
                }
            }
        });
    }

    public void addButton4(){

        Button button4 = new Button("4");
        buttonPanel.add(button4);
        button4.setFont(new Font("font", Font.PLAIN, 30));

        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(4);
                }
                if(inputingSecondNum){
                    InputSecondNumber(4);
                }
            }
        });
    }

    public void addButton5(){

        Button button5 = new Button("5");
        buttonPanel.add(button5);
        button5.setFont(new Font("font", Font.PLAIN, 30));

        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(5);
                }
                if(inputingSecondNum){
                    InputSecondNumber(5);
                }
            }
        });
    }

    public void addButton6(){

        Button button6 = new Button("6");
        buttonPanel.add(button6);
        button6.setFont(new Font("font", Font.PLAIN, 30));

        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(6);
                }
                if(inputingSecondNum){
                    InputSecondNumber(6);
                }
            }
        });
    }

    public void addButtonSubtraction(){

        Button buttonSubtraction = new Button("-");
        buttonPanel.add(buttonSubtraction);
        buttonSubtraction.setFont(new Font("font", Font.PLAIN, 30));

        buttonSubtraction.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc.setWhatCalc("-");
                if(Calc.getNum2()==0){
                    inputingFirstNum = false;
                    inputingSecondNum = true;
                }
                else{
                    Calc.setNum1(Calc.getNum1() - Calc.getNum2());
                    Calc.setNum2(0);
                }
            }
        });
    }

    public void addButton7(){

        Button button7 = new Button("7");
        buttonPanel.add(button7);
        button7.setFont(new Font("font", Font.PLAIN, 30));

        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(7);
                }
                if(inputingSecondNum){
                    InputSecondNumber(7);
                }
            }
        });
    }

    public void addButton8(){

        Button button8 = new Button("8");
        buttonPanel.add(button8);
        button8.setFont(new Font("font", Font.PLAIN, 30));

        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(8);
                }
                if(inputingSecondNum){
                    InputSecondNumber(8);
                }
            }
        });
    }

    public void addButton9(){

        Button button9 = new Button("9");
        buttonPanel.add(button9);
        button9.setFont(new Font("font", Font.PLAIN, 30));

        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(9);
                }
                if(inputingSecondNum){
                    InputSecondNumber(9);
                }
            }
        });
    }

    public void addButtonMultiplication(){

        Button buttonMultiplication = new Button("*");
        buttonPanel.add(buttonMultiplication);
        buttonMultiplication.setFont(new Font("font", Font.PLAIN, 30));

        buttonMultiplication.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc.setWhatCalc("*");
                if(Calc.getNum2()==0){
                    inputingFirstNum = false;
                    inputingSecondNum = true;
                }
                else{
                    Calc.setNum1(Calc.getNum1() * Calc.getNum2());
                    Calc.setNum2(0);
                }
            }
        });
    }

    public void addButtonComa(){

        Button buttonComa = new Button(",");
        buttonPanel.add(buttonComa);
        buttonComa.setFont(new Font("font", Font.PLAIN, 30));

        buttonComa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }

    public void addButton0(){

        Button button0 = new Button("0");
        buttonPanel.add(button0);
        button0.setFont(new Font("font", Font.PLAIN, 30));

        button0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inputingFirstNum){
                    InputFirstNum(0);
                }
                if(inputingSecondNum){
                    InputSecondNumber(0);
                }
            }
        });
    }

    public void addButtonEquals(){

        Button buttonEquals = new Button("=");
        buttonPanel.add(buttonEquals);
        buttonEquals.setFont(new Font("font", Font.PLAIN, 30));

        buttonEquals.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc.Main();
                jTextField.setText(jTextField.getText() + "=" + Calc.getOutcome());
            }
        });
    }

    public void addButtonDivision(){

        Button buttonDivision = new Button("/");
        buttonPanel.add(buttonDivision);
        buttonDivision.setFont(new Font("font", Font.PLAIN, 30));

        buttonDivision.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc.setWhatCalc("/");
                if(Calc.getNum2()==0){
                    inputingFirstNum = false;
                    inputingSecondNum = true;
                }
                else{
                    Calc.setNum1(Calc.getNum1() / Calc.getNum2());
                    Calc.setNum2(0);
                }
            }
        });
    }

    public void InputFirstNum(double input){
        if(inputingFirstNum){
            if(Calc.getNum1()==0){
                Calc.setNum1(input);
            }
            else{
                double temp;
                temp = Calc.getNum1() * 10 + input;
                Calc.setNum1(temp);
            }
            jTextField.setText("");
            jTextField.setText(jTextField.getText() + Calc.getNum1());
        }
    }

    public void InputSecondNumber(double input){
        if(inputingSecondNum){
            if(Calc.getNum2()==0){
                Calc.setNum2(input);
            }
            else{
                double temp;
                temp = Calc.getNum2() * 10 + input;
                Calc.setNum2(temp);
            }
            jTextField.setText(Calc.getNum1() + Calc.getWhatCalc() + Calc.getNum2());
        }
    }

    public void Output(){
        jTextField.setText("");
        jTextField.setText( jTextField.getText());
    }
}
