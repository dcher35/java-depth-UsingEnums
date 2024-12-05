package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnumSeasonsTest {

    @Test
    void testSeasonTypeDescriptions() {
        assertEquals("Spring: Blooming flowers", EnumSeasons.SeasonType.SPRING.getDescription());
        assertEquals("Summer: Beach trips", EnumSeasons.SeasonType.SUMMER.getDescription());
        assertEquals("Autumn: Vegetables", EnumSeasons.SeasonType.AUTUMN.getDescription());
        assertEquals("Winter: Snowy", EnumSeasons.SeasonType.WINTER.getDescription());
    }

    @Test
    void testWinterSeasonOutput() {
        EnumSeasons.SeasonType currentSeason = EnumSeasons.SeasonType.WINTER;
        assertEquals("Winter: Snowy", currentSeason.getDescription());
    }
}