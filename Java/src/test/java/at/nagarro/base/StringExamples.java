package at.nagarro.base;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringExamples {

    @Test
    public void assertingStringBasicsWithAssertJ() {
        String theString = " ";
        assertThat(theString)
                .isNotNull()
                .isNotEmpty()
                .hasSize(1)
                .containsOnlyWhitespaces();
    }

    @Test
    public void assertingStringContentWithAssertJ() {
        var theString = "This is a String";
        assertThat(theString).isEqualTo("This is a String");
        assertThat(theString).isNotEqualTo("This is another String");
        assertThat(theString).isEqualToIgnoringCase("THis IS A STRING");

        assertThat(theString).contains("is a");
        assertThat(theString).contains("String", "a");
        assertThat(theString).doesNotContain("not is a");
        assertThat(theString).doesNotContain("can", "contain", "some", "but", "not", "all");

        assertThat(theString).startsWith("This");
        assertThat(theString).doesNotStartWith("This-");

        assertThat(theString).endsWith("a String");
        assertThat(theString).doesNotEndWith("an String");
    }

}