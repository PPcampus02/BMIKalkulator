package org.campus02.pollheimer;

public class BMIKalk {
    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    // Konstruktor
    public BMIKalk(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }

    public String getFirstname()
    {
        return firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public int getBodyHeight()
    {
        return bodyHeight;
    }
    public void setBodyHeight(int bodyHeight)
    {
        this.bodyHeight = bodyHeight;
    }
    public double getBodyWeight()
    {
        return bodyWeight;
    }
    public void setBodyWeight(double bodyWeight)
    {
        this.bodyWeight = bodyWeight;
    }
    public char getGender()
    {
        return gender;
    }

    // Berechne den BMI
    public double calculateBMI() {
        double heightInMeters = bodyHeight / 100.0;
        double bmi = bodyWeight / (heightInMeters * heightInMeters);
        return round(bmi);
    }

    // Kategorieberechnung
    public int calculateBMICategory() {
        double bmi = calculateBMI();
        if (gender == 'm') {
            if (bmi < 16.0)
                return -2;
            if (bmi < 18.5)
                return -1;
            if (bmi < 25.0)
                return 0;
            if (bmi < 35.0)
                return 1;
            if (bmi >= 35.0)
                return 2;

        } else if (gender == 'w') {
            if (bmi < 15.0)
                return -2;
            if (bmi < 17.5)
                return -1;
            if (bmi < 24.0)
                return 0;
            if (bmi < 34.0)
                return 1;
            if (bmi >= 34.0)
                return 2;
        }
        return -1;
    }
    // Methode für Kategorien
    public String getBMICategoryName() {
        switch (calculateBMICategory()) {
            case -2: return "Sehr starkes Untergewicht";
            case -1: return "Untergewicht";
            case 0: return "Normalgewicht";
            case 1: return "Uebergewicht";
            case 2: return "Sehr starkes Uebergewicht";
            default: return "Nicht klassifiziert";
        }
    }
    // Methode fürs Runden auf 2 Kommawerte
    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
