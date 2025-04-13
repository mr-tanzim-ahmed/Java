
public class MainProgram {

    public static void main(String[] args) {

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}