package swingtextfield;
import java.awt.*;
import javax.swing.*;
import java.text.*;
import java.util.Locale;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame{
    
    MyFrame(){
        JTextField tf1=new JTextField(15);
        
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
          JFormattedTextField tf2=new JFormattedTextField(df);
          
           NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);// for selecting currency
//           NumberFormat nf=NumberFormat.getInstance();
           NumberFormatter nft=new NumberFormatter(nf);
           JFormattedTextField tf3=new JFormattedTextField(nft);
           nft.setAllowsInvalid(false);//used for restriction to only numbers
           nft.setMaximum(1000);//to set max allowance of numbers
           

        
        tf3.setColumns(15);
        tf3.setValue(0);
        
        tf2.setColumns(15);
        tf2.setValue(0);
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);    
    }
}
public class SwingTextField {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
