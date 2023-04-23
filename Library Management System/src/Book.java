
public class Book {
    private int ISBN;
    private String Title;
    private Name Author;
    private String Category;
    private String Genre;
    private String description;
    private Catalog location;
    private Date published;
    private String status;
    private Date borrowed;
    
    public Book(){
        ISBN = 0;
        Title = null;
        Author = null;
        Category = null;
        Genre = null;
        description = null;
        location = null;
        published = null;
        status = null;
        borrowed = null;
    }

    public Book(int ISBN, String Title, Name Author, String Category, String Genre, 
            String description, Catalog location, Date published, String status,Date borrowed) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
        this.Category = Category;
        this.Genre = Genre;
        this.description = description;
        this.location = location;
        this.published = published;
        this.status = status;
        this.borrowed = borrowed;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Name getAuthor() {
        return Author;
    }

    public void setAuthor(Name Author) {
        this.Author = Author;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getLocation() {
        return location;
    }

    public void setLocation(Catalog location) {
        this.location = location;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Date borrowed) {
        this.borrowed = borrowed;    
    }
    
    
    @Override
    public String toString(){
	StringBuilder a = new StringBuilder();
        a.append("ISBN: ");
        a.append(ISBN);
        a.append("\nTITLE: ");
        a.append(Title);
        a.append("\nAUTHOR: ");
        a.append(Author);
        a.append("\nCATEGORY: ");
        a.append(Category);
        a.append("\nGENRE: ");
        a.append(Genre);
        a.append("\nDESCRIPTION: ");
        a.append(description);
        a.append("\nCATALOG: ");
        a.append(location);
        a.append("\nPUBLISHED: ");
        a.append(published);
        a.append("\nSTATUS: ");
        a.append(status);
        a.append("\nDATE BORROWED: ");
        a.append(borrowed);
    return a.toString();
    }
}