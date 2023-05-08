package tk.hildebrandt.maven.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("slowtest")
class AppSlowIT {

   @Test
   void slowTest(){
      System.out.println("startApplication for slow test");
      try {
         Thread.sleep(10000);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
      System.out.println("finished test");
   }
}
