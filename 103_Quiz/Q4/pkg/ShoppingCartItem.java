package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem(){
        itemName="nothing";
        itemCost= 0.0;
        quantity=0;
    }
    public ShoppingCartItem(String itemName, double itemCost, int quantity){
        this.itemName=itemName;
        this.itemCost=itemCost;
        this.quantity=quantity;
    }
    public void cartToString(){
        System.out.println("You have "+quantity+" of "+itemName+" for $"+itemCost+" each");
    }
    public String getItemName(){
        return itemName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getItemCost(){
        return itemCost;
    }
    public double getTotalCost(){
        return itemCost*quantity;
    }
    public double getTotalWithTax(){
        return getTotalCost()*1.12;
    }
    public double quantityToCostCalculator(int quantity){
        return quantity*itemCost;
    }
    public boolean compareItemCost(ShoppingCartItem item3){
        if (itemCost<item3.getItemCost()){
            return true;
        }
        else{
            return false;
        }
    }
    public ShoppingCartItem copyCart(){
        return this;
    }
}
