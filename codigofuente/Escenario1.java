package codigofuente;

import java.io.IOException;
import uwcse.graphics.GWindow;
import uwcse.io.AudioPlayer;
import uwcse.io.Sound;

/**
 * La clase Escenario1 representa un escenario de animación con elementos
 * visuales y sonoros.
 * Permite reproducir una secuencia de movimiento de imágenes,objetos complejos
 * y sonidos en una
 * ventana gráfica.
 */
public class Escenario1 {
    /**
     * Reproduce la animación del escenario en la ventana gráfica especificada.
     *
     * @param ventanaGWindow la ventana gráfica en la que se reproducirá la
     *                       animación
     * @throws InterruptedException si ocurre un error durante la espera de los
     *                              hilos de animación
     * @throws IOException          si ocurre un error al cargar los archivos de
     *                              imagen o sonido
     */
    public static void Reproducir(GWindow ventanaGWindow) throws InterruptedException, IOException {
        Piedras desierto = new Piedras();
        Imagenes personaje1 = new Imagenes(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/gokubehind.png",
                800, 30);
        Imagenes personaje2 = new Imagenes(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/frontvegeta.png",
                307, 208);
        Imagenes fondo = new Imagenes(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/desert.png",
                0, 0);
        AudioPlayer audioPlayer = new AudioPlayer();
        Sound musicaSound = new Sound(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/musicaescena1.wav");

        // Agregamos en pantalla los elementos que creamos
        fondo.AgregarImagen(ventanaGWindow);
        desierto.AgregarPiedras(ventanaGWindow);
        personaje1.AgregarImagen(ventanaGWindow);
        personaje2.AgregarImagen(ventanaGWindow);
        audioPlayer.play(musicaSound);
        /*
         * Utilizamos la Clase Thread para realizar varios procesos al mismo tiempo y
         * obtener un efecto mas llamativo a la vista en la animación
         */

        new Thread(() -> {
            try {
                desierto.moverPiedrasDerecha(ventanaGWindow, 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                personaje2.moverImagenDerecha(ventanaGWindow, 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                personaje1.moverImagenIzquierda(ventanaGWindow, 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
