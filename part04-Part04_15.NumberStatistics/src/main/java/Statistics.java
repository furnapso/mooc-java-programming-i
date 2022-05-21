
import java.util.ArrayList;

public class Statistics {

    private ArrayList<Integer> numbers;

    public Statistics() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int getCount() {
        return this.numbers.size();
    }

    public int sum() {
        int sum = 0;
        for (int i : this.numbers) {
            sum = sum + i;
        }

        return sum;
    }

    public double average() {
        double average = 0;
        if (this.numbers.size() > 0) {
            average = this.sum() / (1.0 * this.numbers.size());
        }

        return average;
    }
}
