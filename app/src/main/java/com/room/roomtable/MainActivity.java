package com.room.roomtable;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.room.roomtable.db.database.AppDatabase;
import com.room.roomtable.db.entity.Profesor;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private Profesor profesor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void insertProfesor(final Profesor profesor, final Context context){
        Completable.fromAction(new Action() {
            @Override
            public void run() throws Exception {
                AppDatabase.getInstanceDatabase(context.getApplicationContext()).profesorDao().inserProfesor(profesor);
            }
        }).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
