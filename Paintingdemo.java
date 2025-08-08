package paintingdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    
    int x=0;int y=0;
    
    MyFrame(){
        super("Painting");
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    public void Paint(Graphics g){
        g.setColor(Color.RED);
        g.drawOval(x,y,50,50);
    }
}
public class Paintingdemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
