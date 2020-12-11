package ch2;

import java.util.ArrayList;

class Pizza { 
 java.util.ArrayList toppings = new ArrayList<>(); 
 public  void addTopping(String topping) { 
  
 System.out.println(toppings.add(topping));
 } 
 } 
 public class PepperoniPizza extends Pizza { 
 public void addTopping(String topping) { 
 System.out.println("Cannot add Toppings"); 
 } 
 public static void main(String[] args) { 
 Pizza pizza = new Pizza(); 
 pizza.addTopping("Mushrooms"); 
 } 
 }

