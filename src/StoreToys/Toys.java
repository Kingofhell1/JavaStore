package StoreToys;

public class Toys {
    private int id;
    private String nameToys;
    private int frequency;

    public Toys(int id, String nameToys, int frequency) {
        this.id = id;
        this.nameToys = nameToys;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }



    public String getNameToys() {
        return nameToys;
    }



    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "id=" + id +
                ", nameToys='" + nameToys + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}


