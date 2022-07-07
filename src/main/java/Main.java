public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "5555 №666666";
        post.patronymic = "Петрович";
        post.phone = "+7 (964)-342-92-35";
        post.surname = "Плотских-Поцелуев";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 31;
        post.birthday.month = 07;
        post.birthday.year = 1968;
    }
}
