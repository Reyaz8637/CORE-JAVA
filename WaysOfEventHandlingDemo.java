package waysofeventhandlingdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    TextField tf;
    Button b;
    int count=0;
    MyFrame(){
        super("Different ways of event handling");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
//        b.addActionListener(new MyListener());//Anonymous object
//          b.addActionListener(new ActionListener()//Anonymous Class
            b.addActionListener((ActionEvent ae)->{count++;tf.setText(String.valueOf(count));});
    }
                  }
public class WaysOfEventHandlingDemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
