package codigofuente;

import java.awt.Color;
import java.io.IOException;
import uwcse.graphics.GWindow;

public class Escenario2 {
    public static void Reproducir(GWindow escena2) throws InterruptedException, IOException {
        Imagenes cielo = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/nochecielo.png", 0, -200);
        Imagenes volando = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/proyectAnimacion.png", 0, 0);
        Estrella estrella1 = new Estrella(10, Color.white, 200, 200, escena2);
        Estrella estrella2 = new Estrella(10, Color.white, 336, 79, escena2);
        Estrella estrella3 = new Estrella(10, Color.white, 846, 74, escena2);
        Estrella estrella4 = new Estrella(10, Color.white, 149, 400, escena2);
        Estrella estrella5 = new Estrella(10, Color.white, 100, 333, escena2);
        Piedras desierto = new Piedras();

        cielo.AgregarImagen(escena2);
        estrella1.dibujarEstrella();
        estrella2.dibujarEstrella();
        estrella3.dibujarEstrella();
        estrella4.dibujarEstrella();
        estrella5.dibujarEstrella();
        desierto.AgregarPiedras(escena2);
        volando.AgregarImagen(escena2);

        new Thread(() -> {
            try {
                estrella1.animacionEstrella(500, 1, 0, 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                estrella2.animacionEstrella(500, 2, 1, 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                estrella3.animacionEstrella(500, 1, 0, 25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                estrella4.animacionEstrella(500, 1, 0, 25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                estrella5.animacionEstrella(500, 1, 0, 25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                cielo.moverImagenArriba(escena2, 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                desierto.moverPiedrasAbajo(escena2, 700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
