package controller;

import model.SlotModel;
import view.SlotView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotController implements ActionListener {
    SlotModel model;
    SlotView view;

    public SlotController(SlotModel model, SlotView view) {
        this.model = model;
        this.view = view;
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
        this.view.lblCredit.setText("Crédito: 10");
        this.model.setCredito(10);
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
            this.model.costoPartida();
            boolean premio = this.model.premioPartida();
            this.view.lblColor.setText(premio ? "Ganas" : "Pierdes");
            this.view.lblColor.setSize(this.view.lblColor.getPreferredSize());
            this.view.lblCredit.setText("Crédito: "+ this.model.getCredito());
            this.view.lblCredit.setSize(this.view.lblCredit.getPreferredSize());
            if (this.model.getCredito() < 1) {
                this.view.btnPlay.setEnabled(false);
                this.view.btnRestart.setEnabled(true);
            }

        }

    }
}
