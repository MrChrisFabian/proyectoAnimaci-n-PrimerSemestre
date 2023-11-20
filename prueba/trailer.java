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

public class trailer {
    public static void main (String [] args) throws InterruptedException, IOException{
        GWindow video = new GWindow(1200,675);
        Sound theme2_3_4 = new Sound("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/seriedad.wav");
        Sound theme5= new Sound("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/pelea.wav");
        Sound remate = new Sound("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/sonidos/cuack.wav");
        AudioPlayer bandaSonora= new AudioPlayer();
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
