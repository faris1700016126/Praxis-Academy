package OOP.Customer;

/**
*Customer
 */

public class Customer 
{
    private String place order;
    private String knows name;
    private String knows address;
    private String knows customer number;
    private String order history;


    public Customer(String knows_name, String knows_address) {
        this.knows_name = knows_name;
        this.knows_address = knows_address;
    }

    public void order(Order order){
        order.orderItemDetail();
    }

}
