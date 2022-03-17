package strategy;

import java.util.Comparator;
import java.util.Objects;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else if (Objects.equals(o1.getHeight(), o2.getHeight())) {
            return 0;
        } else {
            return 1;
        }
    }
}
