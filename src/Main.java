import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Андрей", "Дима");
        List<String> result = processNames(names);
        System.out.println(result);
    }

    public static List<String> processNames(List<String> names) {
        if (names == null) return List.of();

        return names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .map(name -> name.substring(1))
                .collect(Collectors.toList());
    }
}