package tk.hildebrandt.gradle.example;

public class App {

   public static void main(String[] args) {
      System.out.println(Lib.calculateName(App.class.getSimpleName()));
   }
}
