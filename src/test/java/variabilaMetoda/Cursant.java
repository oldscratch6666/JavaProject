package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    // acesta este un comentariu
    // recunoastem o clasa intr-un fisier java dupa cuvantul cheie class
    // intr-un fisier Java putem avea o multime de clae pe care le diferentim prin numele lor
    // nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    // fiecare clasa trebuie sa aiba un nume
    // intelegem printr-o clasa ca fiind un sablon specific din viata reala
    // intr-o clasa putem defini variabile si metode
    // variabila este proprietatea unei clase
    // intr-o clasa putem avea o multime de variable
    // variabilele se diferentiaza prin tip si nume
    // variabilele pot fi de doua feluri: global si local
    // variabila globala este o proprietate vizibila oriunde in cod
    // variabila locala este o proprietate vizibila doar in locul definit
    // tipuri de date: string, integer, double/float, character, boolean

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    // metoda este reprezentata de actiunea unei clase
    // intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    // exista doua tipuri de metode: void si return
    // metoda void = actiune pe care vrem sa o afisam / interpretam fara a fi nevoie sa o returnam
    // pentru o metoda trebuie sa specificam un access control (public), () si {}


    @Test
    public void metodaTest(){
        descrieCursantul();
    }

    public void primesteBursa(){
        Integer bursa = 1000;
        System.out.println("Bursa cursantului este" + bursa);

    }
    @Test
    public void descrieCursantul ()  {
        nume = "Cristi";
        prenume = "Constantin";
        varsta = 33;
        adresa = "Odei 92, Etaj 3, Ap 22";
        inaltime = 1.83;
        greutate = 115.00f;
        sex = 'M';
        areRestante = true;

        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Prenumele cursantului este: " + prenume);
        System.out.println("Varsta cursantului este: " + varsta + " de ani");
        System.out.println("Adresa cursantului este: " + adresa);
        System.out.println("Inaltimea cursantului este: " + inaltime);
        System.out.println("Greutatea cursantului este: " + greutate);
        System.out.println("Sexul cursantului este: " + sex);
        System.out.println("Cursantul are restanta? " + areRestante);

    }
}
