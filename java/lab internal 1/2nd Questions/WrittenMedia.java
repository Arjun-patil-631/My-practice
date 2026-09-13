class WrittenMedia extends LibraryItem {
    protected String author;
    protected int pageCount;

    WrittenMedia(String title, int id, String author, int pageCount) {
        super(title, id);
        this.author = author;
        this.pageCount = pageCount;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}
