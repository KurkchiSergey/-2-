
public class Main {
    public static void main(String[] args) {
        /*Задание2.
        Напишите программу, в которой заведены две целочисленные переменные:
        income - размер заработной платы; spending для хранения размера расходов
        Программа должна выводить на экран сообщение о том, сколько денег осталось на счету.
        Не считайте в уме итоговую сумму, расчёт итоговой суммы должна производить сама программа. */
        System.out.println("------------");
        int  income = 44000;
        int spending = 30000;
        int result = income-spending;
        System.out.println("Итого (руб): ");
        System.out.println(result);
    }
}