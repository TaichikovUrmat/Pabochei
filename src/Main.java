import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//        MyClass деген класс тузунуз
//
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//        Параметри эки башка болгон эки конструктор тузунуз
//
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//
//        Эки объектке эки башка конструктор иштесин.
//
//        Объекттердин маанилерин консольго чыгарыныз.

public class Main {
    public static void main(String[] args) {
        MuClass muClassc = new  MuClass("Urmat","Taichikov",19,"Loop,Method,if-else","manty");
        System.out.println(STR."""
                 \{muClassc.nema}
                 \{muClassc.surnema}
                 \{muClassc.age}
                 \{muClassc.tema}
                 \{muClassc.tamak}
                """);


    MuClass muClass1 = new MuClass();
    muClass1.nema = "Ajybek";
    muClass1.surnema = "Sadykov";
    muClass1.tema = "java oop, swich,";
    muClass1.age = 16;
    muClass1.tamak =" sushi";

        System.out.println(STR."""
                \{muClass1.nema}
                \{muClass1.surnema}
                \{muClass1.tema}
                \{muClass1.age}
                \{muClass1.tamak}
                """);

    }
}




















