package org.prog;

public class Plane {
    public static String planeName = "MiniPlane";
    private String color;
    private int passengers;
    public Plane(String planeColor){
        color = planeColor;
    }
    private String[] passengerNames = new String[6];

    public String[] getPassengerNames() {
        return passengerNames;
    }

    public String getPassenger(int index) {
        return passengerNames[index];
    }

    public void setPassengerNames(String[] passengerNames) {
        this.passengerNames = passengerNames;
    }
}
