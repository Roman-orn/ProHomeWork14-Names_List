package app;

import java.util.List;

public class DataHandler {

    public String listOutput(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "No data available!";
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String item : list) {
            sb.append(String.format("%d) %s, ", ++count, item));
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }

    public String elementOutputAt(List<String> list, int index) {
        try {
            if (list == null || list.isEmpty()) {
                return "No data available!";
            }
            return "Name: " + list.get(index) + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }
}
