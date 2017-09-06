package sample01;



public class Book {
    
	private String Author;
    private Integer year;
 
    public String getAuthor() {
        return Author;
    }
 
    public void setAuthor(String author) {
        Author = author;
    }
 
    public Integer getYear() {
        return year;
    }
 
    public void setYear(Integer year) {
        this.year = year;
    }
 
    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", year=" + year +
                '}';
    }
}