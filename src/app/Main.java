package app;

import java.util.List;

public class Main {

    static void main(String[] arg) {

        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator operator = new UIOperator();

        List<String> data = repository.getData();

        try {
            String listOutput = handler.listOutput(data);
            operator.getOutput(listOutput);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            String elementAt = handler.elementOutputAt(data, 2);
            operator.getOutput(elementAt);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
