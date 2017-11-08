package Chapter_08;
/*
(Compute the weekly hours for each employee) Suppose the weekly hours for all employees are stored in a two-dimensional array.
Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours
for eight employees. Write a program that displays employees and their total hours in decreasing order of the total hours.
            Su  M   T   W   Th  F   Sa
Employee 0  2   4   3   4   5   8   8
Employee 1  7   3   4   3   3   4   4
Employee 2  3   3   4   3   3   2   2
Employee 3  9   3   4   7   3   4   1
Employee 4  3   5   4   3   6   3   8
Employee 5  3   4   4   6   3   4   4
Employee 6  3   7   4   8   3   8   4
Employee 7  6   3   5   9   2   7   9
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int week[][] =
                {{2, 4, 3, 4, 5, 8, 8},
                 {7, 3, 4, 3, 3, 4, 4},
                 {3, 3, 4, 3, 3, 2, 2},
                 {9, 3, 4, 7, 3, 4, 1},
                 {3, 5, 4, 3, 6, 3, 8},
                 {3, 4, 4, 6, 3, 4, 4},
                 {3, 7, 4, 8, 3, 8, 4},
                 {6, 3, 5, 9, 2, 7, 9}};

        // print before sorting
        int sumHours[][] = sumWorkingHours(week);
        for (int i = 0; i < sumHours.length; i++) {
            System.out.println("Employee " + sumHours[i][0] + " - hours worked: " + sumHours[i][1]);
        }

        System.out.println("-----------------------------------");

        // sort array
        int sortedSumHours[][] = sortHours(sumHours);

        // print after sorting
        for (int i = 0; i < sortedSumHours.length; i++) {
            System.out.println("Employee " + sortedSumHours[i][0] + " - hours worked: " + sortedSumHours[i][1]);
        }

    }

    /** Sum up hours from Monday to Friday for each employee*/
    public static int[][] sumWorkingHours(int[][] week){
        int sum = 0;
        int hours[][] = new int[week.length][2];
        // sum up hours for each employee
        for (int employee = 0; employee < week.length; employee++) {
            // sum up all hours
            for (int day = 1; day < 6; day++) {
                sum += week[employee][day];
            }

            // write data into hours array
            hours[employee][0] = employee;
            hours[employee][1] = sum;
            sum = 0;
        }
        return hours;
    }

    /** Sort employees and hours - decreasing order of worked hours */
    public static int[][] sortHours(int [][] sumHours){
        for (int i = 0; i < sumHours.length; i++) {
            // find maximum
            int currentMaxIndex = i;
            int currentMax =  sumHours[i][1];
            int empNumber = sumHours[i][0];

            for (int j = i + 1; j < sumHours.length; j++) {
                if (sumHours[j][1] > currentMax){
                    currentMax = sumHours[j][1];
                    empNumber = sumHours[j][0];
                    currentMaxIndex = j;
                }
            }

            // swap if required
            if (currentMaxIndex != i){
                sumHours[currentMaxIndex][0] = sumHours[i][0];
                sumHours[currentMaxIndex][1] = sumHours[i][1];
                sumHours[i][0] = empNumber;
                sumHours[i][1] = currentMax;
            }
        }
        return sumHours;
    }
}
