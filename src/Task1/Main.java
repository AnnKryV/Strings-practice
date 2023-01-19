package Task1;


public class Main {

    static String[] food;
    static StringBuilder stringBuilder;

    public static void main(String[] args) {

        food = new String[]{"brange", "plum", "tomato", "onibn","grape"};
        stringBuilder = new StringBuilder();

        for (String name : food) {
            stringBuilder.append(name).append("\n");
        }

        stringBuilder.replace(0,1, "o");
        stringBuilder.replace(22,23,"o");

        stringBuilder.insert(0,"1.");
        stringBuilder.insert(9,"2.");
        stringBuilder.insert(16,"3.");
        stringBuilder.insert(25,"4.");
        stringBuilder.insert(33,"5.");

        System.out.println(stringBuilder);

    }
}
