package StoreToys;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;


public class StoreToys {
    public PriorityQueue<Toys> getQueue(ArrayList<Toys> toys, int number) {

        CompareToys comparator = new CompareToys();
        PriorityQueue<Toys> prizes = new PriorityQueue<>(comparator);
        for (int i = 0; i < toys.size(); i++) {
            for (int j = 0; j < (toys.get(i).getFrequency() * number / 100) ; j++) {
                prizes.add(toys.get(i));
            }
        }
        return prizes;
    }
    public Toys lottery(PriorityQueue<Toys> pq) {
        Toys result = null;
        Random random = new Random();
        int element = random.nextInt(0, pq.size());
        for (int i = 0; i <= element; i++) {
            result = pq.poll();
        }
        return result;
    }
    public void fileWriter(ArrayList<Toys> toys, Integer number)  {
        try {
            FileWriter writer = new FileWriter("toys.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (int i = 0; i < number; i++) {
                Toys toy = lottery(getQueue(toys, number));
                bufferWriter.write(toy.toString() + "\n");
            }
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
