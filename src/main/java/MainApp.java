import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,6,9,1,4,8);
        List<Integer> list2 = Arrays.asList(1,4,8,9,3,6);
        List<Integer> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(list3);

    }
}
