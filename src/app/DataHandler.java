package app;

import java.util.List;

public class DataHandler {

    public String listOutput(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No data available!");
        } else {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (String item : list) {
                sb.append(String.format("%d) %s, ", ++count, item));
            }
            sb.setLength(sb.length() - 2);
            return sb.toString();
        }
    }

    public String elementOutputAt(List<String> list, int index) {
        if (index > 0 && index < list.size()) {
            return String.format("Name: %s is in index %d", list.get(index), index);
        } else {
            throw new IllegalArgumentException("Index out of list");
        }
    }
}
