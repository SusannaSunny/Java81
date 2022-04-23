package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test   //Тест увеличение громкости
    void increaseVolume() {
        Radio rad = new Radio();
    rad.increaseVolume();
    int expectedRadioVolume = 1;
    int actualRadioVolume = rad.getCurrentRadioVolume();

    assertEquals(expectedRadioVolume, actualRadioVolume);
    }

    @Test    //Тест увеличение громкости за пределы максимума
    void increaseVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);
        rad.increaseVolume();
        int expectedRadioVolumeMax = 10;
        int actualRadioVolumeMax = rad.getCurrentRadioVolume();

        assertEquals(expectedRadioVolumeMax, actualRadioVolumeMax);
    }

    @Test   //Тест уменьшение громкости
    void reduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(3);
        rad.reduceVolume();
        int expectedRadioVolumeR = 2;
        int actualRadioVolumeR = rad.getCurrentRadioVolume();

        assertEquals(expectedRadioVolumeR, actualRadioVolumeR);
    }

    @Test    //Тест уменьшение громкости за пределы минимума
    void reduceVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);
        rad.reduceVolume();
        int expectedRadioVolumeMin = 0;
        int actualRadioVolumeMin = rad.getCurrentRadioVolume();

        assertEquals(expectedRadioVolumeMin, actualRadioVolumeMin);
    }

    @Test   //Тест увеличение станции
    void increaseStation() {
        Radio rad = new Radio();
        rad.next();
        int expectedRadioStation = 1;
        int actualRadioStation = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);
    }

    @Test    //Тест увеличение станции за пределы максимума
    void increaseStationMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.next();
        int expectedRadioStationMax = 0;
        int actualRadioStationMax = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationMax, actualRadioStationMax);
    }

    @Test   //Тест уменьшение станции
    void reduceStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.prev();
        int expectedRadioStationR = 2;
        int actualRadioStationR = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationR, actualRadioStationR);
    }

    @Test    //Тест уменьшение станции за пределы минимума
    void reduceStationMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prev();
        int expectedRadioStationMin = 9;
        int actualRadioStationMin = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationMin, actualRadioStationMin);
    }

    @Test    //Тест выставление номера станции
    void setRadioStationS() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        int expectedRadioStationS = 5;
        int actualRadioStationS = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationS, actualRadioStationS);
    }

    @Test    //Тест выставление некорректного максимального номера станции
    void setRadioStationWrong() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(15);
        int expectedRadioStationW = 0;
        int actualRadioStationW = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationW, actualRadioStationW);
    }

    @Test    //Тест выставление некорректного минимального номера станции
    void setRadioStationWrongMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expectedRadioStationWMin = 0;
        int actualRadioStationWMin = rad.getCurrentRadioStation();

        assertEquals(expectedRadioStationWMin, actualRadioStationWMin);
    }

    @Test    //Тест выставление некорректного максимального уровня громкости
    void setRadioVolumeWrongMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(15);
        int expectedRadioVolumeWMax = 0;
        int actualRadioVolumeWMax = rad.getCurrentRadioVolume();

        assertEquals(expectedRadioVolumeWMax, actualRadioVolumeWMax);
    }

    @Test    //Тест выставление некорректного минимального уровня громкости
    void setRadioVolumeWrongMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(-1);
        int expectedRadioVolumeWMin = 0;
        int actualRadioVolumeWMin = rad.getCurrentRadioVolume();

        assertEquals(expectedRadioVolumeWMin, actualRadioVolumeWMin);
    }
}