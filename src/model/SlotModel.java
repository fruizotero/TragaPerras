package model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SlotModel {

    private ArrayList<ImageIcon> listImages;
    private int[] slotRandomNumbers;
    private double credito;


    public SlotModel() {
        listImages = new ArrayList<ImageIcon>();
        imgs();
        slotRandomNumbers = new int[3];
        this.credito = 10;
    }

    public int[] getSlotRandomNumbers() {
        return slotRandomNumbers;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    private void imgs() {

        for (int i = 0; i < 7; i++) {
            listImages.add(new ImageIcon(new ImageIcon(String.format("%s%s%s", "src/img/", i, ".gif")).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT)));
        }

    }

    public ArrayList<ImageIcon> getListImages() {
        return listImages;
    }

    private int getRandomNumber() {

        int number = (int) (Math.random() * 6 + 1);
        return number;
    }

    public void randomNumbers() {

        for (int i = 0; i < slotRandomNumbers.length; i++) {
            slotRandomNumbers[i] = getRandomNumber();
        }

    }

    public void costoPartida() {
        this.credito--;
    }

    public boolean premioPartida() {

        double premio = 0;
        int contador = 0;
        int num1 = slotRandomNumbers[0];
        int num2 = slotRandomNumbers[1];
        int num3 = slotRandomNumbers[2];
        boolean banderaPremio = false;

        if (num2 == num3 && num1 == num3) {
            contador = 2;
        } else {
            if (num1 == num2 || num2 == num3 || num1 == num3) {
                contador = 1;
            }
        }

        if (contador != 0) {
            premio = contador == 1 ? 1.5 : 5;
            setCredito(getCredito() + premio);
            banderaPremio = true;
        }

        return banderaPremio;
    }


}
