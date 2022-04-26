package Cycle1.lib.Test;
import java.io.IOException;
import java.util.Scanner;
import org.testng.annotations.*;
import org.testng.asserts.*;

import Cycle1.lib.AddTodoTest;

import org.junit.*;
import org.testng.Assert;
import org.testng.TestNG;

public class DeleteTest {

   Delete delete = new Delete();

   @Test
   public void testName(String line) throws Exception {	
      String [] task = delete(line);
      Assert.assertEquals("", task[0]);   
      Assert.assertNotEquals("", task[1]);
      Assert.assertNotEquals("", task[2]);
      Assert.assertNotEquals("", task[3]);
   }    
   @Test
   public void testPriority(String line) throws Exception {	
      String [] task = delete(line);
      Assert.assertEquals("", task[1]);   
      Assert.assertNotEquals("", task[0]);
      Assert.assertNotEquals("", task[2]);
      Assert.assertNotEquals("", task[3]);
   }
   @Test
   public void testDifficulty(String line) throws Exception {	
      String [] task = delete(line);
      Assert.assertEquals("", task[2]);   
      Assert.assertNotEquals("", task[0]);
      Assert.assertNotEquals("", task[1]);
      Assert.assertNotEquals("", task[3]);
   }   
   @Test
   public void testTimeLength(String line) throws Exception {	
      String [] task = delete(line);
      Assert.assertEquals("", task[3]);   
      Assert.assertNotEquals("", task[0]);
      Assert.assertNotEquals("", task[1]);
      Assert.assertNotEquals("", task[2]);
   }    
}   