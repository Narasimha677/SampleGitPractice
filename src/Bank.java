public class Bank {
    String name;
    int amount;
    int accountNo;
    public Bank(String name,int amount,int accountNo){
        this.name=name;
        this.accountNo=accountNo;
        this.amount=amount;
    }

    //public void Deposit(){}


    public int Balance(int accountNo){
        if(this.accountNo==accountNo){
            System.out.println("name = " + name);
            System.out.println("balance amount" + amount);
        
    }

}
