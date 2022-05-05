import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Caculate extends JFrame{

    JLabel label1,label2,label3;
    JTextField n1,n2,n3;
    JButton equalButton,clearButton,closeButton,addButton,subButton,mulButton,divButton;
    JPanel panel;
    char operator;
    double num1=0,num2=0,num3=0;

    Font myfont = new Font("Ink Free",Font.BOLD,20);

    public Caculate(){

        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel();
        label1.setText("NumberX :");
        label1.setFont(myfont);
        add(label1);
        n1 = new JTextField(10);
        add(n1);
        label2 = new JLabel();
        label2.setText("NumberY :");
        label2.setFont(myfont);
        add(label2);
        n2 = new JTextField(10);
        add(n2);
        label3 = new JLabel();
        label3.setText("Result =");
        label3.setFont(myfont);
        add(label3);
        n3 = new JTextField(10);
        add(n3);
        n3.setEditable(false);

        equalButton = new JButton("=");
        add(equalButton);
        clearButton = new JButton("Clear");
        add(clearButton);
        closeButton = new JButton("Close");
        add(closeButton);
        addButton = new JButton("+");
        add(addButton);
        subButton = new JButton("-");
        add(subButton);
        mulButton = new JButton("*");
        add(mulButton);
        divButton = new JButton("/");
        add(divButton);

        equalButton.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());
        closeButton.addActionListener(new ButtonListener());
        addButton.addActionListener(new ButtonListener());
        subButton.addActionListener(new ButtonListener());
        mulButton.addActionListener(new ButtonListener());
        divButton.addActionListener(new ButtonListener());
        
    }
    public class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addButton ){
            num1 = Double.parseDouble(n1.getText());
            num2 = Double.parseDouble(n2.getText());
            operator='+';
            }
            if(e.getSource() == subButton){
                num1 = Double.parseDouble(n1.getText());
                num2 = Double.parseDouble(n2.getText());
                operator ='-';
            }
            if(e.getSource() == mulButton){
                num1 = Double.parseDouble(n1.getText());
                num2 = Double.parseDouble(n2.getText());
                operator ='*';
            }
            if(e.getSource() == divButton){
                num1 = Double.parseDouble(n1.getText());
                num2 = Double.parseDouble(n2.getText());
                operator ='/';
            }
            if(e.getSource() == equalButton){
                switch(operator){
                    case'+':
                        num3 = num1+num2;
                        break;
                    case'-':
                        num3 = num1-num2;
                        break;
                    case'*':
                        num3 = num1*num2;
                        break;
                    case'/':
                        num3 = num1/num2;
                        break;
                }
                n3.setText(Double.toString(num3));
            }
            if(e.getSource() == clearButton){
                n1.setText("");
                n2.setText("");
                n3.setText("");
            }
            else if(e.getSource() == closeButton){
                System.exit(0);
            }
        }
    }
}


