package mainwindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
public class mainwindow
{
    public static void main(String[]args)
    {
    	Buttons myButtonGUI=new Buttons();
        myButtonGUI.setVisible(true);
    }
}
class Buttons extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	public static final int Width=675;
    public static final int Height=435;
    private ImageIcon background;
    private JPanel imagePanel;
    public Buttons()
    {
        setSize(Width,Height); 
        setTitle("内外网在线工具");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        background = new ImageIcon(getClass().getResource("/image.jpg"));
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
        imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        JButton But1=new JButton("WIFI");
        But1.addActionListener(this);
        setLayout(null);
        add(But1);
        But1.setBounds(560,170,100,60);
        But1.setContentAreaFilled(false);
        But1.setBorderPainted(false);
        But1.setFont(new Font("wifi", Font.PLAIN, 28)); 
        But1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton But2=new JButton("Local");
        But2.addActionListener(this);        
        add(But2);
        But2.setBounds(560,240,100,60);
        But2.setContentAreaFilled(false);
        But2.setBorderPainted(false);
        But2.setFont(new Font("local", Font.PLAIN, 28));
        But2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton But3=new JButton("By.Lc");
        But3.addActionListener(this); 
        add(But3);
        But3.setBounds(610,360,70,20);
        But3.setContentAreaFilled(false);
        But3.setBorderPainted(false);
        But3.setFont(new Font("option", Font.PLAIN, 12));
        But3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
        JButton But4=new JButton("Option");
        But4.addActionListener(this);        
        add(But4);
        But4.setBounds(550,300,120,60);
        But4.setContentAreaFilled(false);
        But4.setBorderPainted(false);
        But4.setFont(new Font("lc", Font.PLAIN, 28));
        But4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("WIFI"))
        	{
        		try 
        		{
        			Desktop.getDesktop().open(new File("D:/wifi.bat"));
        		} 
        		catch (Exception e1)
        		{				       			
        			e1.printStackTrace();
        			JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>打开失败  请确保Option已配置", "Error",JOptionPane.ERROR_MESSAGE);       			
        		}	
        	}
        else if(e.getActionCommand().equals("Local"))
			{
        		try 
        		{
        			Desktop.getDesktop().open(new File("D:/local.bat"));
        		} 
        		catch (Exception e1)
        		{				       			
        			e1.printStackTrace();
        			JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>打开失败  请确保Option已配置", "Error",JOptionPane.ERROR_MESSAGE);       			
        		}
			} 
        else if(e.getActionCommand().equals("Option"))
    		{			
        		setup op=new setup();
        		op.setVisible(true);
    		} 
        else if(e.getActionCommand().equals("By.Lc"))
        	{
    			JOptionPane.showMessageDialog(null, "<html><h2></font>Version:1.0  Made by Lc", "关于此程序",JOptionPane.INFORMATION_MESSAGE);       	
    			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	        addWindowListener(new WindowAdapter() 
    	        {
    	        	public void windowClosing(WindowEvent e) {
    	        	dispose();
    	        }
    	        });
        	} 
     }     
}		       
    

    
    

