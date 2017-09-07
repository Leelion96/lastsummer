package mainwindow;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class batwrite4
{		 
	 public static void main(String[]args) throws IOException
     {
        batwrite4.creatTxtFile(); 
        batwrite4.writeTxtFile("%1 mshta vbscript:CreateObject(\"Shell.Application\").ShellExecute(\"cmd.exe\",\"/c %~s0 ::\",\"\",\"runas\",1)(window.close)&&exit"+"\r\nroute delete 0.0.0.0"); 
        File f = new File("D:/local.bat");
        if(f.exists())
           f.delete();
        File file=new File("D:/local.txt");
        String filename=file.getAbsolutePath();
        if(filename.indexOf(".")>=0)
        {
          filename = filename.substring(0, filename.lastIndexOf("."));
        }
        file.renameTo(new File(filename+".bat"));
     } 
	 private static String path = "D:/local.txt"; 
	 private static File filename = new File(path); 
	 private static String readStr =""; 
	 public static void creatTxtFile() throws IOException
	 { 	 		
        try 
	    {
		    filename.createNewFile(); 
	        System.err.println(filename + "已创建！ ");
	        JOptionPane.showMessageDialog(null, new JLabel("<html><h2></font>local.bat创建成功") ,"Create success",JOptionPane.INFORMATION_MESSAGE); 
	    }
        catch (IOException e1) 
	    { 
        	JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>local.bat创建失败", "Create failed",JOptionPane.ERROR_MESSAGE);
	    } 
	 }
	 public static void writeTxtFile(String newStr) throws IOException
	 { 
		 
		 //String wifiGateway = setup.text1.getText();
		 String localGateway = setup.text2.getText();
		 String str = newStr + readStr+"\r\nroute -p add 0.0.0.0 mask 0.0.0.0 "+localGateway+"\r\nroute -p add 172.16.0.0 mask 255.255.0.0 "+localGateway+"\r\npause";
		 RandomAccessFile mm = null; 
	     try 
	     { 
	    	 mm = new RandomAccessFile(filename, "rw"); 
	         mm.writeBytes(str); 
	     } 
	     catch (IOException e1) 
	     { 
	         // TODO 自动生成  catch  块 
	         e1.printStackTrace(); 
	     } 
	     finally 
	     { 
	         if (mm != null) 
	         { 
	        	 try 
	             { 
	                 mm.close(); 
	             } 
	             catch (IOException e2) 
	             { 
	                 // TODO 自动生成  catch  块 
	                 e2.printStackTrace(); 
	             } 
	         } 
	     } 
	 }  
}
