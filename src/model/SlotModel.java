package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import language.Language;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class SlotModel {

    private ArrayList<ImageIcon> listImages;
    private int[] slotRandomNumbers;
    private double credit;
    private Language lang;

    public Language getLang() {
        return lang;
    }

    public SlotModel() {
        listImages = new ArrayList<ImageIcon>();
        imgs();
        slotRandomNumbers = new int[3];
        this.credit = 10;
    }

    public int[] getSlotRandomNumbers() {
        return slotRandomNumbers;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
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

    public void costGame() {
        this.credit--;
    }

    public boolean priceGame() {

        double price = 0;
        int counter = 0;
        int num1 = slotRandomNumbers[0];
        int num2 = slotRandomNumbers[1];
        int num3 = slotRandomNumbers[2];
        boolean flagPrice = false;

        if (num2 == num3 && num1 == num3) {
            counter = 2;
        } else {
            if (num1 == num2 || num2 == num3 || num1 == num3) {
                counter = 1;
            }
        }

        if (counter != 0) {
            price = counter == 1 ? 1.5 : 5;
            setCredit(getCredit() + price);
            flagPrice = true;
        }

        return flagPrice;
    }

    public void setLanguage(String language) {
        String stringLanguage = "";
        ObjectMapper mapper = new ObjectMapper();

        try (Scanner sc = new Scanner(new File(String.format("src/utils/%s.json", language)))) {
            while (sc.hasNext()) {
                stringLanguage += sc.nextLine();
            }
            Map<String, String> languageMap = mapper.readValue(stringLanguage, Map.class);
            lang = new Language(languageMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
