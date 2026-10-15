import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class calculator implements ActionListener {

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton ;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton pointButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multiButton;
    JButton minButton;
    JButton plusButton;
    JButton doublezeroButton;
    JButton clearButton;
    JButton deleteButton;
    JButton negButton;
    boolean operatorClicked=false;
    double num1=0,num2=0,result=0;
    char operator;


    public calculator (){
        jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);


        displayLabel=new JLabel();
        displayLabel.setBounds(30, 50, 550, 50);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.BLACK);
        jf.add(displayLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial",Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial",Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial",Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);


        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);
        
        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial",Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial",Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        
        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial",Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial",Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        pointButton=new JButton(".");
        pointButton.setBounds(30, 430, 80, 80);
        pointButton.setFont(new Font("Arial",Font.TYPE1_FONT, 40));
        pointButton.addActionListener(this);
        jf.add(pointButton);
        
        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        doublezeroButton=new JButton("00");
        doublezeroButton.setBounds(230, 430, 80, 80);
        doublezeroButton.setFont(new Font("Arial",Font.PLAIN, 40));
        doublezeroButton.addActionListener(this);
        jf.add(doublezeroButton);

        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial",Font.ITALIC, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        multiButton=new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new Font("Arial",Font.ROMAN_BASELINE, 40));
        multiButton.addActionListener(this);
        jf.add(multiButton);

        minButton=new JButton("-");
        minButton.setBounds(330, 330, 80, 80);
        minButton.setFont(new Font("Arial",Font.ITALIC, 40));
        minButton.addActionListener(this);
        jf.add(minButton);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial",Font.ITALIC, 40));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        equalButton=new JButton("=");
        equalButton.setBounds(430, 430, 80, 80);
        equalButton.setFont(new Font("Arial",Font.ITALIC, 40));
        equalButton.addActionListener(this);
        equalButton.setForeground(Color.RED);
        jf.add(equalButton);

        clearButton=new JButton("CLEAR");
        clearButton.setBounds(430, 330, 80, 80);
        clearButton.setFont(new Font("Arial",Font.BOLD, 13));
        clearButton.addActionListener(this);
        clearButton.setForeground(Color.RED);
        jf.add(clearButton);

        deleteButton=new JButton("Delete");
        deleteButton.setBounds(430, 230, 80, 80);
        deleteButton.setFont(new Font("Arial",Font.BOLD, 13));
        deleteButton.addActionListener(this);
        deleteButton.setForeground(Color.RED);
        jf.add(deleteButton);

        negButton=new JButton("(-)");
        negButton.setBounds(430, 130, 80, 80);
        negButton.setFont(new Font("Arial",Font.PLAIN, 30));
        negButton.addActionListener(this);
        negButton.setForeground(Color.RED);
        jf.add(negButton);






         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayLabel.setFont(new Font("Arial",Font.LAYOUT_RIGHT_TO_LEFT, 40));
       if (e.getSource()== sevenButton){
        if(operatorClicked){
            displayLabel.setText("7");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"7");
        }
        
       }else if (e.getSource()==eightButton){
        if(operatorClicked){
            displayLabel.setText("8");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"8");
        }
       }else if (e.getSource()==nineButton){
        if(operatorClicked){
            displayLabel.setText("9");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"9");
        }
    }else if (e.getSource()==fourButton){
        if(operatorClicked){
            displayLabel.setText("4");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"4");
        }
      }else if (e.getSource()==fiveButton){
        if(operatorClicked){
            displayLabel.setText("5");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"5");
        }
      }else if (e.getSource()==sixButton){
        if(operatorClicked){
            displayLabel.setText("6");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"6");
        }
    }else if (e.getSource()==oneButton){
        if(operatorClicked){
            displayLabel.setText("1");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"1");
        }
    }else if (e.getSource()==twoButton){
        if(operatorClicked){
            displayLabel.setText("2");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"2");
        }
    }else if (e.getSource()==threeButton){
        if(operatorClicked){
            displayLabel.setText("3");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"3");
        }
    }else if (e.getSource()==zeroButton){
        if(operatorClicked){
            displayLabel.setText("0");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"0");
        }
    }else if (e.getSource()==doublezeroButton){
        if(operatorClicked){
            displayLabel.setText("00");
            operatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"00");
        }
    }else if (e.getSource()==clearButton){
        displayLabel.setText("");
    }else if (e.getSource()==pointButton){
        displayLabel.setText(displayLabel.getText().concat("."));
    }else if (e.getSource()==plusButton){
        num1= Double.parseDouble(displayLabel.getText());
        operator = '+';
        displayLabel.setText("");
    }else if (e.getSource()==minButton){
        num1= Double.parseDouble(displayLabel.getText());
        operator = '-';
        displayLabel.setText("");
    }else if (e.getSource()==multiButton){
        num1= Double.parseDouble(displayLabel.getText());
        operator = 'x';
        displayLabel.setText("");
    }else if (e.getSource()==divButton){
        num1= Double.parseDouble(displayLabel.getText());
        operator = '/';
        displayLabel.setText("");
    }else if (e.getSource()==equalButton){
        num2= Double.parseDouble(displayLabel.getText());
        switch (operator){
            case '+':
            result = num1+num2;
            break;
            case '-':
            result = num1-num2;
            break;
            case 'x':
            result = num1*num2;
            break;
            case '/':
            result = num1/num2;
            break;
        }
        displayLabel.setText(String.valueOf(result));
        num1=result;
    
    }else if (e.getSource()==deleteButton){
        String string= displayLabel.getText();
        displayLabel.setText("");
        for(int i=0;i<string.length()-1;i++){
            displayLabel.setText(displayLabel.getText()+string.charAt(i));
        }

    }else if (e.getSource()==negButton){
        double temp = Double.parseDouble(displayLabel.getText());
        temp*=-1;
        displayLabel.setText(String.valueOf(temp));
    }
}


}

