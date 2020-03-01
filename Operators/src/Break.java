public class Break {

    public static void main(String[] args) {

        boolean t=true;
        first: {
            second: {
                third: {
                System.out.println("Предшествует оператору break");
                if(t) break second;
                System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор выполняться не будет");
            }
            System.out.println("Этот блок кода будет выполнен сразу после перехода к метке");
        }

        Continue.continueMethod();
    }
}
