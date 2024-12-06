package building;

import products.Butter;
import products.Cheese;
import products.Meat;
import products.Milk;
import java.util.ArrayList;
import java.util.List;

public class Storage {
     private List<Milk> milkStorage;
     private List<Meat> meatStorage;
     private List<Cheese> cheeseStorage;
     private List<Butter> butterStorage;

     public Storage() {
          milkStorage = new ArrayList<>();
          meatStorage = new ArrayList<>();
          cheeseStorage = new ArrayList<>();
          butterStorage = new ArrayList<>();
     }

     public void addMilk(String type, double weight) {
          milkStorage.add(new Milk(type, weight));
     }


     public void addMeat(String type, double weight) {
          meatStorage.add(new Meat(type, weight));
     }


     public void addCheese(String type, double weight) {
          cheeseStorage.add(new Cheese(type, weight));
     }

     public void addButter(String type, double weight) {
          butterStorage.add(new Butter(type, weight));
     }


     public void showStorage1() {
          final double MILK_WEIGHT = 0.3;
          final double MEAT_WEIGHT = 0.7;

          double totalMilkWeight = milkStorage.size() * MILK_WEIGHT;
          double totalMeatWeight = meatStorage.size() * MEAT_WEIGHT;
          double totalWeight = totalMilkWeight + totalMeatWeight;

          if (totalWeight > 30) {
               System.out.println("У меня теперь был неистощаемый запас козьего мяса, молока");
          } else {
               System.out.println("Запас молока, мяса, мал");
          }
     }
     public void showStorage2() {
          final double MILK_WEIGHT = 0.3;
          final double CHEESE_WEIGHT = 0.5;
          final double BUTTER_WEIGHT = 0.4;

          double totalMilkWeight = milkStorage.size() * MILK_WEIGHT;
          double totalCheeseWeight = cheeseStorage.size() * CHEESE_WEIGHT;
          double totalButterWeight = butterStorage.size() * BUTTER_WEIGHT;
          double totalWeight = totalMilkWeight + totalCheeseWeight + totalButterWeight;


          if (totalWeight > 30) {
               System.out.println("не испытывал недостатка молока, сыра и масла");
          } else {
               System.out.println("испытывал недостаток");
          }
     }
}
