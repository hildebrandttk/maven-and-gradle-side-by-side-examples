package tk.hildebrandt.maven.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
   @Id
   private Long id;

   private String name;

   public DemoEntity() {
   }

   public DemoEntity(String name) {
      this.name = name;
   }

   public Long getId() {
      return id;
   }

   protected DemoEntity setId(Long id) {
      this.id = id;
      return this;
   }

   public String getName() {
      return name;
   }

   public DemoEntity setName(String name) {
      this.name = name;
      return this;
   }
}
