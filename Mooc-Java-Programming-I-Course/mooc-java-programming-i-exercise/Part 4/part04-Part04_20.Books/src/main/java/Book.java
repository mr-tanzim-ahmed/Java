public class Book {
    private String title;
    private int pages;
    private int year;
    public Book(String title,int pages,int year){
        this.title=title;
        this.pages=pages;
        this.year=year;
    }
    public String toString(){
        return  this.title+", "+this.pages+" pages, "+this.year;
    }
    String getTitle(){
        return title;
    }
}
