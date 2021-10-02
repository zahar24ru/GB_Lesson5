package zit;

public class Main {

    public static void main(String[] args) {
        Employee[] User = new Employee[6];
        User[0] = new Employee("Kostia_Zakharov", "QA", "zaharovkostia@yandex.ru", "+79993131488", 20, 31);
        User[1] = new Employee("Mihail_Zanosov", "Programmer", "miha_lol@ya.ru", "+79993331444", 25, 40);
        User[2] = new Employee("Alexandr_Ivanov", "HR", "Alex@gmail.com", "+79233004421", 19, 28);
        User[3] = new Employee("Gerorg_Tihonskov", "Cleaner", "unknown", "2586899", 31, 41);
        User[4] = new Employee("Zarudski_Allex", "WTF", "wtf@wtf.рф", "+79993331115", 100, 19);
        User[5] = new Employee("Bill_Gates", "Boss", "microsoft@live.ru", "Skype", 200, 60);

        for (Employee userAge : User) {
            if (userAge.getAge() >= 60)
                System.out.print(userAge);
        }
    }
}
