package Obiect;

import java.sql.SQLOutput;

public class Sportiv {

    //programare orientata obiect se bazeaza pe interactiunea cu obiecte
    //obiect = instanta unei clase
    //putem defini un obiect doar daca avem un constructor
    //constructorul = are rol sa initializeze atributele unei clase
    // intr-o clasa recunoastem un constructor dupa numele acestuia
    //constructorul este de cele mai multe ori public
    //intr-o clasa pot sa fie mai multi constructori diferentiatia dupa numarul sau tipul de
    //intr-o clasa avem un constructor by default fara parametrii
    //in momentul cand se defineste un obiect, se apeleazsa constructorul din clasa
    //dintr-o clasa putem defini mai multe obiecte
    //obiectele se diferentiaza prin nume si valorile date
    //un obiect se instanteaza folosind cuvantul "new"
    //un obiect se poate defini in orice clasa din orice pachet
    //in momentul cand instantiem un obiect, putem avea access la toate variabilele / metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean sportDeEchipa;
    public Integer salariu;

    //Constructor
    //se poate genera automat prin click dreapta - generate - constructor - select all

    public Sportiv (String nume, String prenume, Integer varsta, String sex,
                    String sportPracticat, Boolean sportDeEchipa, Integer salariu){

        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.sportDeEchipa = sportDeEchipa;
        this.salariu = salariu;

    }

    public void prezentareSportiv(){
        System.out.println("Numele sportivului este: " + nume);
        System.out.println("Prenumele sportivului este: " + prenume);
        System.out.println("Varsta sportivului este: " + varsta);
        System.out.println("Sexul sportivului este: " + sex);
        System.out.println("Sportul practicat de catre sportiv este:  " + sportPracticat);
        System.out.println("Este un sport de echipa? " + sportDeEchipa);
        if (salariu != null){
            System.out.println("Salariul sportivului este: " + salariu);
        }

    }

    public void verificareVarsta(){
        if (varsta > 18){
            System.out.println("Sportivul este major");
        }
        else {
            System.out.println("Sportivul este minor");

        }

    }

    public void marireSalariu(Integer procent){
        if (salariu != null){
            Integer marire = (salariu * procent / 100);
            salariu = salariu + marire;
            System.out.println("Noul salariu este de: " + salariu);
        } else {
            System.out.println("Sportivul nu are salariu");
        }
    }


}
