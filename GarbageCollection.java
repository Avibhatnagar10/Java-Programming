public class GarbageCollection {
    // Finalize method
    protected void GarbageCollection() {
        System.out.println("Object finalized.");
    }

    public static void main(String[] args) {
        // Creating an object
        GarbageCollection obj = new GarbageCollection();

        // Setting reference to null to make the object eligible for garbage collection
        obj = null;

        // Calling garbage collector explicitly (for demonstration purposes, not recommended in general)
        System.gc();

        // Sleeping to allow time for the garbage collector to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}


