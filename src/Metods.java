import java.util.HashMap;

public class Metods {
        static HashMap<Character, String> dict = new HashMap<>();

    public static String conversion(String q) {
        dict.put(' ', " ");
        // ------------------
        dict.put('а', "a");
        dict.put('б', "b");
        dict.put('в', "v");
        dict.put('г', "g");
        dict.put('д', "d");
        dict.put('е', "e");
        dict.put('ё', "e");
        dict.put('ж', "zh");
        dict.put('з', "z");
        dict.put('и', "i");
        dict.put('й', "i");
        dict.put('к', "k");
        dict.put('л', "l");
        dict.put('м', "m");
        dict.put('н', "n");
        dict.put('о', "o");
        dict.put('п', "p");
        dict.put('р', "r");
        dict.put('с', "s");
        dict.put('т', "t");
        dict.put('у', "u");
        dict.put('ф', "f");
        dict.put('х', "kh");
        dict.put('ц', "tc");
        dict.put('ч', "ch");
        dict.put('ш', "sh");
        dict.put('щ', "shch");
        dict.put('ы', "y");
        dict.put('э', "e");
        dict.put('ю', "iu");
        dict.put('я', "ia");
        // -----------------------------
        dict.put((char) ('a' - 32), "A");
        dict.put((char) ('б' - 32), "B");
        dict.put((char) ('в' - 32), "V");
        dict.put((char) ('г' - 32), "G");
        dict.put((char) ('д' - 32), "D");
        dict.put((char) ('е' - 32), "E");
        dict.put((char) ('ё' - 32), "E");
        dict.put((char) ('ж' - 32), "Zh");
        dict.put((char) ('з' - 32), "Z");
        dict.put((char) ('и' - 32), "I");
        dict.put((char) ('й' - 32), "I");
        dict.put((char) ('к' - 32), "K");
        dict.put((char) ('л' - 32), "L");
        dict.put((char) ('м' - 32), "M");
        dict.put((char) ('н' - 32), "N");
        dict.put((char) ('о' - 32), "O");
        dict.put((char) ('п' - 32), "P");
        dict.put((char) ('р' - 32), "R");
        dict.put((char) ('с' - 32), "S");
        dict.put((char) ('т' - 32), "T");
        dict.put((char) ('у' - 32), "U");
        dict.put((char) ('ф' - 32), "F");
        dict.put((char) ('х' - 32), "Kh");
        dict.put((char) ('ц' - 32), "Tc");
        dict.put((char) ('ч' - 32), "Ch");
        dict.put((char) ('ш' - 32), "Sh");
        dict.put((char) ('щ' - 32), "Shch");
        dict.put((char) ('ы' - 32), "Y");
        dict.put((char) ('э' - 32), "E");
        dict.put((char) ('ю' - 32), "Iu");
        dict.put((char) ('я' - 32), "Ia");
        // ------------------------------
        dict.put((char) 97, "эй");
        dict.put('b', "би");
        dict.put('c', "си");
        dict.put('d', "ди");
        dict.put('e', "и");
        dict.put('f', "эф");
        dict.put('g', "джи");
        dict.put('h', "эйч");
        dict.put('i', "ай");
        dict.put('j', "джей");
        dict.put('k', "кэй");
        dict.put('l', "эл");
        dict.put('m', "эм");
        dict.put('n', "эн");
        dict.put('o', "оу");
        dict.put('p', "пи");
        dict.put('q', "кью");
        dict.put('r', "ар");
        dict.put('s', "эс");
        dict.put('t', "ти");
        dict.put('u', "ю");
        dict.put('v', "ви");
        dict.put('w', "дабл-ю");
        dict.put('x', "экс");
        dict.put('y', "уай");
        dict.put('z', "зед");
        // ------------------------
        dict.put('A', "Эй");
        dict.put('B', "Би");
        dict.put('C', "Си");
        dict.put('D', "Ди");
        dict.put('E', "И");
        dict.put('F', "Эф");
        dict.put('G', "Джи");
        dict.put('H', "Эйч");
        dict.put('I', "Ай");
        dict.put('J', "Джей");
        dict.put('K', "Кэй");
        dict.put('L', "Эл");
        dict.put('M', "Эм");
        dict.put('N', "Эн");
        dict.put('O', "Оу");
        dict.put('P', "Пи");
        dict.put('Q', "Кью");
        dict.put('R', "Ар");
        dict.put('S', "Эс");
        dict.put('T', "Ти");
        dict.put('U', "Ю");
        dict.put('V', "Ви");
        dict.put('W', "Дабл-ю");
        dict.put('X', "Экс");
        dict.put('Y', "Уай");
        dict.put('Z', "Зед");
        // -----------------------

        String result = "";

        int l = q.length();

        for (int i = 0; i < l; i++) {
            if (dict.get(q.charAt(i)) != null) {
                result += dict.get(q.charAt(i));
            } else {
                result += dict.getOrDefault(q.charAt(i), "" + q.charAt(i));
            }
        }
        return result;
    }

    public static int collichSymbol(String s, char symbol) {
        int index = s.length() - 1;
        var result = 0;
        while (index >= 0) {
            if (s.charAt(index) == symbol) {
                result += 1;
            }
            index -= 1;
        }

        return result;
    }

    public static String registrVniz(String s) {
        // String result = "";
        //for (int i = 0; i < s.length(); i++) {
        //    result += Character.toLowerCase(s.charAt(i));
        //}
        return s.toLowerCase();
        //return result;
    }

    public static String registrVverx(String s) {
        String result = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                result += Character.toUpperCase(s.charAt(i));
            } else {
                result += s.charAt(i);
            }
        }
        return Character.toUpperCase(s.charAt(0)) + result;
    }

}
