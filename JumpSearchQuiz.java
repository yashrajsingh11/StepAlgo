import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JumpSearchQuiz {

	JFrame f;
	JLabel l, q1, q2, q3, q4, q5;	
	JButton b1, b2;
	JRadioButton rb11, rb12, rb13, rb14, rb21, rb22, rb23, rb24, rb31, rb32, rb33, rb34, rb41, rb42, rb43, rb44, rb51, rb52, rb53, rb54;
	ButtonGroup bg1, bg2, bg3, bg4, bg5;

	int score = 0;

	public JumpSearchQuiz() {
		
		f = new JFrame("Jump Search Quiz");

		l = new JLabel("QUIZ", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 20, 400, 60);

    	b1 = new JButton("Submit");  
    	b1.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b1.setBounds(830, 620, 250, 40);

    	b2 = new JButton("Clear All");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(315, 620, 250, 40);

    	q1 = new JLabel("1. In Jump search algorithm the array should _______.");
    	q1.setFont(new Font("Verdana", Font.PLAIN, 18));
        q1.setBounds(100, 100, 900, 40);

        rb11 = new JRadioButton("a) be sorted");
		rb11.setBounds(100, 150, 300, 50);
		rb11.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb12 = new JRadioButton("b) not be sorted");
		rb12.setBounds(400, 150, 300, 40);
		rb12.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb13 = new JRadioButton("c) have less than 64 elements");
		rb13.setBounds(700, 150, 300, 40);
		rb13.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb14 = new JRadioButton("d) be partially sorted");
		rb14.setBounds(1000, 150, 300, 40);
		rb14.setFont(new Font("Verdana", Font.PLAIN, 18));

		bg1 = new ButtonGroup();
		bg1.add(rb11);
		bg1.add(rb12);
		bg1.add(rb13);
		bg1.add(rb14);

    	q2 = new JLabel("2. How many jumps will be made in the worst case of jump search(block jumped = k)?");
    	q2.setFont(new Font("Verdana", Font.PLAIN, 18));
        q2.setBounds(100, 200, 1000, 40);

        rb21 = new JRadioButton("a) n*k");
		rb21.setBounds(100, 250, 300, 40);
		rb21.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb22 = new JRadioButton("b) n/k");
		rb22.setBounds(400, 250, 300, 40);
		rb22.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb23 = new JRadioButton("c) k/n");
		rb23.setBounds(700, 250, 300, 40);
		rb23.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb24 = new JRadioButton("d) n+k");
		rb24.setBounds(1000, 250, 300, 40);
		rb24.setFont(new Font("Verdana", Font.PLAIN, 18));

		bg2 = new ButtonGroup();
		bg2.add(rb21);
		bg2.add(rb22);
		bg2.add(rb23);
		bg2.add(rb24);

		q3 = new JLabel("3. What will be the maximum number of comparisons that can be made in jump search algorithm(block jumped = k)?");
    	q3.setFont(new Font("Verdana", Font.PLAIN, 18));
        q3.setBounds(100, 300, 1200, 40);

        rb31 = new JRadioButton("a) k");
		rb31.setBounds(100, 350, 300, 40);
		rb31.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb32 = new JRadioButton("b) n/k");
		rb32.setBounds(400, 350, 300, 40);
		rb32.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb33 = new JRadioButton("c) k-1");
		rb33.setBounds(700, 350, 300, 50);
		rb33.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb34 = new JRadioButton("d) k-1");
		rb34.setBounds(1000, 350, 300, 40);
		rb34.setFont(new Font("Verdana", Font.PLAIN, 18));

		bg3 = new ButtonGroup();
		bg3.add(rb31);
		bg3.add(rb32);
		bg3.add(rb33);
		bg3.add(rb34);

		q4 = new JLabel("4. What is the value of jump taken for maximum efficiency while implementing jump search?");
    	q4.setFont(new Font("Verdana", Font.PLAIN, 18));
        q4.setBounds(100, 400, 900, 40);

        rb41 = new JRadioButton("a) n/2");
		rb41.setBounds(100, 450, 300, 40);
		rb41.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb42 = new JRadioButton("b) n^2");
		rb42.setBounds(400, 450, 300, 40);
		rb42.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb43 = new JRadioButton("c) n^(1/2)");
		rb43.setBounds(700, 450, 300, 50);
		rb43.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb44 = new JRadioButton("d) log n");
		rb44.setBounds(1000, 450, 300, 40);
		rb44.setFont(new Font("Verdana", Font.PLAIN, 18));

		bg4 =new ButtonGroup();
		bg4.add(rb41);
		bg4.add(rb42);
		bg4.add(rb43);
		bg4.add(rb44);

		q5 = new JLabel("5. What is the auxiliary space requirement of the jump search?");
    	q5.setFont(new Font("Verdana", Font.PLAIN, 18));
        q5.setBounds(100, 500, 900, 40);

        rb51 = new JRadioButton("a) O(n)");
		rb51.setBounds(100, 550, 300, 50);
		rb51.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb52 = new JRadioButton("b) O(log n)");
		rb52.setBounds(400, 550, 300, 50);
		rb52.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb53 = new JRadioButton("c) O(n^(1/2))");
		rb53.setBounds(700, 550, 300, 40);
		rb53.setFont(new Font("Verdana", Font.PLAIN, 18));

		rb54 = new JRadioButton("d) O(1)");
		rb54.setBounds(1000, 550, 300, 40);
		rb54.setFont(new Font("Verdana", Font.PLAIN, 18));

		bg5 =new ButtonGroup();
		bg5.add(rb51);
		bg5.add(rb52);
		bg5.add(rb53);
		bg5.add(rb54);

    	b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rb11.isSelected()) {
                	score = score + 5;
                }
                if(rb22.isSelected()) {
                	score = score + 5;
                }
                if(rb33.isSelected()) {
                	score = score + 5;
                }
                if(rb43.isSelected()) {
                	score = score + 5;
                }
                if(rb54.isSelected()) {
                	score = score + 5;
                }

                try {
      				FileWriter myWriter = new FileWriter("score.txt");
      				myWriter.write(Integer.toString(score));
      				myWriter.close();
    			} catch (IOException e1) {
      				System.out.println("An error occurred.");
      				e1.printStackTrace();
    			}

    			f.dispose();
    			new JumpSearchQuizScore();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bg1.clearSelection();
                bg2.clearSelection();
                bg3.clearSelection();
                bg4.clearSelection();
                bg5.clearSelection();
            }
        });

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(q1);
		f.add(q2);
		f.add(q3);
		f.add(q4);
		f.add(q5);
		f.add(rb11);
		f.add(rb12);
		f.add(rb13);
		f.add(rb14);
		f.add(rb21);
		f.add(rb22);
		f.add(rb23);
		f.add(rb24);
		f.add(rb31);
		f.add(rb32);
		f.add(rb33);
		f.add(rb34);
		f.add(rb41);
		f.add(rb42);
		f.add(rb43);
		f.add(rb44);
		f.add(rb51);
		f.add(rb52);
		f.add(rb53);
		f.add(rb54);
		f.add(b1);
		f.add(b2);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);
	}
}