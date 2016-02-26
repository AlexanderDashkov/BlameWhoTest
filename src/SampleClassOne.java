/**
 * Created by александр on 20.02.2016.
 */
public class SampleClassOne {

    // throws NullPointer Exception
    public void invokeJackException(){
        String s = null;
        s.hashCode();
    }
	
	//throws ArithmeticException
	public void invokeJaneException(){
	    int n = 10.0/ 0;
	}
}
