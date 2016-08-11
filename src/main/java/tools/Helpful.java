package tools;

import java.io.*;
import java.util.*;


/**
 * Created by Evgenii_Nemich on 8/8/2016.
 */
public class Helpful {
    public static String getName(String task, int num) {
        String id = "";
        if (num > 0)
            id = " (" + num + ")";
        return "C:\\Users\\Evgenii_Nemich\\Downloads\\Rosalind\\rosalind_" + task + id + ".txt";
    }
    public static String readSingleStringFile(String name) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(name));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    public static List<Integer> readIntegers(String name, int amount) throws IOException {
        List<Integer> result = new ArrayList<Integer>();
        Scanner s = new Scanner(new FileReader(name));
        for (int i = 0; i < amount; i++) {
            result.add(s.nextInt());
        }
        return result;
    }

    public static List<String> readMultipleStringFile(String name) throws IOException {
        List<String> result = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(name));
        String line;
        while ((line = reader.readLine()) != null) {
            result.add(line);
        }
        return result;
    }

    public static List<Sequence> readSequences(String name) throws IOException {
        final List<Sequence> result = new ArrayList<Sequence>();
        Sequence curSeq = null;
        BufferedReader reader = new BufferedReader(new FileReader(name));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            if (line.charAt(0) == '>') {
                if (result.size() != 0)
                    curSeq.setSequence(sb.toString());
                curSeq = new Sequence(line.replace(">", ""));
                result.add(curSeq);
                sb.setLength(0);
            } else {
                sb.append(line);
            }
        }

        if (result.size() != 0)
            curSeq.setSequence(sb.toString());
        return result;
    }

    public static Map<String, String> readRNACodonTable(String file) throws IOException {
        Map<String, String> result = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String s[] = line.split(" ");
            result.put(s[0], s[1]);
        }
        return result;
    }

    public static String getMaxChar(final int a, final int c, final int g, final int t) {
        int max = Math.max(Math.max(a, c), Math.max(g, t));
        if (max == a)
            return "A";
        if (max == c)
            return "C";
        if (max == g)
            return "G";
        return "T";
    }

    public static void printToFile(String file, String data) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(data);

        } catch (IOException e) {
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
            }
        }
//        PrintWriter out;
//        try {
//            out = new PrintWriter(file);
//            for (int i = 0; i < data.size(); i++) {
//                out.println(data.get(i));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
