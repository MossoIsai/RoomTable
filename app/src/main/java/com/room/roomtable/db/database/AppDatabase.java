package com.room.roomtable.db.database;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.room.roomtable.constans.Constants;
import com.room.roomtable.db.dao.ProfesorDao;
import com.room.roomtable.db.entity.Profesor;

@Database(entities = {Profesor.class}, version = Constants.VERSION_DB)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase mAppDB;
    public abstract ProfesorDao profesorDao();

    public static AppDatabase getInstanceDatabase(Context context){
        if(mAppDB == null){

            mAppDB = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class,Constants.DATABASE_NAME).build();
        }
        return mAppDB;
    }
    public void onDestroyInstanceDB(){
        mAppDB = null;
    }
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
