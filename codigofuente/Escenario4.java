package codigofuente;

import uwcse.graphics.GWindow;
import java.awt.Color;

public class Escenario4 {
    /**
     * 
     * Metodo Listo para reproducir los elementos cuando sea necesario
     * 
     * @param escena4 Gwindow en donde se reproducira la animación
     */

    public static void Reproducir(GWindow escena4) {
        /*
         * Inicializamos las variables a ser utilizadas
         */
        Imagenes vegeta = new Imagenes(
                "vegeta.png",
                -50, 0);
        Estrella estrella1 = new Estrella(10, Color.white, 140, 426, escena4);
        Estrella estrella2 = new Estrella(5, Color.white, 228, 626, escena4);
        Estrella estrella3 = new Estrella(5, Color.white, 117, 141, escena4);
        /*
         * Agregamos la pantalla las imagenes y objetos complejos a mostrarse.
         */
        vegeta.AgregarImagen(escena4);
        estrella1.dibujarEstrella();
        estrella2.dibujarEstrella();
        estrella3.dibujarEstrella();
        /*
         * Utilizamos la Clase Thread para realizar varios procesos al mismo tiempo y
         * obtener un efecto mas llamativo a la vista en la animación
         */
        new Thread(() -> {
            try {
                estrella1.animacionEstrella(500, 1, 1, 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                vegeta.moverImagenDerecha(escena4, 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                estrella2.animacionEstrella(500, 1, 0, 10);
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
    }
}
