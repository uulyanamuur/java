public class Book {
    private String title;
    private int pages;
    public Book(String n, int a){
        title = n;
        pages = a;
    }
    public Book(String n){
        title = n;
        pages = 0;
    }
    public Book(){
        title = "1984";
        pages = 300;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String toString(){
        return this.title+", pages "+this.pages;
    }
}