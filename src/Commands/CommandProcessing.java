package Commands;

import java.util.Scanner;

public class CommandProcessing {
    public static void commandScanner() {
        String choice;
        do {
            System.out.println("введите команду. для списка возможных команд введите команду help");
            Scanner scanner = new Scanner(System.in);
            choice = "";
            choice = scanner.nextLine();
            switch (choice) {
                case ("help"):
                    Help.helpExecute();
                    break;
                case ("info"):
                    Info.sizeOfCollection();
                    break;
                case ("show"):
                    Show.showCollection();
                    break;
                case ("remove_by_id"):
                    RemoveByID.removeElementFromCollectionByID();
                    break;
                case ("delete_smallest_name"):
                    DeleteSmallestName.deleteSmallestNameOfCollection();
                    break;
                case ("add"):
                    Add.addElementInCollection();
                    break;
                case ("clear"):
                    Clear.deleteAllElementsInCollection();
                    break;
                /*case ("save"):
                    Save.saveToJSON();
                    break;*/

            }
        } while (!choice.equals("exit"));
        System.out.println("До свидания");
    }
    }
