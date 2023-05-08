package tk.hildebrandt.gradle.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LibTest {

   @Test
   void exampleTest(){
      assertEquals("testclass tk.hildebrandt.maven.example.Lib", Lib.calculateName("test"));
   }
}
