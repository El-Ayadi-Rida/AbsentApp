package com.teams.DaoJson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AbsentFile {
    private static AbsentFile instance;
    private String fileContent;
    String absenceFilePath = pathNames.ABSENCE_FILE_PATH.getPath();
    private AbsentFile() throws IOException {
        fileContent =  new String(Files.readAllBytes(Paths.get(absenceFilePath)));
    }
    public static AbsentFile getInstance() throws IOException {
        if (instance == null) {
            instance = new AbsentFile();
        }
        return instance;
    }

    public String getFileContent() {
        return fileContent;
    }
}
