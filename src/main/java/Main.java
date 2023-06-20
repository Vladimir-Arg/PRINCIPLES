public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = Boolean.parseBoolean("true");
        FromDate FromDate = new FromDate();
        FromDate.day = 13;
        FromDate.month = 6;
        FromDate.year = 1999;
    }
}