package ua.lviv.lgs.cy_27;

import java.util.Random;

public abstract class Orbita {
   private Random random = new Random();
   private int min = 22, max = 88;
   private int length, width, weight;

    public Orbita(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void engineStart(){
       int diff = max - min;
       System.out.println("Dvigyn gotovij za " + (random.nextInt(diff + 1) + min) + " seconds");
   }

   public void orbitaTakeOff(){
       System.out.println("Litak letityme " + random.nextInt(1000) + " minutes");
   }

   public void orbitaLanding(){
       System.out.println("Litak ide na prezemlenia");
   }
}
