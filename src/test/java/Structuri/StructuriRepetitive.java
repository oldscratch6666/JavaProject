package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive = For, While, For each

    @Test
    public void testMethod (){
        //afisareNrFor();
        //afisareNrWhile();
        afisareNrPare();


    }

    //afisam primele 15 numere
    public void afisareNrFor(){
        for (Integer index = 0; index <= 15; index++){
            System.out.println(index);
        }
    }

    public void afisareNrWhile(){
        Integer index = 0;
        while (index <= 15){
            System.out.println(index);
            index++;
        }
    }

    public void afisareNrPare(){
        for (Integer index = 0; index <= 10000; index++){
            if (index % 2 == 0){
                System.out.println("Numarul " + index + " este par.");
            } else {
                System.out.println("Numarul " + index + " este impar.");
            }
        }
    }

}

// tema o sa o primim