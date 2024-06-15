import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> copyIntList = new ArrayList<>(intList);

        Iterator<Integer> listIterator = copyIntList.iterator();

        while (listIterator.hasNext()) {
            Integer x = listIterator.next();
            if (x <= 0 || x % 2 != 0) {
                listIterator.remove();
            }
        }

        Collections.sort(copyIntList);

        System.out.println(copyIntList);
    }
}