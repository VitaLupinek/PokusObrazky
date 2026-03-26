import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class Postavicka implements KeyListener {
    private String SOUBOR_POSTAVA="raketa.jpg";
    private Image postImage;

    int poz_x=100;
    int poz_y=100;


    public Postavicka(){
        postImage = new ImageIcon(SOUBOR_POSTAVA).getImage();


    }

    public void vykresli(Graphics g) {
        g.drawImage(postImage, poz_x, poz_y, null);
    }


        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
        char znak = e.getKeyChar();
        if (znak == 'a'){
            poz_x -= 5;
        }
        if (znak == 'd'){
            poz_x += 5;
        }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
