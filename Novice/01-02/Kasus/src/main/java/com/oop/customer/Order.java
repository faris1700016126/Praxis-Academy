package OOP.Customer;

/**
*order
 */

 public class Order 
 {
     private String knows placement date;
     private String delivery date;
     private String order_items;
     private int price_items;
     private int amount;
     private int total;
     private String applicable taxes;
     private String order number;

     public order (String order_items, int price_items, int total, int amount){
         this.order_item = order_items;
         this.price_item = price_item;
         this.total = total;
         this.amount = amount;
     }

     public void orderItemDetail(){

         total = price_items * amount;

         System.out.println("---------Your Detail Order--------");
         System.out.println("name items : " + order_items);
         System.out.println("price item : " + price_items);
         System.out.println("amount item : " + amount);
         System.out.println("total : " + total);
     }
 }