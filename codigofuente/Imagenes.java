package codigofuente;

import uwcse.graphics.ImageShape;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import uwcse.graphics.GWindow;

/**
 * La clase Imagenes representa una imagen en una ventana gráfica.
 * Permite cargar una imagen desde una ruta dada y realizar operaciones de
 * movimiento en la ventana.
 */
public class Imagenes {
    /**
     * Constructor para Obtener la ruta de la imagen y su posición
     * @param rutaImagen Dirección Donde se almacena la imagen
     * @param x Coordenada en el eje X
     * @param y Coordenada en el eje Y
     */
    public Imagenes(String rutaImagen, int x, int y) {
        try {
            image = ImageIO.read(new File(rutaImagen));
            imageShapo = new ImageShape(image, x, y);
        } catch (IOException e) {
        }
    }
    /**
     * Se Dibuja la imagen en la ventana gwindow necesaria
     * @param ventanita Ventana gwindow donde agregar la imagen
     */
    public void AgregarImagen(GWindow ventanita) {
        imageShapo.addTo(ventanita);
    }
    /**
     * Metodo encargado de mover la imagen en la dirección derecha segun el usuario.
     * @param ventana ventana en donde se realiza el desplazamiento
     * @param CantPixMover Cantidad de pixeles que se desplazara
     * @throws InterruptedException En Caso de obtener algún error en la animación
     */
    public void moverImagenDerecha(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX() + 1, imageShapo.getY());
            Thread.sleep(50);
        }
    }
    /**
     * Metodo encargado de mover la imagen en la dirección izquierda segun el usuario.
     * @param ventana ventana en donde se realiza el desplazamiento
     * @param CantPixMover Cantidad de pixeles que se desplazara
     * @throws InterruptedException En Caso de obtener algún error en la animación
     */
    public void moverImagenIzquierda(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX() - 1, imageShapo.getY());
            Thread.sleep(50);
        }
    }
    /**
     * Metodo encargado de mover la imagen en la dirección Superior segun el usuario.
     * @param ventana ventana en donde se realiza el desplazamiento
     * @param CantPixMover Cantidad de pixeles que se desplazara
     * @throws InterruptedException En Caso de obtener algún error en la animación
     */
    public void moverImagenArriba(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX(), imageShapo.getY() + 1);
            Thread.sleep(50);
        }
    }
    /**
     * Metodo encargado de mover la imagen en la dirección inferior segun el usuario.
     * @param ventana ventana en donde se realiza el desplazamiento
     * @param CantPixMover Cantidad de pixeles que se desplazara
     * @throws InterruptedException En Caso de obtener algún error en la animación
     */
    public void moverImagenAbajo(GWindow ventana, int CantPixMover) throws InterruptedException {
        for (int i = 0; i < CantPixMover; i++) {
            imageShapo.moveTo(imageShapo.getX(), imageShapo.getY() - 1);
            Thread.sleep(50);
        }
    }

    // Variables de Instancia de la clase imagenes
    private BufferedImage image;
    private ImageShape imageShapo;
}
