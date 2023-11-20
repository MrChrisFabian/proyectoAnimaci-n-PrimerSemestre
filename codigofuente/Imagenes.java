package codigofuente;

import uwcse.graphics.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class Imagenes {
    public Imagenes(String rutaImagen, int x, int y) {
        try {
            image = ImageIO.read(new File(rutaImagen));
            imageShapo = new ImageShape(image, x, y);
        } catch (IOException e) {
        }
    }

    public void AgregarImagen(GWindow ventanita) {
        imageShapo.addTo(ventanita);
    }

    public void moverImagenDerecha(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX() + 1,  imageShapo.getY());
            Thread.sleep(50);
        }
    }

    public void moverImagenIzquierda(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX() - 1, imageShapo.getY());
            Thread.sleep(50);
        }
    }

    public void moverImagenArriba(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX(), imageShapo.getY() + 1);
            Thread.sleep(50);
        }
    }

    public void moverImagenAbajo(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX(), imageShapo.getY() - 1);
            Thread.sleep(50);
        }
    }
    private BufferedImage image;
    private ImageShape imageShapo;
}
