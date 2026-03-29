public class App {

    public static double average(int[] marks) {
        int sum = 0;
        for(int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    public static int topper(int[] marks) {
        int max = marks[0];
        for(int m : marks)
            if(m > max) max = m;
        return max;
    }

    public static String performance(int mark) {
        if(mark >= 75) return "High";
        else if(mark >= 50) return "Medium";
        else return "Low";
    }

    public static void main(String[] args) {
        int[] marks = {80, 60, 40};

        System.out.println("Average: " + average(marks));
        System.out.println("Topper: " + topper(marks));

        for(int m : marks)
            System.out.println(m + " -> " + performance(m));
    }
}