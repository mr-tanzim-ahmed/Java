public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue=startValue;
    }
    public Counter(){
        this.startValue=0;
    }
    public int value(){
        return startValue;
    }
    public void increase(){
        this.startValue= this.startValue+1;
    }
    public void decrease(){
        this.startValue= this.startValue-1;
    }
    public void increase(int increaseBy){
        if(increaseBy<0){
            return;
        }
        this.startValue= this.startValue+increaseBy;
    }
    public void decrease(int decreaseBy){
        if(decreaseBy>=0){
            this.startValue= startValue-decreaseBy;
        }
        return;
    }
}
