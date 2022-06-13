package projectTest;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;

public class Main extends JFrame {
   private JPanel backPanel;
  
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main frame = new Main();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   /**
    * Create the frame.
    */
   public Main() {
      setResizable(false);
      setTitle("MULTI CONVERTER");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 556, 600);
      backPanel = new JPanel();
      backPanel.setBackground(Color.WHITE);
      backPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(backPanel);
      backPanel.setLayout(null);
      
      JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
      tab.setForeground(Color.BLACK);
      tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
      tab.setFont(new Font("���� ���", Font.PLAIN, 12));
      tab.setBounds(0, 10, 542, 553);
      backPanel.add(tab);
      
      NumChange numchange = new NumChange();
      tab.addTab("������ȯ", null, numchange.panel, null);
      
      Calculator calculator = new Calculator();
      tab.addTab("���", null, calculator.gui, null);
      
      Frame myCalc = new Frame();
      tab.addTab("�������", null, myCalc.panel, null);
      
      BitShift bitshift = new BitShift();
      tab.addTab("��Ʈ����Ʈ", null, bitshift.panel, null);
   
      Converter converter = new Converter();
      tab.addTab("������ȯ", null, converter.panel, null);
      
      CharConverter charconverter = new CharConverter();
      tab.addTab("����", null, charconverter.panel, null);
      
      RgbCalc rgbcalc = new RgbCalc();
      tab.addTab("����", null, rgbcalc.panel, null);
   }
}
