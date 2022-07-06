import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task5 {

    public static void main(String[] args) throws FileNotFoundException {
        String key = null;
        int value = 0;
        int maxCount = 0;
        List<String> list = listCreate(new File("task5.txt"));
        System.out.println("Исходный список слов:\n" + list);
        Collections.sort(list);
        System.out.println("Отсортированный список слов:\n" + list);
        System.out.println("Сколько раз каждое слово встречается в файле:\n" + namberRepetitions(list));
        for (Map.Entry<String, Integer> entry : namberRepetitions(list).entrySet()) {
            value = entry.getValue();
            if (value > maxCount) maxCount = value;
        }
        for (Map.Entry<String, Integer> entry : namberRepetitions(list).entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.printf("'%s' встречается в файле %d раз(а)", key, value);
        }
    }

    public static List<String> listCreate(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        String[] arr = line.split(" ");
        in.close();
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> Map<T, Integer> namberRepetitions(List<T> inputList) {
        Map<T, Integer> resultMap = new HashMap<>();
        inputList.forEach(e -> resultMap.merge(e, 1, Integer::sum));
        return resultMap;
    }
}