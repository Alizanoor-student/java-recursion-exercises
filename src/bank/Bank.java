package bank;
class Account{
   //Access Modifiers in java
    public String name;
    protected String email;
    private String password;
    //We can access the private modifiers through Getters and Setters Functions
    //Getter
    public String getPassword(){
        return this.password;
    }
    //Setter
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna college";
        account1.email = "apnacollege@gmail.com";
        account1.setPassword(("abc"));
        System.out.println(account1.getPassword());
    }
}
