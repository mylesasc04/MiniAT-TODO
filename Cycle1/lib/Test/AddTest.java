package Cycle1.lib.Test;
import java.util.Scanner;
import org.testng.annotations.*;
import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.TestNG;

public class AddTest {

 
   @Test
   public void testDescription() {	
      String description = new String("Get milk");
      Assert.assertEquals(description, "Get milk");   
      Assert.assertNotEquals(description, "Get mikl");
   }   
   @Test
   public void testDueDate() {	
      String dueDate = new String("02/24/2022");
      Assert.assertEquals(dueDate, "02/24/2022");
      Assert.assertNotEquals(dueDate, "February 24, 2022");
   }
   @Test
   public void testID() {	
      String ID = new String("1");
      Assert.assertEquals(ID, "1");
      Assert.assertNotEquals(ID, "2");
   }   

}