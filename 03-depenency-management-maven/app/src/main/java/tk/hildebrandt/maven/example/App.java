package tk.hildebrandt.maven.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

   public static void main(String[] args) {
      System.out.println(Lib.calculateName(App.class.getSimpleName()));
   }
   @GetMapping("/hello")
   public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
   }
}
