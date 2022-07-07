import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Alex Fedenev
 * @see #main(String[])  метод ввода вывода
 * @see #listCreate(File)  передаем в метод экземпляр класса File(путь к файлу), получаем объект типа List c данными из файла
 * @see #namberRepetitionsWords(List) в метод передаем list и перебираем его, ключ кладем в экземпляр класса Map и присваиваем ему значение если отсутствует, если есть то +1
 * @see #maxRepeatWord(Map)  метод ищет слово с максимальным количеством повторений
 */
public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = listCreate(new File("task5.txt"));
        System.out.println("Исходный список слов:\n" + list);
        Collections.sort(list);
        System.out.println("Отсортированный список слов:\n" + list);
        Map<String, Integer> map = namberRepetitionsWords(list);
        System.out.println("Сколько раз каждое слово встречается в файле:\n" + map);
        maxRepeatWord(map);
    }

    public static List<String> listCreate(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        String line = in.nextLine();
        String[] arr = line.split(" ");
        in.close();
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> Map<T, Integer> namberRepetitionsWords(List<T> inputList) {
        Map<T, Integer> resultMap = new HashMap<>();
        inputList.forEach(e -> resultMap.merge(e, 1, Integer::sum));
        return resultMap;
    }

    public static void maxRepeatWord(Map<String, Integer> map) {
        String key = null;
        int value = 0;
        int maxCount = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.printf("'%s' встречается в файле %d раз(а)", key, value);
        }
    }
}