
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        this.management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrosListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.contains("Write a test"));
    }
    
    @Test
    public void markTestAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
}
