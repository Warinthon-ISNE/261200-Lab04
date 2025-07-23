
public class Lab04 {
    public static void main(String[] args) {
        // Create and test student records
        HealthRecord student1 = new HealthRecord(120);
        HealthRecord student2 = new HealthRecord(55);
        HealthRecord student3 = new HealthRecord(180);
        HealthRecord student4 = new HealthRecord(150);

        // Display individual records
        student1.displayDetails(); // Expected: 120
        student2.displayDetails(); // Expected: 55
        student3.displayDetails(); // Expected: 100 (default, as 180 is invalid)
        student4.displayDetails(); // test


        // Display class statistics
        HealthRecord.displayClassDetails(); // Expected: tallest=120, shortest=55
        }
    }