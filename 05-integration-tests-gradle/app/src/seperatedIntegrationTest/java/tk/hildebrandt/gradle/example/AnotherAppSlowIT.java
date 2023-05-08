package tk.hildebrandt.gradle.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnotherAppSlowIT {

   @Test
   void verySlowTest(){
      System.out.println("startApplication for very slow test");
      try {
         Thread.sleep(12000);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }
      System.out.println("finished test");
   }
}
