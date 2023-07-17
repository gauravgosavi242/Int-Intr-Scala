package scratch;

public class Date {
  private int day, month, year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date tomorrow(Date this) {
    // check for wrap end of month!!!
    return new Date(this.day + 1, this.month, this.year);
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static void doStuff(Object obj) {

  }

  public static void useIt() {
    doStuff(new Date(1, 1, 2024));
//    doStuff(scratch.Date);
  }
}
