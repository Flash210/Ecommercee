class Customer extends User {
    private int loyaltyPoints;

    public Customer(String userId, String name, String email, int loyaltyPoints) {
        super(userId, name, email);
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public void login() {
        System.out.println("Customer " + getName() + " logged in.");
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}

