public class SalaryIncrease {
    public static void main(String[] args) {

        int salary = 50000;

        for (int month = 1; month <= 6; month++) {
            salary = salary + 2000;
            System.out.println("Month " + month + " Salary: " + salary);
        }

    }
}
