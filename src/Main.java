public class Main {
    public static void main(String[] args) {
        Human human1 =new Human(-35, null," Минск","бренд-менеджером" );
        Human human2 =new Human(39, " Аня ","  Москва", "методистом образовательных программ");
        Human human3 =new Human(28, " Катя "," Калининград","продакт-менеджером.");
        Human human4 =new Human(27, " Артем "," Москва","директором по развитию бизнеса.");
        Human human5 =new Human("Anna",26);
        human1.greetings();
        human2.greetings();
        human3.greetings();
        human5.greetings();


    }
}