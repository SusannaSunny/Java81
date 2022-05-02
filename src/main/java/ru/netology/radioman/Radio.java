package ru.netology.radioman;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    // Громкость (Уровни)
    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < 0) {
            return;
        }
        if (currentRadioVolume > 10) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    //Радиостанции (Уровни)
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    //Громкость (границы)
    public void increaseVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }

    //Радиостанции (границы)
    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }


}
