package lab.m01.w02.d01;

public class Book implements Identifiable<Long> {
    @Override
    public Long getId() {
        return 100L;
    }
}
