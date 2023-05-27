package mavenproject1;  
import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;  
public class NewTestAdd   
{  
@Test  
@Parameters({"a","b"})  
public void add(int a, int b)  
{  
int sum=b+a;  
System.out.println("Sum of two numbers : "+sum);  
}  
}  
