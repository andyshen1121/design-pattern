package strategy;

public class Person implements Comparable<Person> {

    private Integer height;

    private Integer weight;

    public Person(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }



    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
