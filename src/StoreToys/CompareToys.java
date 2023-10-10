package StoreToys;

import java.util.Comparator;

public class CompareToys<T extends Toys> implements Comparator<T> {
    @Override
    public int compare(T o1,T o2){
        return o1.getFrequency() - o2.getFrequency();
    }
}
