package swingdemo;
import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    int count=0;
    
    MyFrame(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        l=new JLabel("Clicked "+count+" times");
        b=new JButton("click");
        add(l);
        add(b);
//        add(new JButton("Cancel"));
        b.addActionListener(this);
        
        getRootPane().setDefaultButton(b);
        l.setToolTipText("counter");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        count++;
        l.setText("Clicked "+count+" Times");
    }
}
       
public class SwingDemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
