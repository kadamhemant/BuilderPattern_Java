package com.tmaher.builderpattern;

import org.testng.annotations.Test;

public class Testcases {

    String heading = "Demonstration of the Builder Pattern:";

    @Test
    public void test_printUnitedStatesAddresses(){
        Address fitbitBostonAddress = new Address.Builder("Fitbit-Boston", "One Marina Park Drive", "Boston", "MA").build();
        Address fitbitBostonMailingAddress = new Address.Builder("Fitbit-Boston", "One Marina Park Drive", "Boston", "MA")
                .setAddress2("Suite 701").setZip("02210").build();
        Address fitbitBostonMailingAddressWithCountry = new Address.Builder("Fitbit-Boston", "One Marina Park Drive", "Boston", "MA")
                .setAddress2("Suite 701").setZip("02210").setCountry("United States").build();

        System.out.println("Sample Address Formats:\n");
        System.out.println(fitbitBostonAddress);
        System.out.println(fitbitBostonMailingAddress);
        System.out.println(fitbitBostonMailingAddressWithCountry);
    }
}