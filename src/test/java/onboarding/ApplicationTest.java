package onboarding;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {
    @Nested
    class Problem1Test {
        @Test
        void case1() {
            List<Integer> pobi = List.of(97, 98);
            List<Integer> crong = List.of(197, 198);
            int result = 0;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case2() {
            List<Integer> pobi = List.of(131, 132);
            List<Integer> crong = List.of(211, 212);
            int result = 1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case3() {
            List<Integer> pobi = List.of(99, 102);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case4() {
            List<Integer> pobi = List.of(0, 1);
            List<Integer> crong = List.of(211, 212);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case5() {
            List<Integer> pobi = List.of(99, 100);
            List<Integer> crong = List.of(-2, -1);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }

        @Test
        void case6() {
            List<Integer> pobi = List.of(99, 100);
            List<Integer> crong = List.of(211, 211);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }
        @Test
        void case7() {
            List<Integer> pobi = List.of(103, 102);
            List<Integer> crong = List.of(210, 211);
            int result = -1;
            assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
        }
    }

    @Nested
    class Problem2Test {
        @Test
        void case1() {
            String cryptogram = "browoanoommnaon";
            String result = "brown";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case2() {
            String cryptogram = "zyelleyz";
            String result = "";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }
        @Test
        void case3() {
            String cryptogram = "ah";
            String result = "ah";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void case4() {
            String cryptogram = "bbbbb";
            String result = "";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }
    }

    @Nested
    class Problem3Test {
        @Test
        void case1() {
            int number = 13;
            int result = 4;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }

        @Test
        void case2() {
            int number = 33;
            int result = 14;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }
    }

    @Nested
    class Problem4Test {
        @Test
        void case1() {
            String word = "I love you";
            String result = "R olev blf";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        @Test
        void case2() {
            String word = "I lo4ve   1you";
            String result = "R ol4ev   1blf";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        @Test
        void case3() {
            String word = "";
            String result = "";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }

        @Test
        void case4() {
            String word = " ";
            String result = " ";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }
    }

    @Nested
    class Problem5Test {
        @Test
        void case1() {
            int money = 50_237;
            List<Integer> result = List.of(1, 0, 0, 0, 0, 2, 0, 3, 7);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case2() {
            int money = 15_000;
            List<Integer> result = List.of(0, 1, 1, 0, 0, 0, 0, 0, 0);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }

        @Test
        void case3() {
            int money = 99;
            List<Integer> result = List.of(0, 0, 0, 0, 0, 0, 1, 4, 9);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }
        @Test
        void case4() {
            int money = 9;
            List<Integer> result = List.of(0, 0, 0, 0, 0, 0, 0, 0, 9);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }
        @Test
        void case5() {
            int money = 1000000;
            List<Integer> result = List.of(20, 0, 0, 0, 0, 0, 0, 0, 0);
            assertThat(Problem5.solution(money)).isEqualTo(result);
        }
    }

    @Nested
    class Problem6Test {
        @Test
        void case1() {
            List<List<String>> forms = List.of(
                    List.of("jm@email.com", "제이엠"),
                    List.of("jason@email.com", "제이슨"),
                    List.of("woniee@email.com", "워니"),
                    List.of("mj@email.com", "엠제이"),
                    List.of("nowm@email.com", "이제엠")
            );
            List<String> result = List.of("jason@email.com", "jm@email.com", "mj@email.com");
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }
        @Test
        void case2() {
            List<List<String>> forms = List.of(
                    List.of("jm@email.com", "제이엠"),
                    List.of("jason@email.com", "제슨")
            );
            List<String> result = List.of();
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }
    }

    @Test
    void case2() {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠"),
                List.of("jason@email.com", "제슨")
        );
        List<String> result = Collections.emptyList();
        assertThat(Problem6.solution(forms)).isEqualTo(result);
    }

    @Test
    void case3() {
        List<List<String>> forms = List.of(
                List.of("jm@email.com", "제이엠")
        );
        List<String> result = Collections.emptyList();
        assertThat(Problem6.solution(forms)).isEqualTo(result);
    }


    @Nested
    class Problem7Test {
        @Test
        void case1() {
            String user = "mrko";
            List<List<String>> friends = List.of(
                    List.of("donut", "andole"),
                    List.of("donut", "jun"),
                    List.of("donut", "mrko"),
                    List.of("shakevan", "andole"),
                    List.of("shakevan", "jun"),
                    List.of("shakevan", "mrko")
            );
            List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
            List<String> result = List.of("andole", "jun", "bedi");
            assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
        }
        @Test
        void case2() {
            String user = "bjk";
            List<List<String>> friends = List.of(
                    List.of("donut", "bjk")
            );
            List<String> visitors = List.of();
            List<String> result = List.of();
            assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
        }

        @Test
        void case3() {
            String user = "bjk";
            List<List<String>> friends = List.of(
                    List.of("donut", "bjk")
            );
            List<String> visitors = List.of("minju");
            List<String> result = List.of("minju");
            assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
        }
    }
}
