package tk.hildebrandt.gradle.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import tk.hildebrandt.gradle.example.App;

class AppTest {

   @Test
   void exampleTest(){
      assertNotNull(App.class.getSimpleName());
   }
}
