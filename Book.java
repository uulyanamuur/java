public class Book {
    private String title;
    private int pages;
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    public Book(String title){
        this.title = title;
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
    public void book(){
        System.out.println("Let's read \'" + this.title + "\'");
    }
}
