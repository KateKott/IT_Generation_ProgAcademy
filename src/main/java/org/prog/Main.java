package org.prog;

public class Main {
    public static void main(String[] someStrings) {
        Plane MiniPlane = new Plane("pink");
        String[] passengers = new String[6];
        passengers[0] = "John Snow";
        passengers[1] = "Jack Smith";
        passengers[2] = "Ann Hopkins";
        passengers[3] = "Bob Marley";
        passengers[4] = "Dana Scully";
        passengers[5] = "Fox Mulder";
        MiniPlane.setPassengerNames(passengers);
        for (int i = 1; i < MiniPlane.getPassengerNames().length; i++) {
            System.out.println(MiniPlane.getPassenger(i));
        }
    }
}
