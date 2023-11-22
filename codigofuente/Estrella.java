package codigofuente;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

import java.awt.Color;

/**
 * La clase Estrella representa una estrella en un escenario gráfico.
 * Esta clase contiene métodos para dibujar y animar la estrella, así como para
 * moverla y cambiar su tamaño.
 */
public class Estrella {

    /**
     * Crea una nueva instancia de la clase Estrella.
     * @param tamaño     el tamaño de la estrella
     * @param color      el color de la estrella
     * @param positionX  la posición X de la estrella
     * @param positionY  la posición Y de la estrella
     * @param escenario1 el escenario en el que se dibujará la estrella
     */
    public Estrella(int tamaño, Color color, int positionX, int positionY, GWindow escenario1) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.tamaño = tamaño;
        this.escenario1 = escenario1;
        this.centro = new Rectangle(positionX, positionY, tamaño, tamaño, color, true);
        this.norte = new Rectangle(positionX, positionY - 5, tamaño, tamaño, color, true);
        this.oeste = new Rectangle(positionX - 5, positionY, tamaño, tamaño, color, true);
        this.sur = new Rectangle(positionX, positionY + 5, tamaño, tamaño, color, true);
        this.este = new Rectangle(positionX + 5, positionY, tamaño, tamaño, color, true);
    }

    /**
     * Dibuja la estrella en el escenario.
     */
    public void dibujarEstrella() {
        centro.addTo(escenario1);
        norte.addTo(escenario1);
        sur.addTo(escenario1);
        este.addTo(escenario1);
        oeste.addTo(escenario1);
    }

    /**
     * Realiza una animación de la estrella.
     *
     * @param time              el tiempo total de la animación
     * @param cantMovHorizontal la cantidad de movimiento horizontal en cada
     *                          iteración
     * @param cantMovVertical   la cantidad de movimiento vertical en cada iteración
     * @param sizeParpadeo      el tamaño de parpadeo de la estrella
     * @throws InterruptedException si ocurre un error durante la animación
     */
    public void animacionEstrella(int time, int cantMovHorizontal, int cantMovVertical, int sizeParpadeo)
            throws InterruptedException {
        new Thread(() -> {
            try {
                this.movimientoEstrella(cantMovHorizontal, cantMovVertical, time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                this.parpadeo(sizeParpadeo, time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /**
     * Mueve la estrella en el escenario.
     *
     * @param coordX la cantidad de movimiento horizontal
     * @param coordY la cantidad de movimiento vertical
     */
    public void moveByEstrella(int coordX, int coordY) {
        centro.moveBy(coordX, coordY);
        norte.moveBy(coordX, coordY);
        sur.moveBy(coordX, coordY);
        este.moveBy(coordX, coordY);
        oeste.moveBy(coordX, coordY);
    }

    /**
     * Obtiene el tamaño de la estrella.
     *
     * @return el tamaño de la estrella
     */
    public int getTamaño() {
        return tamaño;
    }

    // Realizamos el movimiento necesario para la animación haciendo uso de metodos
    // ya anteriormente definidos.
    private void movimientoEstrella(int cantMovHorizontal, int cantMovVertical, int time) throws InterruptedException {
        // Establecemos las iteraciones segun el tiempo en milisegundos que se nos
        // indica
        for (int p = 0; p < time; p++) {
            // Realizamos el movimiento horizontal positivo
            for (int i = 0; i < (time / 5); i++) {
                this.moveByEstrella(cantMovHorizontal, cantMovVertical);
                Thread.sleep(45);
            }
            // Realizamos el movimiento horizontal negativo
            for (int s = 0; s < (time / 5); s++) {
                this.moveByEstrella(-cantMovHorizontal, cantMovVertical);
                Thread.sleep(45);
            }
        }
    }

    // Efecto de parpadeo creado cambiando el tamaño de la estrella y devolviendola
    // a su estado original tambien es posible llevar su tamaño a 0 para un efecto
    // mas convincente
    private void parpadeo(int size, int time) throws InterruptedException {
        // Cantidad de iteraciones segun el tiempo
        for (int i = 0; i < time; i++) {
            this.setTamañoEstrella(size);
            Thread.sleep(700);
            this.setTamañoEstrella(tamaño);
            Thread.sleep(700);
        }
    }

    // Establecemos el tamaño de la estrella con sus 5 objetos que la forman
    private void setTamañoEstrella(int size) {
        this.setTamaño(size, centro);
        this.setTamaño(size, norte);
        this.setTamaño(size, sur);
        this.setTamaño(size, este);
        this.setTamaño(size, oeste);
    }

    // Establecer el tamaño de un objeto de forma individual y actualizarlo en la
    // ventana donde se dibuja
    private void setTamaño(int size, Rectangle rectanguloGenerico) {
        rectanguloGenerico.resize(size, size);
        rectanguloGenerico.addTo(escenario1);
    }

    /* Variables de instancia de la clase Estrella */
    private int positionX;
    private int positionY;
    private Color color;
    private GWindow escenario1;
    private int tamaño;
    private Rectangle centro;
    private Rectangle norte;
    private Rectangle sur;
    private Rectangle este;
    private Rectangle oeste;
}
