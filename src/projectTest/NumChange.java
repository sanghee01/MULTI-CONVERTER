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
   String[] text= {"10����","2����","8����","16����"};
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
   public void actionPerformed(ActionEvent e) {//��ưŬ���� �ߵ��Ǵ� �޼ҵ�
      String s1=null, s2=null;
      if(e.getSource()==combo1) {
         s1=combo1.getSelectedItem().toString();
         //getSelectedItem() :���õ� ��ü�� ����
         //toString : ��ü�� �������ִ� ������ ������ ���ڿ��� ����
         try {
            switch(s1) {
               case "10����":
                  n=Integer.parseInt(src.getText());
                  //�Է¹��� ������ getText()�� �޾Ƽ� String ���·� �ٲپ� (src ������ �ִ´�.)
                  break;
               case "2����":
                  n=Integer.parseInt(src.getText(),2);
                  break;
               case "8����":
                  n=Integer.parseInt(src.getText(),8);
                  break;
               case "16����":
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
               case "10����":
                  if(sign<0) dest.setText("-"+Integer.toString(n));
                  else dest.setText(Integer.toString(n));
                  break;
               case "2����":
                  if(sign<0) dest.setText("-"+Integer.toBinaryString(n));
                  else dest.setText(Integer.toBinaryString(n));
                  break;
               case "8����":
                  if(sign<0) dest.setText("-"+Integer.toOctalString(n));
                  else dest.setText(Integer.toOctalString(n));
                  break;
               case "16����":
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