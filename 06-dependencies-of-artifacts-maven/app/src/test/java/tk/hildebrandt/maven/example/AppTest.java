package tk.hildebrandt.maven.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import tk.hildebrandt.maven.example.AppLogging;

class AppTest {

   @Test
   void exampleTest(){
      assertNotNull(AppLogging.class.getSimpleName());
   }
}
