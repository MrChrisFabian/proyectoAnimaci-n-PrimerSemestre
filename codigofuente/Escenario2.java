package codigofuente;

import java.awt.Color;
import java.io.IOException;
import uwcse.graphics.GWindow;

/**
 * La clase Escenario2 representa un escenario de animación con estrellas, cielo
 * y piedras.
 * Permite reproducir la animación en una ventana gráfica.
 */

public class Escenario2 {
    /**
     * Reproduce la animación del escenario en la ventana gráfica especificada.
     *
     * @param escena2 la ventana gráfica en la que se reproducirá la animación
     * @throws InterruptedException si ocurre un error durante la animación
     * @throws IOException          si ocurre un error al cargar las imágenes
     */
    public static void Reproducir(GWindow escena2) throws InterruptedException, IOException {

        /* Creamos las variables y elementos necesarios para la animación */
        Imagenes cielo = new Imagenes(
                "nochecielo.png",
                0, -200);
        Imagenes volando = new Imagenes(
                "proyectAnimacion.png",
                0, 0);
        /*
         * Creamos Los Objetos complejos, las "Estrella" ingresamos el tamaño ya que
         * sera simetrico siempre, luego su color, sus coordenadas y el escenario en
         * donde se utillizara
         */
        Estrella estrella1 = new Estrella(10, Color.white, 200, 200, escena2);
        Estrella estrella2 = new Estrella(10, Color.white, 336, 79, escena2);
        Estrella estrella3 = new Estrella(10, Color.white, 846, 74, escena2);
        Estrella estrella4 = new Estrella(10, Color.white, 149, 400, escena2);
        Estrella estrella5 = new Estrella(10, Color.white, 997, 206, escena2);
        Estrella estrella6 = new Estrella(10, Color.white, 754, 129, escena2);
        Estrella estrella7 = new Estrella(10, Color.white, 595, 216, escena2);
        Estrella estrella8 = new Estrella(10, Color.white, 1052, 388, escena2);
        Piedras desierto = new Piedras();

        // Agregamos al escenario todos los ementos

        cielo.AgregarImagen(escena2);
        estrella1.dibujarEstrella();
        estrella2.dibujarEstrella();
        estrella3.dibujarEstrella();
        estrella4.dibujarEstrella();
        estrella5.dibujarEstrella();
        estrella6.dibujarEstrella();
        estrella7.dibujarEstrella();
        estrella8.dibujarEstrella();
        desierto.AgregarPiedras(escena2);
        volando.AgregarImagen(escena2);
        
        /*Utilizamos la Clase Thread para realizar varios procesos al mismo tiempo y obtener un efecto mas llamativo a la vista en la animación */
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
                estrella6.animacionEstrella(500, 1, 0, 25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                estrella7.animacionEstrella(500, 1, 0, 25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                estrella8.animacionEstrella(500, 1, 1, 25);
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
