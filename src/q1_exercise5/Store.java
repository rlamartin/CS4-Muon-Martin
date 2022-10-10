/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise5;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private int index;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    itemList  = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index > this.itemList.size()){
        
        System.out.println("There are only " + this.itemList.size() + " items in the store");
    }else{
        this.earnings += this.itemList.get(index).getCost();
        System.out.println("The store earned " + this.itemList.get(index).getCost() + " Pesos");
    }
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    for(Item i: this.itemList){
        if(name.equals(i.getName())){
            this.earnings += i.getCost();
            System.out.println("The store earned " + i.getCost() + " Pesos");
        }
        if(!name.equals(i.getName())){
            System.out.println("The store doesn't sell " + name);
        }
    }
    
    
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    
// get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    this.itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(Item i: this.itemList){
        if(type.equals(i.getType())){
            System.out.println(i.getName() + " is a/an " + type);
        }
        else{
            System.out.println(i.getName() + " is not a/an " + type);
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
