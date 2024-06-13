package variabilaMetoda;

import org.testng.annotations.Test;

import javax.swing.undo.CannotUndoException;

public class Masina {
    public String marca;
    public String model;
    public Float pret;
    public Integer an;
    public Boolean esteDecapotabila;
    public Double greutatea;

    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("=== Exemplu 2 ===");
        afisareOriceMasina("Hyundai", "ionic", 245.00, 34355.53f, true, 2010);
        System.out.println("=== Exemplu 3 ===");
        afisareOriceMasina("BMW", "i30", 300.00, 66666.66f, false, 2024);
    }

    // Descriem o masina
    public void afisareMasina(){
        marca = "Mercedes";
        model = "GLS";
        pret = 2565.5f;
        esteDecapotabila = true;
        greutatea = 54.0;
        an = 2010;
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Greutatea masinii este: " + greutatea);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Este decapotabila masina? " + esteDecapotabila);
        System.out.println("Masina este din anul: " + an);

    }

    public void afisareOriceMasina(String marca, String model, Double greutatea, Float pret, Boolean esteDecapotabila, Integer an){


        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Greutatea masinii este: " + greutatea);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Este decapotabila masina? " + esteDecapotabila);
        System.out.println("Masina este din anul: " + an);

    }
}


//tema pentru saptamana viitoare: ne mai uitam o data pe astea 2 sesiuni
//de facut pentru fruct ce am facut pentru clasa masina.java. De descris 6-7 fructe.