package mainwindow;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class setup  extends JFrame implements ActionListener
{
	public static void main(String[]args)
    {
    	setup op = new setup();
    	op.setVisible(true);
    }
	private static final long serialVersionUID = 1L;
	public static final int Width=325;
    public static final int Height=209;
    JLabel label1 = new JLabel("请输入WIFI的网关:");
    JLabel label2 = new JLabel("请输入内网的网关:");
    static JTextField text1 = new JTextField(50);
    static JTextField text2 = new JTextField(50);
    JButton ok = new JButton("确认配置");
    JButton help = new JButton("查询网关");
    JCheckBox re = new JCheckBox("重启有效(禁用网络恢复默认)");  
    public setup()
    {
        setSize(Width,Height); 
        setLocationRelativeTo(null);
        setTitle("配置网络地址");
        setResizable(false);        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() 
        {
        	public void windowClosing(WindowEvent e) {
        	dispose();
        }
        });
        setLayout(null);
        add(label1);        
        add(label2);        
        add(re);
        label1.setFont(new   java.awt.Font("label1",   1,   18));
        label2.setFont(new   java.awt.Font("label2",   1,   18));
        label1.setBounds(30, 20, 180, 20);
        label2.setBounds(30, 50, 180, 20);
        add(text1);
        add(text2);
        text1.setBounds(200, 20, 90, 20);       
        text2.setBounds(200, 50, 90, 20);
        add(ok);
        add(help);
        ok.setContentAreaFilled(false);
        help.setContentAreaFilled(false);
        re.setBounds(30, 80, 300, 33);
        re.setFont(new Font("re",   1,   18));      
        ok.setBounds(170, 130, 120, 33);
        ok.setFont(new Font("ok", 1, 18)); 
        help.setBounds(30, 130, 120, 33);
        help.setFont(new Font("help", 1, 18)); 
        ok.addActionListener(this);
        re.addActionListener(this);
        help.addActionListener(this);
        help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    public void actionPerformed(ActionEvent e)
    {	   	
    	if(re.isSelected()&&e.getActionCommand().equals("确认配置"))
    	{			    		    		    		     
    		try 
    		{
   	    		batwrite3.main(null);
   	    		batwrite4.main(null);
   	    		JOptionPane.showMessageDialog(null, "<html><h2></font>已开启重启不失效，适配器设置中禁用再恢复WLAN和以太网即可还原默认配置", "bingo",JOptionPane.INFORMATION_MESSAGE);
   	    		this.dispose();
   		    } 
    		catch (IOException e1) 
    		{
    			// TODO 自动生成的 catch 块
   			 	e1.printStackTrace();
    		}
    	}	
   		else if(e.getActionCommand().equals("确认配置"))
   		{
   			try 
   			{
   	    		batwrite1.main(null);
   	    		batwrite2.main(null);
   	    		this.dispose();
   			} 
   			catch (IOException e1) 
   			{
   				// TODO 自动生成的 catch 块
   				e1.printStackTrace();
    		}
   		}   		
   		else if(e.getActionCommand().equals("查询网关"))
	    {
   			help hp = new help();
   			hp.setVisible(true);
	    }
    }    
}
