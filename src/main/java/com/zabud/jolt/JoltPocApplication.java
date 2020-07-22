package com.zabud.jolt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

@SpringBootApplication
public class JoltPocApplication {

  public static void main(String[] args) {
    SpringApplication.run(JoltPocApplication.class, args);
    try {
      run();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private static void run() throws IOException {
    List<?> specs = JsonUtils.jsonToList(readFile("jolt/spec.json"));
    Chainr converter = Chainr.fromSpec(specs);
    Object inputJSON = JsonUtils.jsonToObject(readFile("jolt/input.json"));
    Object transformedOutput = converter.transform(inputJSON);
    System.out.println(JsonUtils.toPrettyJsonString(transformedOutput));
    
  }

  private static String readFile(String fileName) throws IOException {
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    try (InputStream is = classLoader.getResourceAsStream(fileName)) {
      if (is == null)
        return null;
      try (InputStreamReader isr = new InputStreamReader(is);
          BufferedReader reader = new BufferedReader(isr)) {
        return reader.lines().collect(Collectors.joining(System.lineSeparator()));
      }
    }
  }

}
