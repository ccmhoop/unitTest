public class Binairo {

    public Binairo() {

    }

    public static String solve(String input) {
        if (input.length() % 2 == 1) throw new UnevenWidthException("Board width cannot be uneven.");
        if (input.chars().filter(c -> !(c == '0' || c == '1' || c == '.')).count() != 0)
            throw new InvalidCharacterException("");
        String snapshot;
        do {
            snapshot = input;
            input = replaceAll(".00.", "1001", input);
            input = replaceAll("00.", "001", input);
            input = replaceAll(".00", "100", input);
            input = replaceAll(".11.", "0110", input);
            input = replaceAll("11.", "110", input);
            input = replaceAll(".11", "011", input);
            input = replaceAll("0.0", "010", input);
            input = replaceAll("1.1", "101", input);
            final long zeroCount = input.chars().filter(c -> c == '0').count();
            final long oneCount = input.chars().filter(c -> c == '1').count();
            final long dotCount = input.chars().filter(c -> c == '.').count();
            if (zeroCount == oneCount + dotCount) input = replaceAll(".", "1", input);
            else if (oneCount == zeroCount + dotCount) input = replaceAll(".", "0", input);
        } while (!snapshot.equals(input));
        return input;
    }

    private static String replaceAll(String target, String replacement, String input) {
        while (input.contains(target)) {
            input = input.replace(target, replacement);
        }
        return input;
    }
}
