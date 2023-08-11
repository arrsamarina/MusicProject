package Commands;

import Collection.CollectionWork;
import MusicBandsData.MusicBand;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RemoveByID {
    public static void removeElementFromCollectionByID(){
        int sizeBefore = CollectionWork.mbCollection.size();
        System.out.println("введите ID муз. группы, которую хотите удалить из коллекции");
        Scanner scanner = new Scanner (System.in);
        long idDetector = scanner.nextLong();
        Iterator<Map.Entry<Integer, MusicBand>> itr = CollectionWork.mbCollection.entrySet().iterator();

        while (itr.hasNext()) {
            if (idDetector == itr.next().getValue().getId()){
                itr.remove();
                System.out.println("элемент с ID " + idDetector + " удалён");
            }
        }
        if (sizeBefore == CollectionWork.mbCollection.size()){
            System.out.println("элемента с таким ID не существует в коллекции");
        }

    }
}
