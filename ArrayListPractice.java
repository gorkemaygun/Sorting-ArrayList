import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(100);// Created array list that name is array

        for (int i = 0; i < 100; i++) { // declared random elements between 0-100 and added array list
            array.add((int) (Math.random() * 100));
        }

        System.out.println("Unsorted Array: ");
        for (int el : array) {// Printed unsorted array list
            System.out.print(el + ",");
        }

        System.out.println("\nSorted Array:");
        Collections.sort(array);// Sorted numbers using premade sort method
        for (int el : array) {
            System.out.print(el + ",");
        }
        ArrayList<Integer> array2 = new ArrayList<>(); // Created new array list that name is array2
        for (int i = 0; i < 100; i++) { // declared random elements between 0-100 and added array list
            array2.add((int) (Math.random() * 100));
        }
        System.out.println("\nUnsorted Array: ");
        for (int el : array2) { // Printed unsorted array list
            System.out.print(el + ",");
        }
        int n = array2.size();
        int emptyArr;
        // This is a bubble sort method.This method allows us to sort numbers min to max
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (array2.get(j) > array2.get(j + 1)) {
                    emptyArr = array2.get(j);
                    array2.set(j, array2.get(j + 1));
                    array2.set(j + 1, emptyArr);
                }
            }
        System.out.println("\nSorted Array: ");
        for (int el : array2) {
            System.out.print(el + ",");
        }
    }
}