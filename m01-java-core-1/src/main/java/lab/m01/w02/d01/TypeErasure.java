package lab.m01.w02.d01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public void Test1(List<String> a){

    }
    public void Test(List<Integer> b){

    }

    static <T> T[] newArray(int size, Class<T> type){
        return (T[]) Array.newInstance(type, size);
    }


    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        System.out.println(listInteger.getClass());
        System.out.println(listString.getClass());
        Object[] x = new String[5];

        String[] a =(String[]) x;
    }
}
