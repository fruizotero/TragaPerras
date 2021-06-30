package controller;

import language.Language;
import model.SlotModel;
import view.SlotView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotController implements ActionListener {
    SlotModel model;
    SlotView view;
    Language language;

    public SlotController(SlotModel model, SlotView view) {
        this.model = model;
        this.view = view;
        this.model.setLanguage("es");
        this.language=this.model.getLang();

        this.view.setTitle(language.getTitle());
        this.view.btnPlay.setText(language.getBtnPlay());
        this.view.btnRestart.setText(language.getBtnRestart());
        this.view.lblCredit.setText(language.getLblCredit());
        this.view.lblPrice.setText(language.getLblPrice());

        this.view.btnPlay.setSize(this.view.btnPlay.getPreferredSize());
        this.view.btnRestart.setSize(this.view.btnRestart.getPreferredSize());
        this.view.lblCredit.setSize(this.view.lblCredit.getPreferredSize());
        this.view.lblPrice.setSize(this.view.lblPrice.getPreferredSize());

        this.view.lblImg1.setIcon(this.model.getListImages().get(1));
        this.view.lblImg2.setIcon(this.model.getListImages().get(2));
        this.view.lblImg3.setIcon(this.model.getListImages().get(3));

        this.view.btnPlay.addActionListener(this);
        this.view.btnRestart.addActionListener(this);
        this.view.btnRestart.setEnabled(false);
    }

    public void init() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500, 300);
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    public void restart() {
        this.view.btnPlay.setEnabled(true);
        this.view.btnRestart.setEnabled(false);
        this.view.lblCredit.setText(language.getLblCredit());
        this.model.setCredit(10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.view.btnRestart) {

            restart();

        }
        if (e.getSource() == this.view.btnPlay) {

            this.model.randomNumbers();
            int[] ArrayRandomNumbers = this.model.getSlotRandomNumbers();
            this.view.lblImg1.setIcon(this.model.getListImages().get(ArrayRandomNumbers[0]));
            this.view.lblImg2.setIcon(this.model.getListImages().get(ArrayRandomNumbers[1]));
            this.view.lblImg3.setIcon(this.model.getListImages().get(ArrayRandomNumbers[2]));
            this.model.costGame();
            boolean price = this.model.priceGame();
            this.view.lblPrice.setText(price ? language.getWin() : language.getLost());
            this.view.lblPrice.setSize(this.view.lblPrice.getPreferredSize());
            this.view.lblCredit.setText(language.getCredit()+ this.model.getCredit());
            this.view.lblCredit.setSize(this.view.lblCredit.getPreferredSize());
            if (this.model.getCredit() < 1) {
                this.view.btnPlay.setEnabled(false);
                this.view.btnRestart.setEnabled(true);
            }

        }

    }
}
