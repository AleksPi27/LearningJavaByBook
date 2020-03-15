import com.example.objectsasparameters.ObjectsAsParameters;
import com.example.overloadofconstructor.TestBox;
import com.example.passingArgumentsToTheMethod.TestArgumentsByValueAndByReference;
import com.example.returningObjects.ReturningObjects;
import com.example.returningObjects.TestReturningObjects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OverloadOfMethods overloadOfMethods =new OverloadOfMethods();
        double result;
        overloadOfMethods.test();
        overloadOfMethods.test(15);
        overloadOfMethods.test(12,17);
       result = overloadOfMethods.test(19.3);
 System.out.println("Result of the previous method is "+result);

        TestBox testBox=new TestBox();
        testBox.testBox();

        ObjectsAsParameters objectsAsParameters1=new ObjectsAsParameters(100,-101);
        ObjectsAsParameters objectsAsParameters2=new ObjectsAsParameters(100,-101);
        ObjectsAsParameters objectsAsParameters3=new ObjectsAsParameters(5,-6);

        System.out.println("obj1==obj2: "+ objectsAsParameters1.equalTo(objectsAsParameters2));
        System.out.println("obj1==obj3: "+objectsAsParameters1.equalTo(objectsAsParameters3));

        ObjectsAsParameters objectsAsParameters4=new ObjectsAsParameters(objectsAsParameters3);

        System.out.println("obj3==obj4: " + objectsAsParameters3.equalTo(objectsAsParameters4));

        TestArgumentsByValueAndByReference test=new TestArgumentsByValueAndByReference();
        test.test();

        TestReturningObjects testReturn=new TestReturningObjects();
        testReturn.test();
    }
}
