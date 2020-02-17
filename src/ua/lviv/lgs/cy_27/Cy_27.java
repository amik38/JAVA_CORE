package ua.lviv.lgs.cy_27;

import java.awt.*;
import java.util.Random;

public class Cy_27 extends Orbita implements Spec{
    private Random random = new Random();

    private Controls Controls = new Controls();

    private int maxSpeed;
    private Color color;

    public Cy_27(int length, int width, int weight, int maxSpeed, Color color) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }


    public void moveUp(){
        Controls.moveUp();
    }
    public void moveDown(){
        Controls.moveDown();
    }
    public void moveRight(){
        Controls.moveRight();
    }
    public void moveLeft(){
        Controls.moveLeft();
    }

    @Override
    public void turboBoost() {
        System.out.println("Cy-27 ruhajetsia zi shvidkisti " + (random.nextInt(1000) + maxSpeed) + " km/h");
    }

    @Override
    public void stelth() {
        System.out.println("Cy-27 ne vidno " + random.nextInt(60) + " minutes");
    }

    @Override
    public void nuke() {
        System.out.println("Cy-27  " + random.nextInt(10) + " nukes");
    }
}
