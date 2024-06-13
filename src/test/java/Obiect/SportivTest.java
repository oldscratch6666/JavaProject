package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void metodaTest(){
        //instantiem un obiect de tipul sportiv
        Sportiv Maradona = new Sportiv("Popescu", "Marcel",
                55, "M", "Tenis", true, 13000);

        Maradona.prezentareSportiv();
        Maradona.varsta = 80;
        Maradona.sportPracticat = "Tetris";
        Maradona.prezentareSportiv();
        Maradona.verificareVarsta();

        System.out.println("---------------------------");

        Sportiv Ghenghea = new Sportiv("Ion", "Mihai",
                100, "M", "Scrima", false, 0);

        Ghenghea.prezentareSportiv();
        Ghenghea.verificareVarsta();

        System.out.println("---------------------------");

        Sportiv Vlad = new Sportiv("Titi", "Aur",
                23, "M", "karate", true, 80000);

        Vlad.prezentareSportiv();
        Vlad.verificareVarsta();
        Vlad.marireSalariu(50);

    }



}


//tema:
//