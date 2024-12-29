package java8InterviewQues.java8Concepts;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPersonInYears {
    public static void main(String[] args){

        LocalDate birthDay = LocalDate.of(1997,04,16);
        LocalDate today = LocalDate.now();
        System.out.println("Your date of birth is YYYY-MM-DD = "+birthDay);
        System.out.println("Your age is "+ ChronoUnit.YEARS.between(birthDay,today));
    }
}
