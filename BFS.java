import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class BFS extends JFrame{

	JFrame f;
	JLabel l, code, theory;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10, itf11, itf12, itf13, itf14, itf15, itf16, itf17, itf18, itf19, itf20;  
	// JLabel ol1, ol2, ol3, ol4, ol5, ol6, ol7, ol8, ol9, ol10;

    int mainCounter = 10;
    int[] queue = new int[100];
    int front = -1, rear = -1;
    //int[] input = new int[10];
    int[][] input = new int[10][10];
    LinkedList<Integer> adjList[] = new LinkedList[20];
    int v = 6;
    int[] s = new int[1000];
    int counter = 0;
    int[] temp = new int[10];

	public BFS() {
		
		f = new JFrame("Breadth-First Search");

		l = new JLabel("Breadth-First Search", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

        theory = new JLabel("<html>Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order, using the logic given on the right.</html>");
        theory.setFont(new Font("Verdana", Font.PLAIN, 18));
        theory.setBounds(100, 100, 600, 280);

        code = new JLabel("<html>for (int i = 0; i &#60 n-1; i++) {<br>&nbsp;&nbsp;&nbsp;&nbsp;for (int j = 0; j &#60; n-i-1; j++) {<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if (arr[j] &#62; arr[j+1]) {<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;swap(arr[j], arr[j+1]);<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>}</html>");
        code.setFont(new Font("Verdana", Font.PLAIN, 18));
        code.setBounds(800, 100, 500, 280);

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
        itf11.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	itf11.setBounds(200, 430, 50, 30); 

    	itf12 = new JTextField("0");  
        itf12.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf12.setBounds(300, 430, 50, 30); 

    	itf13 = new JTextField("0");  
        itf13.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf13.setBounds(400, 430, 50, 30); 

    	itf14 = new JTextField("0");  
        itf14.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf14.setBounds(500, 430, 50, 30); 

    	itf15 = new JTextField("0");  
        itf15.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf15.setBounds(600, 430, 50, 30); 

    	itf16 = new JTextField("0");  
        itf16.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf16.setBounds(700, 430, 50, 30); 

    	itf17 = new JTextField("0");  
        itf17.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf17.setBounds(800, 430, 50, 30); 

    	itf18 = new JTextField("0");  
        itf18.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf18.setBounds(900, 430, 50, 30); 

    	itf19 = new JTextField("0");  
        itf19.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf19.setBounds(1000, 430, 50, 30); 

    	itf20 = new JTextField("0");  
        itf20.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf20.setBounds(1100, 430, 50, 30);  

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

          //       if(temp[0] != s[mainCounter]) {
          //           ol1.setForeground(Color.red);
          //       } else {
          //           ol1.setForeground(Color.black);
          //       }
          //       if(temp[1] != s[mainCounter + 1]) {
          //           ol2.setForeground(Color.red);
          //       } else {
          //           ol2.setForeground(Color.black);
          //       }
          //       if(temp[2] != s[mainCounter + 2]) {
          //           ol3.setForeground(Color.red);
          //       } else {
          //           ol3.setForeground(Color.black);
          //       }
          //       if(temp[3] != s[mainCounter + 3]) {
          //           ol4.setForeground(Color.red);
          //       } else {
          //           ol4.setForeground(Color.black);
          //       }
          //       if(temp[4] != s[mainCounter + 4]) {
          //           ol5.setForeground(Color.red);
          //       } else {
          //           ol5.setForeground(Color.black);
          //       }
          //       if(temp[5] != s[mainCounter + 5]) {
          //           ol6.setForeground(Color.red);
          //       } else {
          //           ol6.setForeground(Color.black);
          //       }
          //       if(temp[6] != s[mainCounter + 6]) {
          //           ol7.setForeground(Color.red);
          //       } else {
          //           ol7.setForeground(Color.black);
          //       }
          //       if(temp[7] != s[mainCounter + 7]) {
          //           ol8.setForeground(Color.red);
          //       } else {
          //           ol8.setForeground(Color.black);
          //       }
          //       if(temp[8] != s[mainCounter + 8]) {
          //           ol9.setForeground(Color.red);
          //       } else {
          //           ol9.setForeground(Color.black);
          //       }
          //       if(temp[9] != s[mainCounter + 9]) {
          //           ol10.setForeground(Color.red);
          //       } else {
          //           ol10.setForeground(Color.black);
          //       }

          //       ol1.setText(Integer.toString(s[mainCounter]));
        		// ol2.setText(Integer.toString(s[mainCounter + 1]));
        		// ol3.setText(Integer.toString(s[mainCounter + 2]));
        		// ol4.setText(Integer.toString(s[mainCounter + 3]));
        		// ol5.setText(Integer.toString(s[mainCounter + 4]));
        		// ol6.setText(Integer.toString(s[mainCounter + 5]));
        		// ol7.setText(Integer.toString(s[mainCounter + 6]));
        		// ol8.setText(Integer.toString(s[mainCounter + 7]));
        		// ol9.setText(Integer.toString(s[mainCounter + 8]));
        		// ol10.setText(Integer.toString(s[mainCounter + 9]));

                for(int i = 0; i < 10; i++) {
                    temp[i] = s[mainCounter + i];
                }

        		mainCounter = mainCounter + 10;
                check(mainCounter, counter);
            }
        });

    	b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
          //       if(temp[0] != s[mainCounter]) {
          //           ol1.setForeground(Color.green);
          //       } else {
          //           ol1.setForeground(Color.black);
          //       }
          //       if(temp[1] != s[mainCounter + 1]) {
          //           ol2.setForeground(Color.green);
          //       } else {
          //           ol2.setForeground(Color.black);
          //       }
          //       if(temp[2] != s[mainCounter + 2]) {
          //           ol3.setForeground(Color.green);
          //       } else {
          //           ol3.setForeground(Color.black);
          //       }
          //       if(temp[3] != s[mainCounter + 3]) {
          //           ol4.setForeground(Color.green);
          //       } else {
          //           ol4.setForeground(Color.black);
          //       }
          //       if(temp[4] != s[mainCounter + 4]) {
          //           ol5.setForeground(Color.green);
          //       } else {
          //           ol5.setForeground(Color.black);
          //       }
          //       if(temp[5] != s[mainCounter + 5]) {
          //           ol6.setForeground(Color.green);
          //       } else {
          //           ol6.setForeground(Color.black);
          //       }
          //       if(temp[6] != s[mainCounter + 6]) {
          //           ol7.setForeground(Color.green);
          //       } else {
          //           ol7.setForeground(Color.black);
          //       }
          //       if(temp[7] != s[mainCounter + 7]) {
          //           ol8.setForeground(Color.green);
          //       } else {
          //           ol8.setForeground(Color.black);
          //       }
          //       if(temp[8] != s[mainCounter + 8]) {
          //           ol9.setForeground(Color.green);
          //       } else {
          //           ol9.setForeground(Color.black);
          //       }
          //       if(temp[9] != s[mainCounter + 9]) {
          //           ol10.setForeground(Color.green);
          //       } else {
          //           ol10.setForeground(Color.black);
          //       }

          //       ol1.setText(Integer.toString(s[mainCounter]));
        		// ol2.setText(Integer.toString(s[mainCounter + 1]));
        		// ol3.setText(Integer.toString(s[mainCounter + 2]));
        		// ol4.setText(Integer.toString(s[mainCounter + 3]));
        		// ol5.setText(Integer.toString(s[mainCounter + 4]));
        		// ol6.setText(Integer.toString(s[mainCounter + 5]));
        		// ol7.setText(Integer.toString(s[mainCounter + 6]));
        		// ol8.setText(Integer.toString(s[mainCounter + 7]));
        		// ol9.setText(Integer.toString(s[mainCounter + 8]));
        		// ol10.setText(Integer.toString(s[mainCounter + 9]));

                for(int i = 0; i < 10; i++) {
                    temp[i] = s[mainCounter + i];
                }

        		mainCounter = mainCounter + 10;
                check(mainCounter, counter);
            }
        });

    	b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new BubbleSortQuiz();
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

                // input[0] = Integer.parseInt(itf1.getText());
                // input[1] = Integer.parseInt(itf2.getText());
                // input[2] = Integer.parseInt(itf3.getText());
                // input[3] = Integer.parseInt(itf4.getText());
                // input[4] = Integer.parseInt(itf5.getText());
                // input[5] = Integer.parseInt(itf6.getText());
                // input[6] = Integer.parseInt(itf7.getText());
                // input[7] = Integer.parseInt(itf8.getText());
                // input[8] = Integer.parseInt(itf9.getText());
                // input[9] = Integer.parseInt(itf10.getText());

          //       for (int i = 9; i > 0; i--) {
        		//     for (int j = 0; j < i; j++) {
          //       		if (input[j] > input[j + 1]) {
          //           		for(int k = 0; k < 10; k++) {
          //           			s[counter] = input[k];
          //           			counter = counter + 1;
          //           		}
          //           		swap(input, j, j+1);
          //       		}
          //   		}
       			// }

       			// for(int k = 0; k < 10; k++) {
       			// 	s[counter] = input[k];
          //           counter = counter + 1;
       			// }

                // for(int i = 0; i < 10; i++) {
                //     temp[i] = s[i];
                // }

       			// ol1.setText(Integer.toString(s[0]));
        		// ol2.setText(Integer.toString(s[1]));
        		// ol3.setText(Integer.toString(s[2]));
        		// ol4.setText(Integer.toString(s[3]));
        		// ol5.setText(Integer.toString(s[4]));
        		// ol6.setText(Integer.toString(s[5]));
        		// ol7.setText(Integer.toString(s[6]));
        		// ol8.setText(Integer.toString(s[7]));
        		// ol9.setText(Integer.toString(s[8]));
        		// ol10.setText(Integer.toString(s[9]));

                //int[][] input = {{0,1},{0,2},{1,2},{2,0},{2,3},{3,3}};
                input[0][0] = Integer.parseInt(itf1.getText());
                input[1][0] = Integer.parseInt(itf2.getText());
                input[2][0] = Integer.parseInt(itf3.getText());
                input[3][0] = Integer.parseInt(itf4.getText());
                input[4][0] = Integer.parseInt(itf5.getText());
                input[5][0] = Integer.parseInt(itf6.getText());
                input[6][0] = Integer.parseInt(itf7.getText());
                input[7][0] = Integer.parseInt(itf8.getText());
                input[8][0] = Integer.parseInt(itf9.getText());
                input[9][0] = Integer.parseInt(itf10.getText());
                input[0][1] = Integer.parseInt(itf11.getText());
                input[1][1] = Integer.parseInt(itf12.getText());
                input[2][1] = Integer.parseInt(itf13.getText());
                input[3][1] = Integer.parseInt(itf14.getText());
                input[4][1] = Integer.parseInt(itf15.getText());
                input[5][1] = Integer.parseInt(itf16.getText());
                input[6][1] = Integer.parseInt(itf17.getText());
                input[7][1] = Integer.parseInt(itf18.getText());
                input[8][1] = Integer.parseInt(itf19.getText());
                input[9][1] = Integer.parseInt(itf20.getText());

                for(int i = 0; i < 10; i++) {
                    adjList[i] = new LinkedList<Integer>();
                }

                for(int i = 0; i < 10; i++) {
                    int x = input[i][0];
                    int y = input[i][1];
                    addEdge(adjList, x, y);
                }
                myBFS(adjList, v, 2);

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
                itf12.setEditable(false);
                itf13.setEditable(false);
                itf14.setEditable(false);
                itf15.setEditable(false);
                itf16.setEditable(false);
                itf17.setEditable(false);
                itf18.setEditable(false);
                itf19.setEditable(false);
                itf20.setEditable(false);
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
                itf12.setText("0");
                itf13.setText("0");
                itf14.setText("0");
                itf15.setText("0");
                itf16.setText("0");
                itf17.setText("0");
                itf18.setText("0");
                itf19.setText("0");
                itf20.setText("0");
                // ol1.setText("");
                // ol2.setText("");
                // ol3.setText("");
                // ol4.setText("");
                // ol5.setText("");
                // ol6.setText("");
                // ol7.setText("");
                // ol8.setText("");
                // ol9.setText("");
                // ol10.setText("");
                // ol1.setForeground(Color.black);
                // ol2.setForeground(Color.black);
                // ol3.setForeground(Color.black);
                // ol4.setForeground(Color.black);
                // ol5.setForeground(Color.black);
                // ol6.setForeground(Color.black);
                // ol7.setForeground(Color.black);
                // ol8.setForeground(Color.black);
                // ol9.setForeground(Color.black);
                // ol10.setForeground(Color.black);
                mainCounter = 10;
                counter = 0;
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
                itf12.setEditable(true);
                itf13.setEditable(true);
                itf14.setEditable(true);
                itf15.setEditable(true);
                itf16.setEditable(true);
                itf17.setEditable(true);
                itf18.setEditable(true);
                itf19.setEditable(true);
                itf20.setEditable(true);
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
        f.add(itf12);
        f.add(itf13);
        f.add(itf14);
        f.add(itf15);
        f.add(itf16);
        f.add(itf17);
        f.add(itf18);
        f.add(itf19);
        f.add(itf20);	
    	// f.add(ol1);
    	// f.add(ol2);
    	// f.add(ol3);
    	// f.add(ol4);
    	// f.add(ol5);
    	// f.add(ol6);
    	// f.add(ol7);
    	// f.add(ol8);
    	// f.add(ol9);
    	// f.add(ol10);
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

    public void addEdge(LinkedList<Integer> adjList[],int x,int y) {
        adjList[x].add(y);

    }

    void enqueue(int item) {

        if(front == -1)
            front = front + 1;
        rear = rear + 1;
        queue[rear] = item;

    }

    void dequeue() {
        front = front + 1;
    }

    boolean QueueEmpty() {
        if(front > rear)
            return true;
        return false;
    }

    void myBFS(LinkedList<Integer> adjList[],int v,int s){
        int[] visited = new int[v];
        for(int i = 0; i < v; i++){
            visited[i] = -1;
        }

        visited[s] = 0;

        enqueue(s);

        while (!QueueEmpty()){
            s = queue[front];
            System.out.print(s + "\n");
            dequeue();
            visited[s] = 1;
            for (int i = 0; i < adjList[s].size(); i++){
                int x = adjList[s].get(i);
                if(visited[x] != 1){
                    visited[x] = 0;
                    enqueue(x);
                }
            }
            for(int i = 0; i < v; i++){
                if(visited[i] == 0){
                    System.out.print("Semi-Visited - " + i + "\n");
                }
                else if(visited[i] == 1){
                    System.out.print("Visited - " + i + "\n");
                }
                else{
                    System.out.print("Not visited yet - " + i + "\n");
                }
            }
        }
    }
}