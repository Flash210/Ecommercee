
class Administrator extends User {
    private String privileges;

    public Administrator(String userId, String name, String email, String privileges) {
        super(userId, name, email);
        this.privileges = privileges;
    }

    public String getPrivileges() {
        return privileges;
    }

    @Override
    public void login() {
        System.out.println("Administrator " + getName() + " logged in.");
    }

    @Override
    public String getRole() {
        return "Administrator";
    }
}
