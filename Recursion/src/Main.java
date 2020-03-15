import com.example.factorial.TestFactorial;
import com.example.TestArray;
import com.example.staticModificator.TestStaticModificator;
import com.example.usageOfFinal.TestFinal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TestFactorial testFactorial=new TestFactorial();
        testFactorial.test();

        TestArray testArray=new TestArray();
        testArray.test();

        TestFinal testFinal=new TestFinal();
        testFinal.test();

        TestStaticModificator testStaticModificator=new TestStaticModificator();
        testStaticModificator.test();
    }
}
