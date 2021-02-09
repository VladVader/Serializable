import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JsonSerializer {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        FileOutputStream fout = new FileOutputStream("person.json");

        mapper.writeValue(fout, new Person("Michal", "Jakciewicz", 22));

        fout.close();


        Person person = mapper.readValue(new File("person.json"), Person.class);
        System.out.println(person.toString());
    }
}
