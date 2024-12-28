package fizzbuzztest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import fizzbuzz.FizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTester {
    String chaine;
    String actual_chaine;
    int nbr;
    @AfterEach
    void tearDown(){
        chaine=null;
    }
    @Test
     public void tester_3_devrait_retourne_Fizz(){
        //given
        nbr=3;
        chaine="Fizz";
        //when
        actual_chaine=FizzBuzz.de(3);
        //then
        assertThat(actual_chaine).isEqualTo(chaine);
    }
    @Test
    public void tester_1_devrait_retourne_1(){
        //given
         nbr=1;
         chaine="1";
        //when
         actual_chaine=FizzBuzz.de(nbr);
        //then
        assertThat(actual_chaine).isEqualTo(chaine);

    }
    @Test
    public void tester_15_devrait_retourne_FizzBuzz(){
        //given
         nbr=15;
         chaine="FizzBuzz";
        //when
         actual_chaine=FizzBuzz.de(nbr);
        //then
        assertThat(actual_chaine).isEqualTo(chaine);

    }
    @Test
    public void tester_0_devrait_retourne_FizzBuzz(){
        //given
         nbr=53342;
         chaine="53342";
        //when
          actual_chaine=FizzBuzz.de(nbr);
        //then
        assertThat(actual_chaine).isEqualTo(chaine);

    }
}
