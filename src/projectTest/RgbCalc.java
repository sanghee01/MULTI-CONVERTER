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
       
        
        
        panel.setBounds(0, 0, 354, 371);
    
                panel.setLayout(null);
        
                JSlider Rslider = new JSlider();
                Rslider.setBounds(30, 193, 303, 31);
                panel.add(Rslider);
                Rslider.setPaintTicks(true);
                Rslider.setForeground(Color.RED);
                Rslider.setBackground(Color.RED);
                Rslider.setValue(0);
                Rslider.setMaximum(255);
                
                        JSlider Gslider = new JSlider();
                        Gslider.setBounds(30, 234, 303, 26);
                        panel.add(Gslider);
                        Gslider.setPaintTicks(true);
                        Gslider.setBackground(Color.GREEN);
                        Gslider.setMaximum(255);
                        Gslider.setValue(0);
                        
                                JSlider Bslider = new JSlider();
                                Bslider.setBounds(30, 270, 303, 23);
                                panel.add(Bslider);
                                Bslider.setPaintTicks(true);
                                
                                        Bslider.setBackground(Color.BLUE);
                                        Bslider.setForeground(Color.BLUE);
                                        Bslider.setMaximum(255);
                                        Bslider.setValue(0);
                                        
                                                JTextArea cta = new JTextArea();
                                                cta.setBounds(30, 33, 303, 117);
                                                panel.add(cta);
                                                
                                                        JTextArea textArea = new JTextArea();
                                                        textArea.setBounds(30, 160, 303, 23);
                                                        panel.add(textArea);
                                                        
                                                                JButton btnInit = new JButton("\uCD08\uAE30\uD654");
                                                                btnInit.setBounds(133, 313, 97, 23);
                                                                panel.add(btnInit);
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
                                                        textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
                                                    }
                                                });
                        
                                Gslider.addChangeListener(new ChangeListener() {
                                    public void stateChanged(ChangeEvent e) {
                                        cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                                        String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                                        textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);
                                    }
                                });

        Rslider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                cta.setBackground(new Color(Rslider.getValue(),Gslider.getValue(),Bslider.getValue()));
                String hex = String.format("#%02x%02x%02x", Rslider.getValue(), Gslider.getValue(), Bslider.getValue());
                textArea.setText("현재 색 : R - "+ Rslider.getValue()+" G - "+Gslider.getValue()+" B - "+Bslider.getValue() + " HexColor : "+hex);

            }
        });
    }
}
