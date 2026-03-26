import javax.swing.*;

public class HlOkno extends JFrame {

    public HlOkno(){
        setTitle("Obrazky");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200,800);

        ZakladniPanel panel1=new ZakladniPanel();
        add(panel1);


    }

}
