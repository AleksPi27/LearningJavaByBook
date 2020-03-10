public class TestStack {

    public static void main(String[] args) {

        Stack stck1 = new Stack();
        Stack stck2 = new Stack();

        for (int i = 0; i < 10; i++) stck1.push(i);
        for (int i = 100; i < 110; i++) stck2.push(i);

        System.out.println("Содержимое стека 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stck1.pop() + " ");
        }
        System.out.println();
        System.out.println("Содержимое стека 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stck2.pop() + " ");
        }

        String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
        System.out.format(format, "A", "AA", "AAA");
        System.out.format(format, "B", "", "BBBBB");
        System.out.format(format, "C", "CCCCC", "CCCCCCCC");

        String ex[] = { "E", "EEEEEEEEEE", "E" };

        System.out.format(String.format(format, (Object[]) ex));
    }
}
