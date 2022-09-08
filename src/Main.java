import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<Worker>();
        Worker w1 = new Worker("001", "John", "Smith", "Mr.", 1999, 20.00);
        Worker w2 = new Worker("002", "Mike", "Gold", "Mr.", 1959, 35.00);
        Worker w3 = new Worker("003", "Sara", "Jane", "Ms.", 2000, 18.00);

        SalaryWorker sw1 = new SalaryWorker("004", "Ash", "Johnson","Mr.", 1996, 0, 75000);
        SalaryWorker sw2 = new SalaryWorker("005", "Jane", "Smith", "Mrs.", 1987, 0, 82000);
        SalaryWorker sw3 = new SalaryWorker("006", "Mary", "Doe", "Ms.", 1967, 0, 95000);


        workerList.add(w1);
        workerList.add(w2);
        workerList.add(w3);
        workerList.add(sw1);
        workerList.add(sw2);
        workerList.add(sw3);



        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Week 1 ------");
                int hoursWorked = 40;
                for (Worker tempWorker : workerList) {
                    System.out.println(tempWorker.displayWeeklyPay(hoursWorked));
                }

            } else if (i == 1) {
                System.out.println("Week 2 ----------------");
                int hoursWorked = 50;
                for (Worker tempWorker : workerList) {
                    System.out.println(tempWorker.displayWeeklyPay(hoursWorked));
                }

            } else if (i == 2) {
                System.out.println("Week 3 ---------");
                int hoursWorked = 40;
                for (Worker tempWorker : workerList) {
                    System.out.println(tempWorker.displayWeeklyPay(hoursWorked));
                }
            }

        }
    }
}