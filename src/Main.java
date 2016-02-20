import ru.sample.SampleClassTwo;

/**
 * Created by Alexander on 20.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        SampleClassOne sampleClassOne = new SampleClassOne();
        SampleClassTwo sampleClassTwo= new SampleClassTwo();
        sampleClassTwo.packageExceptionMethod();
    //    sampleClassOne.invokeJackException();
    }
}
