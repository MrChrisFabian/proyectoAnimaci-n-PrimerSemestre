package codigofuente;

import java.awt.Color;
import uwcse.graphics.GWindow;

public class Escenario5 {
    public static void Reproducir(GWindow escena5GWindow) throws InterruptedException {
        
        Imagenes ultImagen = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/final.png", 0, 0); 
        Imagenes texto01= new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/trailer.png", 0, 0);        
        Imagenes texto02 = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/trailer(1).png", 0, 0);
        Imagenes prox = new Imagenes("/home/mrfabian/Desktop/Facu/1erSemestre/Introduccion a la Programacion/proyectoAnimacio/imagenes/proximamente.png", 0, 0);
        texto01.AgregarImagen(escena5GWindow);
        Thread.sleep(5000);
        texto02.AgregarImagen(escena5GWindow);
        Thread.sleep(5000);
        ultImagen.AgregarImagen(escena5GWindow);
        Thread.sleep(2000);
        prox.AgregarImagen(escena5GWindow);

    }
}
