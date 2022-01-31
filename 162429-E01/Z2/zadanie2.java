package pl.imiajd.kordowski;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class zadanie2 {
    public static void main(String[] args){
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        print(i);
        TreeSet<String> s = new TreeSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        print(s);
        LinkedList<String> z = new LinkedList<>();
        z.add("X");
        z.add("Y");
        z.add("Z");
        print(z);
    }

    public static <T> void print(Iterable<T> n){
        n.forEach( (i) -> {System.out.print(i+",");});
    }
}
