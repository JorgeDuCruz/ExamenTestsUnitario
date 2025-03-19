import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000001,R,true",
            "00000002,W,true",
            "00000003,A,true",
            "00000004,G,true",
            "00000005,M,true",
            "00000006,Y,true",
            "00000007,F,true",
            "00000008,P,true",
            "00000009,D,true",
            "00000010,X,true",
            "00000011,B,true",
            "00000012,N,true",
            "00000013,J,true",
            "00000014,Z,true",
            "00000015,S,true",
            "00000016,Q,true",
            "00000017,V,true",
            "00000018,H,true",
            "00000019,L,true",
            "00000020,C,true",
            "00000021,K,true",
            "00000022,E,true",
            "00000023,T,true",
            "00000015,E,false",

    })
    void comprobarDNI(String dni, char letra,boolean resultadoEsperado) {
        assertEquals(resultadoEsperado,Main.comprobarDNI(dni,letra));
    }

    @ParameterizedTest(name="{0} deberia tener la letra {1}")
    @CsvSource({
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
            "00000015,S",
            "00000016,Q",
            "00000017,V",
            "00000018,H",
            "00000019,L",
            "00000020,C",
            "00000021,K",
            "00000022,E",
            "00000023,T",
    })
    void calcularLetraDNI(String dni, char resultadoEsperado) {
        assertEquals(resultadoEsperado,Main.calcularLetraDNI(dni));
    }
}