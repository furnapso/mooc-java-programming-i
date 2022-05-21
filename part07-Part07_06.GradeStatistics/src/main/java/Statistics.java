/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author lukeb
 */
public class Statistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public Statistics() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public double getAverage() {
        if (points.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int i : points) {
            sum += i;
        }

        return sum / (double) points.size();
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            if (points >= 50) {
                this.passingPoints.add(points);
            }
        }

    }

    public double getPassingAverage() {
        if (passingPoints.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int i : passingPoints) {
            sum += i;
        }

        return sum / (double) passingPoints.size();
    }

    public double passPercentage() {
        return 100 * (passingPoints.size() / (double) points.size());
    }

    public String gradeDistribution() {
        String gradeStr = "";
        int[] distribution = {0, 0, 0, 0, 0, 0};
        
        for (int i: points) {
            if (i < 50) {
                distribution[0] += 1;
            } else if (i < 60) {
                distribution[1] += 1;
            } else if (i < 70) {
                distribution[2] += 1;
            } else if (i < 80) {
                distribution[3] += 1;
            } else if (i < 90) {
                distribution[4] += 1;
            } else if (i >= 90) {
                distribution[5] += 1;
            }
        }
        
        for (int i = 0; i < distribution.length; i++) {
            gradeStr += i + ": ";
            for (int j = 0; j < distribution[i]; j++) {
                gradeStr += "*";
            }
            gradeStr += "\n";
        }
        
        return gradeStr;
    }

}
