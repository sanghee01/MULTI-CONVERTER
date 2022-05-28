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
		panel.setLayout(null);
		
		String[] unitChoose = {"bit","byte","kb","mb","gb","tb","pb","eb"};
		
		// ���� ����
		JComboBox dropdown1 = new JComboBox(unitChoose);
		dropdown1.setBounds(58, 58, 100, 30);
		panel.add(dropdown1);
		
		JComboBox dropdown2 = new JComboBox(unitChoose);
		dropdown2.setBounds(58, 107, 100, 30);
		panel.add(dropdown2);
		
		// ���� ��ȯ�ϰ� ���� �� �Է�
		toBitText = new JTextField("0");
		toBitText.setBounds(170, 59, 216, 29);
		panel.add(toBitText);
		toBitText.setColumns(10);
		
		// ���� ��ȯ �� ���
		fromBitText = new JTextField("0");
		fromBitText.setEditable(false);
		fromBitText.setBounds(170, 109, 216, 28);
		panel.add(fromBitText);
		
		
	
		// ��ȯ ��ư
		JButton convertBtn = new JButton("\uBCC0\uD658");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ���� ���� ������
				String fromUnit = (String) dropdown1.getItemAt(dropdown1.getSelectedIndex());
				// ��ȯ ���ϴ� ���� ������
				String toUnit = (String) dropdown2.getItemAt(dropdown2.getSelectedIndex());
				// factor ����
				LengthConverter from = new LengthConverter(fromUnit);
				LengthConverter to = new LengthConverter(toUnit);
				
				// �Է� �� double������ ������
				double val = Double.parseDouble(toBitText.getText());
				// �Է� ���� bit������
				double bit = from.toBit(val);
				// bit������ ��ȯ�� ���� ���ϴ� ������
				String converted = Double.toString(to.fromBit(bit));
				fromBitText.setText(converted);
			}
		});

		convertBtn.setBounds(58, 179, 328, 30);
		panel.add(convertBtn);

	}
}
