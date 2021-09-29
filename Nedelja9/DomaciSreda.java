import java.util.List;
import java.util.stream.Collectors;

public class DomaciSreda {
    /*
    Za prosledjenu Listu brojeva preko tokova izdvojiti:
    Sve brojeve deljive sa 3 uvecati za 2
    Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja
    Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate
    */

    public static List<Integer> prviZadatak(List<Integer> unsortedList) {
        return unsortedList.stream().map(x -> x % 3 == 0 ? x + 2 : x).collect(Collectors.toList());
    }


    public static List<Integer> drugiZadatak(List<Integer> unsortedList) {
        return unsortedList.stream().map(x -> x * 2).filter(x -> x % 3 == 0).collect(Collectors.toList());
    }

    public static List<Integer> treciZadatak(List<Integer> unsortedList) {
        return unsortedList.stream().map(x -> x % 2 != 0 ? x * 2 : x).distinct().collect(Collectors.toList());
    }
}
