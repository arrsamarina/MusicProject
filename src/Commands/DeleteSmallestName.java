package Commands;

import Collection.CollectionWork;
import MusicBandsData.MusicBand;

import java.util.Iterator;
import java.util.Map;

public class DeleteSmallestName {
    public static void deleteSmallestNameOfCollection(){
        int min = 1000;
        int number = 0;
        if ((CollectionWork.mbCollection.size() == 0) || (CollectionWork.mbCollection.size() ==1)){
            switch (CollectionWork.mbCollection.size()){
                case (0):
                    System.out.println("коллекция пустая");
                    break;
                case (1):
                    System.out.println("элемент удалён");
                    break;
            }
        } else {
            Iterator<Map.Entry<Integer, MusicBand>> itr1 = CollectionWork.mbCollection.entrySet().iterator();
            while (itr1.hasNext()){
                if (min > itr1.next().getValue().getName().length()){
                    min = itr1.next().getValue().getName().length();
                }
            }
            Iterator<Map.Entry<Integer, MusicBand>> itr2 = CollectionWork.mbCollection.entrySet().iterator();
            while (itr2.hasNext()){
                if (min == itr2.next().getValue().getName().length()){
                    itr2.remove();
                    number++;
                }
            }
            System.out.println("количество удалённых элементов: " + number);

        }
    }
}
