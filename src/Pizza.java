
public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int ExtraCheeseAmount;
    private boolean checkForCheese;
    private int ExtraToppingAmount;
    private boolean checkForTopping;
    private int bagPrice;
    private boolean checkForBag;
    private boolean checkForBill;

    public Pizza(Boolean isVeg){
        this.checkForBag=false;
        this.checkForCheese=false;
        this.checkForTopping=false;
        this.checkForBill=false;
        this.isVeg = isVeg;
        this.ExtraCheeseAmount=80;
        this.bagPrice=20;
        if(isVeg){
            this.price=300;
            this.ExtraToppingAmount=70;
        }else{
            this.price=400;
            this.ExtraToppingAmount=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        if(!checkForCheese) {
            this.bill=this.bill+"Extra Cheese Added: "+this.ExtraCheeseAmount+"\n";
            this.price=this.price+this.ExtraCheeseAmount;
            this.checkForCheese=true;
        }
    }

    public void addExtraToppings() {;
        if (!checkForTopping) {
            this.bill=this.bill+"Extra Toppings Added: "+this.ExtraToppingAmount+"\n";
            this.price=this.price + this.ExtraToppingAmount;
            this.checkForTopping=true;
        }
    }

    public void addTakeaway() {
        if (!checkForBag) {
            this.bill=this.bill+"Paperbag Added: "+this.bagPrice+"\n";
            this.price=this.price+this.bagPrice;
            this.checkForBag=true;
        }
    }
    public String getBill(){
        if(!checkForBill){
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            this.checkForBill=true;
        }
        return this.bill;
    }
}
