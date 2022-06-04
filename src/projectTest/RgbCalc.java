package projectTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RgbCalc extends JFrame {

   public JPanel panel = new JPanel();
    private Color color;
   
    /**
     * Create the frame.
     */
    public RgbCalc() {
       setTitle("RGB CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 363, 403);
       
        
        
        panel.setBounds(0, 10, 542, 553);
    
                panel.setLayout(null);
        
                JSlider Rslider = new JSlider();
                Rslider.setBounds(177, 287, 303, 31);
                panel.add(Rslider);
                Rslider.setPaintTicks(true);
                Rslider.setForeground(Color.RED);
                Rslider.setBackground(new Color(255, 69, 0));
                Rslider.setValue(0);
                Rslider.setMaximum(255);
                
                        JSlider Gslider = new JSlider();
                        Gslider.setBounds(177, 337, 303, 31);
                        panel.add(Gslider);
                        Gslider.setPaintTicks(true);
                        Gslider.setBackground(new Color(50, 205, 50));
                        Gslider.setMaximum(255);
                        Gslider.setValue(0);
                        
                                JSlider Bslider = new JSlider();
                                Bslider.setBounds(177, 393, 303, 31);
                                panel.add(Bslider);
                                Bslider.setPaintTicks(true);
                                
                                        Bslider.setBackground(new Color(65, 105, 225));
                                        Bslider.setForeground(new Color(65, 105, 225));
                                        Bslider.setMaximum(255);
                                        Bslider.setValue(0);
                                        
                                                JTextArea cta = new JTextArea();
                                                cta.setBounds(71, 10, 400, 190);
                                                panel.add(cta);
                                                
                                                        JTextArea textArea = new JTextArea();
                                                        textArea.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
                                                        textArea.setBounds(71, 224, 400, 31);
                                                        panel.add(textArea);
                                                        
                                                                JButton btnInit = new JButton("RESET");
                                                                btnInit.addActionListener(new ActionListener() {
                                                                	public void actionPerformed(ActionEvent e) {
                                                                	}
                                                                });
                                                                btnInit.setForeground(Color.WHITE);
                                                                btnInit.setBackground(Color.BLACK);
                                                                btnInit.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
                                                                btnInit.setBounds(198, 454, 124, 41);
                                                                panel.add(btnInit);
                                                                
                                                                JLabel lblNewLabel = new JLabel("RED");
                                                                lblNewLabel.setForeground(new Color(255, 69, 0));
                                                                lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
                                                                lblNewLabel.setBounds(71, 276, 50, 41);
                                                                panel.add(lblNewLabel);
                                                                
                                                                JLabel lblNewLabel_1 = new JLabel("GREEN");
                                                                lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
                                                                lblNewLabel_1.setForeground(new Color(50, 205, 50));
                                                                lblNewLabel_1.setBounds(71, 327, 75, 41);
                                                                panel.add(lblNewLabel_1);
                                                                
                                                                JLabel lblNewLabel_2 = new JLabel("BLUE");
                                                                lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
                                                                lblNewLabel_2.setForeground(new Color(65, 105, 225));
                                                                lblNewLabel_2.setBounds(71, 378, 66, 41);
                                                                panel.add(lblNewLabel_2);
                                                                btnInit.addMouseListener(new MouseAdapter() {
                                                                    @Override
                                                                    public void mouseClicked(MouseEvent e) {
                                                                        Rslider.setValue(0);
                                                                        Gslider.setValue(0);
                                                                        Bslider.setValue(0);
                                                                    }
                                                                });
                                        
                                                Bslider.addChangeListener(new ChangeListener() {
                                                    public void stateChanged(ChangeEvent e) {
                                                        cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                                                        String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                                                        textArea.setText("R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
                                                    }
                                                });
                        
                                Gslider.addChangeListener(new ChangeListener() {
                                    public void stateChanged(ChangeEvent e) {
                                        cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                                        String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                                        textArea.setText("R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
                                    }
                                });

        Rslider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                textArea.setText("R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);

            }
        });
    }
}