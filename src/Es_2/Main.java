package Es_2;

public class Main {
    static void main(String[] args) {

        Chiamata call1 = new Chiamata(3.45, "124565654");
        Chiamata call2 = new Chiamata(2.45, "484884");
        Chiamata call3 = new Chiamata(1.45, "1245654");
        Chiamata call4 = new Chiamata(5.45, "333333333333335654");
        Chiamata call5 = new Chiamata(7.45, "111111111111");

        Chiamata[] telefonate = {call1, call2, call3, call4, call5};
        Sim data1 = new Sim("081656565", telefonate);

        data1.setChiamate(telefonate);
        data1.printSim();

    }
}
