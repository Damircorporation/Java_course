package family_Tree;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setMother(human2);
    }
}
