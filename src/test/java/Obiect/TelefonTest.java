package Obiect;

import org.openqa.selenium.edge.AddHasCasting;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("----- Telefon iPhone 15 -----");
        Map<String,String> iphone15Specificatii = new HashMap<>();
        iphone15Specificatii.put ("Ecran ", "OLED");
        iphone15Specificatii.put ("Numar camere ", "3");
        iphone15Specificatii.put ("Porturi ", "Type C");
        iphone15Specificatii.put("Model Procesor ", "A16 Bionic");
        iphone15Specificatii.put ("Chip grafic ", "A16 Boost");
        iphone15Specificatii.put ("Sistem de operare ", "iOS 15");

        List<String> iphone15Accesorii = new ArrayList<>();
        iphone15Accesorii.add ("Incarcator");
        iphone15Accesorii.add ("Cablu usb type C");
        iphone15Accesorii.add ("Casti");
        iphone15Accesorii.add ("Sticker apple");

        Telefon iphone15 = new Telefon("Apple", "15", "Rosu", "1 tb",
                10000 , iphone15Specificatii, iphone15Accesorii, true, " este ce trebuie");
        iphone15.infoTelefon();

        System.out.println("----- Telefon Samsung S23 Ultra -----");
        Map<String,String> samsgunSpecificatii = new HashMap<>();
        iphone15Specificatii.put ("Ecran ", "OLED");
        iphone15Specificatii.put ("Numar camere ", "5");
        iphone15Specificatii.put ("Porturi ", "Type C");
        iphone15Specificatii.put("Model Procesor ", "Snapdragn 888");
        iphone15Specificatii.put ("Chip grafic ", "Snapdragon Turbo");
        iphone15Specificatii.put ("Sistem de operare ", "Android 15");

        List<String> samsungAccesorii = new ArrayList<>();
        iphone15Accesorii.add ("Incarcator");
        iphone15Accesorii.add ("Cablu usb type C");
        iphone15Accesorii.add ("Casti");
        iphone15Accesorii.add ("Sticker Samsung");

        Telefon samsung = new Telefon("Samsung", "S24", "Verde", "1 tb",
                12000 , samsgunSpecificatii, samsungAccesorii, false, "nu este ce trebuie");
        samsung.infoTelefon();

    }




}
