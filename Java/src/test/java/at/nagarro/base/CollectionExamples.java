package at.nagarro.base;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Arrays.array;
import static org.assertj.core.util.Lists.newArrayList;


public class CollectionExamples {
    @Test
    public void aLotOfAssertionsWithAssertJ() {
        List<Integer> ints = newArrayList(1, 2, 5, 8, 1);
        assertThat(ints).isNotEmpty();
        assertThat(ints).hasSize(5);
        assertThat(ints).containsExactly(1, 2, 5, 8, 1);
        assertThat(ints).contains(8, 1);
        assertThat(ints).containsOnlyOnce(8);
        assertThat(ints).isSubsetOf(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(ints).allMatch(num -> num > 0 && num < 10);
        assertThat(ints).containsAnyOf(0, 2, 4);

        Integer[] array = array(1, 2, 3, 4);
        assertThat(array).doesNotContainNull().doesNotHaveDuplicates();
        assertThat(array).contains(1);

        assertThat(array).isSorted();

        Object[] empty = array();
        assertThat(empty).isEmpty();
        assertThat(empty).contains();
        assertThat(empty).isNullOrEmpty();
        empty = null;
        assertThat(empty).isNullOrEmpty();

        String[] abc = {"a", "b", "c"};
        assertThat(abc).containsExactly("a", "b", "c")
                .containsAnyOf("b")
                .containsAnyOf("b", "c")
                .containsAnyOf("a", "b", "c")
                .containsAnyOf("a", "b", "c", "d")
                .containsExactly("a", "b", "c");
        assertThat(abc).startsWith("a", "b");
        assertThat(abc).endsWith("c");
        assertThat(abc).hasOnlyElementsOfType(String.class);
        assertThat(abc).allMatch(c -> !c.isBlank());


    }
}
