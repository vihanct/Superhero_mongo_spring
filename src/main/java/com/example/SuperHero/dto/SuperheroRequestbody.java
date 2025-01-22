package com.example.SuperHero.dto;

public class SuperheroRequestbody {
    private String name;
    private String power;
    private String universe;

    SuperheroRequestbody(String name, String power, String universe) {
        this.name = name;
        this.power = power;
        this.universe = universe;
    }

    public static SuperheroRequestBodyBuilder builder() {
        return new SuperheroRequestBodyBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getPower() {
        return this.power;
    }

    public String getUniverse() {
        return this.universe;
    }

    public static class SuperheroRequestBodyBuilder {
        private String name;
        private String power;
        private String universe;

        SuperheroRequestBodyBuilder() {
        }

        public SuperheroRequestBodyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SuperheroRequestBodyBuilder power(String power) {
            this.power = power;
            return this;
        }

        public SuperheroRequestBodyBuilder universe(String universe) {
            this.universe = universe;
            return this;
        }

        public SuperheroRequestbody build() {
            return new SuperheroRequestbody(this.name, this.power, this.universe);
        }

        public String toString() {
            return "SuperheroRequestBody.SuperheroRequestBodyBuilder(name=" + this.name + ", power=" + this.power + ", universe=" + this.universe + ")";
        }


    }
}
