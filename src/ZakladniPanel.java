import javax.swing.*;
import java.awt.*;


class ZakladniPanel extends JPanel {
    private String SOUBOR_POZADI="pozadi1.jpg";

    private Image image;

    public ZakladniPanel() {
        image = new ImageIcon(SOUBOR_POZADI).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

    }
}



