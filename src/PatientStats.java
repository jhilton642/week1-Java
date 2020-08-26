public class PatientStats {
    public static void main(String[] args) {
        String name = getName();
        double temp = getTemp();
        double bloodPressure = getBloodPressure();
        double height = getHeight();     //in meters
        int weight = getWeight();
        int age = getAge();
        int howDoYouFeel = howDoYouFeel();
        System.out.println();
        System.out.println("GENERAL INFO:");
        System.out.println("Name: " + name);
        System.out.println("Temperature: " + temp);
        System.out.println("Blood pressure: " + bloodPressure);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("How does the patient feel (1-5)?: " + howDoYouFeel);
        System.out.println();
        System.out.println("COMMENTS:");

        if (temp < 80.0) {
            System.out.println("Patient has probably been dead for several days");
        } else if (temp < 87.5) {
            System.out.println("Patient most likely just died");
        } else if (temp > 87.5 && temp < 96) {
            System.out.println("Get patient a blanket");
        } else if (temp > 96 && temp < 99) {
            System.out.println("Normal temperature");
        } else if (temp > 102 && temp < 106) {
            System.out.println("Call the ER");
        } else if (temp > 106) {
            System.out.println("Call the CDC");
        }
        if (height < 1.5) {
            System.out.println("Suggest growth hormones");
        } else if (height > 2.4) {
            System.out.println("Suggest they try out for the Mavs");
        }
        if (howDoYouFeel == 1) {
            System.out.println("Patient feels terrible");
        } else if (howDoYouFeel == 2) {
            System.out.println("Patient has had worse days, but not many");
        } else if (howDoYouFeel == 3) {
            System.out.println("meh");
        } else if (howDoYouFeel == 4) {
            System.out.println("Why are they here if they feel this good");
        } else if (howDoYouFeel == 5) {
            System.out.println("Patient probably just got a job as a programmer");
        }
    }

    public static String getName() {
        String name = Utils.getInput("What is your name?");
        return name;
    }

    public static double getTemp() {
        double temp = Utils.getDouble("What is your temperature?");
        return temp;
    }

    public static double getBloodPressure() {
        double bloodPressure = Utils.getDouble("What is your blood pressure?");
        return bloodPressure;
    }

    public static double getHeight() {
        double height = Utils.getDouble("What is your height in meters?");
        return height;
    }

    public static int getWeight() {
        int weight = Utils.getNumber("What is your weight in lbs?");
        return weight;
    }

    public static int getAge() {
        int age = Utils.getNumber("How old are you?");
        return age;
    }

    public static int howDoYouFeel() {
        int howDoYouFeel = Utils.getNumber("On a scale of 1-5 how do you feel today?");
        return howDoYouFeel;
    }
}
