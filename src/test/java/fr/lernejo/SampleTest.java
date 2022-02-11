package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void Op_ADD() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(ADD,2,2)).isEqualTo(4);
    }

    @Test
    void Op_MUL() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(MULT,4,2)).isEqualTo(8);
    }

    @Test
    void fact_of_negative() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(-1));
    }

    @Test
    void fact_of_3_is_6() {
        int result = Sample.fact(3);
        Assertions.assertThat(result).isEqualTo(6);
    }

}
