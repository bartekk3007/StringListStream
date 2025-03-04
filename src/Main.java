import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List<String> stringList = List.of("Andrzej", "Bartek", "Czesław", "Daniel", "Edward", "Filip");
        long count = stringList.stream().filter(w -> w.length() > 5).count();
        System.out.println(count);

        Stream<String> empty = Stream.empty();
        Stream<Double> randoms = Stream.generate(Math::random);
        System.out.println(randoms);

        Stream<BigInteger> bigIntegerStream = Stream.iterate(BigInteger.ZERO, n -> n.compareTo(BigInteger.TEN) < 0,  n -> n.add(BigInteger.ONE));
        BigInteger[] array = bigIntegerStream.toArray(BigInteger[]::new);
        for (BigInteger bigInteger : array)
        {
            System.out.println(bigInteger);
        }

        Optional<String> largest = stringList.stream().max(String::compareToIgnoreCase);
        System.out.println(largest.get());

        stringList.forEach(System.out::println);
    }
}