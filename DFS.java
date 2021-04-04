import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class DFS {

	JFrame f;
	JLabel l01, l02, l03, l04, l05, l10, l12, l13, l14, l15, l20, l21, l23, l24, l25, l30, l31, l32, l34, l35, l40, l41, l42, l43, l45, l50, l51, l52, l53, l54 ;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10, itf11, itf12, itf13, itf14, itf15, itf16, itf17, itf18, itf19, itf20, starting, vertexNum;  
	JLabel ol1, ol2, ol3, ol4, ol5, ol6;
	JLabel l, l1, l2, l3, l4, prompt;

    int[][] input = new int[10][10];
    LinkedList<Integer> adjList[] = new LinkedList[20];
    int v, startingVertex;
    int[] index1 = new int[600];
    int[] index = new int[60];
    int counter = 0, z = 0, mainCounter = 0, ekAurCounter = 0;

	public DFS() {
		
		f = new JFrame("Depth-First Search");

		l = new JLabel("Depth-First Search", JLabel.CENTER);
		l.setFont(new Font("Verdana", Font.PLAIN, 36));
    	l.setBounds(490, 50, 400, 60);

    	l1 = new JLabel("Enter the Edges : ");
    	l1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	l1.setBounds(75, 150, 200, 30);

    	l2 = new JLabel("Enter the Starting Vertex : ");
    	l2.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	l2.setBounds(325, 250, 275, 30);

    	starting = new JTextField("2");  
    	starting.setBounds(425, 300, 50, 30);
        starting.setFont(new Font("Verdana", Font.PLAIN, 18));

    	l3 = new JLabel("<html>*It only works for a graph with<br>6 vertices and 10 edges</html>");
    	l3.setFont(new Font("Verdana", Font.PLAIN, 12));  
    	l3.setBounds(350, 300, 200, 100);

    	l4 = new JLabel("Enter Number of Vertex : ");
    	l4.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	l4.setBounds(325, 150, 275, 30);

    	vertexNum = new JTextField("6");  
    	vertexNum.setBounds(425, 200, 50, 30);
        vertexNum.setFont(new Font("Verdana", Font.PLAIN, 18));

        prompt = new JLabel();
    	prompt.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	prompt.setBounds(325, 400, 275, 100);

        try {
	        
	        BufferedImage img01 = ImageIO.read(this.getClass().getResource("01.png"));
	        BufferedImage img02 = ImageIO.read(this.getClass().getResource("02.png"));
	        BufferedImage img03 = ImageIO.read(this.getClass().getResource("03.png"));
	        BufferedImage img04 = ImageIO.read(this.getClass().getResource("04.png"));
	        BufferedImage img05 = ImageIO.read(this.getClass().getResource("05.png"));
	        BufferedImage img10 = ImageIO.read(this.getClass().getResource("10.png"));
	        BufferedImage img12 = ImageIO.read(this.getClass().getResource("12.png"));
	        BufferedImage img13 = ImageIO.read(this.getClass().getResource("13.png"));
	        BufferedImage img14 = ImageIO.read(this.getClass().getResource("14.png"));
	        BufferedImage img15 = ImageIO.read(this.getClass().getResource("15.png"));
	        BufferedImage img20 = ImageIO.read(this.getClass().getResource("20.png"));
	        BufferedImage img21 = ImageIO.read(this.getClass().getResource("21.png"));
	        BufferedImage img23 = ImageIO.read(this.getClass().getResource("23.png"));
	        BufferedImage img24 = ImageIO.read(this.getClass().getResource("24.png"));
	        BufferedImage img25 = ImageIO.read(this.getClass().getResource("25.png"));
	        BufferedImage img30 = ImageIO.read(this.getClass().getResource("30.png"));
	        BufferedImage img31 = ImageIO.read(this.getClass().getResource("31.png"));
	        BufferedImage img32 = ImageIO.read(this.getClass().getResource("32.png"));
	        BufferedImage img34 = ImageIO.read(this.getClass().getResource("34.png"));
	        BufferedImage img35 = ImageIO.read(this.getClass().getResource("35.png"));
	        BufferedImage img40 = ImageIO.read(this.getClass().getResource("40.png"));
	        BufferedImage img41 = ImageIO.read(this.getClass().getResource("41.png"));
	        BufferedImage img42 = ImageIO.read(this.getClass().getResource("42.png"));
	        BufferedImage img43 = ImageIO.read(this.getClass().getResource("43.png"));
	        BufferedImage img45 = ImageIO.read(this.getClass().getResource("45.png"));
	        BufferedImage img50 = ImageIO.read(this.getClass().getResource("50.png"));
	        BufferedImage img51 = ImageIO.read(this.getClass().getResource("51.png"));
	        BufferedImage img52 = ImageIO.read(this.getClass().getResource("52.png"));
	        BufferedImage img53 = ImageIO.read(this.getClass().getResource("53.png"));
	        BufferedImage img54 = ImageIO.read(this.getClass().getResource("54.png"));

	        l01 = new JLabel(new ImageIcon(img01));
        	l01.setBounds(700, 150, 200, 300);
        	l01.setVisible(false);

        	l02 = new JLabel(new ImageIcon(img02));
        	l02.setBounds(700, 300, 200, 300);
        	l02.setVisible(false);

        	l03 = new JLabel(new ImageIcon(img03));
        	l03.setBounds(750, 140, 600, 300);
        	l03.setVisible(false);

        	l04 = new JLabel(new ImageIcon(img04));
        	l04.setBounds(750, 182, 600, 300);
        	l04.setVisible(false);

        	l05 = new JLabel(new ImageIcon(img05));
        	l05.setBounds(730, 175, 600, 300);
        	l05.setVisible(false);

        	l10 = new JLabel(new ImageIcon(img10));
        	l10.setBounds(690, 140, 200, 300);
        	l10.setVisible(false);

        	l12 = new JLabel(new ImageIcon(img12));
        	l12.setBounds(785, 155, 200, 300);
        	l12.setVisible(false);

        	l13 = new JLabel(new ImageIcon(img13));
        	l13.setBounds(900, 10, 200, 300);
        	l13.setVisible(false);

        	l14 = new JLabel(new ImageIcon(img14));
        	l14.setBounds(910, 150, 200, 300);
        	l14.setVisible(false);

        	l15 = new JLabel(new ImageIcon(img15));
        	l15.setBounds(930, 25, 600, 300);
        	l15.setVisible(false);

        	l20 = new JLabel(new ImageIcon(img20));
        	l20.setBounds(695, 325, 200, 300);
        	l20.setVisible(false);

        	l21 = new JLabel(new ImageIcon(img21));
        	l21.setBounds(805, 155, 200, 300);
        	l21.setVisible(false);

        	l23 = new JLabel(new ImageIcon(img23));
        	l23.setBounds(905, 150, 200, 300);
        	l23.setVisible(false);

        	l24 = new JLabel(new ImageIcon(img24));
        	l24.setBounds(900, 325, 200, 300);
        	l24.setVisible(false);

        	l25 = new JLabel(new ImageIcon(img25));
        	l25.setBounds(950, 305, 600, 300);
        	l25.setVisible(false);

        	l30 = new JLabel(new ImageIcon(img30));
            l30.setBounds(500, 160, 600, 300);
            l30.setVisible(false);

            l31 = new JLabel(new ImageIcon(img31));
            l31.setBounds(900, 30, 200, 300);
            l31.setVisible(false);

            l32 = new JLabel(new ImageIcon(img32));
            l32.setBounds(920, 160, 200, 300);
            l32.setVisible(false);

            l34 = new JLabel(new ImageIcon(img34));
            l34.setBounds(1000, 155, 200, 300);
            l34.setVisible(false);

            l35 = new JLabel(new ImageIcon(img35));
            l35.setBounds(1120, 150, 200, 300);
            l35.setVisible(false);

            l40 = new JLabel(new ImageIcon(img40));
            l40.setBounds(500, 170, 600, 300);
            l40.setVisible(false);

            l41 = new JLabel(new ImageIcon(img41));
            l41.setBounds(895, 160, 200, 300);
            l41.setVisible(false);

            l42 = new JLabel(new ImageIcon(img42));
            l42.setBounds(900, 345, 200, 300);
            l42.setVisible(false);

            l43 = new JLabel(new ImageIcon(img43));
            l43.setBounds(1020, 155, 200, 300);
            l43.setVisible(false);

            l45 = new JLabel(new ImageIcon(img45));
            l45.setBounds(1110, 300, 200, 300);
            l45.setVisible(false);

            l50 = new JLabel(new ImageIcon(img50));
            l50.setBounds(730, 190, 600, 300);
            l50.setVisible(false);

            l51 = new JLabel(new ImageIcon(img51));
            l51.setBounds(710, 15, 600, 300);
            l51.setVisible(false);

            l52 = new JLabel(new ImageIcon(img52));
            l52.setBounds(650, 310, 600, 300);
            l52.setVisible(false);

            l53 = new JLabel(new ImageIcon(img53));
            l53.setBounds(1125, 125, 200, 300);
            l53.setVisible(false);

            l54 = new JLabel(new ImageIcon(img54));
            l54.setBounds(1100, 290, 200, 300);
            l54.setVisible(false);

    	} catch(IOException ex) {
    		System.out.println("An error occurred.");
      		ex.printStackTrace();
    	}

   		itf1 = new JTextField("0");  
    	itf1.setBounds(100, 200, 50, 30);
        itf1.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf2 = new JTextField("2");  
    	itf2.setBounds(100, 250, 50, 30);
        itf2.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf3 = new JTextField("2");  
    	itf3.setBounds(100, 300, 50, 30);
        itf3.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf4 = new JTextField("1");  
    	itf4.setBounds(100, 350, 50, 30);
        itf4.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf5 = new JTextField("2");  
    	itf5.setBounds(100, 400, 50, 30);
        itf5.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf6 = new JTextField("4");  
    	itf6.setBounds(100, 450, 50, 30);
        itf6.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf7 = new JTextField("3");  
    	itf7.setBounds(100, 500, 50, 30);
        itf7.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf8 = new JTextField("3");  
    	itf8.setBounds(100, 550, 50, 30);
        itf8.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf9 = new JTextField("4");  
    	itf9.setBounds(100, 600, 50, 30);
        itf9.setFont(new Font("Verdana", Font.PLAIN, 18));

    	itf10 = new JTextField("0");  
    	itf10.setBounds(100, 650, 50, 30);
        itf10.setFont(new Font("Verdana", Font.PLAIN, 18)); 

    	itf11 = new JTextField("1");
        itf11.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	itf11.setBounds(200, 200, 50, 30); 

    	itf12 = new JTextField("0");  
        itf12.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf12.setBounds(200, 250, 50, 30); 

    	itf13 = new JTextField("1");  
        itf13.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf13.setBounds(200, 300, 50, 30); 

    	itf14 = new JTextField("3");  
        itf14.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf14.setBounds(200, 350, 50, 30); 

    	itf15 = new JTextField("3");  
        itf15.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf15.setBounds(200, 400, 50, 30); 

    	itf16 = new JTextField("2");  
        itf16.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf16.setBounds(200, 450, 50, 30); 

    	itf17 = new JTextField("4");  
        itf17.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf17.setBounds(200, 500, 50, 30); 

    	itf18 = new JTextField("5");  
        itf18.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf18.setBounds(200, 550, 50, 30); 

    	itf19 = new JTextField("5");  
        itf19.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf19.setBounds(200, 600, 50, 30); 

    	itf20 = new JTextField("0");  
        itf20.setFont(new Font("Verdana", Font.PLAIN, 18));
    	itf20.setBounds(200, 650, 50, 30);  

    	ol1 = new JLabel();
        ol1.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol1.setBounds(700, 300, 50, 30);

    	ol2 = new JLabel();
        ol2.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol2.setBounds(900, 150, 50, 30);

    	ol3 = new JLabel();
        ol3.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol3.setBounds(900, 450, 50, 30);

    	ol4 = new JLabel();
        ol4.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol4.setBounds(1100, 150, 50, 30);

    	ol5 = new JLabel();
        ol5.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol5.setBounds(1100, 450, 50, 30);

    	ol6 = new JLabel();
        ol6.setFont(new Font("Verdana", Font.PLAIN, 18));  
    	ol6.setBounds(1300, 300, 50, 30);

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
        		
        		mainCounter = mainCounter - (2 * v);
        		ekAurCounter = ekAurCounter - 2;

        		if(index1[mainCounter] == 1) {
                    ol1.setForeground(Color.orange);
                } else if(index1[mainCounter] == 0){
                    ol1.setForeground(Color.black);
                } else if(index1[mainCounter] == -1){
                	ol1.setForeground(Color.red);
            	}
            	if(index1[mainCounter + 1] == 1) {
                    ol2.setForeground(Color.orange);
                } else if(index1[mainCounter + 1] == 0) {
                    ol2.setForeground(Color.black);
                } else if(index1[mainCounter + 1] == -1) {
                	ol2.setForeground(Color.red);
            	}
            	if(index1[mainCounter + 2] == 1) {
                    ol3.setForeground(Color.orange);
                } else if(index1[mainCounter + 2] == 0) {
                    ol3.setForeground(Color.black);
                } else if(index1[mainCounter + 2] == -1) {
                	ol3.setForeground(Color.red);
            	}
            	if(index1[mainCounter + 3] == 1) {
                    ol4.setForeground(Color.orange);
                } else if(index1[mainCounter + 3] == 0) {
                    ol4.setForeground(Color.black);
                } else if(index1[mainCounter + 3] == -1) {
                	ol4.setForeground(Color.red);
            	}
            	if(index1[mainCounter + 4] == 1) {
                    ol5.setForeground(Color.orange);
                } else if(index1[mainCounter + 4] == 0) {
                    ol5.setForeground(Color.black);
                } else if(index1[mainCounter + 4] == -1) {
                	ol5.setForeground(Color.red);
            	}
            	if(index1[mainCounter + 5] == 1) {
                    ol6.setForeground(Color.orange);
                } else if(index1[mainCounter + 5] == 0) {
                    ol6.setForeground(Color.black);
                } else if(index1[mainCounter + 5] == -1) {
                	ol6.setForeground(Color.red);
            	}

            	prompt.setText("Current Vertex : " + Integer.toString(index[ekAurCounter]));

            	ekAurCounter = ekAurCounter + 1;
        		mainCounter = mainCounter + v;
                check(mainCounter, counter);
            
            }
        });

    	b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(index1[mainCounter] == 1) {
                    ol1.setForeground(Color.cyan);
                } else if(index1[mainCounter] == 0){
                    ol1.setForeground(Color.black);
                } else if(index1[mainCounter] == -1){
                	ol1.setForeground(Color.green);
            	}
            	if(index1[mainCounter + 1] == 1) {
                    ol2.setForeground(Color.cyan);
                } else if(index1[mainCounter + 1] == 0) {
                    ol2.setForeground(Color.black);
                } else if(index1[mainCounter + 1] == -1) {
                	ol2.setForeground(Color.green);
            	}
            	if(index1[mainCounter + 2] == 1) {
                    ol3.setForeground(Color.cyan);
                } else if(index1[mainCounter + 2] == 0) {
                    ol3.setForeground(Color.black);
                } else if(index1[mainCounter + 2] == -1) {
                	ol3.setForeground(Color.green);
            	}
            	if(index1[mainCounter + 3] == 1) {
                    ol4.setForeground(Color.cyan);
                } else if(index1[mainCounter + 3] == 0) {
                    ol4.setForeground(Color.black);
                } else if(index1[mainCounter + 3] == -1) {
                	ol4.setForeground(Color.green);
            	}
            	if(index1[mainCounter + 4] == 1) {
                    ol5.setForeground(Color.cyan);
                } else if(index1[mainCounter + 4] == 0) {
                    ol5.setForeground(Color.black);
                } else if(index1[mainCounter + 4] == -1) {
                	ol5.setForeground(Color.green);
            	}
            	if(index1[mainCounter + 5] == 1) {
                    ol6.setForeground(Color.cyan);
                } else if(index1[mainCounter + 5] == 0) {
                    ol6.setForeground(Color.black);
                } else if(index1[mainCounter + 5] == -1) {
                	ol6.setForeground(Color.green);
            	}

            	prompt.setText("Current Vertex : " + Integer.toString(index[ekAurCounter]));

        		mainCounter = mainCounter + v;
        		ekAurCounter = ekAurCounter + 1;
                check(mainCounter, counter);
            
            }
        });

    	b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new DFSQuiz();
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
                
                v = Integer.parseInt(vertexNum.getText());
                startingVertex = Integer.parseInt(starting.getText());

                if(countDistinct() > 6) {
                	b5.setEnabled(false);
                	b6.setEnabled(true);
                	prompt.setText("<html>Number of Edges<br> must be less than 6</html>");
                } else {

                	showLines();
	                for(int i = 0; i < 10; i++) {
    	                adjList[i] = new LinkedList<Integer>();
        	        }

	                for(int i = 0; i < 10; i++) {
    	                int x = input[i][0];
        	            int y = input[i][1];
            	        addEdge(x, y);
                	}
                	mainCounter = v;

                	for(int i = 0; i < v; i ++) {
                		index1[counter] = 0;
                		counter = counter + 1;
                	}
                	index[z] = -1;
                	z = z + 1; 

                	myDFS(v, startingVertex);

                	prompt.setText("Current Vertex : " + Integer.toString(index[ekAurCounter]));
                	ekAurCounter = ekAurCounter + 1;

	                check(mainCounter, counter);
    	            ol1.setText("0");
        			ol2.setText("1");
        			ol3.setText("2");
        			ol4.setText("3");
	        		ol5.setText("4");
    	    		ol6.setText("5");
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
            	    starting.setEditable(false);
            	    vertexNum.setEditable(false);
                	b6.setEnabled(true);
            	}
        	}
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                itf1.setText("0");
                itf2.setText("2");
                itf3.setText("2");
                itf4.setText("1");
                itf5.setText("2");
                itf6.setText("4");
                itf7.setText("3");
                itf8.setText("3");
                itf9.setText("4");
                itf10.setText("0");
                itf11.setText("1");
                itf12.setText("0");
                itf13.setText("1");
                itf14.setText("3");
                itf15.setText("3");
                itf16.setText("2");
                itf17.setText("4");
                itf18.setText("5");
                itf19.setText("5");
                itf20.setText("0");
                starting.setText("2");
                vertexNum.setText("6");
                ol1.setText("");
                ol2.setText("");
                ol3.setText("");
                ol4.setText("");
                ol5.setText("");
                ol6.setText("");
                prompt.setText("");
                ol1.setForeground(Color.black);
                ol2.setForeground(Color.black);
                ol3.setForeground(Color.black);
                ol4.setForeground(Color.black);
                ol5.setForeground(Color.black);
                ol6.setForeground(Color.black);
                mainCounter = 0;
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
                itf12.setEditable(true);
                itf13.setEditable(true);
                itf14.setEditable(true);
                itf15.setEditable(true);
                itf16.setEditable(true);
                itf17.setEditable(true);
                itf18.setEditable(true);
                itf19.setEditable(true);
                itf20.setEditable(true);
                starting.setEditable(true);
                vertexNum.setEditable(true);
                l01.setVisible(false);
                l02.setVisible(false);
                l03.setVisible(false);
                l04.setVisible(false);
                l05.setVisible(false);
                l10.setVisible(false);
                l12.setVisible(false);
                l13.setVisible(false);
                l14.setVisible(false);
                l15.setVisible(false);
                l20.setVisible(false);
                l21.setVisible(false);
                l23.setVisible(false);
                l24.setVisible(false);
                l25.setVisible(false);
                l30.setVisible(false);
                l31.setVisible(false);
                l32.setVisible(false);
                l34.setVisible(false);
                l35.setVisible(false);
                l40.setVisible(false);
                l41.setVisible(false);
                l42.setVisible(false);
                l43.setVisible(false);
                l45.setVisible(false);
                l50.setVisible(false);
                l51.setVisible(false);
                l52.setVisible(false);
                l53.setVisible(false);
                l54.setVisible(false);
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.add(l);
    	f.add(l1);
    	f.add(l2);
    	f.add(l3);
    	f.add(l4);
    	f.add(prompt);
    	f.add(l01);
    	f.add(l02);
    	f.add(l03);
    	f.add(l04);
    	f.add(l05);
    	f.add(l10);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(l15);
        f.add(l20);
        f.add(l21);
        f.add(l23);
        f.add(l24);
        f.add(l25);
        f.add(l30);
        f.add(l31);
        f.add(l32);
        f.add(l34);
        f.add(l35);
        f.add(l40);
        f.add(l41);
        f.add(l42);
        f.add(l43);
        f.add(l45);
        f.add(l50);
        f.add(l51);
        f.add(l52);
        f.add(l53);
        f.add(l54);
        f.add(starting);
        f.add(vertexNum);
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
    	f.add(ol1);
    	f.add(ol2);
    	f.add(ol3);
    	f.add(ol4);
    	f.add(ol5);
    	f.add(ol6);
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
        
        if(mainCounter >= v) {
            b2.setEnabled(true);
            b1.setEnabled(true); 
        } 
        
        if(mainCounter <= v) {
            b1.setEnabled(false);
        }
        
        if(mainCounter >= counter) {
            b2.setEnabled(false);
        }
    
    }

    public int countDistinct() {

    	int res = 1;
    	int[] myArr = new int[20];
    	
    	for(int i = 0; i < 10; i++) {
    		myArr[i] = input[i][0];
    	} 
    	
    	for(int i = 10; i < 20; i++) {
    		myArr[i] = input[i - 10][1];
    	}
    	
    	for (int i = 1; i < 20; i++) {
        	int j = 0;
        	for (j = 0; j < i; j++) {
            	if (myArr[i] == myArr[j]) {
                	break;
	            }
    	    }
        	if (i == j) {
            	res++;
        	}
    	}
    	return res;
    }

    public void showLines() {

    	for(int i = 0; i < 10; i++) {
    		int a = input[i][0];
    		int b = input[i][1];
    		
    		if(a == 0) {
    			if(b == 1) {
    				l01.setVisible(true);
    			} else if(b == 2) {
    				l02.setVisible(true);
    			} else if(b == 3) {
    				l03.setVisible(true);
    			} else if(b == 4) {
    				l04.setVisible(true);
    			} else if(b == 5) {
    				l05.setVisible(true);
    			}
    		} else if(a == 1) {
    			if(b == 0) {
    				l10.setVisible(true);
    			} else if(b == 2) {
    				l12.setVisible(true);
    			} else if(b == 3) {
    				l13.setVisible(true);
    			} else if(b == 4) {
    				l14.setVisible(true);
    			} else if(b == 5) {
    				l15.setVisible(true);
    			}
    		} else if(a == 2) {
    			if(b == 0) {
    				l20.setVisible(true);
    			} else if(b == 1) {
    				l21.setVisible(true);
    			} else if(b == 3) {
    				l23.setVisible(true);
    			} else if(b == 4) {
    				l24.setVisible(true);
    			} else if(b == 5) {
    				l25.setVisible(true);
    			}
    		} else if(a == 3) {
    			if(b == 0) {
    				l30.setVisible(true);
    			} else if(b == 1) {
    				l31.setVisible(true);
    			} else if(b == 2) {
    				l32.setVisible(true);
    			} else if(b == 4) {
    				l34.setVisible(true);
    			} else if(b == 5) {
    				l35.setVisible(true);
    			}
    		} else if(a == 4) {
    			if(b == 0) {
    				l40.setVisible(true);
    			} else if(b == 1) {
    				l41.setVisible(true);
    			} else if(b == 2) {
    				l42.setVisible(true);
    			} else if(b == 3) {
    				l43.setVisible(true);
    			} else if(b == 5) {
    				l45.setVisible(true);
    			}
    		} else if(a == 5) {
    			if(b == 0) {
    				l50.setVisible(true);
    			} else if(b == 1) {
    				l51.setVisible(true);
    			} else if(b == 2) {
    				l52.setVisible(true);
    			} else if(b == 3) {
    				l53.setVisible(true);
    			} else if(b == 4) {
    				l54.setVisible(true);
    			}
    		}
    	}
    }

    public void addEdge(int x, int y) {
        adjList[x].add(y);
    }

    void DFSutil(int s, int visited[]) {
        visited[s] = 1;
        index[z] = s;
        z = z + 1;

        for (int i = 0; i < v; i++) {
            index1[counter] = visited[i];
            counter = counter + 1;
        }
        
        if(adjList[s].size() == 0) {
            visited[s] = -1;
            for (int i = 0; i < v; i++) {
            	index1[counter] = visited[i];
            	counter = counter + 1;
        	}
        	index[z] = s;
        	z = z + 1;
            return;
        }

        for (int i = 0; i <= adjList[s].size(); i++){

            if(i < adjList[s].size()) {
                int x = adjList[s].get(i);
                if (visited[x] == 0) {
                    DFSutil(x, visited);
                }
            } else{
                index[z] = s;
                z = z + 1;
                visited[s] = -1;
                for (int j = 0; j < v; j++) {
                    index1[counter] = visited[j];
                    counter = counter + 1;
                }
            }
        }
    }

    void myDFS(int v,int s) {
        int[] visited = new int[v];

        for (int i = 0; i < v; i++){
            visited[i] = 0;
        }

        DFSutil(s, visited);      
        for (int i = 0; i < v; i++){
            if(visited[i] == 0){
                visited[i] = -1;
                index[z] = i;
                z = z + 1;
                DFSutil(i, visited);
            }
        }
    }
}