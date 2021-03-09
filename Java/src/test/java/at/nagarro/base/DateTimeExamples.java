package at.nagarro.base;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

public class DateTimeExamples {

    public static final LocalDateTime MARCH_1_2010 = LocalDateTime.parse("2010-03-01T00:00");
    public static final LocalDateTime MARCH_2_2010 = LocalDateTime.parse("2010-03-02T00:00");
    public static final LocalDateTime MARCH_3_2010 = LocalDateTime.parse("2010-03-03T00:00");

    @Test
    public void assertingStringBasicsWithAssertJ() {
        var theDatetime = LocalDateTime.of(2010, 3, 2, 22, 15);

        assertThat(theDatetime).isEqualTo(LocalDateTime.of(2010, 3, 2, 22, 15));
        assertThat(theDatetime).isEqualToIgnoringHours(MARCH_2_2010);
        assertThat(theDatetime).isAfter(MARCH_1_2010);
        assertThat(theDatetime).isBefore(MARCH_3_2010);
        assertThat(theDatetime).isAfterOrEqualTo(MARCH_2_2010);
        assertThat(theDatetime).isStrictlyBetween(MARCH_1_2010, MARCH_3_2010);
    }


}
