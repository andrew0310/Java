package NoweSrodkiPieniezne;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScalSrodki implements BinaryOperator<SrodkiPieniezne> {


    @Override
    public SrodkiPieniezne apply(SrodkiPieniezne srodkiPieniezne, SrodkiPieniezne srodkiPieniezne2) {
        final Map<FormaPieniedzy, Integer> scalone =
                Stream.concat(
                        srodkiPieniezne.getSrodki().entrySet().stream(),
                        srodkiPieniezne2.getSrodki().entrySet().stream())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                Integer::sum
                        ));

        return new SrodkiPieniezneC(scalone);
    }

    @Override
    public <V> BiFunction<SrodkiPieniezne, SrodkiPieniezne, V> andThen(Function<? super SrodkiPieniezne, ? extends V> function) {
        return null;
    }
}
