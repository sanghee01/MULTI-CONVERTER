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


class CharConverter implements ActionListener
{
     JFrame jf;
     JLabel L1, L2;
     JTextField tf1, tf2;
     JButton b1;
     private JLabel lblNewLabel;
     private JLabel lblNewLabel_1;
     public JPanel panel = new JPanel();
     
     CharConverter()
     {
          jf = new JFrame();
         
          jf.setSize(536,520);
          jf.setTitle("�ؽ�Ʈ ���� ��ȯ��");
         
          Dimension d1 = new Dimension(100,30);
          Dimension d2 = new Dimension(75,30);
          
          
          
          panel.setBounds(0, 0, 522, 483);
          
                    panel.setLayout(null);
          
                    L1 = new JLabel("�ؽ�Ʈ", SwingConstants.CENTER);
                    L1.setBounds(48, 22, 100, 30);
                    panel.add(L1);
                    L1.setPreferredSize(d1);
                    
                             
                     b1 = new JButton("\uBC88\uC5ED");
                     b1.setBounds(223, 22, 75, 30);
                     panel.add(b1);
                     b1.setPreferredSize(d2);
                     L2 = new JLabel("2����",SwingConstants.CENTER);
                     L2.setBounds(353, 22, 100, 30);
                     panel.add(L2);
                     L2.setPreferredSize(d1);
                     
                      tf1=new JTextField("���⿡ ��ȯ�� ������ �Է��ϼ���.",15);
                      tf1.setHorizontalAlignment(SwingConstants.LEFT);
                      tf1.setBounds(12, 62, 498, 141);
                      panel.add(tf1);
                      tf2=new JTextField("����� ��ȯ�� ������ ��Ƶ˴ϴ�.",15);
                      tf2.setBounds(12, 213, 498, 157);
                      panel.add(tf2);
                      
                      lblNewLabel = new JLabel("�� �����ڿ� ��ǻ�� �����ڵ��� �ؽ�Ʈ�� 10������ ��ȯ�Ͽ� �����͸� ������ �����մϴ�.");
                      lblNewLabel.setBounds(12, 400, 498, 15);
                      panel.add(lblNewLabel);
                      
                      lblNewLabel_1 = new JLabel("�� 2������ ���ΰ� ģ���� �����̿��� ���� ��ȣ�� �� �� �ֽ��ϴ�!");
                      lblNewLabel_1.setBounds(12, 425, 456, 15);
                      panel.add(lblNewLabel_1);
         
          b1.addActionListener(this);
         
     }
    
    
     public void actionPerformed(ActionEvent ae)
     {
          char word = tf1.getText().charAt(0);
          int dec = (int)word;
         
          tf2.setText(Integer.toBinaryString(dec));
     }
    

}