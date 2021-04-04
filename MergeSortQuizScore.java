import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MergeSortQuizScore {

	JFrame f;
	JLabel l1, l2;
	JButton b1, b2, b3, b4, b5;
	String data;

	public MergeSortQuizScore() {
		
		f = new JFrame("Score");

		try {
      		File myObj = new File("score.txt");
      		Scanner myReader = new Scanner(myObj);
      		while (myReader.hasNextLine()) {
       			data = myReader.nextLine();
      		}
      		myReader.close();
    	} catch (FileNotFoundException e1) {
      		System.out.println("An error occurred.");
      		e1.printStackTrace();
    	}

		l1 = new JLabel("Your Score Is", JLabel.CENTER);
		l1.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l1.setBounds(480, 50, 400, 60);

    	l2 = new JLabel(data, JLabel.CENTER);  
		l2.setFont(new Font("Verdana", Font.PLAIN, 48));
    	l2.setBounds(380, 225, 600, 80); 

    	b1 = new JButton("Try Again");  
    	b1.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b1.setBounds(620, 500, 150, 40);

    	b2 = new JButton("Return To Algorithm");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(315, 550, 250, 40);

    	b3 = new JButton("Return To Main Menu");  
    	b3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b3.setBounds(315, 620, 250, 40);

    	b4 = new JButton("Exit");  
        b4.setFont(new Font("Verdana", Font.PLAIN, 18));
        b4.setBounds(830, 620, 250, 40);

        b5 = new JButton("Return To Quiz Menu");  
        b5.setFont(new Font("Verdana", Font.PLAIN, 18));
        b5.setBounds(830, 550, 250, 40);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
        f.add(b5);

		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MergeSortQuiz();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MergeSort();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MainMenu();
            }
        });

		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new QuizMenu();
            }
        });

		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
	}
}