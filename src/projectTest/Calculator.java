package projectTest;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Calculator implements ActionListener {

   Font font = new Font("Bold", Font.BOLD, 35);
   public JPanel gui;
   
   JButton oneButton;
   JButton twoButton;
   JButton threeButton;
   JButton fourButton;
   JButton fiveButton;
   JButton sixButton;
   JButton sevenButton;
   JButton eightButton;
   JButton nineButton;
   JButton zeroButton;
   JButton emptyButton1;
   JButton emptyButton2;
   JButton resetButton;
   JButton convertSignButton;
   JButton decimalButton;
   JButton plusButton;
   JButton minusButton;
   JButton divButton;
   JButton mulButton;
   JButton equalButton;
   JTextArea display;

   StringBuilder sb = new StringBuilder();

   ArrayList<String> postfix = new ArrayList<>();
   Stack<String> opStack = new Stack<>(); //       
   Stack<Float> numStack = new Stack<>();

   float result = 0; //  ߰                  calculate() Լ         

   public Calculator() {

//      super("    ");
      gui = new JPanel(new BorderLayout(5, 5));

      gui.setBorder(new EmptyBorder(4, 4, 4, 4));

      display = new JTextArea();
      display.setText("");
      display.setFont(font);

      gui.add(display, BorderLayout.NORTH);

      JPanel panelButtons = new JPanel(new GridLayout(5, 4, 5, 5));
      panelButtons.setForeground(Color.WHITE);

      emptyButton1 = new JButton("");
      emptyButton1.setBackground(Color.BLACK);
      panelButtons.add(emptyButton1);

      emptyButton2 = new JButton("");
      emptyButton2.setBackground(Color.BLACK);
      panelButtons.add(emptyButton2);

      resetButton = new JButton("C");
      resetButton.setForeground(Color.WHITE);
      resetButton.setBackground(Color.RED);
      resetButton.setFont(font);
      panelButtons.add(resetButton);

      divButton = new JButton("/");
      divButton.setBackground(Color.GRAY);
      divButton.setForeground(Color.WHITE);
      divButton.setFont(font);
      panelButtons.add(divButton);

      sevenButton = new JButton("7");
      sevenButton.setBackground(Color.BLACK);
      sevenButton.setForeground(Color.WHITE);
      sevenButton.setFont(font);
      panelButtons.add(sevenButton);

      eightButton = new JButton("8");
      eightButton.setBackground(Color.BLACK);
      eightButton.setForeground(Color.WHITE);
      eightButton.setFont(font);
      panelButtons.add(eightButton);

      nineButton = new JButton("9");
      nineButton.setBackground(Color.BLACK);
      nineButton.setForeground(Color.WHITE);
      nineButton.setFont(font);
      panelButtons.add(nineButton);

      mulButton = new JButton("*");
      mulButton.setBackground(Color.GRAY);
      mulButton.setForeground(Color.WHITE);
      mulButton.setFont(font);
      panelButtons.add(mulButton);

      fourButton = new JButton("4");
      fourButton.setBackground(Color.BLACK);
      fourButton.setForeground(Color.WHITE);
      fourButton.setFont(font);
      panelButtons.add(fourButton);

      fiveButton = new JButton("5");
      fiveButton.setBackground(Color.BLACK);
      fiveButton.setForeground(Color.WHITE);
      fiveButton.setFont(font);
      panelButtons.add(fiveButton);

      sixButton = new JButton("6");
      sixButton.setBackground(Color.BLACK);
      sixButton.setForeground(Color.WHITE);
      sixButton.setFont(font);
      panelButtons.add(sixButton);

      minusButton = new JButton("-");
      minusButton.setBackground(Color.GRAY);
      minusButton.setForeground(Color.WHITE);
      minusButton.setFont(font);
      panelButtons.add(minusButton);

      oneButton = new JButton("1");
      oneButton.setBackground(Color.BLACK);
      oneButton.setForeground(Color.WHITE);
      oneButton.setFont(font);
      panelButtons.add(oneButton);

      twoButton = new JButton("2");
      twoButton.setBackground(Color.BLACK);
      twoButton.setForeground(Color.WHITE);
      twoButton.setFont(font);
      panelButtons.add(twoButton);

      threeButton = new JButton("3");
      threeButton.setBackground(Color.BLACK);
      threeButton.setForeground(Color.WHITE);
      threeButton.setFont(font);
      panelButtons.add(threeButton);

      plusButton = new JButton("+");
      plusButton.setBackground(Color.GRAY);
      plusButton.setForeground(Color.WHITE);
      plusButton.setFont(font);
      panelButtons.add(plusButton);

      convertSignButton = new JButton("Negative");
      convertSignButton.setBackground(Color.GRAY);
      convertSignButton.setForeground(Color.WHITE);
      panelButtons.add(convertSignButton);

      zeroButton = new JButton("0");
      zeroButton.setBackground(Color.GRAY);
      zeroButton.setForeground(Color.WHITE);
      zeroButton.setFont(font);
      panelButtons.add(zeroButton);

      decimalButton = new JButton(".");
      decimalButton.setBackground(Color.GRAY);
      decimalButton.setForeground(Color.WHITE);
      decimalButton.setFont(font);
      panelButtons.add(decimalButton);

      equalButton = new JButton("=");
      equalButton.setBackground(Color.GRAY);
      equalButton.setForeground(Color.WHITE);
      equalButton.setFont(font);
      panelButtons.add(equalButton);

      oneButton.addActionListener(this);
      twoButton.addActionListener(this);
      threeButton.addActionListener(this);
      fourButton.addActionListener(this);
      fiveButton.addActionListener(this);
      sixButton.addActionListener(this);
      sevenButton.addActionListener(this);
      eightButton.addActionListener(this);
      nineButton.addActionListener(this);
      zeroButton.addActionListener(this);
      decimalButton.addActionListener(this);
      mulButton.addActionListener(this);
      divButton.addActionListener(this);
      minusButton.addActionListener(this);
      plusButton.addActionListener(this);
      equalButton.addActionListener(this);
      resetButton.addActionListener(this);
      convertSignButton.addActionListener(this);

      gui.add(panelButtons, BorderLayout.CENTER);

   

   }

   public void actionPerformed(ActionEvent e) {

      if (e.getSource().equals(oneButton)) {
         sb.append("1");
         display.append("1");
      }

      else if (e.getSource().equals(twoButton)) {
         sb.append("2");
         display.append("2");
      } else if (e.getSource().equals(threeButton)) {
         sb.append("3");
         display.append("3");
      } else if (e.getSource().equals(fourButton)) {
         sb.append("4");
         display.append("4");
      } else if (e.getSource().equals(fiveButton)) {
         sb.append("5");
         display.append("5");
      } else if (e.getSource().equals(sixButton)) {
         sb.append("6");
         display.append("6");
      } else if (e.getSource().equals(sevenButton)) {
         sb.append("7");
         display.append("7");
      } else if (e.getSource().equals(eightButton)) {
         sb.append("8");
         display.append("8");
      } else if (e.getSource().equals(nineButton)) {
         sb.append("9");
         display.append("9");
      } else if (e.getSource().equals(zeroButton)) {
         sb.append("0");
         display.append("0");
      }

      else if (e.getSource().equals(resetButton)) {
         sb.setLength(0);
         postfix.clear();
         opStack.removeAllElements();
         numStack.clear();
         display.setText("");
      }

      // +++++++++++++++++++++++++++++++++
      else if (e.getSource().equals(plusButton)) { // -<<<

         addNumToPostfix();
         handleOperator("+");
         display.append("+");

      } // plus

      else if (e.getSource().equals(minusButton)) {

         addNumToPostfix();
         handleOperator("-");
         display.append("-");

      } // minusMethod

      else if (e.getSource().equals(mulButton)) {

         addNumToPostfix();
         handleOperator("*");
         display.append("*");
      } // mulMeThod

      else if (e.getSource().equals(divButton)) {

         addNumToPostfix();
         handleOperator("/");
         display.append("/");
      } // divMeThod

      else if (e.getSource().equals(convertSignButton)) {
         sb.append("-");
         display.append("-");
      }

      else if (e.getSource().equals(equalButton)) {

         postfix.add(sb.toString());
         sb.setLength(0);

         while (!opStack.empty()) {
            postfix.add(opStack.pop());
         }

         display.setText(Float.toString(calculate()));

      }

      else if (e.getSource().equals(decimalButton)) {
         sb.append(".");
         display.append(".");

      }

   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Calculator ci = new Calculator();

   }

   public int priorityCheck(String op) {

      switch (op) {

      case ("+"):
         return 1;

      case ("-"):
         return 1;

      case ("*"):
         return 2;

      case ("/"):
         return 2;

      default:
         return -1;
      }
   }// priorityCheck

   public float calculate() {

      float num1, num2;

      for (int i = 0; i < postfix.size(); i++) {

         if (postfix.get(i) == "+") {

            System.out.println(numStack.size() + "      " + numStack.peek());
            num2 = numStack.pop();
            num1 = numStack.pop();

            result = num1 + num2;
            numStack.push(result);

         } else if (postfix.get(i) == "*") {
            num2 = numStack.pop();
            num1 = numStack.pop();

            result = num1 * num2;
            numStack.push(result);

         } else if (postfix.get(i) == "-") {
            num2 = numStack.pop();
            num1 = numStack.pop();

            result = num1 - num2;
            numStack.push(result);
         } else if (postfix.get(i) == "/") {
            num2 = numStack.pop();
            num1 = numStack.pop();

            result = num1 / num2;
            numStack.push(result);
         }

         else {
            numStack.push(Float.parseFloat(postfix.get(i)));
         }

      }

      postfix.clear();
      return numStack.peek();

   }// calculateMethod

   public void addNumToPostfix() {
      if (sb.length() != 0) {
         postfix.add(sb.toString());
         sb.setLength(0);
      }
   }// addNumtoPostFix Method

   public void handleOperator(String op) {
      if (opStack.empty()) {
         opStack.add(op);
      } else {
         if (priorityCheck(opStack.peek()) < priorityCheck(op)) {
            opStack.add(op);
         } else {
            postfix.add(opStack.pop());
            opStack.add(op);
         }
      }

   }

}