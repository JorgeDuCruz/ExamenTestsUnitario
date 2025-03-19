import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000000,T",
            "00000001,R",
            "00000002,W",
            "00000003,A",
            "00000004,G",
            "00000005,M",
            "00000006,Y",
            "00000007,F",
            "00000008,P",
            "00000009,D",
            "00000010,X",
            "00000011,B",
            "00000012,N",
            "00000013,J",
            "00000014,Z",
            "00000015,Q",
            "00000016,S",
            "00000017,V",
            "00000018,H",
            "00000019,L",
            "00000020,C",
            "00000021,K",
            "00000022,E",
            "00000023,T",
    })
    void comprobarDNI(String dni, char letra) {
    }

    @ParameterizedTest(name="{0} deberia tener la letra {1}")
    @CsvSource({
            "00000000,T",
            "00000001,R",
            "00000002,W",
            "00000003,A",
            "00000004,G",
            "00000005,M",
            "00000006,Y",
            "00000007,F",
            "00000008,P",
            "00000009,D",
            "00000010,X",
            "00000011,B",
            "00000012,N",
            "00000013,J",
            "00000014,Z",
            "00000015,Q",
            "00000016,S",
            "00000017,V",
            "00000018,H",
            "00000019,L",
            "00000020,C",
            "00000021,K",
            "00000022,E",
    })
    void calcularLetraDNI(String dni, char resultadoEsperado) {
        assertEquals(resultadoEsperado,Main.calcularLetraDNI(dni));
    }
}