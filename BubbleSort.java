import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class BubbleSort {

	JFrame f;
	JLabel l;
	JButton b1, b2, b3, b4, b5;
	JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10;  
	JTextField otf1, otf2, otf3, otf4, otf5, otf6, otf7, otf8, otf9, otf10;

    	int mainCounter = 10;

	public BubbleSort() {
		
		f = new JFrame("Bubble Sort");

		l = new JLabel("Bubble Sort", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

   		itf1 = new JTextField();  
    	itf1.setBounds(200, 400, 50, 30);

    	itf2 = new JTextField();  
    	itf2.setBounds(300, 400, 50, 30);

    	itf3 = new JTextField();  
    	itf3.setBounds(400, 400, 50, 30);

    	itf4 = new JTextField();  
    	itf4.setBounds(500, 400, 50, 30);

    	itf5 = new JTextField();  
    	itf5.setBounds(600, 400, 50, 30);

    	itf6 = new JTextField();  
    	itf6.setBounds(700, 400, 50, 30);

    	itf7 = new JTextField();  
    	itf7.setBounds(800, 400, 50, 30);

    	itf8 = new JTextField();  
    	itf8.setBounds(900, 400, 50, 30);

    	itf9 = new JTextField();  
    	itf9.setBounds(1000, 400, 50, 30);

    	itf10 = new JTextField();  
    	itf10.setBounds(1100, 400, 50, 30); 

    	otf1 = new JTextField();  
    	otf1.setBounds(200, 450, 50, 30); 

    	otf2 = new JTextField();  
    	otf2.setBounds(300, 450, 50, 30); 

    	otf3 = new JTextField();  
    	otf3.setBounds(400, 450, 50, 30); 

    	otf4 = new JTextField();  
    	otf4.setBounds(500, 450, 50, 30); 

    	otf5 = new JTextField();  
    	otf5.setBounds(600, 450, 50, 30); 

    	otf6 = new JTextField();  
    	otf6.setBounds(700, 450, 50, 30); 

    	otf7 = new JTextField();  
    	otf7.setBounds(800, 450, 50, 30); 

    	otf8 = new JTextField();  
    	otf8.setBounds(900, 450, 50, 30); 

    	otf9 = new JTextField();  
    	otf9.setBounds(1000, 450, 50, 30); 

    	otf10 = new JTextField();  
    	otf10.setBounds(1100, 450, 50, 30);  

    	b1 = new JButton("Previous");
		b1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	b1.setBounds(315, 550, 250, 40);

    	b2 = new JButton("Next");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(830, 550, 250, 40); 

    	b3 = new JButton("Take The Quiz");  
    	b3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b3.setBounds(315, 620, 250, 40);

    	b4 = new JButton("Return To Algorithms");  
    	b4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b4.setBounds(830, 620, 250, 40);

    	b5 = new JButton("Run");  
    	b5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b5.setBounds(620, 500, 150, 40);


    	int[] input = new int[10];
    	int[] s = new int[1000];


    	b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        		mainCounter = mainCounter - 20;
                otf1.setText(Integer.toString(s[mainCounter]));
        		otf2.setText(Integer.toString(s[mainCounter + 1]));
        		otf3.setText(Integer.toString(s[mainCounter + 2]));
        		otf4.setText(Integer.toString(s[mainCounter + 3]));
        		otf5.setText(Integer.toString(s[mainCounter + 4]));
        		otf6.setText(Integer.toString(s[mainCounter + 5]));
        		otf7.setText(Integer.toString(s[mainCounter + 6]));
        		otf8.setText(Integer.toString(s[mainCounter + 7]));
        		otf9.setText(Integer.toString(s[mainCounter + 8]));
        		otf10.setText(Integer.toString(s[mainCounter + 9]));
        		mainCounter = mainCounter + 10;
            }
        });

    	b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                otf1.setText(Integer.toString(s[mainCounter]));
        		otf2.setText(Integer.toString(s[mainCounter + 1]));
        		otf3.setText(Integer.toString(s[mainCounter + 2]));
        		otf4.setText(Integer.toString(s[mainCounter + 3]));
        		otf5.setText(Integer.toString(s[mainCounter + 4]));
        		otf6.setText(Integer.toString(s[mainCounter + 5]));
        		otf7.setText(Integer.toString(s[mainCounter + 6]));
        		otf8.setText(Integer.toString(s[mainCounter + 7]));
        		otf9.setText(Integer.toString(s[mainCounter + 8]));
        		otf10.setText(Integer.toString(s[mainCounter + 9]));
        		mainCounter = mainCounter + 10;
            }
        });

    	b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    	b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new MainMenu();
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input[0] = Integer.parseInt(itf1.getText());
                input[1] = Integer.parseInt(itf2.getText());
                input[2] = Integer.parseInt(itf3.getText());
                input[3] = Integer.parseInt(itf4.getText());
                input[4] = Integer.parseInt(itf5.getText());
                input[5] = Integer.parseInt(itf6.getText());
                input[6] = Integer.parseInt(itf7.getText());
                input[7] = Integer.parseInt(itf8.getText());
                input[8] = Integer.parseInt(itf9.getText());
                input[9] = Integer.parseInt(itf10.getText());

                int counter = 0;
                for (int i = 9; i > 0; i--) {
        		    for (int j = 0; j < i; j++) {
                		if (input[j] > input[j + 1]) {
                    		for(int k = 0; k < 10; k++) {
                    			s[counter] = input[k];
                    			counter = counter + 1;
                    		}
                    		swap(input, j, j+1);
                		}
            		}
       			}
       			for(int k = 0; k < 10; k++) {
       				s[counter] = input[k];
                    counter = counter + 1;
       			}

       			otf1.setText(Integer.toString(s[0]));
        		otf2.setText(Integer.toString(s[1]));
        		otf3.setText(Integer.toString(s[2]));
        		otf4.setText(Integer.toString(s[3]));
        		otf5.setText(Integer.toString(s[4]));
        		otf6.setText(Integer.toString(s[5]));
        		otf7.setText(Integer.toString(s[6]));
        		otf8.setText(Integer.toString(s[7]));
        		otf9.setText(Integer.toString(s[8]));
        		otf10.setText(Integer.toString(s[9]));
            }
        });



    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.add(l);
    	f.add(itf1);
    	f.add(itf2);
    	f.add(itf3);
    	f.add(itf4);
    	f.add(itf5);
    	f.add(itf6);
    	f.add(itf7);
    	f.add(itf8);
    	f.add(itf9);
    	f.add(itf10);	
    	f.add(otf1);
    	f.add(otf2);
    	f.add(otf3);
    	f.add(otf4);
    	f.add(otf5);
    	f.add(otf6);
    	f.add(otf7);
    	f.add(otf8);
    	f.add(otf9);
    	f.add(otf10);
    	f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
    	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void swap(int[] array, int i, int j) {
        if(i==j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        //System.out.println(array[i]+" and "+array[j]+" got swapped");
    }
}