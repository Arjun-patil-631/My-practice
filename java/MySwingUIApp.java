import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MySwingUIApp extends JFrame implements ActionListener{
    //All required UI componets are declared here
    private JLabel nameLabel;
    private JLabel statusLabel;
    private JTextField nameField;
    private JButton loginBtn;
    private JButton resetBtn;
    private JButton openBtn;
    private JTextArea textArea;

    //Constructing the UI applicasion
    public MySwingUIApp(){
        setTitle("My Swing UI Application ");
        setSize(450,450);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel =new JLabel("name :");
        statusLabel=new JLabel("status :");
        nameField=new JTextField(30);
        loginBtn=new JButton("login");
        resetBtn=new JButton("reset");
        openBtn=new JButton("open file");
        textArea=new JTextArea();
        textArea.setSize(20,20);

        add(nameLabel);
        add(nameField);
        add(statusLabel);
        add(loginBtn);
        add(resetBtn);
        add(openBtn);
        add(textArea);
        loginBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        openBtn.addActionListener(this);
        this.setVisible(true);

    }

    //Handler to handle the action events
    public void actionPerformed(ActionEvent e){
        Object obj =e.getSource();
        if(obj==loginBtn){
            loginCheck();
        }else if(obj==resetBtn){
            nameField.setText("");
            statusLabel.setText("");
        }else if(obj==openBtn){
            openFile();
        }
    }

    private void loginCheck() {
        String name=nameField.getText();
        if(name.equals("admin")){
            statusLabel.setText("valid user");
        }else{
            statusLabel.setText("Invalid user");
        }
    }

    public void openFile(){
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setCurrentDirectory(new java.io.File("D://work"));
        fileChooser.showOpenDialog(this);
        java.io.File file=fileChooser.getSelectedFile();
        System.out.println(file.getAbsolutePath());
        try{
            FileReader fr=new FileReader(file.getAbsoluteFile());
            char buf[]= new char(1024);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        MySwingUIApp myapp = new MySwingUIApp();
        myapp.setVisible(true);
    }
}