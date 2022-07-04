
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task5 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("task5.txt");
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        String[] arr = line.split(" ");
        in.close();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        for (String counter : list) {
            System.out.print(counter+" ");
        }
        System.out.println("\n"+countByForEachLoopWithMapMerge(list));
    }

    public static <T> Map<T, Long> countByForEachLoopWithMapMerge(List<T> inputList) {
        Map<T, Long> resultMap = new HashMap<>();
        inputList.forEach(e -> resultMap.merge(e, 1L, Long::sum));
        return resultMap;
    }
}