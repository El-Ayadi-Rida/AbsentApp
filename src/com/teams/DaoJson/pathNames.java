package com.teams.DaoJson;

public enum pathNames {
    ABSENCE_FILE_PATH("src/com/teams/DaoJson/data.json"),
    OUTPUT_FILE_PATH_JAVA_ABSENT("src/com/teams/output/JAVA_ABSENT.json"),
    OUTPUT_FILE_PATH_JAVA_PRESENT("src/com/teams/output/JAVA_PRESENT.json"),
    OUTPUT_FILE_PATH_DOTNET_ABSENT("src/com/teams/output/DOTNET_ABSENT.json"),
    OUTPUT_FILE_PATH_DOTNET_PRESENT("src/com/teams/output/DOTNET_PRESENT.json");
    private final String path;

    pathNames(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
