package com.room.roomtable.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.room.roomtable.constans.Constants;
import com.room.roomtable.db.entity.Profesor;

import java.util.ArrayList;

@Dao
public interface ProfesorDao {

    @Insert
    void inserProfesor(Profesor profesor);

    @Query("SELECT * FROM "+Constants.TABLE_NAME_PROFESOR)
    ArrayList<Profesor> getAllProfesores();

    @Query("SELECT * FROM  "+Constants.PROFESOR.name+" WHERE "+Constants.PROFESOR.name+" LIKE :"+Constants.PROFESOR.name)
    Profesor getProfessorByName(String name);

    @Update
    void updateProfesorById(Profesor profesor);

    @Delete
    void deleteProfesorById(Profesor profesor);

}
