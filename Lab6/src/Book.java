public abstract class Book {
    private String titleName;
    private String author ;

    public Book(String title){
        this.titleName =title;

    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getTitleName(){
        return getTitleName();
    }

    public String getAuthor(){
        return getAuthor();
    }
    public abstract double discountAmount();
    public abstract void displayInfo();



}
