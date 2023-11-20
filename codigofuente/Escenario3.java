package codigofuente;

import java.awt.Color;

import uwcse.graphics.GWindow;

public class Escenario3 {
    public static void Reproducir(GWindow escena3){
        Imagenes gokuImagenes = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/gokuface.png", 0, 0);
        Estrella estrella1 = new Estrella(10, Color.white, 143, 494, escena3);
        Estrella estrella2 = new Estrella(5, Color.white, 335, 620, escena3);
        Estrella estrella3 = new Estrella(5, Color.white, 117, 141, escena3);

        gokuImagenes.AgregarImagen(escena3);
        estrella1.dibujarEstrella();
        estrella2.dibujarEstrella();
        estrella3.dibujarEstrella();

        new Thread(() -> {
            try {
                estrella1.animacionEstrella(500, 1, 1, 20);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                estrella2.animacionEstrella(500, 2, 0, 10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                estrella3.animacionEstrella(500, 1, 0, 10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                gokuImagenes.moverImagenIzquierda(escena3, 50);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }).start();
    }
}
