import ru.sample.SampleClassTwo;

import java.io.IOException;

/**
 * Created by Alexander on 20.02.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        SampleClassOne sampleClassOne = new SampleClassOne();
        SampleClassTwo sampleClassTwo = new SampleClassTwo();
//        sampleClassTwo.packageExceptionMethod();
        sampleClassOne.invokeJackException();
//		sampleClassOne.invokeJaneException();
    }
}
