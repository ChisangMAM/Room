package com.example.architecture;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Insert
    Void insert (Note note);

    @Update
    Void update (Note note);

    @Delete
    Void delete (Note note);

    @Query("Delete from note_table")
    Void DeleteAllNotes();

    @Query("Select * from note_table order by priority DESC")
    LiveData<List<Note>> getAllNotes();
}
