import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "ola;ala .mana,ala,ula:,bela ala";

        String[] names = input.split("\\s|\\.|,|;|:");

        Map<String, Integer> wordsByNumber = new HashMap<>();

        for (String name : names) {
            if (wordsByNumber.containsKey(name)) {
                int nmb = wordsByNumber.get(name);

                wordsByNumber.put(name, ++nmb);
            } else {
                wordsByNumber.put(name, 1);
            }
        }

        String maxWord = wordsByNumber.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        int counter = wordsByNumber.get(maxWord);

        System.out.println("Najwieksza liczba liczba wystapien " + counter + " ma slowo " + maxWord);
    }
}
