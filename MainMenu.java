import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class MainMenu {
	
	JFrame f;
	JLabel l, l1, l2, l3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
	
	public MainMenu() {
	
		f = new JFrame("Main Menu");

		l = new JLabel("Algorithms", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

    	l1 = new JLabel("Sorting", JLabel.CENTER);
		l1.setFont(new Font("Verdana", Font.PLAIN, 24));
    	l1.setBounds(100, 100, 300, 50);

    	l2 = new JLabel("Searching", JLabel.CENTER);
		l2.setFont(new Font("Verdana", Font.PLAIN, 24));
    	l2.setBounds(475, 100, 400, 50);

    	l3 = new JLabel("Graph-Based", JLabel.CENTER);
		l3.setFont(new Font("Verdana", Font.PLAIN, 24));
    	l3.setBounds(950, 100, 300, 50);

		b1 = new JButton("Bubble Sort");
		b1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	b1.setBounds(150, 200, 200, 40);

    	b2 = new JButton("Selection Sort");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(150, 250, 200, 40); 

    	b3 = new JButton("Insertion Sort");  
    	b3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b3.setBounds(150, 300, 200, 40);

    	b4 = new JButton("Quick Sort");  
    	b4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b4.setBounds(150, 350, 200, 40); 

    	b5 = new JButton("Merge Sort");  
    	b5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b5.setBounds(150, 400, 200, 40);

    	b6 = new JButton("Heap Sort");  
    	b6.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b6.setBounds(150, 450, 200, 40); 

    	b7 = new JButton("Exit");  
    	b7.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b7.setBounds(805, 620, 250, 40); 

        b8 = new JButton("Go To Quiz Menu");  
        b8.setFont(new Font("Verdana", Font.PLAIN, 18));
        b8.setBounds(290, 620, 250, 40);

        b9 = new JButton("Linear Search");  
        b9.setFont(new Font("Verdana", Font.PLAIN, 18));
        b9.setBounds(575, 200, 200, 40);

        b10 = new JButton("Binary Search");  
        b10.setFont(new Font("Verdana", Font.PLAIN, 18));
        b10.setBounds(575, 250, 200, 40);

        b17 = new JButton("Jump Search");  
        b17.setFont(new Font("Verdana", Font.PLAIN, 18));
        b17.setBounds(575, 300, 200, 40);

        b11 = new JButton("BFS");  
        b11.setFont(new Font("Verdana", Font.PLAIN, 18));
        b11.setBounds(1000, 200, 200, 40);

        b12 = new JButton("DFS");  
        b12.setFont(new Font("Verdana", Font.PLAIN, 18));
        b12.setBounds(1000, 250, 200, 40);

        b13 = new JButton("Prim");  
        b13.setFont(new Font("Verdana", Font.PLAIN, 18));
        b13.setBounds(1000, 300, 200, 40);

        b14 = new JButton("Kruskal");  
        b14.setFont(new Font("Verdana", Font.PLAIN, 18));
        b14.setBounds(1000, 350, 200, 40);

        b15 = new JButton("Dijkstra");  
        b15.setFont(new Font("Verdana", Font.PLAIN, 18));
        b15.setBounds(1000, 400, 200, 40);

        b16 = new JButton("Bellman-Ford");  
        b16.setFont(new Font("Verdana", Font.PLAIN, 18));
        b16.setBounds(1000, 450, 200, 40);

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

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new QuizMenu();
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new LinearSearch();
            }
        });

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new BinarySearch();
            }
        });

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new BFS();
            }
        });

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new DFS();
            }
        });

        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Prim();
            }
        });

        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Kruskal();
            }
        });

        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Dijkstra();
            }
        });

        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new BellmanFord();
            }
        });

        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new JumpSearch();
            }
        });

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
	}
}