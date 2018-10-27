package Consumer;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntConsumer konsument = new KonsumentLiczbCalkowitych();
        IntStream.range(0, 10).forEach(konsument);

        IntStream.range(10, 20).forEach(value -> System.out.println("Liczba to: " + value));


    }
}
