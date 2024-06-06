import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;



public class StudyHub extends JFrame{
  
  private Container con;
  private Font textFont;
  private JLabel Img_label, Log_label;
  private ImageIcon img;
  private JTextField User_name;
  private JPasswordField Password;
  private JButton LogN_Button;
  String id="",pass="";
  char[] p = new char[33];
  

  StudyHub(){
    initComponents();
  }

  void initComponents(){
    con = this.getContentPane();
    con.setLayout(null);
    
    textFont = new Font("Times New Roman",Font.BOLD,20);

    img = new ImageIcon(getClass().getResource("Study.png"));
    Img_label = new JLabel(img);
    Img_label.setBounds(240,50,img.getIconWidth(),img.getIconHeight());
    con.add(Img_label);

    Log_label = new JLabel("Login");
    Log_label.setFont(textFont);
    Log_label.setBounds(320,270,80,80);
    con.add(Log_label);

    User_name = new JTextField(" Username");
    User_name.setBounds(230,350,250,30);
    con.add(User_name);
    
    Password = new JPasswordField();
    Password.setEchoChar('P');
    Password.setBounds(230,400,250,30);
    con.add(Password);

    p = Password.getPassword();
    System.out.println(p);

    String UserName = User_name.getText();
   // String PassWord = Password.getText();

    User_name.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
          String UN = User_name.getText();
          System.out.println("User Name: " + UN);
      }      
    });

   /* Password.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String PW = Password.getText();
        System.out.println("Password: " + PW);
      }
    });
*/
    LogN_Button = new JButton("Login");
    LogN_Button.setBounds(320,450,80,30);
    con.add(LogN_Button);

    LogN_Button.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        System.out.println("Login button cliked");
        id = User_name.getText();
//        pass = Password.getPassword();
      }
    });
    
    System.out.println(UserName);
   // System.out.println(PassWord);
  }
  
  void setMainWindow(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setResizable(true);
    this.setBounds(50,20,700,650);
    this.setTitle("Study Hub");

    Image HubIcon = new ImageIcon(this.getClass().getResource("Hub.jpg")).getImage();
    this.setIconImage(HubIcon);
  }   
  
  public static void main(String [] args){
    StudyHub MainWindow = new StudyHub();
    MainWindow.setMainWindow();
  }
}
