package tk.hildebrandt.maven.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppIT {

   @Test
   void startApplication(){
      System.out.println("startApplication");
   }
}
