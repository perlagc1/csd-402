/*
 * Name: Perla Garcia Cavazos
 * Date: October 3, 2026
 * Assignment: Module 10 Programming Assignment
 */

public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 =
                new InternationalDivision("Latin America Division", 1001,
                        "Mexico", "Spanish");

        InternationalDivision international2 =
                new InternationalDivision("European Division", 1002,
                        "France", "French");

        DomesticDivision domestic1 =
                new DomesticDivision("Midwest Division", 2001, "Nebraska");

        DomesticDivision domestic2 =
                new DomesticDivision("Southern Division", 2002, "Texas");

        System.out.println("INTERNATIONAL DIVISIONS");
        System.out.println("-----------------------");
        international1.display();
        international2.display();

        System.out.println("DOMESTIC DIVISIONS");
        System.out.println("------------------");
        domestic1.display();
        domestic2.display();
    }
}