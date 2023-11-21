package prueba;

import java.io.IOException;

import codigofuente.Imagenes;
import codigofuente.Escenario1;
import codigofuente.Escenario2;
import codigofuente.Escenario3;
import codigofuente.Escenario4;
import codigofuente.Escenario5;
import uwcse.graphics.GWindow;
import uwcse.io.AudioPlayer;
import uwcse.io.Sound;

/**
 * Clase encargada de llamar a todas las clases de cada escenario y reproducir
 * audios que
 */
public class trailer {
    /**
     * La Clase Principal, el main el encargado de reproducir todas las clases
     * listos para observar la animación
     * 
     * @param args
     * @throws InterruptedException En Caso de tener problemas con las animaciones
     * @throws IOException          En casa de tener problemas con las imagenes
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        GWindow video = new GWindow(1200, 675);
        Sound theme2_3_4 = new Sound(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/seriedad.wav");
        Sound theme5 = new Sound(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/pelea.wav");
        Sound remate = new Sound(
                "/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/cuack.wav");
        AudioPlayer bandaSonora = new AudioPlayer();
        /*
         * Debido a decisiones creativas se decidio reproducir estas musicas y manejar
         * los tiempos en el main para un mejor resultado
         */
        Escenario1.Reproducir(video);
        Thread.sleep(15000);
        bandaSonora.play(theme2_3_4);
        Escenario2.Reproducir(video);
        Thread.sleep(10000);
        Escenario3.Reproducir(video);
        Thread.sleep(10000);
        Escenario4.Reproducir(video);
        Thread.sleep(10000);
        bandaSonora.stop(theme2_3_4);
        bandaSonora.play(theme5);
        Escenario5.Reproducir(video);
        bandaSonora.play(remate);

    }
}
