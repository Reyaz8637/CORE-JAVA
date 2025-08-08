package mouseeventdemo;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener,MouseMotionListener{
    Label l;
    Label l2;
   public MyFrame(){
        super("MouseEvent Demo");
        
        l=new Label("");
        l2=new Label("");
        setLayout(null);
        l.setBounds(10,50,100,20);
        add(l);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moved");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }
}
public class MouseEventdemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
