package windoweventdemo;
import java.awt.*;
import java.awt.event.*;

    class MyFrame extends Frame implements WindowListener{
        Label l;
        MyFrame(){
            super("window Event demo");
            l=new Label("");
            setLayout(new FlowLayout());
            add(l);
            addWindowListener(this);
        }

        @Override
        public void windowOpened(WindowEvent e) {
            l.setText("window Opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
             l.setText("window closing");
                         System.exit(0);

        }

        @Override
        public void windowClosed(WindowEvent e) {
             l.setText("window closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
             l.setText("window Iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
             l.setText("window deiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
             l.setText("window Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
             l.setText("window deactivated");
        }
        
    }
public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
