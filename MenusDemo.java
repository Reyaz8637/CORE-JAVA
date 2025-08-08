package menusdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Menu file,sub;
    
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    
    MyFrame(){
        super("Menu Demo");
        
        open=new MenuItem("open");
        save=new MenuItem("save");
        close=new MenuItem("close");
        closeall=new MenuItem("closeall");
        
        auto=new CheckboxMenuItem("Auto Save");
        
        
        file=new Menu("file");
        sub=new Menu("Close");
        
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(close);
        file.add(auto);
        
        sub.add(close);
        sub.add(closeall);
        
        MenuBar mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        
        tf=new TextField();
        setLayout(new FlowLayout());
        add(tf);
        
        open.addActionListener((ActionEvent ae)->tf.setText("open"));
        save.addActionListener((ActionEvent ae)->tf.setText("save"));
        close.addActionListener((ActionEvent ae)->tf.setText("close"));
        closeall.addActionListener((ActionEvent ae)->tf.setText("close all"));
        
        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState())
                tf.setText("Auto On");
            else
                tf.setText("Auto off");
        });
    }
}
public class MenusDemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
