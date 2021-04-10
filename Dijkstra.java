import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Dijkstra {

    JFrame f;
    JLabel l0110, l0220, l0330, l0440, l0550, l1221, l1331, l1441, l1551, l2332, l2442, l2552, l3443, l3553, l4554 ;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10, itf11, itf12, itf13, itf14, itf15, itf16, itf17, itf18, itf19, itf20, itf21, itf22, itf23, itf24, itf25, itf26, itf27, itf28, itf29, itf30, starting, vertexNum;  
    JLabel ol1, ol2, ol3, ol4, ol5, ol6, ol0110, ol0220, ol0330, ol0440, ol0550, ol1221, ol1331, ol1441, ol1551, ol2332, ol2442, ol2552, ol3443, ol3553, ol4554;
    JLabel l, l1, l2, l3, l4, prompt1, prompt2, prompt3, prompt4, prompt5, prompt6;

    int[][] input = new int[10][10];
    int[][] arr = new int[6][6];
    int[] mainArr = new int[600];
    int v, startingVertex;
    int[] index2 = new int[60];
    int[] index1 = new int[60];
    int[] index = new int[60];
    int counter = 0, mainCounter = 0, z = 0, ekAurCounter = 0;

    public Dijkstra() {
        
        f = new JFrame("Dijkstra's Algorithm");

        l = new JLabel("Dijkstra's Algorithm", JLabel.CENTER);
        l.setFont(new Font("Verdana", Font.PLAIN, 36));
        l.setBounds(490, 50, 400, 60);

        l1 = new JLabel("Enter the Edges and Weights: ");
        l1.setFont(new Font("Verdana", Font.PLAIN, 18));  
        l1.setBounds(25, 150, 300, 30);

        l2 = new JLabel("Enter the Starting Vertex : ");
        l2.setFont(new Font("Verdana", Font.PLAIN, 18));  
        l2.setBounds(325, 250, 275, 30);

        starting = new JTextField("0");  
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

        prompt1 = new JLabel();
        prompt1.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt1.setBounds(640, 330, 80, 30);

        prompt2 = new JLabel();
        prompt2.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt2.setBounds(840, 120, 80, 30);

        prompt3 = new JLabel();
        prompt3.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt3.setBounds(880, 480, 80, 30);

        prompt4 = new JLabel();
        prompt4.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt4.setBounds(1120, 130, 80, 30);

        prompt5 = new JLabel();
        prompt5.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt5.setBounds(1080, 480, 80, 30);

        prompt6 = new JLabel();
        prompt6.setFont(new Font("Verdana", Font.PLAIN, 18));  
        prompt6.setBounds(1290, 330, 80, 30);

        try {
            
            BufferedImage img0110 = ImageIO.read(this.getClass().getResource("0110.png"));
            BufferedImage img0220 = ImageIO.read(this.getClass().getResource("0220.png"));
            BufferedImage img0330 = ImageIO.read(this.getClass().getResource("0330.png"));
            BufferedImage img0440 = ImageIO.read(this.getClass().getResource("0440.png"));
            BufferedImage img0550 = ImageIO.read(this.getClass().getResource("0550.png"));
            BufferedImage img1221 = ImageIO.read(this.getClass().getResource("1221.png"));
            BufferedImage img1331 = ImageIO.read(this.getClass().getResource("1331.png"));
            BufferedImage img1441 = ImageIO.read(this.getClass().getResource("1441.png"));
            BufferedImage img1551 = ImageIO.read(this.getClass().getResource("1551.png"));
            BufferedImage img2332 = ImageIO.read(this.getClass().getResource("2332.png"));
            BufferedImage img2442 = ImageIO.read(this.getClass().getResource("2442.png"));
            BufferedImage img2552 = ImageIO.read(this.getClass().getResource("2552.png"));
            BufferedImage img3443 = ImageIO.read(this.getClass().getResource("3443.png"));
            BufferedImage img3553 = ImageIO.read(this.getClass().getResource("3553.png"));
            BufferedImage img4554 = ImageIO.read(this.getClass().getResource("4554.png"));

            l0110 = new JLabel(new ImageIcon(img0110));
            l0110.setBounds(700, 150, 200, 300);
            l0110.setVisible(false);

            l0220 = new JLabel(new ImageIcon(img0220));
            l0220.setBounds(700, 300, 200, 300);
            l0220.setVisible(false);

            l0330 = new JLabel(new ImageIcon(img0330));
            l0330.setBounds(750, 140, 600, 300);
            l0330.setVisible(false);

            l0440 = new JLabel(new ImageIcon(img0440));
            l0440.setBounds(750, 182, 600, 300);
            l0440.setVisible(false);

            l0550 = new JLabel(new ImageIcon(img0550));
            l0550.setBounds(730, 175, 600, 300);
            l0550.setVisible(false);

            l1221 = new JLabel(new ImageIcon(img1221));
            l1221.setBounds(785, 155, 200, 300);
            l1221.setVisible(false);

            l1331 = new JLabel(new ImageIcon(img1331));
            l1331.setBounds(900, 10, 200, 300);
            l1331.setVisible(false);

            l1441 = new JLabel(new ImageIcon(img1441));
            l1441.setBounds(910, 150, 200, 300);
            l1441.setVisible(false);

            l1551 = new JLabel(new ImageIcon(img1551));
            l1551.setBounds(930, 25, 600, 300);
            l1551.setVisible(false);

            l2332 = new JLabel(new ImageIcon(img2332));
            l2332.setBounds(905, 150, 200, 300);
            l2332.setVisible(false);

            l2442 = new JLabel(new ImageIcon(img2442));
            l2442.setBounds(900, 325, 200, 300);
            l2442.setVisible(false);

            l2552 = new JLabel(new ImageIcon(img2552));
            l2552.setBounds(950, 305, 600, 300);
            l2552.setVisible(false);

            l3443 = new JLabel(new ImageIcon(img3443));
            l3443.setBounds(1000, 155, 200, 300);
            l3443.setVisible(false);

            l3553 = new JLabel(new ImageIcon(img3553));
            l3553.setBounds(1120, 150, 200, 300);
            l3553.setVisible(false);

            l4554 = new JLabel(new ImageIcon(img4554));
            l4554.setBounds(1110, 300, 200, 300);
            l4554.setVisible(false);

        } catch(IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }

        itf1 = new JTextField("0");  
        itf1.setBounds(50, 200, 50, 30);
        itf1.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf2 = new JTextField("2");  
        itf2.setBounds(50, 250, 50, 30);
        itf2.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf3 = new JTextField("2");  
        itf3.setBounds(50, 300, 50, 30);
        itf3.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf4 = new JTextField("1");  
        itf4.setBounds(50, 350, 50, 30);
        itf4.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf5 = new JTextField("2");  
        itf5.setBounds(50, 400, 50, 30);
        itf5.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf6 = new JTextField("4");  
        itf6.setBounds(50, 450, 50, 30);
        itf6.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf7 = new JTextField("3");  
        itf7.setBounds(50, 500, 50, 30);
        itf7.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf8 = new JTextField("3");  
        itf8.setBounds(50, 550, 50, 30);
        itf8.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf9 = new JTextField("4");  
        itf9.setBounds(50, 600, 50, 30);
        itf9.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf10 = new JTextField("0");  
        itf10.setBounds(50, 650, 50, 30);
        itf10.setFont(new Font("Verdana", Font.PLAIN, 18)); 

        itf11 = new JTextField("1");
        itf11.setFont(new Font("Verdana", Font.PLAIN, 18));  
        itf11.setBounds(150, 200, 50, 30); 

        itf12 = new JTextField("0");  
        itf12.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf12.setBounds(150, 250, 50, 30); 

        itf13 = new JTextField("1");  
        itf13.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf13.setBounds(150, 300, 50, 30); 

        itf14 = new JTextField("3");  
        itf14.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf14.setBounds(150, 350, 50, 30); 

        itf15 = new JTextField("3");  
        itf15.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf15.setBounds(150, 400, 50, 30); 

        itf16 = new JTextField("2");  
        itf16.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf16.setBounds(150, 450, 50, 30); 

        itf17 = new JTextField("4");  
        itf17.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf17.setBounds(150, 500, 50, 30); 

        itf18 = new JTextField("5");  
        itf18.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf18.setBounds(150, 550, 50, 30); 

        itf19 = new JTextField("5");  
        itf19.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf19.setBounds(150, 600, 50, 30); 

        itf20 = new JTextField("0");  
        itf20.setFont(new Font("Verdana", Font.PLAIN, 18));
        itf20.setBounds(150, 650, 50, 30);  

        itf21 = new JTextField("1");  
        itf21.setBounds(250, 200, 50, 30);
        itf21.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf22 = new JTextField("2");  
        itf22.setBounds(250, 250, 50, 30);
        itf22.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf23 = new JTextField("4");  
        itf23.setBounds(250, 300, 50, 30);
        itf23.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf24 = new JTextField("3");  
        itf24.setBounds(250, 350, 50, 30);
        itf24.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf25 = new JTextField("2");  
        itf25.setBounds(250, 400, 50, 30);
        itf25.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf26 = new JTextField("1");  
        itf26.setBounds(250, 450, 50, 30);
        itf26.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf27 = new JTextField("8");  
        itf27.setBounds(250, 500, 50, 30);
        itf27.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf28 = new JTextField("4");  
        itf28.setBounds(250, 550, 50, 30);
        itf28.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf29 = new JTextField("8");  
        itf29.setBounds(250, 600, 50, 30);
        itf29.setFont(new Font("Verdana", Font.PLAIN, 18));

        itf30 = new JTextField("0");  
        itf30.setBounds(250, 650, 50, 30);
        itf30.setFont(new Font("Verdana", Font.PLAIN, 18)); 

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
        ol6.setBounds(1305, 300, 50, 30);

        ol0110 = new JLabel();
        ol0110.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol0110.setBounds(765, 205, 50, 30);

        ol0220 = new JLabel();
        ol0220.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol0220.setBounds(750, 375, 50, 30);

        ol0330 = new JLabel();
        ol0330.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol0330.setBounds(900, 190, 50, 30);

        ol0440 = new JLabel();
        ol0440.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol0440.setBounds(950, 400, 50, 30);

        ol0550 = new JLabel();
        ol0550.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol0550.setBounds(930, 310, 50, 30);

        ol1221 = new JLabel();
        ol1221.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol1221.setBounds(835, 265, 50, 30);

        ol1331 = new JLabel();
        ol1331.setFont(new Font("Verdana", Font.PLAIN, 18));        
        ol1331.setBounds(980, 110, 50, 30);

        ol1441 = new JLabel();
        ol1441.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol1441.setBounds(930, 250, 50, 30);

        ol1551 = new JLabel();
        ol1551.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol1551.setBounds(1150, 250, 50, 30);

        ol2332 = new JLabel();
        ol2332.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol2332.setBounds(1030, 250, 50, 30);

        ol2442 = new JLabel();
        ol2442.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol2442.setBounds(970, 455, 50, 30);

        ol2552 = new JLabel();
        ol2552.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol2552.setBounds(1120, 340, 50, 30);

        ol3443 = new JLabel();
        ol3443.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol3443.setBounds(1110, 205, 50, 30);

        ol3553 = new JLabel();
        ol3553.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol3553.setBounds(1230, 80, 200, 300);

        ol4554 = new JLabel();
        ol4554.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol4554.setBounds(1210, 260, 200, 300);      

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
                
                mainCounter = mainCounter - 1;
                ekAurCounter = ekAurCounter - 6;

                if(index1[mainCounter] == 0 && index[mainCounter] == 1) {
                    ol1.setForeground(Color.red);
                    ol2.setForeground(Color.red);
                    ol0110.setForeground(Color.red);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 2) {
                    ol1.setForeground(Color.red);
                    ol3.setForeground(Color.red);
                    ol0220.setForeground(Color.red);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 3) {
                    ol1.setForeground(Color.red);
                    ol4.setForeground(Color.red);
                    ol0330.setForeground(Color.red);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 4) {
                    ol1.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol0440.setForeground(Color.red);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 5) {
                    ol1.setForeground(Color.red);
                    ol6.setForeground(Color.red);
                    ol0550.setForeground(Color.red);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 0) {
                    ol2.setForeground(Color.red);
                    ol1.setForeground(Color.red);
                    ol0110.setForeground(Color.red);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 2) {
                    ol2.setForeground(Color.red);
                    ol3.setForeground(Color.red);
                    ol1221.setForeground(Color.red);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 3) {
                    ol2.setForeground(Color.red);
                    ol4.setForeground(Color.red);
                    ol1331.setForeground(Color.red);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 4) {
                    ol2.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol1441.setForeground(Color.red);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 5) {
                    ol2.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol1551.setForeground(Color.red);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 0) {
                    ol3.setForeground(Color.red);
                    ol1.setForeground(Color.red);
                    ol0220.setForeground(Color.red);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 1) {
                    ol3.setForeground(Color.red);
                    ol2.setForeground(Color.red);
                    ol1221.setForeground(Color.red);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 3) {
                    ol3.setForeground(Color.red);
                    ol4.setForeground(Color.red);
                    ol2332.setForeground(Color.red);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 4) {
                    ol3.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol2442.setForeground(Color.red);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 5) {
                    ol3.setForeground(Color.red);
                    ol6.setForeground(Color.red);
                    ol2552.setForeground(Color.red);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 0) {
                    ol4.setForeground(Color.red);
                    ol1.setForeground(Color.red);
                    ol0330.setForeground(Color.red);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 1) {
                    ol4.setForeground(Color.red);
                    ol2.setForeground(Color.red);
                    ol1331.setForeground(Color.red);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 2) {
                    ol4.setForeground(Color.red);
                    ol3.setForeground(Color.red);
                    ol2332.setForeground(Color.red);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 4) {
                    ol4.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol3443.setForeground(Color.red);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 5) {
                    ol4.setForeground(Color.red);
                    ol6.setForeground(Color.red);
                    ol3553.setForeground(Color.red);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 0) {
                    ol5.setForeground(Color.red);
                    ol1.setForeground(Color.red);
                    ol0440.setForeground(Color.red);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 1) {
                    ol5.setForeground(Color.red);
                    ol2.setForeground(Color.red);
                    ol1441.setForeground(Color.red);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 2) {
                    ol5.setForeground(Color.red);
                    ol3.setForeground(Color.red);
                    ol2442.setForeground(Color.red);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 3) {
                    ol5.setForeground(Color.red);
                    ol4.setForeground(Color.red);
                    ol3443.setForeground(Color.red);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 5) {
                    ol5.setForeground(Color.red);
                    ol6.setForeground(Color.red);
                    ol4554.setForeground(Color.red);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 0) {
                    ol6.setForeground(Color.red);
                    ol1.setForeground(Color.red);
                    ol0550.setForeground(Color.red);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 1) {
                    ol6.setForeground(Color.red);
                    ol2.setForeground(Color.red);
                    ol1551.setForeground(Color.red);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 2) {
                    ol6.setForeground(Color.red);
                    ol3.setForeground(Color.red);
                    ol2552.setForeground(Color.red);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 3) {
                    ol6.setForeground(Color.red);
                    ol4.setForeground(Color.red);
                    ol3553.setForeground(Color.red);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 4) {
                    ol6.setForeground(Color.red);
                    ol5.setForeground(Color.red);
                    ol4554.setForeground(Color.red);
                }

                prompt1.setText("SD: " + Integer.toString(mainArr[ekAurCounter]));
                prompt2.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 1]));
                prompt3.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 2]));
                prompt4.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 3]));
                prompt5.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 4]));
                prompt6.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 5]));


                check(mainCounter, counter);
            
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(index1[mainCounter] == 0 && index[mainCounter] == 1) {
                    ol1.setForeground(Color.green);
                    ol2.setForeground(Color.green);
                    ol0110.setForeground(Color.green);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 2) {
                    ol1.setForeground(Color.green);
                    ol3.setForeground(Color.green);
                    ol0220.setForeground(Color.green);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 3) {
                    ol1.setForeground(Color.green);
                    ol4.setForeground(Color.green);
                    ol0330.setForeground(Color.green);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 4) {
                    ol1.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol0440.setForeground(Color.green);
                }
                if(index1[mainCounter] == 0 && index[mainCounter] == 5) {
                    ol1.setForeground(Color.green);
                    ol6.setForeground(Color.green);
                    ol0550.setForeground(Color.green);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 0) {
                    ol2.setForeground(Color.green);
                    ol1.setForeground(Color.green);
                    ol0110.setForeground(Color.green);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 2) {
                    ol2.setForeground(Color.green);
                    ol3.setForeground(Color.green);
                    ol1221.setForeground(Color.green);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 3) {
                    ol2.setForeground(Color.green);
                    ol4.setForeground(Color.green);
                    ol1331.setForeground(Color.green);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 4) {
                    ol2.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol1441.setForeground(Color.green);
                }
                if(index1[mainCounter] == 1 && index[mainCounter] == 5) {
                    ol2.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol1551.setForeground(Color.green);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 0) {
                    ol3.setForeground(Color.green);
                    ol1.setForeground(Color.green);
                    ol0220.setForeground(Color.green);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 1) {
                    ol3.setForeground(Color.green);
                    ol2.setForeground(Color.green);
                    ol1221.setForeground(Color.green);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 3) {
                    ol3.setForeground(Color.green);
                    ol4.setForeground(Color.green);
                    ol2332.setForeground(Color.green);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 4) {
                    ol3.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol2442.setForeground(Color.green);
                }
                if(index1[mainCounter] == 2 && index[mainCounter] == 5) {
                    ol3.setForeground(Color.green);
                    ol6.setForeground(Color.green);
                    ol2552.setForeground(Color.green);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 0) {
                    ol4.setForeground(Color.green);
                    ol1.setForeground(Color.green);
                    ol0330.setForeground(Color.green);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 1) {
                    ol4.setForeground(Color.green);
                    ol2.setForeground(Color.green);
                    ol1331.setForeground(Color.green);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 2) {
                    ol4.setForeground(Color.green);
                    ol3.setForeground(Color.green);
                    ol2332.setForeground(Color.green);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 4) {
                    ol4.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol3443.setForeground(Color.green);
                }
                if(index1[mainCounter] == 3 && index[mainCounter] == 5) {
                    ol4.setForeground(Color.green);
                    ol6.setForeground(Color.green);
                    ol3553.setForeground(Color.green);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 0) {
                    ol5.setForeground(Color.green);
                    ol1.setForeground(Color.green);
                    ol0440.setForeground(Color.green);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 1) {
                    ol5.setForeground(Color.green);
                    ol2.setForeground(Color.green);
                    ol1441.setForeground(Color.green);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 2) {
                    ol5.setForeground(Color.green);
                    ol3.setForeground(Color.green);
                    ol2442.setForeground(Color.green);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 3) {
                    ol5.setForeground(Color.green);
                    ol4.setForeground(Color.green);
                    ol3443.setForeground(Color.green);
                }
                if(index1[mainCounter] == 4 && index[mainCounter] == 5) {
                    ol5.setForeground(Color.green);
                    ol6.setForeground(Color.green);
                    ol4554.setForeground(Color.green);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 0) {
                    ol6.setForeground(Color.green);
                    ol1.setForeground(Color.green);
                    ol0550.setForeground(Color.green);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 1) {
                    ol6.setForeground(Color.green);
                    ol2.setForeground(Color.green);
                    ol1551.setForeground(Color.green);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 2) {
                    ol6.setForeground(Color.green);
                    ol3.setForeground(Color.green);
                    ol2552.setForeground(Color.green);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 3) {
                    ol6.setForeground(Color.green);
                    ol4.setForeground(Color.green);
                    ol3553.setForeground(Color.green);
                }
                if(index1[mainCounter] == 5 && index[mainCounter] == 4) {
                    ol6.setForeground(Color.green);
                    ol5.setForeground(Color.green);
                    ol4554.setForeground(Color.green);
                }

                prompt1.setText("SD: " + Integer.toString(mainArr[ekAurCounter]));
                prompt2.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 1]));
                prompt3.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 2]));
                prompt4.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 3]));
                prompt5.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 4]));
                prompt6.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 5]));

                mainCounter = mainCounter + 1;
                ekAurCounter = ekAurCounter + v;
                check(mainCounter, counter);
            
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new DijkstraQuiz();
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
                input[0][2] = Integer.parseInt(itf21.getText());
                input[1][2] = Integer.parseInt(itf22.getText());
                input[2][2] = Integer.parseInt(itf23.getText());
                input[3][2] = Integer.parseInt(itf24.getText());
                input[4][2] = Integer.parseInt(itf25.getText());
                input[5][2] = Integer.parseInt(itf26.getText());
                input[6][2] = Integer.parseInt(itf27.getText());
                input[7][2] = Integer.parseInt(itf28.getText());
                input[8][2] = Integer.parseInt(itf29.getText());
                input[9][2] = Integer.parseInt(itf30.getText());
                
                v = Integer.parseInt(vertexNum.getText());
                startingVertex = Integer.parseInt(starting.getText());

                if(countDistinct() > 6) {
                    b5.setEnabled(false);
                    b6.setEnabled(true);
                    prompt1.setText("<html>Number of Edges<br> must be less than 6</html>");
                } else {

                    showLines();
                    
                    for(int i = 0; i < 10; i++) {
                        arr[input[i][0]][input[i][1]] = input[i][2];
                        arr[input[i][1]][input[i][0]] = input[i][2];
                    }

                    for(int i = 0; i < v; i++) {
                        if(i == startingVertex) {
                            mainArr[z] = 0;
                            z = z + 1;
                        } else {
                            mainArr[z] = 100;
                            z = z + 1;
                        }
                    }

                    index[counter] = -1;
                    index1[counter] = -1;
                    index2[counter] = -1;
                    counter = counter + 1;

                    myDjikstra(arr, v, startingVertex);

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
                    itf21.setEditable(false);
                    itf22.setEditable(false);
                    itf23.setEditable(false);
                    itf24.setEditable(false);
                    itf25.setEditable(false);
                    itf26.setEditable(false);
                    itf27.setEditable(false);
                    itf28.setEditable(false);
                    itf29.setEditable(false);
                    itf30.setEditable(false);
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
                itf21.setText("1");
                itf22.setText("2");
                itf23.setText("4");
                itf24.setText("3");
                itf25.setText("2");
                itf26.setText("1");
                itf27.setText("8");
                itf28.setText("4");
                itf29.setText("8");
                itf30.setText("0");
                starting.setText("0");
                vertexNum.setText("6");
                ol1.setText("");
                ol2.setText("");
                ol3.setText("");
                ol4.setText("");
                ol5.setText("");
                ol6.setText("");
                ol0110.setText("");
                ol0220.setText("");
                ol0330.setText("");
                ol0440.setText("");
                ol0550.setText("");
                ol1221.setText("");
                ol1331.setText("");
                ol1441.setText("");
                ol1551.setText("");
                ol2332.setText("");
                ol2442.setText("");
                ol2552.setText("");
                ol3443.setText("");
                ol3553.setText("");
                ol4554.setText("");
                prompt1.setText("");
                prompt2.setText("");
                prompt3.setText("");
                prompt4.setText("");
                prompt5.setText("");
                prompt6.setText("");
                ol1.setForeground(Color.black);
                ol2.setForeground(Color.black);
                ol3.setForeground(Color.black);
                ol4.setForeground(Color.black);
                ol5.setForeground(Color.black);
                ol6.setForeground(Color.black);
                ol0110.setForeground(Color.black);
                ol0220.setForeground(Color.black);
                ol0330.setForeground(Color.black);
                ol0440.setForeground(Color.black);
                ol0550.setForeground(Color.black);
                ol1221.setForeground(Color.black);
                ol1331.setForeground(Color.black);
                ol1441.setForeground(Color.black);
                ol1551.setForeground(Color.black);
                ol2332.setForeground(Color.black);
                ol2442.setForeground(Color.black);
                ol2552.setForeground(Color.black);
                ol3443.setForeground(Color.black);
                ol3553.setForeground(Color.black);
                ol4554.setForeground(Color.black);
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
                itf21.setEditable(true);
                itf22.setEditable(true);
                itf23.setEditable(true);
                itf24.setEditable(true);
                itf25.setEditable(true);
                itf26.setEditable(true);
                itf27.setEditable(true);
                itf28.setEditable(true);
                itf29.setEditable(true);
                itf30.setEditable(true);
                starting.setEditable(true);
                vertexNum.setEditable(true);
                l0110.setVisible(false);
                l0220.setVisible(false);
                l0330.setVisible(false);
                l0440.setVisible(false);
                l0550.setVisible(false);
                l1221.setVisible(false);
                l1331.setVisible(false);
                l1441.setVisible(false);
                l1551.setVisible(false);
                l2332.setVisible(false);
                l2442.setVisible(false);
                l2552.setVisible(false);
                l3443.setVisible(false);
                l3553.setVisible(false);
                l4554.setVisible(false);
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
        f.add(prompt1);
        f.add(prompt2);
        f.add(prompt3);
        f.add(prompt4);
        f.add(prompt5);
        f.add(prompt6);
        f.add(l0110);
        f.add(l0220);
        f.add(l0330);
        f.add(l0440);
        f.add(l0550);
        f.add(l1221);
        f.add(l1331);
        f.add(l1441);
        f.add(l1551);
        f.add(l2332);
        f.add(l2442);
        f.add(l2552);
        f.add(l3443);
        f.add(l3553);
        f.add(l4554);
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
        f.add(itf21);
        f.add(itf22);
        f.add(itf23);
        f.add(itf24);
        f.add(itf25);
        f.add(itf26);
        f.add(itf27);
        f.add(itf28);
        f.add(itf29);
        f.add(itf30);   
        f.add(ol1);
        f.add(ol2);
        f.add(ol3);
        f.add(ol4);
        f.add(ol5);
        f.add(ol6);
        f.add(ol0110);
        f.add(ol0220);
        f.add(ol0330);
        f.add(ol0440);
        f.add(ol0550);
        f.add(ol1221);
        f.add(ol1331);
        f.add(ol1441);
        f.add(ol1551);
        f.add(ol2332);
        f.add(ol2442);
        f.add(ol2552);
        f.add(ol3443);
        f.add(ol3553);
        f.add(ol4554);
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
        
        if(mainCounter >= 0) {
            b2.setEnabled(true);
            b1.setEnabled(true); 
        } 
        
        if(mainCounter <= 0) {
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
                    l0110.setVisible(true);
                    ol0110.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l0220.setVisible(true);
                    ol0220.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l0330.setVisible(true);
                    ol0330.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l0440.setVisible(true);
                    ol0440.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l0550.setVisible(true);
                    ol0550.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 1) {
                if(b == 0) {
                    l0110.setVisible(true);
                    ol0110.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l1221.setVisible(true);
                    ol1221.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l1331.setVisible(true);
                    ol1331.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l1441.setVisible(true);
                    ol1441.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l1551.setVisible(true);
                    ol1551.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 2) {
                if(b == 0) {
                    l0220.setVisible(true);
                    ol0220.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l1221.setVisible(true);
                    ol1221.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l2332.setVisible(true);
                    ol2332.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l2442.setVisible(true);
                    ol2442.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l2552.setVisible(true);
                    ol2552.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 3) {
                if(b == 0) {
                    l0330.setVisible(true);
                    ol0330.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l1331.setVisible(true);
                    ol1331.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l2332.setVisible(true);
                    ol2332.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l3443.setVisible(true);
                    ol3443.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l3553.setVisible(true);
                    ol3553.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 4) {
                if(b == 0) {
                    l0440.setVisible(true);
                    ol0440.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l1441.setVisible(true);
                    ol1441.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l2442.setVisible(true);
                    ol2442.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l3443.setVisible(true);
                    ol3443.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l4554.setVisible(true);
                    ol4554.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 5) {
                if(b == 0) {
                    l0550.setVisible(true);
                    ol0550.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l1551.setVisible(true);
                    ol1551.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l2552.setVisible(true);
                    ol2552.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l3553.setVisible(true);
                    ol3553.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l4554.setVisible(true);
                    ol4554.setText(Integer.toString(input[i][2]));
                }
            }
        }
    }

    int minKey(int key[], boolean visited[], int v) {
        int min = 1000000000;
        int index = 0;
        for(int i = 0; i < v; i++) {
            if(!visited[i] && key[i] < min) {
                min = key[i];
                index = i;
            }
        }
        return index;
    }

    void myDjikstra(int arr[][], int v, int s) {
        int parent[] = new int[v];
        int key[] = new int[v];
        boolean visited[] = new boolean[v];
        int[] src = new int[v];
        int[] dest = new int[v];

        for(int i = 0; i < v; i++) {
            key[i] = 100;
            visited[i] = false;
            parent[i] = -1;
        }
        key[s] = 0;

        for(int i = 0; i < v; i++) {
            int in = minKey(key,visited,v);
            visited[in] = true;
            for(int j = 0; j < v; j++) {
                if(arr[in][j] != 0 && !visited[j] && key[in] != 100 && arr[in][j] + key[in] < key[j]) {
                    parent[j] = in;
                    key[j] = key[in] + arr[in][j];
                }   
            }
            for(int l = 0; l < v; l++) {
                mainArr[z] = key[l];
                z = z + 1;
            }
            dest[i] = in;
            src[i] = parent[in];
        }

        int dist = 0;
        for(int i = 1; i < v; i++) {
            index[counter] = src[i];
            index1[counter] = dest[i];
            index2[counter] = key[dest[i]];
            counter = counter + 1;
        }
    }

}