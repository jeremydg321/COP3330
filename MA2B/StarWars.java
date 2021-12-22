/* University of Central Florida
 * COP 3330 Spring 2019
 * Assignment #2
 * Author: <Your Name>
 */
package name;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class StarWars extends JFrame {

    public StarWars() {

        initUI();
    }

    private void initUI() {

        add(new Galaxy());

        setResizable(false);
        pack();

        setTitle("A Star War Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            StarWars ex = new StarWars();
            ex.setVisible(true);
        });
    }
}
