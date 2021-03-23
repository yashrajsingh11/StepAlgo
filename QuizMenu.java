import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class QuizMenu {

	JFrame f;
	JLabel l;
	JButton b1, b2, b3, b4, b5, b6, b7, b8;

	public QuizMenu() {
		
		f = new JFrame("Quiz Menu");

		l = new JLabel("Quiz Menu", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

		b1 = new JButton("Bubble Sort");
		b1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	b1.setBounds(315, 200, 200, 40);

    	b2 = new JButton("Selection Sort");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(830, 200, 200, 40); 

    	b3 = new JButton("Insertion Sort");  
    	b3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b3.setBounds(315, 300, 200, 40);

    	b4 = new JButton("Quick Sort");  
    	b4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b4.setBounds(830, 300, 200, 40); 

    	b5 = new JButton("Merge Sort");  
    	b5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b5.setBounds(315, 400, 200, 40);

    	b6 = new JButton("Heap Sort");  
    	b6.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b6.setBounds(830, 400, 200, 40); 

    	b7 = new JButton("Exit");  
    	b7.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b7.setBounds(805, 620, 250, 40);

        b8 = new JButton("Return To Main Menu");  
        b8.setFont(new Font("Verdana", Font.PLAIN, 18));
        b8.setBounds(290, 620, 250, 40);

    	b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
				new BubbleSortQuiz();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new SelectionSortQuiz();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new InsertionSortQuiz();
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new QuickSortQuiz();
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MergeSortQuiz();
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new HeapSortQuiz();
            }
        });

    	b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MainMenu();
            }
        });

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
        f.add(b8);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);

	}
}