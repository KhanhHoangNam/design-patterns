package com.khanhhn.design_patterns.structural_patterns.composite;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FileComponent firstFile = new FileLeaf("first file", (long) 10);
        FileComponent secondFile = new FileLeaf("second file", (long) 5);
        FileComponent thirdFile = new FileLeaf("third file", (long) 15);

        List<FileComponent> files = Arrays.asList(firstFile, secondFile, thirdFile);
        FileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total size: " + folder.totalSize());
    }
}
