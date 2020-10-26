package entities;

public class Number implements Comparable<Number>{

    private Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }


    @Override
    public int compareTo(Number other) {
        return -number.compareTo(other.getNumber());
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
