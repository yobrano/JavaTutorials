import java.util.logging.SimpleFormatter;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if(this.day <30){
            this.day++;
        }else{
            this.day = 1;
            if(this.month<12){
                this.month++;
            }else{
                this.month = 1;
                this.year++;
            }
        }
    }


    public void advance(int noDays){
        for(int i = 0; i<noDays; i++){
            this.advance();
        }
    }

    public SimpleDate clone(){
        return new SimpleDate(this.day, this.month,this.year);
    }

    public SimpleDate afterNoDays(int days){
        SimpleDate newDate = this.clone();
        newDate.advance(days);
        return newDate;
    }


}
