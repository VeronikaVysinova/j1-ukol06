package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() {
        //TODO implementovat test metody vyhledatSvatkyKeDni

SeznamSvatku seznamSvatku = new SeznamSvatku();
List<String> svatkyKeDni = seznamSvatku.getSvatky().stream().filter(svatek -> svatek.getDen().equals(MonthDay.of(01,04))).map(Svatek::getJmeno).toList();
assertEquals("Diana",svatkyKeDni);




       
    }
}
