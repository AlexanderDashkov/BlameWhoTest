import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SampleClassOne {
    // throws NullPointer Exception
    public void invokeJackException() throws IOException{
        Files.createFile(Paths.get("fileToDelete.txt"));
        Path fileToDeletePath = Paths.get("fileToDelete_jdk7.txt");
        Files.delete(fileToDeletePath);
    }
	//throws ArithmeticException
	public void invokeJaneException(){
	    int n = 10.0/ 0;
	}
}
