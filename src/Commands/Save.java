package Commands;

import Collection.CollectionWork;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Save {
    public static void saveToJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Преобразование HashMap в JSON и запись в файл
        objectMapper.writeValue(new File("output.json"), CollectionWork.mbCollection);

        System.out.println("HashMap сохранена в файл output.json");

    }
}
