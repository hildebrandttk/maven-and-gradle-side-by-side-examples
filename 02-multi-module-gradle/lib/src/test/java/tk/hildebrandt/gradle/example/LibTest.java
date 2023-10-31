package tk.hildebrandt.gradle.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import tk.hildebrandt.gradle.example.Lib;

class LibTest {

   @Test
   void exampleTest(){
      assertEquals("testclass tk.hildebrandt.gradle.example.Lib", Lib.calculateName("test"));
   }
}
