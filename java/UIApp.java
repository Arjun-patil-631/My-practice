
import java.awt.*;
import java.awt.event.*;

public class UIApp {

    public static void main(String[] args) {
        Frame myFrame = new Frame();
        myFrame.setLayout(new FlowLayout());
        Label input = new Label("input");
        TextField textInput = new TextField("<Give input here..");
        Button login = new Button("Login");
        login.addMouseListener(new MyMouseListener());
        myFrame.add(input);
        myFrame.add(textInput);
        myFrame.add(login);
        myFrame.setTitle("My first UI app");
        myFrame.setSize(900, 300);
        myFrame.setVisible(true);
        System.out.println(myFrame);
    }
}

class MyActionListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        System.out.println("From inside of the listener attached to the login button");
    }
}

class MyMouseListener extends MouseAdapter{
    public void mouseClicked(MouseEvent me){
        System.out.println("The mouse is clicked...");
    }
}
//class MyMouseListener implements MouseListener
//All the 5 methods must be implented.. And im not interested to that much stuff