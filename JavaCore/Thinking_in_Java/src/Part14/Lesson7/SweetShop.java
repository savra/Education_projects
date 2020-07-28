package Part14.Lesson7;

class Candy {
    static {
        System.out.println("Загрузка класса Candy");
    }
}

class Gum {
    static {
        System.out.println("3arpy3Ka класса Gum");
    }
}

class Cookie {
    static {
        System.out.println("3arpy3Ka класса Cookie");
    }
}


public class SweetShop {
    public static void main(String[] args) {
        System.out.println("B методе main");
        // new Candy();
       // System.out.println("nocne создания объекта Candy");
        try {
            for (String cl : args)
                Class.forName("Part14.Lesson7." + cl);
        } catch (ClassNotFoundException e) {
            System.out.println("He удалось найти Gum");
        }
        //System.out.println("nocne вызова метода Class.forName(\"Gum\")");
        //new Cookie();
      //  System.out.println("nocne создания объекта Cookie");
    }
}
