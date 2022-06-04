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
   String[] text= {"DEC","BIN","OCT","HEX"};
   JComboBox combo1=new JComboBox(text);
   JComboBox combo2=new JComboBox(text);
   int n, sign=1;
   public JPanel panel = new JPanel();
   
   NumChange(){
      panel.setBounds(0, 10, 561, 563);
      panel.setLayout(null);
      src.setForeground(Color.BLACK);
      src.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
      src.setBounds(12, 72, 518, 164);
      panel.add(src);
      combo1.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
      combo1.setModel(new DefaultComboBoxModel(new String[] {"DEC", "BIN", "OCT", "HEX"}));
      combo1.setBounds(49, 264, 99, 53);
      panel.add(combo1);
      col.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      col.setBounds(147, 260, 73, 60);
      panel.add(col);
      combo2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
      combo2.setModel(new DefaultComboBoxModel(new String[] {"DEC", "BIN", "OCT", "HEX"}));
      combo2.setBounds(232, 264, 99, 53);
      panel.add(combo2);
      
      JLabel lblNewLabel = new JLabel("\uB85C \uBCC0\uD658\uD558\uAE30");
      lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      lblNewLabel.setBounds(343, 269, 163, 42);
      panel.add(lblNewLabel);
      dest.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
      dest.setBounds(12, 351, 518, 164);
      panel.add(dest);
      
      dest.setEditable(false);
      
      JLabel lblNewLabel_1 = new JLabel("2진수, 8진수, 10진수, 16진수를 상호 변환합\r\n니다.");
      lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      lblNewLabel_1.setBounds(22, 10, 486, 77);
      panel.add(lblNewLabel_1);
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
               case "DEC":
                  n=Integer.parseInt(src.getText());
                  //입력받은 정수를 getText()로 받아서 String 형태로 바꾸어 (src 변수에 넣는다.)
                  break;
               case "BIN":
                  n=Integer.parseInt(src.getText(),2);
                  break;
               case "OCT":
                  n=Integer.parseInt(src.getText(),8);
                  break;
               case "HEX":
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
               case "DEC":
                  if(sign<0) dest.setText("-"+Integer.toString(n));
                  else dest.setText(Integer.toString(n));
                  break;
               case "BIN":
                  if(sign<0) dest.setText("-"+Integer.toBinaryString(n));
                  else dest.setText(Integer.toBinaryString(n));
                  break;
               case "OCT":
                  if(sign<0) dest.setText("-"+Integer.toOctalString(n));
                  else dest.setText(Integer.toOctalString(n));
                  break;
               case "HEX":
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