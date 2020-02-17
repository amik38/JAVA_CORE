package ua.lviv.lgs.cy_27;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cy_27 cy_27 =  new Cy_27(22, 15, 23000, 2500, Color.WHITE);

        cy_27.engineStart();
        cy_27.orbitaTakeOff();
        cy_27.moveUp();
        cy_27.moveLeft();
        cy_27.moveRight();
        cy_27.moveDown();
        cy_27.stelth();
        cy_27.nuke();
        cy_27.turboBoost();
        cy_27.orbitaLanding();

    }
}
