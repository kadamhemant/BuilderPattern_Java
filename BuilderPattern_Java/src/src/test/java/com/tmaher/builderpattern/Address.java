package com.tmaher.builderpattern;

public class Address {
    private final String addressName; // Let's make this Required
    private final String address1; // Required
    private final String address2; // Let's make this optional
    private final String city; // Required
    private final String state; // Required
    private final String zip; // Optional
    private final String country; // Optional

    public static class Builder {
        // Required Parameters
        private final String name;
        private final String address1;
        private final String city;
        private final String state;

        // Optional Parameters
        private String address2;
        private String zip;
        private String country;

        public Builder(String name, String address1, String city, String state) {
            this.name = name;
            this.address1 = address1;
            this.city = city;
            this.state = state;
        }

        public Builder setAddress2(String value) {
            address2 = value;
            return this;
        }

        public Builder setCountry(String value) {
            country = value;
            return this;
        }

        public Builder setZip(String value) {
            zip = value;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    private Address(Builder builder) {
        this.addressName = builder.name;
        this.address1 = builder.address1;
        this.city = builder.city;
        this.state = builder.state;
        this.address2 = builder.address2;
        this.country = builder.country;
        this.zip = builder.zip;
    }

    private StringBuilder appendIfNotBlank(StringBuilder output, String value ){
        if (value != null ){
            output.append(value).append("\n");
        }
        return output;
    }

    @Override
    public String toString(){

        StringBuilder output = new StringBuilder();
        output.append(this.addressName).append("\n")
                .append(this.address1 ).append("\n");
        appendIfNotBlank(output, address2);
        output.append(this.city).append(", ").append(this.state).append("  ");
        appendIfNotBlank(output, this.zip);
        appendIfNotBlank(output, this.country);
        output.append("\n");
        return output.toString();
    }
}


