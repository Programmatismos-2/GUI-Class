package com.freddo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * GiveFileToAI class for reading a file and preparing data for AI.
 */
public class GiveFileToAI {

    public static String fileToVariable(String userquestion) throws IOException {
        // Specify the path to the file
        String filePath = "/Users/fanisorfan/code/projmv/Mediator-Class-1/Mediator-Class/GUI-Class/project/src/resources/1.txt";

        // Create a BufferedReader to read the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            // Read each line from the file and append it to the StringBuilder
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            // Concatenate the file content with the user's question
            return stringBuilder.toString() + "\n input: " + userquestion;
        } finally {
            // Close the BufferedReader to release resources
            if (reader != null) {
                reader.close();
            }
        }
    }
}

