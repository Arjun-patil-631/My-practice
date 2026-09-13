
final class RareManuscript extends WrittenMedia {
    private String conservationRule;

    RareManuscript(String title, int id, String author,
                   int pageCount, String conservationRule) {
        super(title, id, author, pageCount);
        this.conservationRule = conservationRule;
    }

    @Override
    void checkout() {
        System.out.println("Checkout denied:cannot be borrowed.");
    }

    void showConservationRule() {
        System.out.println("Conservation Rule: " + conservationRule);
    }
}

