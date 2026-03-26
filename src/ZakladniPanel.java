import javax.swing.*;
import java.awt.*;


class ZakladniPanel extends JPanel {
    private String SOUBOR_POZADI="pozadi1.jpg";
    add

    private Image image;
    private Postavicka postavicka;

    public ZakladniPanel() {
        image = new ImageIcon(SOUBOR_POZADI).getImage();
        postavicka = new Postavicka();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        postavicka.vykresli(g);

    }
}



