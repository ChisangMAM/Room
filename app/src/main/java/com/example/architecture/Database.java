package com.example.architecture;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class Database extends RoomDatabase {

    private static Database instance;

    public abstract Dao noteDao();

    public static synchronized Database getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    Database.class, "note_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
