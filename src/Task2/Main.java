package Task2;

public class Main {
    static String[] food;
    static StringBuilder stringBuilder;

    public static void main(String[] args) {

        food = new String[]{"orange", "plum", "tomato", "onion","grape", "onion"};
        stringBuilder = new StringBuilder();
        int count = 1;


        for (String str : food) {
            stringBuilder.append(count).append(".").append(str).append("\n");
            count++;
        }
        stringBuilder.delete(27,32);
        stringBuilder.delete(38,43);

//        for (String counter: food) {
//            stringBuilder.append(counter);
//            count++;
//        }
        System.out.println(stringBuilder);
    }
}
