package Cycle1.lib.Test;
import java.io.IOException;
import java.util.Scanner;
import org.testng.annotations.*;
import org.testng.asserts.*;

import Cycle1.lib.AddTodoTest;

import org.junit.*;
import org.testng.Assert;
import org.testng.TestNG;

public class TestSuite() { 
   
   AddTodoTest add = new AddTodoTest();

   @Test
   public void test() {
         FileWriter writer = new FileWriter("George.csv");
         writer.append( "test" );
         writer.append( ',' );
         writer.append( "low" );
         writer.append( ',' );
         writer.append( "difficult" );
         writer.append( ',' );
         writer.append( "long" );
         writer.append( '\n' );
         writer.flush();
         writer.close();
   
      List <String[]> expected = new ArrayList<>();
      expected.add(new String[]{"test", "low", "difficult", "long"});
   
      List <String[]> actual = new ArrayList<>();
      actual.add(new String[]{"test", "low", "difficult", "long"});
   
      Assert.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         for (int j = 0; j < expected.get(i).length; j++) {
            Assert.assertEquals(expected.get(i)[j], actual.get(i)[j]);
         }
      }
   }
   public void testName() {	
      String [] task = add();
      Assert.assertEquals("task2", task[0]);   
      Assert.assertEquals("TASK3", task[0]);   
      Assert.assertNotEquals("", task[0]);
      Assert.assertNotEquals("task2", task[1]);
      Assert.assertNotEquals("hw1", task[2]);
      Assert.assertNotEquals("todo3", task[3]);
   }   
   public void testPriority() {	
      String [] task = add();
      Assert.assertEquals("low", task[1]);   
      Assert.assertEquals("LOW", task[1]);   
      Assert.assertNotEquals("", task[1]);
      Assert.assertNotEquals("HIGH", task[0]);
      Assert.assertNotEquals("Low", task[1]);
      Assert.assertNotEquals("high", task[3]);
   }
   
   public void testDifficulty() {	
      String [] task = add();
      Assert.assertEquals("difficult", task[2]);   
      Assert.assertEquals("Easy", task[2]);   
      Assert.assertNotEquals("", task[2]);
      Assert.assertNotEquals("EASY", task[1]);
      Assert.assertNotEquals("easy", task[0]);
      Assert.assertNotEquals("DIFFICULT", task[3]);
   }   
   
   public void testTimeLength() {	
      String [] task = add();
      Assert.assertEquals("short", task[3]);   
      Assert.assertEquals("LONG", task[3]);   
      Assert.assertNotEquals("", task[3]);
      Assert.assertNotEquals("long", task[0]);
      Assert.assertNotEquals("Short", task[1]);
      Assert.assertNotEquals("SHORT", task[2]);
   }    
}