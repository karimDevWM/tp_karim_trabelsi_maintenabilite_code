package com.simplecity.amp_library.model;

import com.simplecity.amp_library.interfaces.FileType;

public class FolderObject extends BaseFileObject {

    private int fileCount;
    public int getFileCount() {
        return this.fileCount;
    }
    public int setFileCount(int fileCount) {
        this.fileCount = fileCount;
        return this.fileCount;
    }

    private int folderCount;
    public int getFolderCount() {
        return this.folderCount;
    }
    public int setFolderCount(int folderCount) {
        this.folderCount = folderCount;
        return this.folderCount;
    }

    public FolderObject() {
        this.fileType = FileType.FOLDER;
    }

    @Override
    public String toString() {
        return "FolderObject{" +
                "fileCount=" + fileCount +
                ", folderCount=" + folderCount +
                "} " + super.toString();
    }
}
