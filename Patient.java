class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"AB", "065-254-7986");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"Z", "6695326584");
        invalidPatient.displayDetails(currentYear);
    }

}

class Patient {
    private double id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(double id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;

            if (height <= 0) {
                System.out.println("Error: Invalid height.");
                this.height = 0;
            } else {
                this.height = height;
            }

            if (weight <= 0) {
                System.out.println("Error: Invalid weight.");
                this.weight = 0;
            } else {
                this.weight = weight;
            }
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        if(bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O")){
            return this.bloodGroup;
        }
            System.out.println("Error: Invalid bloodGroup.");
            return "Unknown";
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge(int currentYear) {
        if(currentYear<=this.birthYear) {
            System.out.println("Error: Invalid currentYear.");
            return 0;
        }
            return currentYear - this.birthYear;
    }

    public double getBMI(){
        if(height <= 0 || weight <= 0){
            System.out.println("Error: Invalid height or weight.");
            return 0.0;
        }
        return weight/((height/100)*(height/100));
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup: " + getBloodGroup());
        System.out.println("Patient phoneNumber: " + getPhoneNumber());
        System.out.println("Patient BMI: " + getBMI());
    }
}


