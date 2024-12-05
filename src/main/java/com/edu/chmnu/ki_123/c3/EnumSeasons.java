package com.edu.chmnu.ki_123.c3;

public class EnumSeasons {
    public static void main(String[] args) {
        SeasonType currentSeason = SeasonType.WINTER;

        System.out.println("It is winter now, we need to go play snowballs.");

        switch (currentSeason) {
            case SPRING, SUMMER, AUTUMN, WINTER:
                System.out.println(currentSeason.getDescription());
                break;
            default:
                System.out.println("Unknown season.");
        }
    }

    public enum SeasonType {
        SPRING("Spring", "Blooming flowers"),
        SUMMER("Summer", "Beach trips"),
        AUTUMN("Autumn", "Vegetables"),
        WINTER("Winter", "Snowy");

        private final String name;
        private final String description;

        SeasonType(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getDescription() {
            return name + ": " + description;
        }
    }
}