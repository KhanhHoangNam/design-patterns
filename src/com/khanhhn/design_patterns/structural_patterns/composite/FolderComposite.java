package com.khanhhn.design_patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {
    private List<FileComponent> files = new ArrayList<>();

    FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (FileComponent file : files) {
            file.showProperty();
        }
    }

    @Override
    public Long totalSize() {
        long total = 0;
        for (FileComponent file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
