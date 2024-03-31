import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton myButton = new JButton("New Window");
    

LaunchPage() {
myButton.setBounds(100, 160, 200, 40);
myButton.setFocusable(false);
myButton.addActionListener(this);

panel.setBounds(20, 20, 350, 350);
panel.setBackground(Color.BLUE);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420, 420);
frame.setLayout(null);
frame.setVisible(true);
frame.add(myButton);
frame.add(panel);
}

public void actionPerformed(ActionEvent e) {
if(e.getSource()== myButton){
    NewWindow myWindow = new NewWindow();
    frame.dispose();
}
}
}
