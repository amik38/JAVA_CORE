package ua.lviv.lgs.cy_27;

import java.util.Random;

public class Controls {
    private Random random = new Random();

    public void moveUp(){
        System.out.println("Litak ruhajetsia v nyz " + random.nextInt(1000) + " meters");
    }
    public void moveDown(){
        System.out.println("Litak ruhajetsia v gory  " + random.nextInt(1000) + " meters");
    }
    public void moveRight(){
        System.out.println("Litak ruhajetsia v prawo  " + random.nextInt(1000) + " meters");
    }
    public void moveLeft(){
        System.out.println("Litak ruhajetsia v liwo  " + random.nextInt(1000) + " meters");
    }
}
