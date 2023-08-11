package Commands;

import Collection.CollectionWork;
import MusicBandsData.MusicBand;
import MusicBandsData.MusicType;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Add {
    public static void addElementInCollection(){
        System.out.println("создание новой музыкальной группы");

        long idNumberOfNewBand = -1;
        if (idNumberOfNewBand < 0) {
            while ((idNumberOfNewBand < 0)){
                System.out.println("введите ID номер новой муз. группы типа long: ");
                Scanner scanner1 = new Scanner(System.in);
                idNumberOfNewBand = scanner1.nextLong();
             }
        }

        String nameOfNewBand;
        System.out.println("введите название новой муз. группы: ");
        Scanner scanner2 = new Scanner(System.in);
        nameOfNewBand = scanner2.nextLine();

        int numberOfMusiciansOfNewBand = 0;
        if (numberOfMusiciansOfNewBand < 1) {
            while (numberOfMusiciansOfNewBand < 1) {
                System.out.println("введите число участников новой муз. группы: ");
                Scanner scanner3 = new Scanner(System.in);
                numberOfMusiciansOfNewBand = scanner3.nextInt();
            }
        }
        System.out.println("введите имя солиста новой муз. группы: ");
        Scanner scanner4 = new Scanner(System.in);
        String frontmanOfNewBand = scanner4.nextLine();

        MusicType typeOfMusic = null;
        int typeOfMusicOfNewBand = 0;
        if ((typeOfMusicOfNewBand<1) || (typeOfMusicOfNewBand>4)) {
            while ((typeOfMusicOfNewBand < 1) || (typeOfMusicOfNewBand > 4)) {
                System.out.println("выберите корректный номер жанра музыки, в котором играет новая группа: 1 - heavy metal; 2 - death metal; " +
                        "3 - alternative rock; 4 - alcohardcore");
                Scanner scanner5 = new Scanner(System.in);
                typeOfMusicOfNewBand = scanner5.nextInt();
            }
        }
        switch(typeOfMusicOfNewBand){
            case(1):
                typeOfMusic = MusicType.HEAVYMETAL;
                break;
            case(2):
                typeOfMusic = MusicType.DEATHMETAL;
                break;
            case(3):
                typeOfMusic = MusicType.ALTERNATIVEROCK;
                break;
            case(4):
                typeOfMusic = MusicType.ALCOHARDCORE;
                break;
        }
        MusicBand musicBand = new MusicBand(idNumberOfNewBand, nameOfNewBand, numberOfMusiciansOfNewBand, frontmanOfNewBand, typeOfMusic);
        System.out.println("введите ключ элемента: ");
        Scanner scanner6 = new Scanner(System.in);
        Integer key = scanner6.nextInt();
        CollectionWork.mbCollection.put(key, musicBand);

    }
}
