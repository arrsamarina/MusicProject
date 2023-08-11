package Commands;

import Collection.CollectionWork;

public class Clear {
    public static void deleteAllElementsInCollection(){
        CollectionWork.mbCollection.clear();
        System.out.println("все элементы коллекции удалены. коллекция очищена");
    }
}
