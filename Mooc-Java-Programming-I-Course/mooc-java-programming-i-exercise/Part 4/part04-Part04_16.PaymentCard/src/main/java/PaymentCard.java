public class PaymentCard {
    private double balance;
    public PaymentCard(double openingBalance){
        this.balance= openingBalance;
    }
    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    public void eatAffordably(){
        if(this.balance>=2.60){
            this.balance= this.balance-2.60;
        }
        return;
        
    }
    public void eatHeartily(){
        if(this.balance>=4.60){
            this.balance= this.balance-4.60;
        }
        return;
    }
    public void addMoney(double amount){
        if(amount>0){
            if(this.balance+amount < 150){
                this.balance= this.balance+amount;
            }
            else{
                this.balance=150;
            }
        }
        
    }
}
