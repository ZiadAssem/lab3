public class CoffeeMachine {
    public boolean isLighting = false;
    public boolean isMakingCoffee = false;
    public int money;
    public boolean isActive = false;
    private final float price = 5;

    public String PutMoney(int m){
        if(isActive) {
            this.money = m;
            return "money received";
        }
        else{
            return "Please turn the machine first";
        }
    }
    public String HelloMachine(){
        if(!isActive) {
            isActive=true;
            isLighting = true;
            return "Power On!" + "Lights On!";
        }
        else{
            return "Machine Already On";
        }
    }
    public String ByeMachine(){
        if(isActive) {
            isLighting = false;
            isActive = false;
            return "Lights Off" + "Power Off";
        }
        else{
            return "Machine Already Off";
        }
    }
    public String OrderCoffee(int x,int money){
        int count= 0;
        this.money=money;
        if ((money) >= (price)) {
            while(money>= price && x > 0){
                money -= price;
                x --;
                count++;
            }
        }
        else {
            return "Not enough Money to make "+count+" cups";
        }
        isMakingCoffee = false;
        return count+ " Cups Of coffee Made!";
    }
}
