import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TaskForm
{
      JFrame frame;
      JLabel lbname;
      JLabel lbfname;
      JLabel lbgender;
      JLabel lbPassword;
      JLabel lbConfirmpas;
      JLabel lbcity;
      JLabel lbemail;
      JTextField jtname;
      JTextField jtfame;
      JComboBox jcom;
      JPasswordField jpassword;
      JPasswordField jpconpass;
      JTextField jtcity;
      JTextField jtemail;
      JButton btnregister;
      JButton btnreset;
      public TaskForm()
      {
          iniComponents();
      }

       public void iniComponents()
       {
       	   frame=new JFrame();
       	   frame.setVisible(true);
       	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	   frame.setBounds(200,100,650,550);

       	   Container c=frame.getContentPane();
       	   c.setLayout(null);
       	   c.setBackground(Color.PINK);
       	   
       	   lbname=new JLabel("Name");
       	   lbfname=new JLabel("Father Name");
       	   lbgender=new JLabel("Gender");
       	   lbPassword=new JLabel("Password");
       	   lbConfirmpas=new JLabel("Confirm Password");
       	   lbcity=new JLabel("City");
       	   lbemail=new JLabel("Email");
       	   jtname=new JTextField();
       	   jtfame=new JTextField();
       	   jtcity=new JTextField();
       	   jtemail=new JTextField();
       	   jpassword=new JPasswordField();
       	   jpconpass=new JPasswordField();
       	   String []s={"--select","Male","Female"};
       	   jcom=new JComboBox(s);
       	   btnregister=new JButton("Register");
       	   btnreset=new JButton("Reset");



        Font f1 = new Font("Arial",Font.PLAIN,20); 
        
        lbname.setBounds(70,50,150,30);
        lbname.setFont(f1);

        lbgender.setBounds(70,100,150,30);
        lbgender.setFont(f1);

        lbfname.setBounds(70,150,150,30);
        lbfname.setFont(f1);
        
        lbPassword.setBounds(70,200,150,30);
        lbPassword.setFont(f1);

        lbConfirmpas.setBounds(70,250,170,30);
        lbConfirmpas.setFont(f1);

        lbcity.setBounds(70,300,150,30);
        lbcity.setFont(f1);

        lbemail.setBounds(70,350,150,30);
        lbemail.setFont(f1);

        jtname.setBounds(280,50,300,30);
        jtname.setFont(f1);

        jcom.setBounds(280,100,300,30);
        jcom.setFont(f1);

        jtfame.setBounds(280,150,300,30);
        jtfame.setFont(f1);

        jpassword.setBounds(280,200,300,30);
        jpassword.setFont(f1);

        jpconpass.setBounds(280,250,300,30);
        jpconpass.setFont(f1);

        jtcity.setBounds(280,300,300,30);
        jtcity.setFont(f1);

        jtemail.setBounds(280,350,300,30);
        jtemail.setFont(f1);

        btnregister.setBounds(150,400,170,50);
        btnreset.setBounds(340,400,170,50);

         btnregister.setFont(new Font("Arial",Font.BOLD,26));
        btnreset.setFont(new Font("Arial",Font.BOLD,26));




        c.add(lbname);
        c.add(lbfname);
        c.add(lbgender);
        c.add(lbcity);
        c.add(lbemail);
        c.add(lbPassword);
        c.add(lbConfirmpas);
        c.add(jtname);
        c.add(jtfame);
        c.add(jtemail);
        c.add(jtcity);
        c.add(jpassword);
        c.add(jpconpass);
        c.add(jcom);
        c.add(btnregister);
        c.add(btnreset);


            btnregister.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
             {
                if( !(jtname.getText().isEmpty()) && !(jtfame.getText().isEmpty()) && 
                (jcom.getSelectedIndex()>0) && !(jpassword.getText().isEmpty()) && !(jpconpass.getText().isEmpty()) &&
                !(jtcity.getText().isEmpty()) && !(jtemail.getText().isEmpty()) ){
                    JOptionPane.showMessageDialog(null,"Information Entered");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please! fill all he fields.");
                }
            }
        });
       btnreset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                jtname.setText("");
                jcom.setSelectedIndex(0);
                jtfame.setText("");
                jpassword.setText("");
                jpconpass.setText("");
                jtcity.setText("");
                jtemail.setText("");
            }
        });



       }
       public static void main(String args[])
      {
       	    new TaskForm();
       }
}