package cz.czechitas.ukol06.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {



    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni
SvatkySluzba svatkySluzba = new SvatkySluzba();
assertEquals(List.of("Diana"),svatkySluzba
        .vyhledatSvatkyKeDni(MonthDay.of(01,04)));
assertTrue(svatkySluzba
        .vyhledatSvatkyKeDni(MonthDay.of(01,01))
        .isEmpty(),"Pro zadany den, neni v souboru nalezen zadny svatek.");
assertTrue(svatkySluzba
        .vyhledatSvatkyKeDni(MonthDay.of(01,01))
        .isEmpty());
assertEquals(Arrays.asList("Karina","Vasil"), svatkySluzba.vyhledatSvatkyKeDni(MonthDay.of(01,02)));


    }

    @Test
    void vyhledatSvatkyDnes () throws IOException {
        SvatkySluzba svatkySluzba = new SvatkySluzba();
        assertEquals(List.of("Antonín"), svatkySluzba.vyhledatSvatkyDnes());
    }
    @Test
    void testConstructorSvatkySluzba() {
        assertDoesNotThrow(() -> {
            SvatkySluzba instance = new SvatkySluzba();
        });
    }
}
