/*
 * package com.service;
 * 
 * import java.io.File; import java.io.IOException; import java.nio.file.Files;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * 
 * @Component public class ResourceReader {
 * 
 * 
 * public String DisplayText() { ClassLoader classLoader =
 * getClass().getClassLoader(); File file = new
 * File(classLoader.getResource("./resources/display.txt").getFile());
 * 
 * //File is found System.out.println("File Found : " + file.exists());
 * 
 * //Read File Content String content=null; try { content = new
 * String(Files.readAllBytes(file.toPath())); } catch (IOException e) {
 * 
 * System.out.println("exception thrown "); } System.out.println(content);
 * 
 * return content;
 * 
 * }
 * 
 * 
 * 
 * }
 */