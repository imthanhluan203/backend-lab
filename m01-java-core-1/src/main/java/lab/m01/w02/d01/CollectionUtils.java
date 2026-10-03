package lab.m01.w02.d01;

import java.util.ArrayList;
import java.util.List;

class Animal implements Comparable<Animal>{

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}

class Dog extends Animal{

}

public class CollectionUtils{
    public <T extends Comparable<? super T>> T max(List<T> collection){
        T max = collection.getFirst();
        for(T t : collection){
            if(max.compareTo(t) < 0){
                max = t;
            }
        }
        return max;
    }

    public <T> void copy(List<? super T> dest, List<? extends T> src){

    }

    public static void main(String[] args) {
        CollectionUtils inCollection = new CollectionUtils();
        List<Dog> inList = new ArrayList<>();
        System.out.println(inCollection.max(inList));

        List<Object> dest = new ArrayList<>();
        List<Integer> src = new ArrayList<>();

        inCollection.copy(dest,src);
    }
}
