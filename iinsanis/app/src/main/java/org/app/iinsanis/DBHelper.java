package org.app.iinsanis;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME="iinsaniscart.db";

    public DBHelper(Context context, int version){
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table if not exists Cart(_id integer primary key autoincrement, name TEXT, number INT, price INT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Cart");
        onCreate(db);
    }

    public void insert(String name, int number, int price){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Cart VALUES('" + name + "', " + number + ", '" + price + "')");
        db.close();
    }

    public void Delete(String name){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE Cart WHERE NAME = '" + name + "'");
        db.close();
    }

    public String getResult(){
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        Cursor cursor = db.rawQuery("SELECT * FROM Cart", null);

        while (cursor.moveToNext()) {
            result += cursor.getString(0) + " " + cursor.getInt(1) + "개," + cursor.getString(2)+"\n";
        }

        cursor.close();

        return result;
    }
}
