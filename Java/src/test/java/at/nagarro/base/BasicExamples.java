package at.nagarro.base;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicExamples {

    @Test
    public void asssertingNullWithAssertJ() {
        Object theObject = null;
        Assertions.assertThat(theObject).isNull();
        //Assertions.assertThat(theObject).isNotNull();
    }

    @Test
    public void assertingBooleansWithAssertJ() {
        Boolean theBooleanFoo = true;
        Assertions.assertThat(theBooleanFoo).isTrue();
        Assertions.assertThat(!theBooleanFoo).isFalse();
    }
}


