
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    private static final double affordableMealCosts =2.50;
    private static final double heartyMealCosts= 4.30;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money= 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if((payment-affordableMealCosts)>=0){
            this.money= this.money+affordableMealCosts;
            this.affordableMeals++;
            return payment-affordableMealCosts;
        }
        return payment;
    }
    public boolean eatAffordably(PaymentCard card){
        if((card.balance()-affordableMealCosts)>=0){
            this.affordableMeals++;
            return card.takeMoney(affordableMealCosts);
        }
        return false;
    }
    
    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if((payment-heartyMealCosts)>=0){
            this.money= this.money+heartyMealCosts;
            this.heartyMeals++;
            return payment-heartyMealCosts;
        }
        return payment;
    }

    public boolean eatHeartily(PaymentCard card){
        if((card.balance()-heartyMealCosts)>=0){
            this.heartyMeals++;
            return card.takeMoney(heartyMealCosts);
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum>0){
            card.addMoney(sum);
            this.money= this.money+sum;
        }
       
    }
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
