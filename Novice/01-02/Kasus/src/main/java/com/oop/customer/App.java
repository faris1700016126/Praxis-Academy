/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package OOP.Customer;

public class App {

    public static void main(String[] args) {
        
        Customer c1 = new customer("Mahmud", "Jogja");
        Order order1 = new Order("Baju", 20000, 2);
        c1.order(order1);

        Customer cc2 = new Customer("Kadir", "Madura");
        Order order2 = new Order("Baju", 20000, 2);
        c2.order(order2);
    }
}
