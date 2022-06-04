package projectTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
 
 
public class BitShift {
    
   private JFrame frmShiftCalculator;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JTextField textField_6;
   private JTextField textField_7;
   public JPanel panel;
   private JLabel lblNewLabel;
   private JLabel lblNewLabel_1;
   private JLabel lblNewLabel_2;
   private JLabel lblNewLabel_3;
   private JLabel lblNewLabel_4;
   private JLabel lblNewLabel_5;
   private JLabel lblNewLabel_6;
   private JLabel lblNewLabel_7;
    
   /**
   * Launch the application.
   */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
      public void run() {
      try {
            BitShift window = new BitShift();
            window.frmShiftCalculator.setVisible(true);
         } catch (Exception e) {
            e.printStackTrace();
            }
         }   
      });
   }
    
   /**
   * Create the application.
   */
   public BitShift() {
      initialize();
   }
    
   /**
   * Initialize the contents of the frame.
   */
   private void initialize() {
      frmShiftCalculator = new JFrame();
      frmShiftCalculator.setTitle("Shift Calculator");
      frmShiftCalculator.setBounds(100, 100, 543, 553);
      frmShiftCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frmShiftCalculator.getContentPane().setLayout(null);
      panel = new JPanel();
      panel.setBounds(0, 10, 542, 553);
      frmShiftCalculator.getContentPane().add(panel);
      panel.setLayout(null);
      textField = new JTextField();
      textField.setBounds(35, 35, 208, 33);
      textField.setForeground(Color.BLACK);
      textField.setHorizontalAlignment(SwingConstants.CENTER);
      textField.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      panel.add(textField);
      textField.setColumns(10);
      textField_1 = new JTextField();
      textField_1.setBounds(42, 230, 450, 40);
      textField_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
      panel.add(textField_1);
      textField_1.setColumns(10);
      textField_3 = new JTextField();
      textField_3.setBounds(42, 305, 450, 40);
      textField_3.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
      panel.add(textField_3);
      textField_3.setColumns(10);
      textField_5 = new JTextField();
      textField_5.setBounds(42, 380, 450, 40);
      textField_5.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
      panel.add(textField_5);
      textField_5.setColumns(10);
      textField_4 = new JTextField();
      textField_4.setBounds(290, 35, 208, 33);
      textField_4.setForeground(Color.BLACK);
      textField_4.setHorizontalAlignment(SwingConstants.CENTER);
      textField_4.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      panel.add(textField_4);
      textField_4.setColumns(10);
      textField_6 = new JTextField();
      textField_6.setBounds(290, 95, 208, 33);
      textField_6.setForeground(Color.BLACK);
      textField_6.setHorizontalAlignment(SwingConstants.CENTER);
      textField_6.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      panel.add(textField_6);
      textField_6.setColumns(10);
      textField_7 = new JTextField();
      textField_7.setBounds(42, 455, 450, 40);
      textField_7.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
      panel.add(textField_7);
      textField_7.setColumns(10);
      JButton button = new JButton("\uACC4\uC0B0");
      button.setForeground(Color.WHITE);
      button.setBackground(Color.BLACK);
      button.setBounds(120, 150, 120, 40);
      button.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
      panel.add(button);
      JButton btnClear = new JButton("RESET");
      btnClear.setForeground(Color.WHITE);
      btnClear.setBackground(Color.BLACK);
      btnClear.setBounds(290, 150, 120, 40);
      btnClear.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
      panel.add(btnClear);
      textField_2 = new JTextField();
      textField_2.setBounds(35, 96, 208, 33);
      textField_2.setHorizontalAlignment(SwingConstants.CENTER);
      textField_2.setForeground(Color.BLACK);
      textField_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      panel.add(textField_2);
      textField_2.setColumns(10);
      
      lblNewLabel = new JLabel("변환하려는 수의 10진수 값");
      lblNewLabel.setBounds(35, 10, 225, 15);
      panel.add(lblNewLabel);
      
      lblNewLabel_1 = new JLabel("찾고 싶은 비트의 위치 (1~32)");
      lblNewLabel_1.setBounds(35, 72, 188, 15);
      panel.add(lblNewLabel_1);
      
      lblNewLabel_2 = new JLabel(">> 이동할 비트 수 (1~31)");
      lblNewLabel_2.setBounds(290, 10, 146, 15);
      panel.add(lblNewLabel_2);
      
      lblNewLabel_3 = new JLabel("<< 이동할 비트 수 (1~31)");
      lblNewLabel_3.setBounds(290, 73, 150, 15);
      panel.add(lblNewLabel_3);
      
      lblNewLabel_4 = new JLabel("변환하려는 수의 2진수 값");
      lblNewLabel_4.setBounds(42, 205, 154, 15);
      panel.add(lblNewLabel_4);
      
      lblNewLabel_5 = new JLabel("찾고 싶은 위치의 비트 값");
      lblNewLabel_5.setBounds(42, 280, 170, 15);
      panel.add(lblNewLabel_5);
      
      lblNewLabel_6 = new JLabel(">> : 오른쪽 시프트 연산 값");
      lblNewLabel_6.setBounds(42, 355, 188, 15);
      panel.add(lblNewLabel_6);
      
      lblNewLabel_7 = new JLabel("<< : 왼쪽 시프트 연산 값");
      lblNewLabel_7.setBounds(42, 430, 227, 15);
      panel.add(lblNewLabel_7);
      btnClear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            textField.setText("");
            textField_1.setText("");
            textField_2.setText("");
            textField_3.setText("");
            textField_4.setText("");
            textField_5.setText("");
            textField_6.setText("");
            textField_7.setText("");
            }
      });
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         int get_num = Integer.parseInt(textField.getText());
         int get_place = Integer.parseInt(textField_2.getText());
         int get_right = Integer.parseInt(textField_4.getText());
         int get_left = Integer.parseInt(textField_6.getText());
         int buf, place, buf_right, buf_left;
         String result = "", result_right = "", result_left = "";
         buf_right = get_num >> get_right;
         buf_left = get_num << get_left;
         for(int i = 0; i < 32; i++) {
         buf = 1 & (get_num >>> i);
         if((i+1) == get_place) {
         place = buf;
         textField_3.setText(String.valueOf(place));
         }
         result = String.valueOf(buf) + result;
         buf = 1 & (buf_right >>> i);
         result_right = String.valueOf(buf) + result_right;
         buf = 1 & (buf_left >>> i);
         result_left = String.valueOf(buf) + result_left;
         }
         textField_1.setText(result);
         textField_5.setText(result_right);
         textField_7.setText(result_left);
         }
      });
   }
}