package com.onenotate.hanumanchalisa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.onenotate.hanumanchalisa.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "HanumanChalisaQuiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " Text" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        // DOHA LINE N0 1.
        Question q1 = new Question(R.string.doha_line1q1,
                R.string.shree, R.string.tiger, R.string.apple, 1, Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question(R.string.doha_line1q2,
                R.string.bear, R.string.guru, R.string.rose, 2, Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question(R.string.doha_line1q1,
                R.string.shree, R.string.tiger, R.string.apple, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q3);
        Question q4 = new Question(R.string.doha_line1q2,
                R.string.bear, R.string.guru, R.string.rose, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q4);
        Question q5 = new Question(R.string.doha_line1q1,
                R.string.shree, R.string.tiger, R.string.apple, 1, Question.DIFFICULTY_HARD);
        addQuestion(q5);
        Question q6 = new Question(R.string.doha_line1q2,
                R.string.bear, R.string.guru, R.string.rose, 2, Question.DIFFICULTY_HARD);
        addQuestion(q6);


    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

}














