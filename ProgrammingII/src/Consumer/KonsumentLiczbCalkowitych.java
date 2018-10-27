package Consumer;

import java.util.function.IntConsumer;

public class KonsumentLiczbCalkowitych implements IntConsumer {


    @Override
    public void accept(int value) {
        System.out.println("Liczba to: " + value);
    }
}
