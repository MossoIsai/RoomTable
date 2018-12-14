package com.room.roomtable.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.room.roomtable.constans.Constants;

@Entity(tableName = Constants.TABLE_NAME_PROFESOR)

public class Profesor {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.PROFESOR.id)
    private int id;
    @ColumnInfo(name = Constants.PROFESOR.name)
    private String name;
    @ColumnInfo(name = Constants.PROFESOR.email)
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
