package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: If..Then..Else..Switch/Case

    @Test
    public void metodaTest(){

        //verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(9);
        verificNumarPar(7);
        verificNumarPar(6);
        verificNumarPar(0);
        verificNumarPar(-1);
        verificNumarPar(-4);


    }

    //verificam daca un numar este mai mare decat zece

    public void verificNrMaiMare(){

        if (15 > 10){
            System.out.println("Numarul 15 este mai mare ca 10");
        }
        else {
            System.out.println("Numarul 15 este mai mic ca 10:");
        }

    }

    //verificam daca un numar este mai mare decat zece
    public void verificNrMaiMareV2(Integer nr){

        if (nr > 10){
            System.out.println("Numarul " + nr + " este mai mare ca 10");
        }
        else {
            System.out.println("Numarul " + nr + " este mai mic ca 10:");
        }
    }

    //verificam daca un numar este par si pozitiv
    public void verificNumarPar(Integer nr) {
        //daca vrem sa luam catul impartirii = / (divide)
        //daca vrem sa luam restul impartirii = % (modulo)
        if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul meu este pozitiv " + nr + " si par");
            } else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }

        }
    }
    //definitie zilele saptamanii
    public void zileleSaptamanii (Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni!");
            case 2:
                System.out.println("Astazi este marti!");
            case 3:
                System.out.println("Astazi este miercuri!");
            case 4:
                System.out.println("Astazi este joi!");

        }
    }

}