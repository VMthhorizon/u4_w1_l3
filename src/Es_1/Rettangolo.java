package Es_1;

public class Rettangolo {

    // ATTRIBUTI
    private final double height;
    private final double width;

    // CONSTRUCTORS
    public Rettangolo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // METODI DI ISTANZA
    private double perimetroRettangolo() {
        return this.height * 2 + width * 2;
    }

    private double areaRettangolo() {
        return this.height * this.width;
    }

    // METODI DI CLASSE
    public static void printRettangolo(Rettangolo rett) {
        System.out.println("PERIMETRO: " + rett.perimetroRettangolo());
        System.out.println("AREA: " + rett.areaRettangolo());
    }

    public static void infoRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("PERIMETRO 1: " + rett1.perimetroRettangolo() + " PERIMETRO 2: " + rett2.perimetroRettangolo());
        System.out.println("AREA 1: " + rett1.areaRettangolo() + " AREA 2: " + rett2.areaRettangolo());
        System.out.println("SOMMA PERIMETRO: " + (rett1.perimetroRettangolo() + rett2.perimetroRettangolo()));
        System.out.println("SOMMA AREE: " + (rett1.areaRettangolo() + rett2.areaRettangolo()));
    }

}
