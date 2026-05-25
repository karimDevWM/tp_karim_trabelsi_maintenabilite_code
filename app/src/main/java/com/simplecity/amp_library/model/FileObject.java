package com.simplecity.amp_library.model;

import android.content.Context;
import com.simplecity.amp_library.interfaces.FileType;
import com.simplecity.amp_library.utils.FileHelper;
import com.simplecity.amp_library.utils.StringUtils;

public class FileObject extends BaseFileObject {

    private String extension;
    public String getExtension() {
        return this.extension;
    }
    public String setExtension(String extension) {
        this.extension = extension;
        return this.extension;
    }

    private TagInfo tagInfo;
    public TagInfo getTagInfo() {
        return this.tagInfo;
    }
    public TagInfo setTagInfo(TagInfo tagInfo) {
        this.tagInfo = tagInfo;
        return this.tagInfo;
    }

    private long duration = 0;

    public FileObject() {
        this.fileType = FileType.FILE;
    }

    public String getTimeString(Context context) {
        if (duration == 0) {
            duration = FileHelper.getDuration(context, this);
        }
        return StringUtils.makeTimeString(context, duration / 1000);
    }

    @Override
    public String toString() {
        return "FileObject{" +
                "extension='" + extension + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
