package com.clouway.aspects;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;
import java.util.List;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Injector injector = Guice.createInjector(new AccessDeniedModule());
        DirectoryBrowser browser = injector.getInstance(DirectoryBrowser.class);
        List files = browser.listAllDirectories("/home/clouway/hello.pdf");
        for (Object file : files) {
            System.out.println(file);
        }
    }
}
