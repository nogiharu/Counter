
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Counter {
    String ans1 = "C";
    String ans2 = "B";
    String ans3 = "A";

    public static void main(String[] args) throws Exception {
        // -----------------------------------------------------------------------
        // 添え字カウンター
        Counter p = new Counter();
        List<String> list = Arrays.asList(p.ans1, p.ans2, p.ans3);

        long counter = list.stream().limit(1).filter("A"::equals).count();
        counter += list.stream().skip(1).limit(1).filter("A"::equals).count();
        counter += list.stream().skip(2).limit(1).filter("A"::equals).count();
        System.out.println(counter);
        // -----------------------------------------------------------------------------------
        long counter2 = IntStream.range(0, 1).filter(i -> list.get(0).equals("A")).count();
        counter += IntStream.range(0, 1).filter(i -> list.get(1).equals("A")).count();
        counter += IntStream.range(0, 1).filter(i -> list.get(2).equals("A")).count();

        System.out.println(counter2);
    }

}
