package mavenproject1;  
import org.testng.annotations.Parameters;  
import org.testng.annotations.Test;  
public class NewTestSubtract   {  
@Test  
@Parameters({"a","b"})  
public void add(int a, int b)  
{  
int subtract=a-b;  
System.out.println("Subtraction of two numbers : "+subtract);  
}  
}  
