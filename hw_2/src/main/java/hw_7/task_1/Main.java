package hw_7.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse<String> warehouse = new Warehouse<>();

        System.out.println("Adding items to the warehouse...");
        warehouse.addItem("Box");
        warehouse.addItem("Crate");
        warehouse.addItem("Bag");

        System.out.println("Item count: " + warehouse.getItemCount());

        System.out.println("Viewing items:");
        List<String> items = warehouse.viewItems();
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("Is warehouse empty? " + warehouse.isEmpty());

        System.out.println("Retrieving all items:");
        List<String> retrieved = warehouse.retrieveAll();
        for (String item : retrieved) {
            System.out.println(item);
        }

        System.out.println("Item count after retrieval: " + warehouse.getItemCount());
        System.out.println("Is warehouse empty now? " + warehouse.isEmpty());

        warehouse.addItem("Pallet");
        warehouse.addItem("Container");

        System.out.println("Clearing warehouse...");
        warehouse.clear();
        System.out.println("Item count after clearing: " + warehouse.getItemCount());
    }
}
