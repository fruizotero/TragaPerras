package language;

import java.util.Map;

public class Language {

    private String btnPlay;
    private String lblCredit;
    private String lblPrice;
    private String btnRestart;
    private String title;
    private String win;
    private String lost;
    private String credit;
    private String file;
    private String language;
    private String spanish;
    private String english;

    public Language(Map<String, String> languageValues) {
        btnPlay = languageValues.get("btnPlay");
        lblCredit = languageValues.get("lblCredit");
        lblPrice = languageValues.get("lblPrice");
        btnRestart = languageValues.get("btnRestart");
        title = languageValues.get("title");
        win = languageValues.get("win");
        lost = languageValues.get("lost");
        credit = languageValues.get("credit");
        file = languageValues.get("file");
        language = languageValues.get("language");
        spanish = languageValues.get("spanish");
        english = languageValues.get("english");
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getBtnPlay() {
        return btnPlay;
    }

    public void setBtnPlay(String btnPlay) {
        this.btnPlay = btnPlay;
    }

    public String getLblCredit() {
        return lblCredit;
    }

    public void setLblCredit(String lblCredit) {
        this.lblCredit = lblCredit;
    }

    public String getLblPrice() {
        return lblPrice;
    }

    public void setLblPrice(String lblPrice) {
        this.lblPrice = lblPrice;
    }

    public String getBtnRestart() {
        return btnRestart;
    }

    public void setBtnRestart(String btnRestart) {
        this.btnRestart = btnRestart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
