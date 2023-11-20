package codigofuente;

import java.io.IOException;
import uwcse.graphics.GWindow;
import uwcse.io.AudioPlayer;
import uwcse.io.Sound;

public class Escenario1 {
    public static void Reproducir(GWindow ventanaGWindow) throws InterruptedException, IOException {
        Piedras desierto = new Piedras();
        Imagenes personaje1 = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/gokubehind.png", 800, 30);
        Imagenes personaje2 = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/frontvegeta.png", 307, 208);
        Imagenes fondo = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/desert.png", 0, 0);
        AudioPlayer audioPlayer = new AudioPlayer();
        Sound musicaSound = new Sound("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/musicaescena1.wav");

        // Agregamos en pantalla los elementos que creamos
        fondo.AgregarImagen(ventanaGWindow);
        desierto.AgregarPiedras(ventanaGWindow);
        personaje1.AgregarImagen(ventanaGWindow);
        personaje2.AgregarImagen(ventanaGWindow);
        audioPlayer.play(musicaSound);

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
