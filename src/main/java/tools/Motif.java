package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Motif {
    public Motif(String motif) {
        boolean exist = true;
        boolean pause = false;
        this.exist = new ArrayList<>();
        this.notExist = new ArrayList<>();

        for (char c : motif.toCharArray()) {
            List<List<Character>> add = exist ? this.exist : this.notExist;
            List<List<Character>> nadd = exist ? this.notExist : this.exist;
            switch (c) {
                case '{':
                    exist = false;
                case '[':
                    pause = true;
                    add.add(position, new ArrayList<>());
                    nadd.add(position, new ArrayList<>());
                    position++;
                    break;
                case '}':
                    exist = true;
                case ']':
                    pause = false;
                    break;

                default:
                    if (!pause) {
                        add.add(position, new ArrayList<>(Arrays.asList(c)));
                        nadd.add(position, new ArrayList<>());
                        position++;
                    } else {
                        add.get(position - 1).add(c);
                    }
            }
        }
    }

    private int position = 0;
    private List<List<Character>> exist;
    private List<List<Character>> notExist;

    private boolean checkMotif(String s, int pos) {
        for (int i = 0; i < position; i++) {
            List<Character> check = (exist.get(i).size() != 0 ? exist.get(i) : notExist.get(i));
            if (exist.get(i).size() != 0) {
                if (!check.contains(s.charAt(pos + i)))
                    return false;
            } else {
                if (check.contains(s.charAt(pos + i)))
                    return false;
            }
        }
        return true;
    }

    public List<Integer> findLocations(Sequence seq) {
        List<Integer> locations = new ArrayList<>();
        String sequence = seq.getSequence();
        for (int i = 0; i < sequence.length(); i++) {
            if (checkMotif(sequence, i))
                locations.add(i + 1);
        }
        return locations;
    }
}
