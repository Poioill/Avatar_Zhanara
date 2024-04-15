package com.example.avatar_zhanara.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.avatar_zhanara.models.Student;
@Database(entities = {Student.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
