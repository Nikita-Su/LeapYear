package constructor_overloading;

public class LeapYear {
    int year ;
    boolean isLeap;
    LeapYear() {
        System.out.println("No value");
    }
    LeapYear(int y) {
        year = y;
    }
    void display() {
        System.out.println(year + " is a leap year: " + isLeap);
    }

    public static void main(String[] args) {
        LeapYear year1 = new LeapYear();
         year1.display();
        LeapYear year2 = new LeapYear(2024);
        if ((year2.year % 4 == 0 && year2.year % 100 != 0)|| (year2.year % 400 == 0)) {
        year2.isLeap = true;
        } else {
            year2.isLeap = false;
        }
        year2.display();

        LeapYear year3 = new LeapYear(2025);
        if ((year3.year % 4 == 0 && year3.year % 100 != 0) || (year3.year % 400 == 0)) {
            year3.isLeap = true;
        } else {
            year3.isLeap = false;
        }
        year3.display();
    }
}

