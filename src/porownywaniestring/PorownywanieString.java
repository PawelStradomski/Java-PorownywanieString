
package porownywaniestring;
/**
 * 
 * @author pawelstradomski
 */

public class PorownywanieString {

    
    public static void main(String[] args) {
        /* Porownywanie String. 
        
            String sa wyjatkowe. Nalezy zawsze do porownywania uzywac met. equals
                                 EQUALS !!! - zawsze do porownywania STRING
        */    
        
        String imie = "Pawel";
        String imie2 = "Pawel";
        if (imie == imie2)
            System.out.println("sa rowne");
        else
            System.out.println("nie sa rowne");
        
        
        String name = new String("Mama");
        String name2 = new String("Mama"); //new String oznacza wywolanie nowej komorki pamieci i optymalizacja nie zachodzi
        if (name == name2)
            System.out.println("ok");
        else
            System.out.println("NOK"); // NOK - nie zaszla optymalizacja komorki pamieci.
                                       // NOK - dwie rozne komorki w pamieci
                                       
        
        // String nie bylyby rowne gdyby wartosci "Pawel" byly przyslane z zewnatrz!!!
        // Dlatego nalezy zastosowac metode equals!!!!
        // Java te same literaly przechowuje w tej samej komorce w pamieci i tak naprawde
        // porownujemy to samo miejsce w pamieci (te same adresy) np nazwa=nazwa2=ten sam adres w przypadku tego
        // samego literalu poniewaz zaszla optymalizacja bo "Pawel" == "Pawel"
        
        String nazwa = "Stradomski";
        String nazwa2 = "Stradomski";
        if (nazwa.equals(nazwa2))
            System.out.println("te same nazwy");
        else
            System.out.println("nie te same nazwy");
                
        
        
    }
    
}
