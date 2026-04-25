import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 6, 9, 1, 4, 8);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 3, 6));

        int i = 0;
        for (Integer each : list1) {
            list2.remove(i);
            list2.add(i, each);
            i++;
        }
        System.out.println(list2);

        //List<Integer> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        //System.out.println(list3);


    }
}
