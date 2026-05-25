package com.simplecity.amp_library.model;

import android.net.Uri;
import java.util.Arrays;

public class Query {

    private Uri uri;
    public Uri getUri() {
        return this.uri;
    }
    public Uri setUri(Uri uri) {
        this.uri = uri;
        return this.uri;
    }

    private String[] projection;
    public String[] getProjection() {
        return this.projection;
    }
    public String[] setProjection(String[] projection) {
        this.projection = projection;
        return this.projection;
    }

    private String selection;
    public String getSelection() {
        return this.selection;
    }
    public String setSelection(String selection) {
        this.selection = selection;
        return this.selection;
    }
    
    private String[] args;
    public String[] getArgs() {
        return this.args;
    }
    public String[] setArgs(String[] args) {
        this.args = args;
        return this.args;
    }
    
    private String sort;
    public String getSort() {
        return this.sort;
    }
    public String setSort(String sort) {
        this.sort = sort;
        return this.sort;
    }


    Query(Builder builder) {
        uri = builder.uri;
        projection = builder.projection;
        selection = builder.selection;
        args = builder.args;
        sort = builder.sort;
    }

    public static final class Builder {
        Uri uri;
        String[] projection;
        String selection;
        String[] args;
        String sort;

        public Builder() {
            // empty constructor
        }

        public Builder uri(Uri val) {
            uri = val;
            return this;
        }

        public Builder projection(String[] val) {
            projection = val;
            return this;
        }

        public Builder selection(String val) {
            selection = val;
            return this;
        }

        public Builder args(String[] val) {
            args = val;
            return this;
        }

        public Builder sort(String val) {
            sort = val;
            return this;
        }

        public Query build() {
            return new Query(this);
        }
    }

    @Override
    public String toString() {
        return "Query{" +
                "\nuri=" + uri +
                "\nPROJECTION=" + Arrays.toString(projection) +
                "\nselection='" + selection + '\'' +
                "\nargs=" + Arrays.toString(args) +
                "\nsort='" + sort + '\'' +
                '}';
    }
}