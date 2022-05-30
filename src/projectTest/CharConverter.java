package projectTest;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;


class CharConverter implements ActionListener
{
     JFrame jf;
     JLabel L1, L2;
     JTextField tf1, tf2;
     JButton b1;
     public JPanel panel = new JPanel();
     private JLabel lblNewLabel;
     private JLabel lblNewLabel_1;
     private JTextField tf3;
     private JTextField tf4;
     private JLabel lblNewLabel_2;
     
     CharConverter()
     {
          jf = new JFrame();
         
          jf.setSize(542,553);
          jf.setTitle("transfer");
         
          Dimension d1 = new Dimension(100,30);
          Dimension d2 = new Dimension(75,30);
          
          
          
          panel.setBounds(0, 0, 522, 483);
          
                    panel.setLayout(null);
          
                    L1 = new JLabel("8진수", SwingConstants.CENTER);
                    L1.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
                    L1.setBounds(12, 350, 64, 30);
                    panel.add(L1);
                    L1.setPreferredSize(d1);
                    
                             
                     b1 = new JButton("\uBC88\uC5ED");
                     b1.setBounds(223, 22, 75, 30);
                     panel.add(b1);
                     b1.setPreferredSize(d2);
                     L2 = new JLabel("2진수",SwingConstants.CENTER);
                     L2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
                     L2.setBounds(10, 289, 64, 30);
                     panel.add(L2);
                     L2.setPreferredSize(d1);
                     
                      tf1=new JTextField("",15);
                      tf1.setHorizontalAlignment(SwingConstants.LEFT);
                      tf1.setBounds(12, 89, 498, 141);
                      panel.add(tf1);
                      tf2=new JTextField("",15);
                      tf2.setBounds(86, 279, 424, 51);
                      panel.add(tf2);
                      
                      lblNewLabel = new JLabel("변환할 내용을 입력하세요.");
                      lblNewLabel.setBounds(12, 64, 164, 15);
                      panel.add(lblNewLabel);
                      
                      lblNewLabel_1 = new JLabel("변환할 내용이 출력됩니다.");
                      lblNewLabel_1.setBounds(12, 254, 250, 15);
                      panel.add(lblNewLabel_1);
                      
                      tf3 = new JTextField();
                      tf3.setBounds(86, 340, 424, 51);
                      panel.add(tf3);
                      tf3.setColumns(10);
                      
                      tf4 = new JTextField();
                      tf4.setBounds(86, 401, 424, 51);
                      panel.add(tf4);
                      tf4.setColumns(10);
                      
                      lblNewLabel_2 = new JLabel("16진수");
                      lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
                      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                      lblNewLabel_2.setBounds(12, 402, 75, 41);
                      panel.add(lblNewLabel_2);
         
          b1.addActionListener(this);
         
     }
    
    
     public void actionPerformed(ActionEvent ae)
     {           
         char word0 = tf1.getText().charAt(0);
         char word1 = tf1.getText().charAt(1);
         char word2 = tf1.getText().charAt(2);
         char word3 = tf1.getText().charAt(3);
         char word4 = tf1.getText().charAt(4);
         char word5 = tf1.getText().charAt(5);
         char word6 = tf1.getText().charAt(6);
         char word7 = tf1.getText().charAt(7);
         
         int dec0 = (int)word0;
         int dec1 = (int)word1;
         int dec2 = (int)word2;
         int dec3 = (int)word3;
         int dec4 = (int)word4;
         int dec5 = (int)word5;
         int dec6 = (int)word6;
         int dec7 = (int)word7;
        
         tf2.setText(Integer.toBinaryString(dec0)
               +'\n'+Integer.toBinaryString(dec1)
               +'\n'+Integer.toBinaryString(dec2)
               +'\n'+Integer.toBinaryString(dec3)
               +'\n'+Integer.toBinaryString(dec4)
               +'\n'+Integer.toBinaryString(dec5)
               +'\n'+Integer.toBinaryString(dec6)
               +'\n'+Integer.toBinaryString(dec7));

         tf3.setText(Integer.toOctalString(dec0)
               +'\n'+Integer.toOctalString(dec1)
               +'\n'+Integer.toOctalString(dec2)
               +'\n'+Integer.toOctalString(dec3)
               +'\n'+Integer.toOctalString(dec4)
               +'\n'+Integer.toOctalString(dec5)
               +'\n'+Integer.toOctalString(dec6)
               +'\n'+Integer.toOctalString(dec7));
         
         tf4.setText(Integer.toHexString(dec0)
               +'\n'+Integer.toHexString(dec1)
               +'\n'+Integer.toHexString(dec2)
               +'\n'+Integer.toHexString(dec3)
               +'\n'+Integer.toHexString(dec4)
               +'\n'+Integer.toHexString(dec5)
               +'\n'+Integer.toHexString(dec6)
               +'\n'+Integer.toHexString(dec7));
   }
}