/* University of Central Florida
 * COP 3330 Spring 2019
 * Assignment #2
 * Author: <Your Name>
 */
package name;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;

public  class Galaxy extends JPanel implements ActionListener {

    private Timer timer;
    private boolean inGame;
    private final int B_WIDTH = 500;
    private final int B_HEIGHT = 400;
    private final int DELAY = 15;

   
    ArrayList<TIEFIghter> fighters = new ArrayList<>();
    Random rand = new Random();


    // END YOUR CODE HERE

    public Galaxy() {

        initGalaxy();
    }

    private void initGalaxy() {

        setFocusable(true);
        setBackground(Color.BLACK);
        inGame = true;

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        initFighter();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void initFighter() {

    	
    	
    	
    	int xaxis, yaxis, count;
    	
    	for(count = 0; count<=9;count++)
    	{
    		xaxis = rand.nextInt(B_WIDTH);
        	yaxis = rand.nextInt(B_HEIGHT);
    	fighters.add(new TIEFIghter(xaxis,yaxis));
    	}

    

    }

    @Override
   public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int visibleAliens = 0;
        if (inGame) {

            drawObjects(g);

        } else {
            for (TIEFIghter alien : fighters) {
                if (alien.isVisible()) {
                	visibleAliens++;
                }
            }

        }

        Toolkit.getDefaultToolkit().sync();
    }

    private void drawObjects(Graphics g) {

        for (TIEFIghter alien : fighters) {
            if (alien.isVisible()) {
                g.drawImage(alien.getImage(), alien.getX(), alien.getY(), this);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("Fighters Present: " + fighters.size(), 5, 15);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        inGame();
        updateFighters();
        repaint();
    }

    private void inGame() {

        if (!inGame) {
            timer.stop();
        }
    }

    private void updateFighters() {

        if (fighters.isEmpty()) {

            inGame = false;
            return;
        }

        for (int i = 0; i < fighters.size(); i++) {

            TIEFIghter a = fighters.get(i);

            if (a.isVisible()) {
                a.move();
            } else {
                fighters.remove(i);
            }
        }
    }

}
