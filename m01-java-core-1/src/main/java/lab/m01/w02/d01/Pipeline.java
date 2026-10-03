package lab.m01.w02.d01;

import java.util.function.Function;
import java.util.function.Predicate;

public class Pipeline<T> {
    private final T value;
    private Pipeline(T value){
        this.value = value;
    }
    public static <T> Pipeline<T> of(T value){
        return new Pipeline(value);
    }

    public <R> Pipeline<R> map(Function<? super T, ? extends R> mapper){
        return new Pipeline<R>(mapper.apply(value));
    }

    public Pipeline<T> filter(Predicate<? super T> fil, T fallback){
        return new Pipeline<>(fil.test(value) ? value : fallback);
    }

    public T get(){
        return value;
    }

    public static void main(String[] args) {
        String a = Pipeline.of(9).map(x->x*10 + "hellohello").filter(x -> x.length() > 10,"Luan").get();
        System.out.println(a);
    }
}
