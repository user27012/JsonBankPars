package net.graysenko.com;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;


public class JsonParser {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Student> exchangeCheckList = objectMapper.readValue(new File("C:\\Users\\kolab\\IdeaProjects\\JsonGetPars\\src\\main\\resources\\privatexch.json"), new TypeReference<List<Student>>() {});
            for (Student student : exchangeCheckList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
