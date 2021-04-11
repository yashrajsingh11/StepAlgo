import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;
import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class BellmanFord {

    JFrame f;
    JLabel l01, l02, l03, l04, l05, l10, l12, l13, l14, l15, l20, l21, l23, l24, l25, l30, l31, l32, l34, l35, l40, l41, l42, l43, l45, l50, l51, l52, l53, l54;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextField itf1, itf2, itf3, itf4, itf5, itf6, itf7, itf8, itf9, itf10, itf11, itf12, itf13, itf14, itf15, itf16, itf17, itf18, itf19, itf20, itf21, itf22, itf23, itf24, itf25, itf26, itf27, itf28, itf29, itf30, starting, vertexNum;  
    JLabel ol1, ol2, ol3, ol4, ol5, ol6, ol01, ol02, ol03, ol04, ol05, ol10, ol12, ol13, ol14, ol15, ol20, ol21, ol23, ol24, ol25, ol30, ol31, ol32, ol34, ol35, ol40, ol41, ol42, ol43, ol45, ol50, ol51, ol52, ol53, ol54;
    JLabel l, l1, l2, l3, l4, prompt1, prompt2, prompt3, prompt4, prompt5, prompt6;

    int[][] input = new int[10][10];
    int[][] arr = new int[6][6];
    int[] mainArr = new int[600];
    int[] temp = new int[600];
    int v, startingVertex;
    int counter = 0, ekAurCounter = 0;

    public BellmanFord() {
        
        f = new JFrame("Bellman-Ford's Algorithm");

        l = new JLabel("Bellman-Ford's Algorithm", JLabel.CENTER);
        l.setFont(new Font("Verdana", Font.PLAIN, 36));
        l.setBounds(390, 50, 600, 60);

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

        itf22 = new JTextField("-22");  
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

        ol01 = new JLabel();
        ol01.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol01.setBounds(765, 215, 50, 30);

        ol10 = new JLabel();
        ol10.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol10.setBounds(785, 195, 50, 30);

        ol02 = new JLabel();
        ol02.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol02.setBounds(780, 375, 50, 30);

        ol20 = new JLabel();
        ol20.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol20.setBounds(755, 385, 50, 30);

        ol03 = new JLabel();
        ol03.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol03.setBounds(855, 215, 50, 30);

        ol30 = new JLabel();
        ol30.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol30.setBounds(850, 245, 50, 30);

        ol04 = new JLabel();
        ol04.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol04.setBounds(970, 395, 50, 30);

        ol40 = new JLabel();
        ol40.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol40.setBounds(920, 375, 50, 30);

        ol05 = new JLabel();
        ol05.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol05.setBounds(920, 280, 50, 30);

        ol50 = new JLabel();
        ol50.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol50.setBounds(930, 320, 50, 30);

        ol12 = new JLabel();
        ol12.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol12.setBounds(865, 270, 50, 30);

        ol21 = new JLabel();
        ol21.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol21.setBounds(865, 340, 50, 30);

        ol13 = new JLabel();
        ol13.setFont(new Font("Verdana", Font.PLAIN, 18));        
        ol13.setBounds(980, 110, 50, 30);

        ol31 = new JLabel();
        ol31.setFont(new Font("Verdana", Font.PLAIN, 18));        
        ol31.setBounds(1000, 140, 50, 30);

        ol14 = new JLabel();
        ol14.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol14.setBounds(1050, 340, 50, 30);

        ol41 = new JLabel();
        ol41.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol41.setBounds(1000, 350, 50, 30);

        ol15 = new JLabel();
        ol15.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol15.setBounds(1150, 250, 50, 30);

        ol51 = new JLabel();
        ol51.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol51.setBounds(1180, 240, 50, 30);

        ol23 = new JLabel();
        ol23.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol23.setBounds(1000, 240, 50, 30);

        ol32 = new JLabel();
        ol32.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol32.setBounds(1040, 260, 50, 30);

        ol24 = new JLabel();
        ol24.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol24.setBounds(970, 455, 50, 30);

        ol42 = new JLabel();
        ol42.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol42.setBounds(990, 480, 50, 30);

        ol25 = new JLabel();
        ol25.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol25.setBounds(1135, 380, 50, 30);

        ol52 = new JLabel();
        ol52.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol52.setBounds(1135, 330, 50, 30);

        ol34 = new JLabel();
        ol34.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol34.setBounds(1080, 270, 50, 30);

        ol43 = new JLabel();
        ol43.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol43.setBounds(1130, 270, 50, 30);

        ol35 = new JLabel();
        ol35.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol35.setBounds(1230, 80, 200, 300);

        ol53 = new JLabel();
        ol53.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol53.setBounds(1240, 60, 200, 300);

        ol45 = new JLabel();
        ol45.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol45.setBounds(1210, 260, 200, 300);

        ol54 = new JLabel();
        ol54.setFont(new Font("Verdana", Font.PLAIN, 18));
        ol54.setBounds(1180, 230, 200, 300);      

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
                
                ekAurCounter = ekAurCounter - v;

                if(temp[0] != mainArr[ekAurCounter]) {
                    prompt1.setForeground(Color.red);
                } else {
                    prompt1.setForeground(Color.black);
                }
                if(temp[1] != mainArr[ekAurCounter + 1]) {
                    prompt2.setForeground(Color.red);
                } else {
                    prompt2.setForeground(Color.black);
                }
                if(temp[2] != mainArr[ekAurCounter + 2]) {
                    prompt3.setForeground(Color.red);
                } else {
                    prompt3.setForeground(Color.black);
                }
                if(temp[3] != mainArr[ekAurCounter + 3]) {
                    prompt4.setForeground(Color.red);
                } else {
                    prompt4.setForeground(Color.black);
                }
                if(temp[4] != mainArr[ekAurCounter + 4]) {
                    prompt5.setForeground(Color.red);
                } else {
                    prompt5.setForeground(Color.black);
                }
                if(temp[5] != mainArr[ekAurCounter + 5]) {
                    prompt6.setForeground(Color.red);
                } else {
                    prompt6.setForeground(Color.black);
                }

                prompt1.setText("SD: " + Integer.toString(mainArr[ekAurCounter]));
                prompt2.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 1]));
                prompt3.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 2]));
                prompt4.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 3]));
                prompt5.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 4]));
                prompt6.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 5]));

                for(int i = 0; i < v; i++) {
                    temp[i] = mainArr[ekAurCounter + i];
                }

                check(ekAurCounter, counter);
            
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(temp[0] != mainArr[ekAurCounter]) {
                    prompt1.setForeground(Color.green);
                } else {
                    prompt1.setForeground(Color.black);
                }
                if(temp[1] != mainArr[ekAurCounter + 1]) {
                    prompt2.setForeground(Color.green);
                } else {
                    prompt2.setForeground(Color.black);
                }
                if(temp[2] != mainArr[ekAurCounter + 2]) {
                    prompt3.setForeground(Color.green);
                } else {
                    prompt3.setForeground(Color.black);
                }
                if(temp[3] != mainArr[ekAurCounter + 3]) {
                    prompt4.setForeground(Color.green);
                } else {
                    prompt4.setForeground(Color.black);
                }
                if(temp[4] != mainArr[ekAurCounter + 4]) {
                    prompt5.setForeground(Color.green);
                } else {
                    prompt5.setForeground(Color.black);
                }
                if(temp[5] != mainArr[ekAurCounter + 5]) {
                    prompt6.setForeground(Color.green);
                } else {
                    prompt6.setForeground(Color.black);
                }

                prompt1.setText("SD: " + Integer.toString(mainArr[ekAurCounter]));
                prompt2.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 1]));
                prompt3.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 2]));
                prompt4.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 3]));
                prompt5.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 4]));
                prompt6.setText("SD: " + Integer.toString(mainArr[ekAurCounter + 5]));

                for(int i = 0; i < v; i++) {
                    temp[i] = mainArr[ekAurCounter + i];
                }

                ekAurCounter = ekAurCounter + v;
                check(ekAurCounter, counter);
            
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new BellmanFordQuiz();
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
                    }

                    for(int i = 0; i < v; i++) {
                        if(i == startingVertex) {
                            mainArr[counter] = 0;
                            counter = counter + 1;
                        } else {
                            mainArr[counter] = 100;
                            counter = counter + 1;
                        }
                    }

                    myBellmanFord(arr, v, startingVertex);

                    for(int i = 0; i < v; i++) {
                        temp[i] = mainArr[i];
                    }

                    check(ekAurCounter, counter);
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
                itf22.setText("-22");
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
                ol01.setText("");
                ol02.setText("");
                ol03.setText("");
                ol04.setText("");
                ol05.setText("");
                ol10.setText("");
                ol12.setText("");
                ol13.setText("");
                ol14.setText("");
                ol15.setText("");
                ol20.setText("");
                ol21.setText("");
                ol23.setText("");
                ol24.setText("");
                ol25.setText("");
                ol30.setText("");
                ol31.setText("");
                ol32.setText("");
                ol34.setText("");
                ol35.setText("");
                ol40.setText("");
                ol41.setText("");
                ol42.setText("");
                ol43.setText("");
                ol45.setText("");
                ol50.setText("");
                ol51.setText("");
                ol52.setText("");
                ol53.setText("");
                ol54.setText("");
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
                ol01.setForeground(Color.black);
                ol02.setForeground(Color.black);
                ol03.setForeground(Color.black);
                ol04.setForeground(Color.black);
                ol05.setForeground(Color.black);
                ol10.setForeground(Color.black);
                ol12.setForeground(Color.black);
                ol13.setForeground(Color.black);
                ol14.setForeground(Color.black);
                ol15.setForeground(Color.black);
                ol20.setForeground(Color.black);
                ol21.setForeground(Color.black);
                ol23.setForeground(Color.black);
                ol24.setForeground(Color.black);
                ol25.setForeground(Color.black);
                ol30.setForeground(Color.black);
                ol31.setForeground(Color.black);
                ol32.setForeground(Color.black);
                ol34.setForeground(Color.black);
                ol35.setForeground(Color.black);
                ol40.setForeground(Color.black);
                ol41.setForeground(Color.black);
                ol42.setForeground(Color.black);
                ol43.setForeground(Color.black);
                ol45.setForeground(Color.black);
                ol50.setForeground(Color.black);
                ol51.setForeground(Color.black);
                ol52.setForeground(Color.black);
                ol53.setForeground(Color.black);
                ol54.setForeground(Color.black);
                counter = 0;
                ekAurCounter = 0;
                check(ekAurCounter, counter);
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
        f.add(prompt1);
        f.add(prompt2);
        f.add(prompt3);
        f.add(prompt4);
        f.add(prompt5);
        f.add(prompt6);
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
        f.add(ol01);
        f.add(ol02);
        f.add(ol03);
        f.add(ol04);
        f.add(ol05);
        f.add(ol10);
        f.add(ol12);
        f.add(ol13);
        f.add(ol14);
        f.add(ol15);
        f.add(ol20);
        f.add(ol21);
        f.add(ol23);
        f.add(ol24);
        f.add(ol25);
        f.add(ol30);
        f.add(ol31);
        f.add(ol32);
        f.add(ol34);
        f.add(ol35);
        f.add(ol40);
        f.add(ol41);
        f.add(ol42);
        f.add(ol43);
        f.add(ol45);
        f.add(ol50);
        f.add(ol51);
        f.add(ol52);
        f.add(ol53);
        f.add(ol54);
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
                    l01.setVisible(true);
                    ol01.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l02.setVisible(true);
                    ol02.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l03.setVisible(true);
                    ol03.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l04.setVisible(true);
                    ol04.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l05.setVisible(true);
                    ol05.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 1) {
                if(b == 0) {
                    l10.setVisible(true);
                    ol10.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l12.setVisible(true);
                    ol12.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l13.setVisible(true);
                    ol13.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l14.setVisible(true);
                    ol14.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l15.setVisible(true);
                    ol15.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 2) {
                if(b == 0) {
                    l20.setVisible(true);
                    ol20.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l21.setVisible(true);
                    ol21.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l23.setVisible(true);
                    ol23.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l24.setVisible(true);
                    ol24.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l25.setVisible(true);
                    ol25.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 3) {
                if(b == 0) {
                    l30.setVisible(true);
                    ol30.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l31.setVisible(true);
                    ol31.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l32.setVisible(true);
                    ol32.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l34.setVisible(true);
                    ol34.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l35.setVisible(true);
                    ol35.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 4) {
                if(b == 0) {
                    l40.setVisible(true);
                    ol40.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l41.setVisible(true);
                    ol41.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l42.setVisible(true);
                    ol42.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l43.setVisible(true);
                    ol43.setText(Integer.toString(input[i][2]));
                } else if(b == 5) {
                    l45.setVisible(true);
                    ol45.setText(Integer.toString(input[i][2]));
                }
            } else if(a == 5) {
                if(b == 0) {
                    l50.setVisible(true);
                    ol50.setText(Integer.toString(input[i][2]));
                } else if(b == 1) {
                    l51.setVisible(true);
                    ol51.setText(Integer.toString(input[i][2]));
                } else if(b == 2) {
                    l52.setVisible(true);
                    ol52.setText(Integer.toString(input[i][2]));
                } else if(b == 3) {
                    l53.setVisible(true);
                    ol53.setText(Integer.toString(input[i][2]));
                } else if(b == 4) {
                    l54.setVisible(true);
                    ol54.setText(Integer.toString(input[i][2]));
                }
            }
        }
    }

    public void myBellmanFord(int arr[][], int v, int s) {
        int key[] = new int[v];
        for(int i = 0; i < v; i++) {
            key[i] = 100;
        }
        key[s] = 0;
        
        for(int k = 0; k < v - 1; k++) {
            for(int i = 0; i < v; i++) {
                for(int j = 0; j < v; j++) {
                    if(arr[i][j] != 0 && key[i] != 100 && arr[i][j] + key[i] < key[j]) {
                        key[j] = arr[i][j] + key[i];
                    }
                }
                for (int l = 0; l < v; l++) {
                    mainArr[counter] = key[l];
                    counter = counter + 1;
                }
            }
        }
    }
}