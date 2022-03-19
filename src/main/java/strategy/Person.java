package strategy;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private Integer height;

    private Integer weight;

    public Person(Integer height, Integer weight) {
        this.height = height;
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }


    @Override
    public int compareTo(Person o) {
        if (this.height > o.height) {
            return 1;
        } else if (Objects.equals(this.height, o.height)) {
            return 0;
        } else {
            return -1;
        }
    }
}
