package com.khanhhn.design_patterns.structural_patterns.composite;

public class FileLeaf implements FileComponent {
    private String name;
    private Long size;

    FileLeaf(String name, Long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
    }

    @Override
    public Long totalSize() {
        return size;
    }
}
