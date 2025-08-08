
package listbox;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener{
    List l;
    Choice ch;
    TextArea ta;
    MyFrame(){
        super("ListBox Demo");
       l=new List(4,true);
       ch=new Choice();
       ta=new TextArea(20,30);
       
       l.add("Monday");
       l.add("Tuesday");
       l.add("wednesday");
       l.add("Thursday");
       l.add("Friday");
       l.add("Saturday");
       l.add("Sunday");
       
       ch.add("January");
       ch.add("Febuary");
       ch.add("March");
       ch.add("April");
       
       setLayout(new FlowLayout());
       add(l);
       add(ch);
       add(ta);
       
       l.addItemListener(this);
       ch.addItemListener(this);
       l.addActionListener(this);
     
    }
    public void  itemStateChanged(ItemEvent ie){
           if(ie.getSource()==l){
               ta.setText(l.getSelectedItem());
           }
           else{
               ta.setText(ch.getSelectedItem());
           }
       }
    public void actionPerformed(ActionEvent e){
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list){
            txt+=x+"\n";
            ta.setText(txt);
        }
    }
}
public class ListBox {

    public static void main(String[] args) {
            MyFrame f=new MyFrame();
            f.setSize(400,300);
            f.setVisible(true);
    }
    
}
