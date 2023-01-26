package com.sharedpreferences2.data;

import java.util.List;

public interface Repo {

    abstract int create(Note note);
    Note read(int id);
    void update(Note note);
    void delete(int id);

    List<Note> getAll();
}
