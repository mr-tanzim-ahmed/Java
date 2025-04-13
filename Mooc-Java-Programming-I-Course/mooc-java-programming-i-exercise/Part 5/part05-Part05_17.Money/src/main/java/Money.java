
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public double amount(){
        return (double)this.cents()/100+this.euros();
    }
    public Money plus(Money addition){
        Money newMoney= new Money(this.euros()+addition.euros(), this.cents()+addition.cents());
        return  newMoney;
    }
    public boolean lessThan(Money compared){
        if(this.amount()<compared.amount()){
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        int euros= this.euros()-decreaser.euros();
        int cents= this.cents()-decreaser.cents();
        if((this.amount()-decreaser.amount())>0){
            if(cents<=0){
                euros--;
                cents= cents+100;
            }
            return new Money(euros,cents);
        }
        return new Money(0, 0);
    }
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
