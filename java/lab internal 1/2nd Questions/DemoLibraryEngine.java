public class DemoLibraryEngine {
    public static void main(String[] args) {

        RareManuscript manuscript = new RareManuscript("Ancient Manuscript",101,"William Shakespeare",250,
            "Must return books :)"
        );

        manuscript.displayInfo();
        manuscript.showConservationRule();
        manuscript.checkout();
    }
}