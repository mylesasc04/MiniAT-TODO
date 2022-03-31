package Cycle1.lib.Test;
import java.util.Scanner;
import org.testng.annotations.*;
import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.TestNG;

public class AddTest {

   @Test
   public void testName() {	
      String name = new String();
      Assert.assertEquals(name, "task3");   
      Assert.assertNotEquals(name, "Task3");
   }   
   @Test
   public void testPriority() {	
      String priority = new String("low"); 
      Assert.assertEquals(priority, "low");
      Assert.assertNotEquals(priority, "Low");
   }
   @Test
   public void testDifficulty() {	
      String difficulty = new String("easy");
      Assert.assertEquals(difficulty, "easy");
      Assert.assertNotEquals(difficulty, "dificukt"); 
   }   
   @Test
   public void testTimeLength() {	
      String timeLength = new String("long");
      Assert.assertEquals(timeLength, "long");   
      Assert.assertNotEquals(timeLength, "3hrs");
   }   
}