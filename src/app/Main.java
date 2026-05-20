package app;

import java.util.List;

public class Main {

    static void main(String[] arg){

        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator operator = new UIOperator();

        List<String> data = repository.getData();
        String listOutput = handler.listOutput(data);
        String elementAt = handler.elementOutputAt(data, 2);

        operator.getOutput(listOutput);
        operator.getOutput(elementAt);
    }
}
