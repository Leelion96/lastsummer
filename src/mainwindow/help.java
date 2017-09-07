package mainwindow;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class help extends JFrame implements ActionListener 
{
	public static void main(String[]args)
    {
    	help hp = new help();
    	hp.setVisible(true);
    }
	private static final long serialVersionUID = 1L;
	public static final int Width = 560;
    public static final int Height = 500;
    private ImageIcon background;
    private JPanel imagePanel;
    public help()
    {
    	setSize(Width,Height);
    	setTitle("配置图例");
    	setLocationRelativeTo(null);
    	setResizable(false); 
    	setBackground(Color.black);
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() 
        {
        	public void windowClosing(WindowEvent e) {
        	dispose();
        }
        });
    	background = new ImageIcon(getClass().getResource("/imagehelp.jpg"));        
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
        imagePanel = (JPanel) this.getContentPane();
 		imagePanel.setOpaque(false);
 		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
 		JButton getit = new JButton("Get it");
        setLayout(null);
        add(getit);
        getit.setBounds(415, 335, 120, 50);
        getit.setForeground(Color.white);
        getit.setContentAreaFilled(false);
        getit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        getit.setFont(new Font("getit", Font.PLAIN, 28)); 
        getit.addActionListener(this);
        JButton nope = new JButton("Nope");
        setLayout(null);
        add(nope);
        nope.setBounds(415, 395, 120, 50);
        nope.setForeground(Color.white);
        nope.setContentAreaFilled(false);
        nope.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //nope.setBorderPainted(false);
        nope.setFont(new Font("nope",Font.PLAIN, 28)); 
        nope.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getActionCommand().equals("Get it"))
		{			    		 
    		this.dispose();    	    
		} 
    	else if(e.getActionCommand().equals("Nope"))
		{
    		this.dispose();
    		JOptionPane.showMessageDialog(null, "<html><h2></font>有问题或者意见建议可以加我QQ：240238480，谢谢大家的支持", "you find me",JOptionPane.INFORMATION_MESSAGE);
		}
    }
}
