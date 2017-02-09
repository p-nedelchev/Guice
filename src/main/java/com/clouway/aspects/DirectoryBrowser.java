package com.clouway.aspects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class DirectoryBrowser {

    @AccessDenied
    public List listAllDirectories(String path) throws IOException {
        return Files.walk(Paths.get(path)).filter(Files::isDirectory).collect(Collectors.toList());
    }
}
