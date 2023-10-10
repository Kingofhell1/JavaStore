package StoreToys;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        StoreToys storeToys = new StoreToys();
        ArrayList<Toys> toys = new ArrayList<>();
        toys.add(new Toys(1, "Кукла", 20));
        toys.add(new Toys(2, "Конструктор", 10));
        toys.add(new Toys(3, "Машина", 40));
        toys.add(new Toys(4, "Настольная игра", 5));
        toys.add(new Toys(5, "Робот", 15));
        //number - это кол-во призов
        storeToys.fileWriter(toys , 5);








    }

}

