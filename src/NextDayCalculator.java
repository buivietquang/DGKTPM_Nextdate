public class NextDayCalculator {
    public static void main(String[] args) {
       
        int d = 31;  
        int m = 12;  
        int y = 2023; 

        int[] nextDay = findNextDay(d, m, y);
        System.out.println("Ngày tiếp theo: " + nextDay[0] + "/" + nextDay[1] + "/" + nextDay[2]);
    }

    public static int[] findNextDay(int d, int m, int y) {
   
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      
        if (isLeapYear(y)) {
            monthDays[1] = 29;
        }

      
        d++;

      
        if (d > monthDays[m - 1]) {
            d = 1;
            m++;  
            if (m > 12) {  
                y++;  
            }
        }

        return new int[]{d, m, y};
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
