package tk.hildebrandt.maven.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibTest {

   @Test
   void exampleTest(){
      assertEquals("testclass tk.hildebrandt.maven.example.Lib", Lib.calculateName("test"));
   }
}
