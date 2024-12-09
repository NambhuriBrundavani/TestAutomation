package Annotation;

import org.testng.annotations.Test;

public class TestCase03  extends GenericScript
{
     @Test
     public void Title()
     {
    	 String title = driver.getTitle();
    	 System.out.println(title);
     }
}
