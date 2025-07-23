public class HealthRecord {
    // Instance field
    private int height;  // student's height in centimeters

    // Constants (static final)
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;


    // TODO: Initialize appropriately
    // Class-level tracking (static)
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;
    private static int counter = 0;      // count number of objects
    private static double averageHeight; // track average height

    public HealthRecord(int height) {
        setHeight(height);
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {

        // TODO: Validate height is within permitted range
        if (height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT) {
            this.height = height;
        } else {
            this.height = DEFAULT_HEIGHT;
        }

        // TODO: Update tallest and shortest heights
        if (this.height > tallestHeight) {
            tallestHeight = this.height;
        }
        if (this.height < shortestHeight) {
            shortestHeight = this.height;
        }

        // Update average using: y' = (y*n + x)/(n+1)
        averageHeight = (averageHeight*counter + this.height)/(counter+1);
        counter++; // increment counter | count number of patient but really just use it for find average height

    }


    public static int getTallestHeight() {
        return tallestHeight;
    }

    public static int getShortestHeight() {
        return shortestHeight;
    }

    public static double getAverageHeight() { // added get average height
        return averageHeight;
    }

//    public static double getAverageHeight() { // this one i added ceil because it looks nicer but its just for testing
//        return Math.ceil(averageHeight);
//    }


    public void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
    }

    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("Average Height (cm): " + getAverageHeight()); //print average height
    }


}