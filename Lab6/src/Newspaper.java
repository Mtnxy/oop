public class Newspaper extends Book {
    private int pages;
    private double price;
    private String date;

    public Newspaper(String name,String date){
        super(name);

        this.date = date;

    }
    public String getDate(){
        return getDate();
    }
    public double getPrice(){
        return getPrice();
    }
    public int getPages(){
        return getPages();
    }
    public void setPrice(double price){
        this.price = price;

    }
    public void setPages(int pages){
        this.pages = pages;

    }

    @Override
    public double discountAmount(){
        double disc = this.price*0.05;
        return disc;

    }
    @Override
    public void displayInfo(){
        System.out.print("For Date: "+ getDate() +"Name: " +getTitleName()+"Total Pages: "+getPages()+"Price: "+ getPrice() +"Baht"+"Discount: "+discountAmount()+"Baht" );

    }


}
