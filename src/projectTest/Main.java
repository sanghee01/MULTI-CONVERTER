package projectTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Main extends JFrame {

	private JPanel backPanel;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=568,-16
	 */

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
		tab.setBounds(0, 10, 542, 553);
		backPanel.add(tab);
		
		Calculator calculator = new Calculator();
		tab.addTab("계산기", null, calculator.gui, null);
		
		NumChange numchange = new NumChange();
		tab.addTab("진법 변환", null, numchange.panel, null);
		
		JPanel tab3 = new JPanel();
		tab.addTab("진법 계산", null, tab3, null);
		
		BitShift bitshift = new BitShift();
		tab.addTab("비트 연산", null, bitshift.panel, null);
	
		Converter converter = new Converter();
		tab.addTab("데이터량 변환", null, converter.panel, null);
		
		CharConverter charconverter = new CharConverter();
		tab.addTab("번역기", null, charconverter.panel, null);
		
		RgbCalc rgbcalc = new RgbCalc();
		tab.addTab("rgb", null, rgbcalc.panel, null);

		JPanel tab6 = new JPanel();
		tab6.setBackground(Color.WHITE);
		tab.addTab("info", null, tab6, null);
	

		
	
	
		
//		textField = new JTextField();
//		textField.setBounds(61, 194, 96, 82);
//		tab5.add(textField);
//		textField.setColumns(10);
//		
//		JList list = new JList();
//		list.setBounds(61, 51, 96, 29);
//		tab5.add(list);
	}
}
