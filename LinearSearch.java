import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class LinearSearch {

	JFrame f;
	JLabel l, l1, code, theory;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10, itf11;  
	JLabel ol1, ol2, ol3, ol4, ol5, ol6, ol7, ol8, ol9, ol10, prompt1, prompt2;

	int[] input = new int[10];
	int[] temp = new int[100];
	int[] s = new int[1000];
	int number = 0, res = -1;
	int mainCounter = 10, counter = 0, z = 0, ekAurCounter = 0;

	public LinearSearch() {

		f = new JFrame("Linear Search");

		l = new JLabel("Linear Search", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

    	theory = new JLabel("<html>In Linear Search we start from the leftmost element of the array and one by one compare the element to be searched with each element of the array.<br> If the elements match then return the index.<br> If they don't match then return -1.</html>");
        theory.setFont(new Font("Verdana", Font.PLAIN, 18));
        theory.setBounds(100, 100, 600, 280);

        code = new JLabel("<html>for (int i = 0; i &#60 n; i++) {<br>&nbsp;&nbsp;&nbsp;&nbsp;if(arr[i] == toBeSearched){<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return i;<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>}<br>return -1;</html>");
        code.setFont(new Font("Verdana", Font.PLAIN, 18));
        code.setBounds(800, 100, 500, 280);

        l1 = new JLabel("Search For : ", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 18));
        l1.setBounds(200, 350, 150, 30);

        itf1 = new JTextField("0");  
    	itf1.setBounds(200, 400, 50, 30);
        itf1.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf2 = new JTextField("0");  
    	itf2.setBounds(300, 400, 50, 30);
        itf2.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf3 = new JTextField("0");  
    	itf3.setBounds(400, 400, 50, 30);
        itf3.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf4 = new JTextField("0");  
    	itf4.setBounds(500, 400, 50, 30);
        itf4.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf5 = new JTextField("0");  
    	itf5.setBounds(600, 400, 50, 30);
        itf5.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf6 = new JTextField("0");  
    	itf6.setBounds(700, 400, 50, 30);
        itf6.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf7 = new JTextField("0");  
    	itf7.setBounds(800, 400, 50, 30);
        itf7.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf8 = new JTextField("0");  
    	itf8.setBounds(900, 400, 50, 30);
        itf8.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf9 = new JTextField("0");  
    	itf9.setBounds(1000, 400, 50, 30);
        itf9.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf10 = new JTextField("0");  
    	itf10.setBounds(1100, 400, 50, 30);
        itf10.setFont(new Font("Verdana", Font.PLAIN, 18)); 

        itf11 = new JTextField("0");  
    	itf11.setBounds(350, 350, 50, 30);
        itf11.setFont(new Font("Verdana", Font.PLAIN, 18));

    	ol1 = new JLabel();
        ol1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol1.setBounds(200, 450, 50, 30); 

    	ol2 = new JLabel();  
        ol2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol2.setBounds(300, 450, 50, 30); 

    	ol3 = new JLabel();  
        ol3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol3.setBounds(400, 450, 50, 30); 

    	ol4 = new JLabel();  
        ol4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol4.setBounds(500, 450, 50, 30); 

    	ol5 = new JLabel();  
        ol5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol5.setBounds(600, 450, 50, 30); 

    	ol6 = new JLabel();  
        ol6.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol6.setBounds(700, 450, 50, 30); 

    	ol7 = new JLabel();  
        ol7.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol7.setBounds(800, 450, 50, 30); 

    	ol8 = new JLabel();  
        ol8.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol8.setBounds(900, 450, 50, 30); 

    	ol9 = new JLabel();  
        ol9.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol9.setBounds(1000, 450, 50, 30); 

    	ol10 = new JLabel();  
        ol10.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol10.setBounds(1100, 450, 50, 30);

    	prompt1 = new JLabel();  
        prompt1.setFont(new Font("Verdana", Font.PLAIN, 18));
        prompt1.setBounds(50, 550, 250, 50);

        prompt2 = new JLabel();  
        prompt2.setFont(new Font("Verdana", Font.PLAIN, 18));
        prompt2.setBounds(100, 600, 250, 50);

    	b1 = new JButton("Previous");
		b1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	b1.setBounds(315, 550, 250, 40);
        b1.setEnabled(false);

    	b2 = new JButton("Next");  
    	b2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b2.setBounds(830, 550, 250, 40);
        b2.setEnabled(false); 

    	b3 = new JButton("Take The Quiz");  
    	b3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b3.setBounds(315, 620, 250, 40);

    	b4 = new JButton("Return To Main Menu");  
    	b4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b4.setBounds(830, 620, 250, 40);

    	b5 = new JButton("Run");  
    	b5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	b5.setBounds(620, 500, 150, 40);

        b6 = new JButton("Clear");  
        b6.setFont(new Font("Verdana", Font.PLAIN, 18));
        b6.setBounds(620, 560, 150, 40);
        b6.setEnabled(false);

        b7 = new JButton("Exit");  
        b7.setFont(new Font("Verdana", Font.PLAIN, 18));
        b7.setBounds(620, 620, 150, 40);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	mainCounter = mainCounter - 20;
            	ekAurCounter = ekAurCounter - 1;

            	if(temp[ekAurCounter] == 0) {
                    ol1.setForeground(Color.red);
                } else {
                    ol1.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 1) {
                    ol2.setForeground(Color.red);
                } else {
                    ol2.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 2) {
                    ol3.setForeground(Color.red);
                } else {
                    ol3.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 3) {
                    ol4.setForeground(Color.red);
                } else {
                    ol4.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 4) {
                    ol5.setForeground(Color.red);
                } else {
                    ol5.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 5) {
                    ol6.setForeground(Color.red);
                } else {
                    ol6.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 6) {
                    ol7.setForeground(Color.red);
                } else {
                    ol7.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 7) {
                    ol8.setForeground(Color.red);
                } else {
                    ol8.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 8) {
                    ol9.setForeground(Color.red);
                } else {
                    ol9.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 9) {
                    ol10.setForeground(Color.red);
                    if(res == -1) {
                    	prompt1.setText("Element Not Found");
                    }
                } else {
                    ol10.setForeground(Color.black);
                }

                if(temp[ekAurCounter] == res) {
                	prompt1.setText("Element Found at Index: "); 
                	prompt2.setText(Integer.toString(ekAurCounter));
                }

                ol1.setText(Integer.toString(s[mainCounter]));
        		ol2.setText(Integer.toString(s[mainCounter + 1]));
        		ol3.setText(Integer.toString(s[mainCounter + 2]));
        		ol4.setText(Integer.toString(s[mainCounter + 3]));
        		ol5.setText(Integer.toString(s[mainCounter + 4]));
        		ol6.setText(Integer.toString(s[mainCounter + 5]));
        		ol7.setText(Integer.toString(s[mainCounter + 6]));
        		ol8.setText(Integer.toString(s[mainCounter + 7]));
        		ol9.setText(Integer.toString(s[mainCounter + 8]));
        		ol10.setText(Integer.toString(s[mainCounter + 9]));

        		mainCounter = mainCounter + 10;
                check(mainCounter, counter);

            }
        });	

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	if(temp[ekAurCounter] == 0) {
                    ol1.setForeground(Color.green);
                } else {
                    ol1.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 1) {
                    ol2.setForeground(Color.green);
                } else {
                    ol2.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 2) {
                    ol3.setForeground(Color.green);
                } else {
                    ol3.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 3) {
                    ol4.setForeground(Color.green);
                } else {
                    ol4.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 4) {
                    ol5.setForeground(Color.green);
                } else {
                    ol5.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 5) {
                    ol6.setForeground(Color.green);
                } else {
                    ol6.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 6) {
                    ol7.setForeground(Color.green);
                } else {
                    ol7.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 7) {
                    ol8.setForeground(Color.green);
                } else {
                    ol8.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 8) {
                    ol9.setForeground(Color.green);
                } else {
                    ol9.setForeground(Color.black);
                }
                if(temp[ekAurCounter] == 9) {
                    prompt1.setText("Element Not Found"); 
                    ol10.setForeground(Color.green);
                } else {
                    ol10.setForeground(Color.black);
                }

                if(temp[ekAurCounter] == res) {
                	prompt1.setText("Element Found at Index: "); 
                	prompt2.setText(Integer.toString(ekAurCounter));
                }

            	ol1.setText(Integer.toString(s[mainCounter]));
        		ol2.setText(Integer.toString(s[mainCounter + 1]));
        		ol3.setText(Integer.toString(s[mainCounter + 2]));
        		ol4.setText(Integer.toString(s[mainCounter + 3]));
        		ol5.setText(Integer.toString(s[mainCounter + 4]));
        		ol6.setText(Integer.toString(s[mainCounter + 5]));
        		ol7.setText(Integer.toString(s[mainCounter + 6]));
        		ol8.setText(Integer.toString(s[mainCounter + 7]));
        		ol9.setText(Integer.toString(s[mainCounter + 8]));
        		ol10.setText(Integer.toString(s[mainCounter + 9]));

        		mainCounter = mainCounter + 10;
        		ekAurCounter = ekAurCounter + 1;
                check(mainCounter, counter);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	f.dispose();
                new LinearSearchQuiz();
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

                number = Integer.parseInt(itf11.getText());
                res = search(input, 10, number);

                for(int k = 0; k < 10; k++) {
       				s[counter] = input[k];
                    counter = counter + 1;
       			}

       			ol1.setText(Integer.toString(s[0]));
        		ol2.setText(Integer.toString(s[1]));
        		ol3.setText(Integer.toString(s[2]));
        		ol4.setText(Integer.toString(s[3]));
        		ol5.setText(Integer.toString(s[4]));
        		ol6.setText(Integer.toString(s[5]));
        		ol7.setText(Integer.toString(s[6]));
        		ol8.setText(Integer.toString(s[7]));
        		ol9.setText(Integer.toString(s[8]));
        		ol10.setText(Integer.toString(s[9]));

                check(mainCounter, counter);
                b5.setEnabled(false);
                itf1.setEditable(false);
                itf2.setEditable(false);
                itf3.setEditable(false);
                itf4.setEditable(false);
                itf5.setEditable(false);
                itf6.setEditable(false);
                itf7.setEditable(false);
                itf8.setEditable(false);
                itf9.setEditable(false);
                itf10.setEditable(false);
                itf11.setEditable(false);
                b6.setEnabled(true);
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	itf1.setText("0");
                itf2.setText("0");
                itf3.setText("0");
                itf4.setText("0");
                itf5.setText("0");
                itf6.setText("0");
                itf7.setText("0");
                itf8.setText("0");
                itf9.setText("0");
                itf10.setText("0");
                itf11.setText("0");
                ol1.setText("");
                ol2.setText("");
                ol3.setText("");
                ol4.setText("");
                ol5.setText("");
                ol6.setText("");
                ol7.setText("");
                ol8.setText("");
                ol9.setText("");
                ol10.setText("");
                prompt1.setText("");
                prompt2.setText("");
                ol1.setForeground(Color.black);
                ol2.setForeground(Color.black);
                ol3.setForeground(Color.black);
                ol4.setForeground(Color.black);
                ol5.setForeground(Color.black);
                ol6.setForeground(Color.black);
                ol7.setForeground(Color.black);
                ol8.setForeground(Color.black);
                ol9.setForeground(Color.black);
                ol10.setForeground(Color.black);
                mainCounter = 10;
                counter = 0;
                z = 0;
                ekAurCounter = 0;
                check(mainCounter, counter);
                b5.setEnabled(true);
                b6.setEnabled(false);
                itf1.setEditable(true);
                itf2.setEditable(true);
                itf3.setEditable(true);
                itf4.setEditable(true);
                itf5.setEditable(true);
                itf6.setEditable(true);
                itf7.setEditable(true);
                itf8.setEditable(true);
                itf9.setEditable(true);
                itf10.setEditable(true);
                itf11.setEditable(true);
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.add(l);
        f.add(theory);
        f.add(code);
        f.add(l1);
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
    	f.add(itf11);
    	f.add(ol1);
    	f.add(ol2);
    	f.add(ol3);
    	f.add(ol4);
    	f.add(ol5);
    	f.add(ol6);
    	f.add(ol7);
    	f.add(ol8);
    	f.add(ol9);
    	f.add(ol10);
    	f.add(prompt1);
    	f.add(prompt2);
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

	public void check(int mainCounter, int counter) {
        
        if(mainCounter >= 10) {
            b2.setEnabled(true);
            b1.setEnabled(true); 
        } 
        
        if(mainCounter <= 10) {
            b1.setEnabled(false);
        }
        
        if(mainCounter >= counter) {
            b2.setEnabled(false);
        }
    
    }

    public int search(int[] arr, int n, int num){
        for (int i = 0; i < n; i++) {
            if(arr[i] == num){
            	for(int k = 0; k < n; k++) {
            		s[counter] = arr[k];
            		counter = counter + 1;
            	}
            	temp[z] = i;
            	z = z + 1;
                return i;
            }

            for(int k = 0; k < n; k++) {
            	s[counter] = arr[k];
            	counter = counter + 1;
            }
            
            temp[z] = i;
            z = z + 1;
        }
        return -1;
    }

}