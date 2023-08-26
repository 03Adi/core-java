import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
  {
  public static void main(String arg[])
    {
     myframe f=new myframe(); 
    f.setSize(400,400);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter()
                       {
                         public void windowClosing(WindowEvent e)
                         {
                           System.exit(0);
                         }
                       });
    }
  }
