public class Cartoon extends Book{
    private int volumeNo;
    private double price;

    public Cartoon(String name,int volume){
        super(name);
        this.volumeNo = volume;
    }
    public double getPrice(){
        return getPrice();
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double discountAmount(){
        double disc = this.price*0.10;
        return disc;

    }
    @Override
    public void displayInfo(){
        System.out.print("Name: " +getTitleName()+"Volum: "+this.volumeNo+"Price: "+ getPrice() +"Baht"+"Discount: "+discountAmount()+"Baht" );

    }
}
