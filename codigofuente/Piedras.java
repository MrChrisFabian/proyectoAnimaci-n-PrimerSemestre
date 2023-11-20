package codigofuente;

import java.awt.Color;
import java.io.IOException;
import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

public class Piedras {
    public Piedras() throws IOException {
        roca = new Rectangle(-110, 661, 1400, 13,PiedraColor, true);
        roca2 = new Rectangle(83, 637, 383, 36,PiedraColor, true);
        roca3 = new Rectangle(120, 570, 384, 68,PiedraColor, true);
        roca4 = new Rectangle(138, 508, 335, 80,PiedraColor, true);
        roca5 = new Rectangle(128, 449, 395, 75,PiedraColor, true);
        roca6 = new Rectangle(177, 377, 338, 73,PiedraColor, true);
        roca7 = new Rectangle(869, 609, 330, 65,PiedraColor, true);
        roca8 = new Rectangle(942,360,256,260,PiedraColor,true);
        roca9 = new Rectangle(983,177,214,188,PiedraColor,true);
        roca10 = new Rectangle(1000,130,198,60,PiedraColor,true);
        roca11 = new Rectangle(915,7,283,123,PiedraColor,true);
        roca12 = new Rectangle(-110,575,125,90,PiedraColor,true);
    }

    public void AgregarPiedras(GWindow ventanaGWindow) {
        
        roca.addTo(ventanaGWindow);
        roca2.addTo(ventanaGWindow);
        roca3.addTo(ventanaGWindow);
        roca4.addTo(ventanaGWindow);
        roca5.addTo(ventanaGWindow);
        roca6.addTo(ventanaGWindow);
        roca7.addTo(ventanaGWindow);
        roca8.addTo(ventanaGWindow);
        roca9.addTo(ventanaGWindow);
        roca10.addTo(ventanaGWindow);
        roca11.addTo(ventanaGWindow);
        roca12.addTo(ventanaGWindow);
    }

    public void moverPiedrasDerecha(GWindow ventaGWindow, int cantPixeMover) throws InterruptedException {
        for (int i = 0; i < cantPixeMover; i++) {
            roca.moveTo(roca.getX() + 1, roca.getY());
            roca2.moveTo(roca2.getX()+1, roca2.getY());
            roca3.moveTo(roca3.getX()+1, roca3.getY());
            roca4.moveTo(roca4.getX()+1, roca4.getY());
            roca5.moveTo(roca5.getX()+1, roca5.getY());
            roca6.moveTo(roca6.getX()+1, roca6.getY());
            roca7.moveTo(roca7.getX()+1, roca7.getY());
            roca8.moveTo(roca8.getX()+1, roca8.getY());
            roca9.moveTo(roca9.getX()+1, roca9.getY());
            roca10.moveTo(roca10.getX()+1, roca10.getY());
            roca11.moveTo(roca11.getX()+1, roca11.getY());
            roca12.moveTo(roca12.getX()+1, roca12.getY());
            Thread.sleep(50);
        }
    }
    public void moverPiedrasAbajo(GWindow ventaGWindow, int cantPixeMover) throws InterruptedException {
        for (int i = 0; i < cantPixeMover; i++) {
            roca.moveTo(roca.getX() , roca.getY()+1);
            roca2.moveTo(roca2.getX(), roca2.getY()+1);
            roca3.moveTo(roca3.getX(), roca3.getY()+1);
            roca4.moveTo(roca4.getX(), roca4.getY()+1);
            roca5.moveTo(roca5.getX(), roca5.getY()+1);
            roca6.moveTo(roca6.getX(), roca6.getY()+1);
            roca7.moveTo(roca7.getX(), roca7.getY()+1);
            roca8.moveTo(roca8.getX(), roca8.getY()+1);
            roca9.moveTo(roca9.getX(), roca9.getY()+1);
            roca10.moveTo(roca10.getX(), roca10.getY()+1);
            roca11.moveTo(roca11.getX(), roca11.getY()+1);
            roca12.moveTo(roca12.getX(), roca12.getY()+1);
            Thread.sleep(10);
        }
    }
    
    private final Rectangle roca;
    private final Rectangle roca2;
    private final Rectangle roca3;
    private final Rectangle roca4;
    private final Rectangle roca5;
    private final Rectangle roca6;
    private final Rectangle roca7;
    private final Rectangle roca8;
    private final Rectangle roca9;
    private final Rectangle roca10;
    private final Rectangle roca11;
    private final Rectangle roca12;
    private final Color PiedraColor = new Color(212,163,115);

}
