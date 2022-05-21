
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        advance(1);
    }
    
    public void advance(int days) {
        day += days;
        if (day > 30) {
            month += 1;
            day = day - 30;
            if (month > 12) {
                year += 1;
                month = 1;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }

}
