public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        int [] cost = {5734,8482,98773,46,857};
        int sum = 0;
        for (int s : cost) {
            sum = sum + s;
        }   System.out.println("Сумма трат за месяц составила "+ sum + " рублей.");
        System.out.println("Task 2");
        //Task 2
        int maxCost = -1;
        int minCost = cost [0];
        for (final int r : cost) {
            if (r > maxCost) {
                maxCost = r;
            }
        }
        for (int t = 1; t < cost.length; t++) {
            if (cost[t] < minCost) {
                minCost = cost[t];
            }
        }   System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей.");
        System.out.println("Task 3");
        //Task 3
        double sum1 = 0;
        for (int l : cost) {
            sum1 = sum1 + l;
        }   double averageSum = sum1 / cost.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
        System.out.println("Task 4");
        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}