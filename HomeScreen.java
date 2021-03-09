import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class HomeScreen {

	JFrame f; 
	JButton button; 
	JLabel l;
	
	public HomeScreen() {
	
		f = new JFrame("StepAlgo");

		l = new JLabel("Welcome To StepAlgo", JLabel.CENTER);  
		l.setFont(new Font("Verdana", Font.PLAIN, 48));
    	l.setBounds(380, 225, 600, 80); 

		button = new JButton("Continue");
		button.setFont(new Font("Verdana", Font.PLAIN, 18));
		button.setBounds(535, 375, 300, 40);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new MainMenu();
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(button);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new HomeScreen();
	}
}

