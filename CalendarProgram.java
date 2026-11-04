import java.util.Scanner;
import java.util.Calendar;

public class CalendarProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);

        System.out.println("\n   " + cal.getDisplayName(
            Calendar.MONTH, Calendar.LONG, java.util.Locale.US
        ) + " " + year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            if ((firstDay + day) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }
}