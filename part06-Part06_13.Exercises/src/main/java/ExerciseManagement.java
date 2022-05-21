import java.util.ArrayList;
public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> strExercises = new ArrayList<>();
        
        for (Exercise i: this.exercises) {
            strExercises.add(i.getName());
        }
        
        return strExercises;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public boolean contains(String exercise) {
        for (Exercise i: this.exercises) {
            if (i.getName().equals(exercise)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise i: this.exercises) {
            if (i.getName().equals(exercise)) {
                i.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise i: this.exercises) {
            if (i.getName().equals(exercise) && 
                    i.isCompleted()) {
                return true;
            }
        }
        
        return false;
    }

}
