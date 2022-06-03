package calculator;

 

import java.awt.BorderLayout;

import java.awt.Font;

import java.awt.GridLayout;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

 

public class Calc extends JFrame {

 private double op1 = 0;

 private double op2 = 0;

 private String operator = "+";

 private JLabel status;
 
 

 Calc() {

  this.setTitle("계산기");

  this.setBounds(100,100,400,500);

  this.setLayout(new BorderLayout());

  

  JTextField display = new JTextField("0");

  display.setFont( new Font("", 0, 30 )  );

  display.setHorizontalAlignment(JTextField.RIGHT );

  this.add(BorderLayout.NORTH, display);

  JLabel status = new JLabel("여기");

  this.add(BorderLayout.SOUTH, status);

 

  JPanel panel = new JPanel();

  panel.setLayout(new GridLayout(5,5));

  

  

  JButton btnDouble = new JButton("x^2");

  btnDouble.addActionListener( e -> {

   op1 = Double.parseDouble( display.getText() );

   display.setText(""+op1*op1);

  });

  panel.add(btnDouble);

  

  JButton btnRoot = new JButton("√");

  btnRoot.addActionListener( e -> {

	   op1 = Double.parseDouble( display.getText() );

	   display.setText(""+Math.sqrt(op1));

	  });

  panel.add(btnRoot);

  

  

  JButton btnclear = new JButton("CE");
  btnclear.addActionListener( e -> {
	  display.setText("0");
	  });

  panel.add(btnclear);

  

  

  JButton btnClear = new JButton("C");

  btnClear.addActionListener(e -> {

	  op1 = 0;

	  op2 = 0;

	  operator = "+";

	  display.setText("0");

  });

  panel.add(btnClear);

  

 

   JButton btn7 = new JButton( "7");

   btn7.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn7.getText()  );

    } else {

     display.setText( display.getText() + btn7.getText()  );

    }

   });

   panel.add(btn7);

   

   

   JButton btn8 = new JButton( "8");

   btn8.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn8.getText()  );

    } else {

     display.setText( display.getText() + btn8.getText()  );

    }

   });

   panel.add(btn8);

   

   

   JButton btn9 = new JButton( "9");

   btn9.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn9.getText()  );

    } else {

     display.setText( display.getText() + btn9.getText()  );

    }

   });

   panel.add(btn9);

   

   

   JButton btnTime = new JButton("X");

   btnTime.addActionListener( e -> {

    op1 = Double.parseDouble( display.getText() );

    display.setText("0");

    operator = "X";

    status.setText(op1 + " X ");

   });

   panel.add(btnTime);

   

   

   JButton btn4 = new JButton( "4");

   btn4.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn4.getText()  );

    } else {

     display.setText( display.getText() + btn4.getText()  );

    }

   });

   panel.add(btn4);

   

   

   JButton btn5 = new JButton( "5");

   btn5.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn5.getText()  );

    } else {

     display.setText( display.getText() + btn5.getText()  );

    }

   });

   panel.add(btn5);

   

   

   JButton btn6 = new JButton( "6");

   btn6.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn6.getText()  );

    } else {

     display.setText( display.getText() + btn6.getText()  );

    }

   });

   panel.add(btn6);

   

   

   JButton btnSub = new JButton("ㅡ");

   btnSub.addActionListener( e -> {

    op1 = Double.parseDouble( display.getText() );

    display.setText("0");

    operator = "ㅡ";

    status.setText(op1 + " ㅡ ");

   });

   panel.add(btnSub);

   

   

   JButton btn1 = new JButton( "1");

   btn1.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn1.getText()  );

    } else {

     display.setText( display.getText() + btn1.getText()  );

    }

   });

   panel.add(btn1);

   

   

   JButton btn2 = new JButton( "2");

   btn2.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn2.getText()  );

    } else {

     display.setText( display.getText() + btn2.getText()  );

    }

   });

   panel.add(btn2);

   

   

   JButton btn3 = new JButton( "3");

   btn3.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn3.getText()  );

    } else {

     display.setText( display.getText() + btn3.getText()  );

    }

   });

   panel.add(btn3);

   

   

   JButton btnPlus = new JButton("+");

   btnPlus.addActionListener( e -> {

    op1 = Double.parseDouble( display.getText() );

    display.setText("0");

    operator = "+";

    status.setText(op1 + " + ");

   });

   panel.add(btnPlus);

   

   

   JButton btnDivi = new JButton("÷");

   btnDivi.addActionListener( e -> {

    op1 = Double.parseDouble( display.getText() );

    display.setText("0");

    operator = "÷";

    status.setText(op1 + " ÷ ");

   });

   panel.add(btnDivi);

   

   

   JButton btn0 = new JButton( "0");

   btn0.addActionListener( e -> {

    if( display.getText().equals( "0" ) ) {

     display.setText( btn0.getText()  );

    } else {

     display.setText( display.getText() + btn0.getText()  );

    }

   });

   panel.add(btn0);

   

   

   JButton btnDot = new JButton(".");

   btnDot.addActionListener( e -> {

	   if(!display.getText().contains(".")) {

	   display.setText( display.getText() + btnDot.getText()  );

	   }

   });

   panel.add(btnDot);

 

 

  JButton btnEqual = new JButton("=");

  btnEqual.addActionListener( e -> {

   op2 = Double.parseDouble( display.getText() );

   double result = calc(op1, op2, operator );

   display.setText( "" + result );

   status.setText(status.getText() + op2 + " = ");

  });

  panel.add(btnEqual);

  

  

  this.add(panel);

  

 

  

 }

 

 private double calc(double op1, double op2, String operator) {

  double result=0;

  switch( operator ) {

  case "+":

   result = op1 + op2;

   break;

  case "ㅡ":

   result = op1 - op2;

   break;

  case "X":

   result = op1 * op2;

   break;

  case "÷":

   result = op1 / op2;

   break;

  }

  return result;

 }

 

 public static void main(String[] args) {

  new Calc().setVisible(true);

 }

 

}