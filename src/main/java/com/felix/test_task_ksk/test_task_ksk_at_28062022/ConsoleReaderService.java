package com.felix.test_task_ksk.test_task_ksk_at_28062022;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import org.springframework.boot.CommandLineRunner;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


@Component
public class ConsoleReaderService implements CommandLineRunner {

    private Path pathXML;

    public Path getPathXML(){
        String p;
        System.out.println("Please enter the path for the file with the .xml");
        while (true){
            Scanner scanner = new Scanner(System.in);
            p = scanner.nextLine();
            if (Files.isRegularFile(Paths.get(p)) && p.endsWith(".xml")){
                break;
            } else if (p.equals("exit")) {
                System.out.println("Выход из программы");
                System.exit(0);
            }
            System.out.println("Данные не верны. Введите корректные данные");
        }
        return Paths.get(p);
    }

    @Override
    public void run(String... args) throws Exception {
        pathXML = getPathXML();
        InputStream inputStream = new FileInputStream(String.valueOf(pathXML));
//        XMLDecoder decoder = new XMLDecoder(fileInputStream);
//        C:\Users\Felix\IdeaProjects\test_task_ksk_at_28062022\sample.xml

        String s = new String(Files.readAllBytes(pathXML));

        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(inputStream);
        XmlMapper xmlMapper = new XmlMapper();
        xmlStreamReader.next();
    }

    @JacksonXmlElementWrapper
    public Map<String,String> getTextFromExample(@NonNull Path pathXML){
        return new LinkedHashMap<>();
    }

}
