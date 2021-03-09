package at.nagarro.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Arrays.array;

public class ObjectExample {

    @Test
    void assertJ() {
        Employee bill = new Employee("Bill", 60, "MicroSoft");
        Employee john = new Employee("John", 30, "Apple");
        Employee maria = new Employee("Maria", 17, "Apple");

        var employees = array(bill, john, maria);

        assertThat(employees).extracting(Employee::getName).contains("Bill", "John");

        assertThat(john).isEqualTo(john);
        assertThat(john).isNotEqualTo(new Employee("John", 30, "Apple"));
        assertThat(john).isEqualToComparingFieldByField(new Employee("John", 30, "Apple"));

        assertThat(john).isEqualToComparingOnlyGivenFields(new PersonDto("John", 30));
        assertThat(john).extracting("age").contains(array(30));
    }

    private class Employee {
        private final String name;
        private final int age;
        private final String company;

        public Employee(String name, int age, String company) {
            this.name = name;
            this.age = age;
            this.company = company;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCompany() {
            return company;
        }

    }

    private class PersonDto {
        private final String name;
        private final int age;

        public PersonDto(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
