//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void performLogin(User user) {
        user.login();
    }
    public static void main(String[] args) {
        Customer customer1 = new Customer("001", "Houcem Eddine", "houcem@gg.com", 100);
        Customer customer2 = new Customer("002", "Ahmed ", "ahmed@gg.com", 200);
        Administrator admin = new Administrator("003", "Ali", "ali@gg.com", "Manage Users");

        // Demonstrate polymorphism
        performLogin(customer1);
        performLogin(admin);

        // Demonstrate upcasting and downcasting
        User user = customer1; // Upcasting
        if (user instanceof Customer) {
            Customer downcastedCustomer = (Customer) user; // Downcasting
            System.out.println("Loyalty Points: " + downcastedCustomer.getLoyaltyPoints());
        }

        System.out.println("Customer1 equals Customer2: " + customer1.equals(customer2)); // Should return true

        // Display roles
        System.out.println(customer1.getName() + " is a " + customer1.getRole());
        System.out.println(admin.getName() + " is an " + admin.getRole());
    }
}