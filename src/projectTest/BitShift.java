package projectTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
 
 
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
		frmShiftCalculator.setBounds(100, 100, 450, 345);
		frmShiftCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShiftCalculator.getContentPane().setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 436, 311);
		frmShiftCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		textField = new JTextField();
		textField.setBounds(25, 42, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		JLabel lblint = new JLabel("\uC2ED\uC9C4\uC218 \uC785\uB825(int)");
		lblint.setBounds(25, 20, 116, 15);
		panel.add(lblint);
		textField_1 = new JTextField();
		textField_1.setBounds(153, 42, 258, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		textField_3 = new JTextField();
		textField_3.setBounds(153, 96, 258, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		textField_5 = new JTextField();
		textField_5.setBounds(153, 152, 258, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);
		JLabel lblNewLabe2 = new JLabel("\uC624\uB978\uCABD \uC774\uB3D9(1-31)");
		lblNewLabe2.setBounds(25, 128, 116, 15);
		panel.add(lblNewLabe2);
		textField_4 = new JTextField();
		textField_4.setBounds(25, 152, 116, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		JLabel lblNewLabe3 = new JLabel("\uC67C\uCABD \uC774\uB3D9(1-31)");
		lblNewLabe3.setBounds(25, 183, 116, 15);
		panel.add(lblNewLabe3);
		textField_6 = new JTextField();
		textField_6.setBounds(25, 208, 116, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		textField_7 = new JTextField();
		textField_7.setBounds(153, 208, 258, 21);
		panel.add(textField_7);
		textField_7.setColumns(10);
		JButton button = new JButton("\uACC4\uC0B0");
		button.setBounds(88, 253, 97, 23);
		panel.add(button);
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(237, 253, 97, 23);
		panel.add(btnClear);
		JLabel lblNewLabel = new JLabel("\uBE44\uD2B8\uC704\uCE58 \uC785\uB825(1-32)");
		lblNewLabel.setBounds(25, 73, 116, 15);
		panel.add(lblNewLabel);
		textField_2 = new JTextField();
		textField_2.setBounds(25, 96, 116, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
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