package strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Sorter<T> {

    public void sorted(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    swap(array, j);
                }
            }
        }
    }

    private void swap(T[] array, int j) {
        T temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }

    public static void main(String[] args) {
        Sorter<Person> personSorter = new Sorter<>();
        Person[] personArray = {new Person(170, 55), new Person(165, 60), new Person(180, 75)};
        personSorter.sorted(personArray, new PersonComparator());
        System.out.println(Arrays.toString(personArray));
    }
}
