package projectTest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class NumChange extends JFrame implements ActionListener{
   private static final int Center = 0;
   JTextField src=new JTextField(8);
   JTextField dest=new JTextField(8);
   JLabel col = new JLabel("\uC5D0\uC11C", Center);
   String[] text= {"10진수","2진수","8진수","16진수"};
   JComboBox combo1=new JComboBox(text);
   JComboBox combo2=new JComboBox(text);
   int n, sign=1;
   public JPanel panel = new JPanel();
   
   NumChange(){
      panel.setBounds(0, 0, 483, 413);
      panel.setLayout(null);
      src.setBounds(12, 10, 431, 106);
      panel.add(src);
      combo1.setBounds(30, 164, 93, 57);
      panel.add(combo1);
      col.setBounds(147, 171, 70, 43);
      panel.add(col);
      combo2.setBounds(229, 164, 93, 57);
      panel.add(combo2);
      
      JLabel lblNewLabel = new JLabel("\uB85C \uBCC0\uD658\uD558\uAE30");
      lblNewLabel.setBounds(358, 181, 93, 23);
      panel.add(lblNewLabel);
      dest.setBounds(12, 274, 431, 129);
      panel.add(dest);
      
      dest.setEditable(false);
      combo2.addActionListener(this);
      combo1.addActionListener(this);
      
 
      
   }
   public void actionPerformed(ActionEvent e) {//버튼클릭시 발동되는 메소드
      String s1=null, s2=null;
      if(e.getSource()==combo1) {
         s1=combo1.getSelectedItem().toString();
         //getSelectedItem() :선택된 객체의 내용
         //toString : 객체가 가지고있는 정보나 값들을 문자열로 리턴
         try {
            switch(s1) {
               case "10진수":
                  n=Integer.parseInt(src.getText());
                  //입력받은 정수를 getText()로 받아서 String 형태로 바꾸어 (src 변수에 넣는다.)
                  break;
               case "2진수":
                  n=Integer.parseInt(src.getText(),2);
                  break;
               case "8진수":
                  n=Integer.parseInt(src.getText(),8);
                  break;
               case "16진수":
                  n=Integer.parseInt(src.getText(),16);
                  break;
            }
         }catch(NumberFormatException exp) {
            src.setText("error");   
         }
         System.out.println(n);
         if(n<0) {
            sign=-1;
            n*=sign;
         }
      }
      if(e.getSource()==combo2) {
         s2=combo2.getSelectedItem().toString();
         try {
            switch(s2) {
               case "10진수":
                  if(sign<0) dest.setText("-"+Integer.toString(n));
                  else dest.setText(Integer.toString(n));
                  break;
               case "2진수":
                  if(sign<0) dest.setText("-"+Integer.toBinaryString(n));
                  else dest.setText(Integer.toBinaryString(n));
                  break;
               case "8진수":
                  if(sign<0) dest.setText("-"+Integer.toOctalString(n));
                  else dest.setText(Integer.toOctalString(n));
                  break;
               case "16진수":
                  if(sign<0) dest.setText("-"+Integer.toHexString(n));
                  else dest.setText(Integer.toHexString(n));
                  break;
            }
         }catch(NumberFormatException exp) {
            src.setText("error");   
         }
      }
   }

}