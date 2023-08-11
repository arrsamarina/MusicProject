package Commands;

import Collection.CollectionWork;

public class Info {
    public static void sizeOfCollection(){
        System.out.println("количество элементов коллекции = " + CollectionWork.mbCollection.size());
    }
}
