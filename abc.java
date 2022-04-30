import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class abc
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b =new JButton("A");
        JButton b1=new JButton("B");
        JButton b2=new JButton("C");
        JButton b3=new JButton("D");
        JLabel tf=new JLabel("Random");
        tf.setBounds(30,50,300,30);
        b.setBounds(50,100,200,30);
        b1.setBounds(50,130,200,30);
        b2.setBounds(50,160,200,30);
        b3.setBounds(50,190,200,30);
        f.add(b);f.add(b1);f.add(b2);f.add(b3);f.add(tf);
        b.addActionListener(new Action());    
        b1.addActionListener(new Action1()); 
        b2.addActionListener(new Action2());    
        b3.addActionListener(new Action3()); 
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    
    
    public static class Action1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f1= new JFrame("Output");
            JLabel l= new JLabel("For B");
            l.setBounds(50,100,200,30);f1.add(l);
            f1.setSize(600,600);
            f1.setVisible(true);
            f1.setLayout(null);
        }
    }
    
    public static class Action2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f1= new JFrame("Output");
            JLabel l= new JLabel("For C");
            JButton u=new JButton("sure");
            u.setBounds(50,100,200,30);
            f1.add(u);
            u.addActionListener(new Action7());
            f1.add(l);
            f1.setSize(700,400);
            f1.setVisible(true);
            f1.setLayout(null);
        }
    }
    
    public static class Action3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f1= new JFrame("Output");
            JLabel l= new JLabel("For D");
            f1.add(l);
            f1.setSize(700,400);
            f1.setVisible(true);
            f1.setLayout(null);
        }
    }
    
    public static class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f1= new JFrame("Output");
            JLabel l= new JLabel("For A?");
            l.setBounds(50,100,200,30);
            f1.add(l);
            f1.setSize(600,600);
            f1.setVisible(true);
            f1.setLayout(null);
        }
    }
    
    public static class Action7 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame f1= new JFrame("Output");
            
            JLabel l= new JLabel("inside c");
            l.setBounds(50,100,200,30);
            f1.add(l);
            f1.setSize(600,600);
            f1.setVisible(true);
            f1.setLayout(null);
        }
    }
}