 package swinginternalframe;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 class MyInternalFrame extends JInternalFrame{
     static int count=0;
     JTextArea ta;
     JScrollPane sp;
     MyInternalFrame(){
         super("Document"+(++count));
         ta=new JTextArea();
         sp=new JScrollPane(ta);
         add(sp);
         
         JMenuBar mb=new JMenuBar();
         JMenu file=new JMenu("file");
         JMenuItem m1=new JMenuItem("Save");
         
         file.add(m1);
         mb.add(file);
         setJMenuBar(mb);
         
         setSize(300,300);
         setLocation(50,50);
         setVisible(true);
         
     }
 }
 class MyFrame extends JFrame implements ActionListener{
     JDesktopPane dp;
     MyFrame(){
         super("Internal Frame Demo");
         
         dp=new JDesktopPane();
         setContentPane(dp);
         
         JMenuBar mb=new JMenuBar();
         JMenu d=new JMenu("Document");
         JMenuItem m1=new JMenuItem("New");
         
         d.add(m1);
         mb.add(d);
         setJMenuBar(mb);
         
         m1.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae){
         MyInternalFrame mi=new MyInternalFrame();
         dp.add(mi);
     }
 }
public class SwingInternalFrameDemo {
 
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    
}
