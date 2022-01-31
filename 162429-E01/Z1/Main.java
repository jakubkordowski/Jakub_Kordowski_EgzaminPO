package pl.imiajd.kordowski;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = 3;
        LocalTime t1 = LocalTime.of(10,10,10);
        LocalTime t2 = LocalTime.of(9,9,9);
        LocalTime t3 = LocalTime.of(8,8,8);
        String s1 = "Ala";
        String s2 = "Beata";
        String s3 = "Cezary";
        ArrayList<Integer> integerSorted = new ArrayList<>();
        ArrayList<Integer> integerNotSorted = new ArrayList<>();
        ArrayList<LocalTime> timeSorted = new ArrayList<>();
        ArrayList<LocalTime> timeNotSorted = new ArrayList<>();
        ArrayList<String> stringSorted = new ArrayList<>();
        ArrayList<String> stringNotSorted = new ArrayList<>();
        integerSorted.add(i1);
        integerSorted.add(i2);
        integerSorted.add(i3);
        integerNotSorted.add(i2);
        integerNotSorted.add(i1);
        integerNotSorted.add(i3);
        timeSorted.add(t3);
        timeSorted.add(t2);
        timeSorted.add(t1);
        timeNotSorted.add(t2);
        timeNotSorted.add(t1);
        timeNotSorted.add(t3);
        stringSorted.add(s1);
        stringSorted.add(s2);
        stringSorted.add(s3);
        stringNotSorted.add(s2);
        stringNotSorted.add(s1);
        stringNotSorted.add(s3);

        System.out.println(integerSorted);
        System.out.println(integerNotSorted);
        System.out.println(timeSorted);
        System.out.println(timeNotSorted);
        System.out.println(stringSorted);
        System.out.println(stringNotSorted);

        System.out.println(isSorted(integerSorted));
        System.out.println(isSorted(integerNotSorted));
        System.out.println(isSorted(timeSorted));
        System.out.println(isSorted(timeNotSorted));
        System.out.println(isSorted(stringSorted));
        System.out.println(isSorted(stringNotSorted));
    }

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> arr){
        boolean sort = true;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1).compareTo(arr.get(i)) > 0) sort = false;
            if(!sort) return false;
        }
        return true;
    }
}
