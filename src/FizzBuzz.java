public class FizzBuzz {

    public String getResults(int result) {
        String test = String.valueOf(result);
        if ((result % 3 == 0 && result % 5 == 0) | (test.contains("5") && result % 3 == 0) |
                (test.contains("3") && result % 5 == 0)) {
            return "fizzbuzz";
        }
        if (result % 3 == 0 | test.contains("3")) {
            return "fizz";
        }
        if (result % 5 == 0 | test.contains("5")) {
            return "buzz";
        }
        return String.valueOf(result);
    }
}
