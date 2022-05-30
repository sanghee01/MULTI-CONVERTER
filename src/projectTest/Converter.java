package projectTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import projectTest.LengthConverter;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class Converter{
   
      public JPanel panel;
      public JTextField toBitText;
      public JTextField fromBitText; 
      
   /**
    * Create the frame.
    */
   public Converter() {
      
      panel = new JPanel();
      panel.setBorder(new EmptyBorder(5, 5, 5, 5));
      
      String[] unitChoose = {"bit (비트)","byte (바이트)","kb (킬로바이트)","mb (메가바이트)","gb (기가바이트)","tb (테라바이트)","pb (페타바이트)","eb (엑사바이트)"};
      panel.setLayout(null);
      
      // 단위 선택        
      JComboBox dropdown1 = new JComboBox(unitChoose);
      dropdown1.setBounds(297, 58, 132, 30);
      dropdown1.setModel(new DefaultComboBoxModel(new String[] {"bit (비트)", "byte (바이트)", "kb (킬로바이트)", "mb (메가바이트)", "gb (기가바이트)", "tb (테라바이트)", "pb (페타바이트)", "eb (엑사바이트)"}));
      panel.add(dropdown1);
      
      JComboBox dropdown2 = new JComboBox(unitChoose);
      dropdown2.setBounds(297, 107, 132, 30);
      dropdown2.setModel(new DefaultComboBoxModel(new String[] {"bit (비트)", "byte (바이트)", "kb (킬로바이트)", "mb (메가바이트)", "gb (기가바이트)", "tb (테라바이트)", "pb (페타바이트)", "eb (엑사바이트)"}));
      panel.add(dropdown2);
      
      // 단위 변환하고 싶은 값 입력
      toBitText = new JTextField("0");
      toBitText.setBounds(101, 59, 184, 29);
      panel.add(toBitText);
      toBitText.setColumns(10);
      
      // 단위 변환 후 출력    
      fromBitText = new JTextField("0");
      fromBitText.setBounds(101, 109, 184, 28);
      fromBitText.setEditable(false);
      panel.add(fromBitText);
      
      
   
      // 변환 버튼
      JButton convertBtn = new JButton("\uBCC0\uD658");
      convertBtn.setBounds(101, 177, 328, 30);
      convertBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
        	// 현재 단위 가져옴               
            String fromUnit = (String) dropdown1.getItemAt(dropdown1.getSelectedIndex());
            // 변환 원하는 단위 가져옴           
            String toUnit = (String) dropdown2.getItemAt(dropdown2.getSelectedIndex());
            // factor 설정 
            LengthConverter from = new LengthConverter(fromUnit);
            LengthConverter to = new LengthConverter(toUnit);
            
            // 입력 값 double형으로 가져옴          
            double val = Double.parseDouble(toBitText.getText());
            // 입력 값을 bit단위로     
            double bit = from.toBit(val);
            // bit단위로 변환된 것을 원하는 단위로       
            String converted = Double.toString(to.fromBit(bit));
            fromBitText.setText(converted);
         }
      });
      panel.add(convertBtn);
      
      JLabel lblNewLabel = new JLabel("bit (비트) : 2진수에서 숫자 0, 1과 같이 신호를 나타내는 최소 단위");
      lblNewLabel.setBounds(37, 251, 392, 15);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_1 = new JLabel("byte (바이트) : 8비트(bit)로 구성되는 정보 단위로 8비트가 1바이트다.");
      lblNewLabel_1.setBounds(37, 276, 406, 15);
      panel.add(lblNewLabel_1);
      
      JLabel lblNewLabel_2 = new JLabel("KB (킬로바이트) : 1,000바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_2.setBounds(37, 301, 406, 15);
      panel.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("MB (메가바이트) : 1,000킬로바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_3.setBounds(37, 326, 346, 15);
      panel.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("GB (기가바이트) : 1,000메가바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_4.setBounds(37, 351, 406, 15);
      panel.add(lblNewLabel_4);
      
      JLabel lblNewLabel_5 = new JLabel("TB (테라바이트) : 1,000기가바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_5.setBounds(37, 376, 382, 15);
      panel.add(lblNewLabel_5);
      
      JLabel lblNewLabel_6 = new JLabel("PB (페타바이트) : 1,000테라바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_6.setBounds(37, 401, 346, 15);
      panel.add(lblNewLabel_6);
      
      JLabel lblNewLabel_7 = new JLabel("EB (엑사바이트) : 1,000페타바이트를 뜻하는 정보의 단위이다.");
      lblNewLabel_7.setBounds(37, 426, 346, 15);
      panel.add(lblNewLabel_7);

   }
}