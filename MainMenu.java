import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class MainMenu {
	
	JFrame f;
	JLabel l;
	JButton b1, b2, b3, b4, b5, b6, b7;
	
	public MainMenu() {
	
		f = new JFrame("Main Menu");

		l = new JLabel("Algorithms", JLabel.CENTER);
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
    	b7.setBounds(575, 500, 200, 40); 

    	b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
				new BubbleSort();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new SelectionSort();
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new InsertionSort();
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new QuickSort();
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MergeSort();
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new HeapSort();
            }
        });

    	b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
	}
}