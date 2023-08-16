import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(0, 2);
            arrayList.add(random.nextInt(0, 2));
            linkedList.add(random.nextInt(0, 2));
        }
        sort(array, arrayList, linkedList);
    }
    public static void sort(int[] array, ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        Arrays.sort(array);
        System.out.println("Массив: " + Arrays.toString(array));
        Collections.sort(arrayList);
        System.out.println("ArrayList: " + arrayList);
        Collections.sort(linkedList);
        System.out.println("LinkedList: " + linkedList);
    }
}
