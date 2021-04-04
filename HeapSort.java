import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class HeapSort {

	JFrame f;
	JLabel l, code;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10;  
	JLabel ol1, ol2, ol3, ol4, ol5, ol6, ol7, ol8, ol9, ol10, aol1, aol2, aol3, aol4, aol5, aol6, aol7, aol8, aol9, aol10, prompt;

    int mainCounter = 10, counter = 0, z = 0, ekAurCounter = 0;
    int[] input = new int[10];
    int[] s = new int[1000];
    int[] index1 = new int[100];
    int[] index2 = new int[100];
    int[] temp = new int[10];

	public HeapSort() {
		
		f = new JFrame("Heap Sort");

		l = new JLabel("Heap Sort", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

        code = new JLabel("<html>public void hsort(int[] arr, int n) {<br>&nbsp;&nbsp;&nbsp;&nbsp;for(int i = n / 2 - 1; i &#62= 0; i--) {<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;minheapify(arr, i, n);<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;&nbsp;&nbsp;for(int i = n - 1; i >= 0; i--) {<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;swap(arr, 0, i);<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;minheapify(arr, 0, i);<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>}</html>");
        code.setFont(new Font("Verdana", Font.PLAIN, 18));
        code.setBounds(100, 100, 500, 280);

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

        aol1 = new JLabel();
        aol1.setFont(new Font("Verdana", Font.PLAIN, 18));  
        aol1.setBounds(200, 450, 50, 30); 

        aol2 = new JLabel();  
        aol2.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol2.setBounds(300, 450, 50, 30); 

        aol3 = new JLabel();  
        aol3.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol3.setBounds(400, 450, 50, 30); 

        aol4 = new JLabel();  
        aol4.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol4.setBounds(500, 450, 50, 30); 

        aol5 = new JLabel();  
        aol5.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol5.setBounds(600, 450, 50, 30); 

        aol6 = new JLabel();  
        aol6.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol6.setBounds(700, 450, 50, 30); 

        aol7 = new JLabel();  
        aol7.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol7.setBounds(800, 450, 50, 30); 

        aol8 = new JLabel();  
        aol8.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol8.setBounds(900, 450, 50, 30); 

        aol9 = new JLabel();  
        aol9.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol9.setBounds(1000, 450, 50, 30); 

        aol10 = new JLabel();  
        aol10.setFont(new Font("Verdana", Font.PLAIN, 18));
        aol10.setBounds(1100, 450, 50, 30);

    	ol1 = new JLabel();
        ol1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol1.setBounds(1000, 150, 50, 30); 

    	ol2 = new JLabel();  
        ol2.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol2.setBounds(800, 200, 50, 30); 

    	ol3 = new JLabel();  
        ol3.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol3.setBounds(1200, 200, 50, 30); 

    	ol4 = new JLabel();  
        ol4.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol4.setBounds(700, 250, 50, 30); 

    	ol5 = new JLabel();  
        ol5.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol5.setBounds(900, 250, 50, 30); 

    	ol6 = new JLabel();  
        ol6.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol6.setBounds(1100, 250, 50, 30); 

    	ol7 = new JLabel();  
        ol7.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol7.setBounds(1300, 250, 50, 30); 

    	ol8 = new JLabel();  
        ol8.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol8.setBounds(650, 300, 50, 30); 

    	ol9 = new JLabel();  
        ol9.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol9.setBounds(750, 300, 50, 30); 

    	ol10 = new JLabel();  
        ol10.setFont(new Font("Verdana", Font.PLAIN, 18));
    	ol10.setBounds(850, 300, 50, 30);  

        prompt = new JLabel();  
        prompt.setFont(new Font("Verdana", Font.PLAIN, 18));
        prompt.setBounds(50, 550, 250, 50);

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

                if(temp[0] != s[mainCounter]) {
                    ol1.setForeground(Color.red);
                    aol1.setForeground(Color.red);
                } else {
                    ol1.setForeground(Color.black);
                    aol1.setForeground(Color.black);
                }
                if(temp[1] != s[mainCounter + 1]) {
                    ol2.setForeground(Color.red);
                    aol2.setForeground(Color.red);
                } else {
                    ol2.setForeground(Color.black);
                    aol2.setForeground(Color.black);
                }
                if(temp[2] != s[mainCounter + 2]) {
                    ol3.setForeground(Color.red);
                    aol3.setForeground(Color.red);                    
                } else {
                    ol3.setForeground(Color.black);
                    aol3.setForeground(Color.black);
                }
                if(temp[3] != s[mainCounter + 3]) {
                    ol4.setForeground(Color.red);
                    aol4.setForeground(Color.red);
                } else {
                    ol4.setForeground(Color.black);
                    aol4.setForeground(Color.black);
                }
                if(temp[4] != s[mainCounter + 4]) {
                    ol5.setForeground(Color.red);
                    aol5.setForeground(Color.red);
                } else {
                    ol5.setForeground(Color.black);
                    aol5.setForeground(Color.black);
                }
                if(temp[5] != s[mainCounter + 5]) {
                    ol6.setForeground(Color.red);
                    aol6.setForeground(Color.red);
                } else {
                    ol6.setForeground(Color.black);
                    aol6.setForeground(Color.black);
                }
                if(temp[6] != s[mainCounter + 6]) {
                    ol7.setForeground(Color.red);
                    aol7.setForeground(Color.red);
                } else {
                    ol7.setForeground(Color.black);
                    aol7.setForeground(Color.black);
                }
                if(temp[7] != s[mainCounter + 7]) {
                    ol8.setForeground(Color.red);
                    aol8.setForeground(Color.red);
                } else {
                    ol8.setForeground(Color.black);
                    aol8.setForeground(Color.black);
                }
                if(temp[8] != s[mainCounter + 8]) {
                    ol9.setForeground(Color.red);
                    aol9.setForeground(Color.red);
                } else {
                    ol9.setForeground(Color.black);
                    aol9.setForeground(Color.black);
                }
                if(temp[9] != s[mainCounter + 9]) {
                    ol10.setForeground(Color.red);
                    aol10.setForeground(Color.red);
                } else {
                    ol10.setForeground(Color.black);
                    aol10.setForeground(Color.black);
                }

                prompt.setText(Integer.toString(index1[ekAurCounter]) + " swapped with " + Integer.toString(index2[ekAurCounter]));

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

                aol1.setText(Integer.toString(s[mainCounter]));
                aol2.setText(Integer.toString(s[mainCounter + 1]));
                aol3.setText(Integer.toString(s[mainCounter + 2]));
                aol4.setText(Integer.toString(s[mainCounter + 3]));
                aol5.setText(Integer.toString(s[mainCounter + 4]));
                aol6.setText(Integer.toString(s[mainCounter + 5]));
                aol7.setText(Integer.toString(s[mainCounter + 6]));
                aol8.setText(Integer.toString(s[mainCounter + 7]));
                aol9.setText(Integer.toString(s[mainCounter + 8]));
                aol10.setText(Integer.toString(s[mainCounter + 9]));

                for(int i = 0; i < 10; i++) {
                    temp[i] = s[mainCounter + i];
                }

        		mainCounter = mainCounter + 10;
                check(mainCounter, counter);
            }
        });

    	b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(temp[0] != s[mainCounter]) {
                    ol1.setForeground(Color.green);
                    aol1.setForeground(Color.green);
                } else {
                    ol1.setForeground(Color.black);
                    aol1.setForeground(Color.black);
                }
                if(temp[1] != s[mainCounter + 1]) {
                    ol2.setForeground(Color.green);
                    aol2.setForeground(Color.green);
                } else {
                    ol2.setForeground(Color.black);
                    aol2.setForeground(Color.black);
                }
                if(temp[2] != s[mainCounter + 2]) {
                    ol3.setForeground(Color.green);
                    aol3.setForeground(Color.green);
                } else {
                    ol3.setForeground(Color.black);
                    aol3.setForeground(Color.black);
                }
                if(temp[3] != s[mainCounter + 3]) {
                    ol4.setForeground(Color.green);
                    aol4.setForeground(Color.green);
                } else {
                    ol4.setForeground(Color.black);
                    aol4.setForeground(Color.black);
                }
                if(temp[4] != s[mainCounter + 4]) {
                    ol5.setForeground(Color.green);
                    aol5.setForeground(Color.green);
                } else {
                    ol5.setForeground(Color.black);
                    aol5.setForeground(Color.black);
                }
                if(temp[5] != s[mainCounter + 5]) {
                    ol6.setForeground(Color.green);
                    aol6.setForeground(Color.green);
                } else {
                    ol6.setForeground(Color.black);
                    aol6.setForeground(Color.black);
                }
                if(temp[6] != s[mainCounter + 6]) {
                    ol7.setForeground(Color.green);
                    aol7.setForeground(Color.green);
                } else {
                    ol7.setForeground(Color.black);
                    aol7.setForeground(Color.black);
                }
                if(temp[7] != s[mainCounter + 7]) {
                    ol8.setForeground(Color.green);
                    aol8.setForeground(Color.green);
                } else {
                    ol8.setForeground(Color.black);
                    aol8.setForeground(Color.black);
                }
                if(temp[8] != s[mainCounter + 8]) {
                    ol9.setForeground(Color.green);
                    aol9.setForeground(Color.green);
                } else {
                    ol9.setForeground(Color.black);
                    aol9.setForeground(Color.black);
                }
                if(temp[9] != s[mainCounter + 9]) {
                    ol10.setForeground(Color.green);
                    aol10.setForeground(Color.green);
                } else {
                    ol10.setForeground(Color.black);
                    aol10.setForeground(Color.black);
                }

                prompt.setText(Integer.toString(index1[ekAurCounter]) + " swapped with " + Integer.toString(index2[ekAurCounter]));

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

                aol1.setText(Integer.toString(s[mainCounter]));
                aol2.setText(Integer.toString(s[mainCounter + 1]));
                aol3.setText(Integer.toString(s[mainCounter + 2]));
                aol4.setText(Integer.toString(s[mainCounter + 3]));
                aol5.setText(Integer.toString(s[mainCounter + 4]));
                aol6.setText(Integer.toString(s[mainCounter + 5]));
                aol7.setText(Integer.toString(s[mainCounter + 6]));
                aol8.setText(Integer.toString(s[mainCounter + 7]));
                aol9.setText(Integer.toString(s[mainCounter + 8]));
                aol10.setText(Integer.toString(s[mainCounter + 9]));

                for(int i = 0; i < 10; i++) {
                    temp[i] = s[mainCounter + i];
                }

        		mainCounter = mainCounter + 10;
                ekAurCounter = ekAurCounter + 1;
                check(mainCounter, counter);
            }
        });

    	b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new HeapSortQuiz();
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

                hsort(input, 10);

       			for(int k = 0; k < 10; k++) {
       				s[counter] = input[k];
                    counter = counter + 1;
       			}

                for(int i = 0; i < 10; i++) {
                    temp[i] = s[i];
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
                aol1.setText(Integer.toString(s[0]));
                aol2.setText(Integer.toString(s[1]));
                aol3.setText(Integer.toString(s[2]));
                aol4.setText(Integer.toString(s[3]));
                aol5.setText(Integer.toString(s[4]));
                aol6.setText(Integer.toString(s[5]));
                aol7.setText(Integer.toString(s[6]));
                aol8.setText(Integer.toString(s[7]));
                aol9.setText(Integer.toString(s[8]));
                aol10.setText(Integer.toString(s[9]));
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
                aol1.setText("");
                aol2.setText("");
                aol3.setText("");
                aol4.setText("");
                aol5.setText("");
                aol6.setText("");
                aol7.setText("");
                aol8.setText("");
                aol9.setText("");
                aol10.setText("");
                prompt.setText("");
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
                aol1.setForeground(Color.black);
                aol2.setForeground(Color.black);
                aol3.setForeground(Color.black);
                aol4.setForeground(Color.black);
                aol5.setForeground(Color.black);
                aol6.setForeground(Color.black);
                aol7.setForeground(Color.black);
                aol8.setForeground(Color.black);
                aol9.setForeground(Color.black);
                aol10.setForeground(Color.black);
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
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.add(l);
        f.add(code);
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
        f.add(aol1);
        f.add(aol2);
        f.add(aol3);
        f.add(aol4);
        f.add(aol5);
        f.add(aol6);
        f.add(aol7);
        f.add(aol8);
        f.add(aol9);
        f.add(aol10);
        f.add(prompt);
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

	public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;    
    }

    public void minheapify(int[] arr,int i, int n) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[smallest]) {
            smallest = left;
        }
        if(right < n && arr[right] > arr[smallest]) {
            smallest = right;
        }
        if(smallest != i) {
            for(int k = 0; k < 10; k++) {
                s[counter] = input[k];
                counter = counter + 1;
            }
            index1[z] = i;
            index2[z] = smallest;
            z = z + 1;
            swap(arr, i, smallest);
            minheapify(arr, smallest, n);
        }

    }

    public void hsort(int[] arr, int n) {
        for(int i = n / 2 - 1; i >= 0; i--) {
            minheapify(arr, i, n);
        }

        for(int i = n - 1; i >= 0; i--) {
            for(int k = 0; k < 10; k++) {
                s[counter] = input[k];
                counter = counter + 1;
            }
            index1[z] = 0;
            index2[z] = i;
            z = z + 1;
            swap(arr, 0, i);
            minheapify(arr, 0, i);
        }
    }
}