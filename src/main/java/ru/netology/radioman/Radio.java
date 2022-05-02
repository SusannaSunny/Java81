package ru.netology.radioman;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;
    private int amountRadioStation = 10;
    private int radioStationMax = amountRadioStation - 1;
    private int radioStationMin = 0;
    private int radioVolumeMin = 0;
    private int radioVolumeMax = 100;

    public Radio(int amountRadioStation) {
        this.radioStationMax = amountRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    // Громкость (Уровни)
    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < radioVolumeMin) {
            return;
        }
        if (currentRadioVolume > radioVolumeMax) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    //Радиостанции (Уровни)
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < radioStationMin) {
            return;
        }
        if (currentRadioStation > radioStationMax) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    //Громкость (границы)
    public void increaseVolume() {
        if (currentRadioVolume < radioVolumeMax) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentRadioVolume > radioVolumeMin) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }

    //Радиостанции (границы)
    public void next() {
        if (currentRadioStation < radioStationMax) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = radioStationMin;
        }
    }

    public void prev() {
        if (currentRadioStation > radioStationMin) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = radioStationMax;
        }
    }


}
