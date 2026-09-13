class LibraryItem{
    protected String title;
    protected int id;

    public LibraryItem(String title, int id) {
        this.title=title;
        this.id=id;
    }
    void checkout() {
        System.out.println("Checkout: the books has been borrowed");
    }
    
}