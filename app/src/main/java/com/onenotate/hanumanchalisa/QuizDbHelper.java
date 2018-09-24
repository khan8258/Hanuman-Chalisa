package com.onenotate.hanumanchalisa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.onenotate.hanumanchalisa.QuizContract.*;

import java.util.ArrayList;


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
        Question q3 = new Question(R.string.doha_line1q3,
                R.string.jaguar, R.string.banana, R.string.charan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question(R.string.doha_line1q4,
                R.string.saroj, R.string.shark, R.string.melon, 1, Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question(R.string.doha_line1q5,
                R.string.rat, R.string.raj, R.string.fig, 2, Question.DIFFICULTY_EASY);
        addQuestion(q5);

        // DOHA LINE N0 2.

        Question q6 = new Question(R.string.doha_line2q1,
                R.string.ant, R.string.log, R.string.nij, 3, Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question(R.string.doha_line2q2,
                R.string.mann, R.string.fizz, R.string.jump, 1, Question.DIFFICULTY_EASY);
        addQuestion(q7);
        Question q8 = new Question(R.string.doha_line2q3,
                R.string.pizza, R.string.mukur, R.string.quick, 2, Question.DIFFICULTY_EASY);
        addQuestion(q8);
        Question q9 = new Question(R.string.doha_line2q4,
                R.string.mushroom, R.string.cucumber, R.string.sudhaari, 3, Question.DIFFICULTY_EASY);
        addQuestion(q9);

        // DOHA LINE N0 .3

        Question q10 = new Question(R.string.doha_line3q1,
                R.string.barnau, R.string.almond, R.string.garlic, 1, Question.DIFFICULTY_EASY);
        addQuestion(q10);
        Question q11 = new Question(R.string.doha_line3q2,
                R.string.beetroot, R.string.raghubar, R.string.tamarind, 2, Question.DIFFICULTY_EASY);
        addQuestion(q11);
        Question q12 = new Question(R.string.doha_line3q3,
                R.string.guava, R.string.horse, R.string.bimal, 3, Question.DIFFICULTY_EASY);
        addQuestion(q12);
        Question q13 = new Question(R.string.doha_line3q4,
                R.string.jasu, R.string.lion, R.string.goat, 1, Question.DIFFICULTY_EASY);
        addQuestion(q13);

        // DOHA LINE N0 4.

        Question q14 = new Question(R.string.doha_line4q1,
                R.string.go, R.string.jo, R.string.to, 2, Question.DIFFICULTY_EASY);
        addQuestion(q14);
        Question q15 = new Question(R.string.doha_line4q2,
                R.string.orange, R.string.fennel, R.string.dayaku, 3, Question.DIFFICULTY_EASY);
        addQuestion(q15);
        Question q16 = new Question(R.string.doha_line4q3,
                R.string.phal, R.string.neem, R.string.duck, 1, Question.DIFFICULTY_EASY);
        addQuestion(q16);
        Question q17 = new Question(R.string.doha_line4q4,
                R.string.grape, R.string.chari, R.string.camel, 2, Question.DIFFICULTY_EASY);
        addQuestion(q17);

        // DOHA LINE N0 5.

        Question q18 = new Question(R.string.doha_line5q1,
                R.string.basketball, R.string.sandstones, R.string.buddhiheen, 3, Question.DIFFICULTY_EASY);
        addQuestion(q18);
        Question q19 = new Question(R.string.doha_line5q2,
                R.string.tanu, R.string.bold, R.string.cool, 1, Question.DIFFICULTY_EASY);
        addQuestion(q19);
        Question q20 = new Question(R.string.doha_line5q3,
                R.string.future, R.string.janike, R.string.school, 2, Question.DIFFICULTY_EASY);
        addQuestion(q20);

        // DOHA LINE N0 6.

        Question q21 = new Question(R.string.doha_line6q1,
                R.string.penguin, R.string.apricot, R.string.sumirow, 3, Question.DIFFICULTY_EASY);
        addQuestion(q21);
        Question q22 = new Question(R.string.doha_line6q2,
                R.string.pavan, R.string.lemon, R.string.jumbo, 1, Question.DIFFICULTY_EASY);
        addQuestion(q22);
        Question q23 = new Question(R.string.doha_line6q3,
                R.string.table, R.string.kumar, R.string.mango, 2, Question.DIFFICULTY_EASY);
        addQuestion(q23);

        // DOHA LINE N0 7.

        Question q24 = new Question(R.string.doha_line7q1,
                R.string.man, R.string.car, R.string.bal, 3, Question.DIFFICULTY_EASY);
        addQuestion(q24);
        Question q25 = new Question(R.string.doha_line7q2,
                R.string.buddhi, R.string.carrot, R.string.papaya, 1, Question.DIFFICULTY_EASY);
        addQuestion(q25);
        Question q26 = new Question(R.string.doha_line7q3,
                R.string.zebra, R.string.vidya, R.string.onion, 2, Question.DIFFICULTY_EASY);
        addQuestion(q26);
        Question q27 = new Question(R.string.doha_line7q4,
                R.string.lime, R.string.crab, R.string.dehu, 3, Question.DIFFICULTY_EASY);
        addQuestion(q27);
        Question q28 = new Question(R.string.doha_line7q5,
                R.string.mohi, R.string.kiwi, R.string.corn, 1, Question.DIFFICULTY_EASY);
        addQuestion(q28);

        // DOHA LINE N0 8.

        Question q29 = new Question(R.string.doha_line8q1,
                R.string.pepper, R.string.harahu, R.string.tomato, 2, Question.DIFFICULTY_EASY);
        addQuestion(q29);
        Question q30 = new Question(R.string.doha_line8q2,
                R.string.olive, R.string.wheat, R.string.kales, 3, Question.DIFFICULTY_EASY);
        addQuestion(q30);
        Question q31 = new Question(R.string.doha_line8q3,
                R.string.bikaar, R.string.coffee, R.string.peanut, 1, Question.DIFFICULTY_EASY);
        addQuestion(q31);

        // CHOPAI LINE N0 1.

        Question q32 = new Question(R.string.chopai_line1q1,
                R.string.bee, R.string.jai, R.string.may, 2, Question.DIFFICULTY_EASY);
        addQuestion(q32);
        Question q33 = new Question(R.string.chopai_line1q2,
                R.string.honesty, R.string.jasmine, R.string.hanuman, 3, Question.DIFFICULTY_EASY);
        addQuestion(q33);
        Question q34 = new Question(R.string.chopai_line1q3,
                R.string.gyan, R.string.four, R.string.pear, 1, Question.DIFFICULTY_EASY);
        addQuestion(q34);
        Question q35 = new Question(R.string.chopai_line1q4,
                R.string.run, R.string.gun, R.string.tea, 2, Question.DIFFICULTY_EASY);
        addQuestion(q35);
        Question q36 = new Question(R.string.chopai_line1q5,
                R.string.rhino, R.string.peach, R.string.sagar, 3, Question.DIFFICULTY_EASY);
        addQuestion(q36);

        // CHOPAI LINE N0 2.

        Question q37 = new Question(R.string.chopai_line2q1,
                R.string.jai_2, R.string.boy, R.string.raw, 1, Question.DIFFICULTY_EASY);
        addQuestion(q37);
        Question q38 = new Question(R.string.chopai_line2q2,
                R.string.davis, R.string.kapis, R.string.crown, 2, Question.DIFFICULTY_EASY);
        addQuestion(q38);
        Question q39 = new Question(R.string.chopai_line2q3,
                R.string.grown, R.string.point, R.string.tihun, 3, Question.DIFFICULTY_EASY);
        addQuestion(q39);
        Question q40 = new Question(R.string.chopai_line2q4,
                R.string.lok, R.string.cop, R.string.ray, 1, Question.DIFFICULTY_EASY);
        addQuestion(q40);
        Question q41 = new Question(R.string.chopai_line2q5,
                R.string.giraffe, R.string.ujaagar, R.string.octopus, 2, Question.DIFFICULTY_EASY);
        addQuestion(q41);

        // CHOPAI LINE N0 3.

        Question q42 = new Question(R.string.chopai_line3q1,
                R.string.peacock, R.string.cheetah, R.string.ramdoot, 3, Question.DIFFICULTY_EASY);
        addQuestion(q42);
        Question q43 = new Question(R.string.chopai_line3q2,
                R.string.atulit, R.string.rabbit, R.string.impala, 1, Question.DIFFICULTY_EASY);
        addQuestion(q43);
        Question q44 = new Question(R.string.chopai_line3q3,
                R.string.zip, R.string.bal_2, R.string.max, 2, Question.DIFFICULTY_EASY);
        addQuestion(q44);
        Question q45 = new Question(R.string.chopai_line3q4,
                R.string.jackal, R.string.quartz, R.string.dhamaa, 3, Question.DIFFICULTY_EASY);
        addQuestion(q45);

        // CHOPAI LINE N0 4.

        Question q46 = new Question(R.string.chopai_line4q1,
                R.string.anjani, R.string.silver, R.string.heaven, 1, Question.DIFFICULTY_EASY);
        addQuestion(q46);
        Question q47 = new Question(R.string.chopai_line4q2,
                R.string.craft, R.string.putra, R.string.eagle, 2, Question.DIFFICULTY_EASY);
        addQuestion(q47);
        Question q48 = new Question(R.string.chopai_line4q3,
                R.string.honeydew, R.string.colorful, R.string.pavansut, 3, Question.DIFFICULTY_EASY);
        addQuestion(q48);
        Question q49 = new Question(R.string.chopai_line4q4,
                R.string.naamaa, R.string.author, R.string.breath, 1, Question.DIFFICULTY_EASY);
        addQuestion(q49);

        // CHOPAI LINE N0 5.

        Question q50 = new Question(R.string.chopai_line5q1,
                R.string.teammate, R.string.mahaveer, R.string.elephant, 2, Question.DIFFICULTY_EASY);
        addQuestion(q50);
        Question q51 = new Question(R.string.chopai_line5q2,
                R.string.walrus, R.string.spirit, R.string.bikram, 3, Question.DIFFICULTY_EASY);
        addQuestion(q51);
        Question q52 = new Question(R.string.chopai_line5q3,
                R.string.bajrangi, R.string.fragment, R.string.extracts, 1, Question.DIFFICULTY_EASY);
        addQuestion(q52);

        // CHOPAI LINE N0 6.

        Question q53 = new Question(R.string.chopai_line6q1,
                R.string.barley, R.string.kumati, R.string.sample, 2, Question.DIFFICULTY_EASY);
        addQuestion(q53);
        Question q54 = new Question(R.string.chopai_line6q2,
                R.string.little, R.string.shiver, R.string.nivaar, 3, Question.DIFFICULTY_EASY);
        addQuestion(q54);
        Question q55 = new Question(R.string.chopai_line6q3,
                R.string.sumati, R.string.pestle, R.string.trivia, 1, Question.DIFFICULTY_EASY);
        addQuestion(q55);
        Question q56 = new Question(R.string.chopai_line6q4,
                R.string.so, R.string.ke, R.string.le, 2, Question.DIFFICULTY_EASY);
        addQuestion(q56);
        Question q57 = new Question(R.string.chopai_line6q5,
                R.string.burst, R.string.shape, R.string.sangi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q57);

        // CHOPAI LINE N0 7.

        Question q58 = new Question(R.string.chopai_line7q1,
                R.string.kanchan, R.string.leopard, R.string.buffalo, 1, Question.DIFFICULTY_EASY);
        addQuestion(q58);
        Question q59 = new Question(R.string.chopai_line7q2,
                R.string.snake, R.string.baran, R.string.panda, 2, Question.DIFFICULTY_EASY);
        addQuestion(q59);
        Question q60 = new Question(R.string.chopai_line7q3,
                R.string.mammal, R.string.brazil, R.string.biraaj, 3, Question.DIFFICULTY_EASY);
        addQuestion(q60);
        Question q61 = new Question(R.string.chopai_line7q4,
                R.string.subesaa, R.string.bullock, R.string.dolphin, 1, Question.DIFFICULTY_EASY);
        addQuestion(q61);

        // CHOPAI LINE N0 8.

        Question q62 = new Question(R.string.chopai_line8q1,
                R.string.cherry, R.string.kaanan, R.string.cashew, 2, Question.DIFFICULTY_EASY);
        addQuestion(q62);
        Question q63 = new Question(R.string.chopai_line8q2,
                R.string.cooker, R.string.lentil, R.string.kundal, 3, Question.DIFFICULTY_EASY);
        addQuestion(q63);
        Question q64 = new Question(R.string.chopai_line8q3,
                R.string.kunchit, R.string.mammoth, R.string.meercat, 1, Question.DIFFICULTY_EASY);
        addQuestion(q64);
        Question q65 = new Question(R.string.chopai_line8q4,
                R.string.deer, R.string.kesa, R.string.musk, 2, Question.DIFFICULTY_EASY);
        addQuestion(q65);

        // CHOPAI LINE N0 9.

        Question q66 = new Question(R.string.chopai_line9q1,
                R.string.bison, R.string.moose, R.string.haath, 3, Question.DIFFICULTY_EASY);
        addQuestion(q66);
        Question q67 = new Question(R.string.chopai_line9q2,
                R.string.bajra, R.string.mouse, R.string.royal, 1, Question.DIFFICULTY_EASY);
        addQuestion(q67);
        Question q68 = new Question(R.string.chopai_line9q3,
                R.string.cat, R.string.aur, R.string.eel, 2, Question.DIFFICULTY_EASY);
        addQuestion(q68);
        Question q69 = new Question(R.string.chopai_line9q4,
                R.string.potato, R.string.radish, R.string.dhwaja, 3, Question.DIFFICULTY_EASY);
        addQuestion(q69);
        Question q70 = new Question(R.string.chopai_line9q5,
                R.string.birajai, R.string.painter, R.string.panther, 1, Question.DIFFICULTY_EASY);
        addQuestion(q70);

        // CHOPAI LINE N0 10.

        Question q71 = new Question(R.string.chopai_line10q1,
                R.string.bicycle, R.string.kaandhe, R.string.unicorn, 2, Question.DIFFICULTY_EASY);
        addQuestion(q71);
        Question q72 = new Question(R.string.chopai_line10q2,
                R.string.sheep, R.string.whale, R.string.moonj, 3, Question.DIFFICULTY_EASY);
        addQuestion(q72);
        Question q73 = new Question(R.string.chopai_line10q3,
                R.string.janeu, R.string.eater, R.string.pulse, 1, Question.DIFFICULTY_EASY);
        addQuestion(q73);
        Question q74 = new Question(R.string.chopai_line10q4,
                R.string.berry, R.string.saaje, R.string.breed, 2, Question.DIFFICULTY_EASY);
        addQuestion(q74);

        // CHOPAI LINE N0 11.

        Question q75 = new Question(R.string.chopai_line11q1,
                R.string.raisin, R.string.ginger, R.string.sankar, 3, Question.DIFFICULTY_EASY);
        addQuestion(q75);
        Question q76 = new Question(R.string.chopai_line11q2,
                R.string.suvan, R.string.acorn, R.string.child, 1, Question.DIFFICULTY_EASY);
        addQuestion(q76);
        Question q77 = new Question(R.string.chopai_line11q3,
                R.string.dates, R.string.kesri, R.string.event, 2, Question.DIFFICULTY_EASY);
        addQuestion(q77);
        Question q78 = new Question(R.string.chopai_line11q4,
                R.string.walnut, R.string.rocket, R.string.nandan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q78);

        // CHOPAI LINE N0 12.

        Question q79 = new Question(R.string.chopai_line12q1,
                R.string.tej, R.string.fly, R.string.ape, 1, Question.DIFFICULTY_EASY);
        addQuestion(q79);
        Question q80 = new Question(R.string.chopai_line12q2,
                R.string.citrus, R.string.pratap, R.string.effect, 2, Question.DIFFICULTY_EASY);
        addQuestion(q80);
        Question q81 = new Question(R.string.chopai_line12q3,
                R.string.crop, R.string.heir, R.string.maha, 3, Question.DIFFICULTY_EASY);
        addQuestion(q81);
        Question q82 = new Question(R.string.chopai_line12q4,
                R.string.jag, R.string.kid, R.string.nut, 1, Question.DIFFICULTY_EASY);
        addQuestion(q82);
        Question q83 = new Question(R.string.chopai_line12q5,
                R.string.income, R.string.vandan, R.string.nutmeg, 2, Question.DIFFICULTY_EASY);
        addQuestion(q83);

        // CHOPAI LINE N0 13.

        Question q84 = new Question(R.string.chopai_line13q1,
                R.string.blueberry, R.string.invention, R.string.vidyavaan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q84);
        Question q85 = new Question(R.string.chopai_line13q2,
                R.string.guni, R.string.work, R.string.seed, 1, Question.DIFFICULTY_EASY);
        addQuestion(q85);
        Question q86 = new Question(R.string.chopai_line13q3,
                R.string.cow, R.string.ati, R.string.hen, 2, Question.DIFFICULTY_EASY);
        addQuestion(q86);
        Question q87 = new Question(R.string.chopai_line13q4,
                R.string.essence, R.string.harvest, R.string.chaatur, 3, Question.DIFFICULTY_EASY);
        addQuestion(q87);

        // CHOPAI LINE N0 14.

        Question q88 = new Question(R.string.chopai_line14q1,
                R.string.ram, R.string.can, R.string.row, 1, Question.DIFFICULTY_EASY);
        addQuestion(q88);
        Question q89 = new Question(R.string.chopai_line14q2,
                R.string.make, R.string.kaaj, R.string.plum, 2, Question.DIFFICULTY_EASY);
        addQuestion(q89);
        Question q90 = new Question(R.string.chopai_line14q3,
                R.string.invert, R.string.kernel, R.string.karibe, 3, Question.DIFFICULTY_EASY);
        addQuestion(q90);
        Question q91 = new Question(R.string.chopai_line14q4,
                R.string.ko, R.string.is, R.string.ro, 1, Question.DIFFICULTY_EASY);
        addQuestion(q91);
        Question q92 = new Question(R.string.chopai_line14q5,
                R.string.opera, R.string.aatur, R.string.stone, 2, Question.DIFFICULTY_EASY);
        addQuestion(q92);

        // CHOPAI LINE N0 15.

        Question q93 = new Question(R.string.chopai_line15q1,
                R.string.muscut, R.string.output, R.string.prabhu, 3, Question.DIFFICULTY_EASY);
        addQuestion(q93);
        Question q94 = new Question(R.string.chopai_line15q2,
                R.string.charittra, R.string.jackfruit, R.string.muskmelon, 1, Question.DIFFICULTY_EASY);
        addQuestion(q94);
        Question q95 = new Question(R.string.chopai_line15q3,
                R.string.result, R.string.sunibe, R.string.sequel, 2, Question.DIFFICULTY_EASY);
        addQuestion(q95);
        Question q96 = new Question(R.string.chopai_line15q4,
                R.string.lo, R.string.pe, R.string.ko, 3, Question.DIFFICULTY_EASY);
        addQuestion(q96);
        Question q97 = new Question(R.string.chopai_line15q5,
                R.string.rasiya, R.string.leaves, R.string.beetle, 1, Question.DIFFICULTY_EASY);
        addQuestion(q97);

        // CHOPAI LINE N0 16.

        Question q98 = new Question(R.string.chopai_line16q1,
                R.string.emu, R.string.ram_2, R.string.pen, 2, Question.DIFFICULTY_EASY);
        addQuestion(q98);
        Question q99 = new Question(R.string.chopai_line16q2,
                R.string.cobalt, R.string.marble, R.string.lakhan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q99);
        Question q100 = new Question(R.string.chopai_line16q3,
                R.string.sita, R.string.neat, R.string.puma, 1, Question.DIFFICULTY_EASY);
        addQuestion(q100);
        Question q101 = new Question(R.string.chopai_line16q4,
                R.string.seal, R.string.mann_2, R.string.wolf, 2, Question.DIFFICULTY_EASY);
        addQuestion(q101);
        Question q102 = new Question(R.string.chopai_line16q5,
                R.string.copper, R.string.radium, R.string.basiya, 3, Question.DIFFICULTY_EASY);
        addQuestion(q102);

        // CHOPAI LINE N0 17.

        Question q103 = new Question(R.string.chopai_line17q1,
                R.string.sukshma, R.string.piranha, R.string.hamster, 1, Question.DIFFICULTY_EASY);
        addQuestion(q103);
        Question q104 = new Question(R.string.chopai_line17q2,
                R.string.bull, R.string.roop, R.string.calf, 2, Question.DIFFICULTY_EASY);
        addQuestion(q104);
        Question q105 = new Question(R.string.chopai_line17q3,
                R.string.queen, R.string.chief, R.string.dhari, 3, Question.DIFFICULTY_EASY);
        addQuestion(q105);
        Question q106 = new Question(R.string.chopai_line17q4,
                R.string.siyahi, R.string.silica, R.string.sodium, 1, Question.DIFFICULTY_EASY);
        addQuestion(q106);
        Question q107 = new Question(R.string.chopai_line17q5,
                R.string.spinach, R.string.dikhawa, R.string.gorilla, 2, Question.DIFFICULTY_EASY);
        addQuestion(q107);

        // CHOPAI LINE N0 18.

        Question q108 = new Question(R.string.chopai_line18q1,
                R.string.brain, R.string.stove, R.string.vikat, 3, Question.DIFFICULTY_EASY);
        addQuestion(q108);
        Question q109 = new Question(R.string.chopai_line18q2,
                R.string.roop_2, R.string.slip, R.string.ring, 1, Question.DIFFICULTY_EASY);
        addQuestion(q109);
        Question q110 = new Question(R.string.chopai_line18q3,
                R.string.grain, R.string.dhari_2, R.string.sting, 2, Question.DIFFICULTY_EASY);
        addQuestion(q110);
        Question q111 = new Question(R.string.chopai_line18q4,
                R.string.tank, R.string.bank, R.string.lank, 3, Question.DIFFICULTY_EASY);
        addQuestion(q111);
        Question q112 = new Question(R.string.chopai_line18q5,
                R.string.jarawa, R.string.cereal, R.string.millet, 1, Question.DIFFICULTY_EASY);
        addQuestion(q112);

        // CHOPAI LINE N0 19.

        Question q113 = new Question(R.string.chopai_line19q1,
                R.string.alarm, R.string.bheem, R.string.canon, 2, Question.DIFFICULTY_EASY);
        addQuestion(q113);
        Question q114 = new Question(R.string.chopai_line19q2,
                R.string.cake, R.string.pass, R.string.roop_3, 3, Question.DIFFICULTY_EASY);
        addQuestion(q114);
        Question q115 = new Question(R.string.chopai_line19q3,
                R.string.dhari_3, R.string.chalk, R.string.china, 1, Question.DIFFICULTY_EASY);
        addQuestion(q115);
        Question q116 = new Question(R.string.chopai_line19q4,
                R.string.zinc, R.string.asur, R.string.bake, 2, Question.DIFFICULTY_EASY);
        addQuestion(q116);
        Question q117 = new Question(R.string.chopai_line19q5,
                R.string.armrest, R.string.bagpipe, R.string.sanhare, 3, Question.DIFFICULTY_EASY);
        addQuestion(q117);

        // CHOPAI LINE N0 20.

        Question q118 = new Question(R.string.chopai_line20q1,
                R.string.ramchandra, R.string.everything, R.string.strawberry, 1, Question.DIFFICULTY_EASY);
        addQuestion(q118);
        Question q119 = new Question(R.string.chopai_line20q2,
                R.string.li, R.string.ke, R.string.in, 2, Question.DIFFICULTY_EASY);
        addQuestion(q119);
        Question q120 = new Question(R.string.chopai_line20q3,
                R.string.word, R.string.rope, R.string.kaaj_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q120);
        Question q121 = new Question(R.string.chopai_line20q4,
                R.string.sanvaare, R.string.software, R.string.broccoli, 1, Question.DIFFICULTY_EASY);
        addQuestion(q121);

        // CHOPAI LINE N0 21.

        Question q122 = new Question(R.string.chopai_line21q1,
                R.string.churn, R.string.laaye, R.string.drive, 2, Question.DIFFICULTY_EASY);
        addQuestion(q122);
        Question q123 = new Question(R.string.chopai_line21q2,
                R.string.caution, R.string.fishnet, R.string.sajivan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q123);
        Question q124 = new Question(R.string.chopai_line21q3,
                R.string.lakhan_2, R.string.button, R.string.honest, 1, Question.DIFFICULTY_EASY);
        addQuestion(q124);
        Question q125 = new Question(R.string.chopai_line21q4,
                R.string.freedom, R.string.jiyaaye, R.string.leather, 2, Question.DIFFICULTY_EASY);
        addQuestion(q125);

        // CHOPAI LINE N0 22.

        Question q126 = new Question(R.string.chopai_line22q1,
                R.string.book, R.string.shop, R.string.shri, 3, Question.DIFFICULTY_EASY);
        addQuestion(q126);
        Question q127 = new Question(R.string.chopai_line22q2,
                R.string.raghuvir, R.string.calmness, R.string.chairman, 1, Question.DIFFICULTY_EASY);
        addQuestion(q127);
        Question q128 = new Question(R.string.chopai_line22q3,
                R.string.mercury, R.string.harashi, R.string.nuclear, 2, Question.DIFFICULTY_EASY);
        addQuestion(q128);
        Question q129 = new Question(R.string.chopai_line22q4,
                R.string.ti, R.string.lu, R.string.ur, 3, Question.DIFFICULTY_EASY);
        addQuestion(q129);
        Question q130 = new Question(R.string.chopai_line22q5,
                R.string.laaye_2, R.string.empty, R.string.gloss, 1, Question.DIFFICULTY_EASY);
        addQuestion(q130);

        // CHOPAI LINE N0 23.

        Question q131 = new Question(R.string.chopai_line23q1,
                R.string.butterfly, R.string.raghupati, R.string.pineapple, 2, Question.DIFFICULTY_EASY);
        addQuestion(q131);
        Question q132 = new Question(R.string.chopai_line23q2,
                R.string.hoist, R.string.learn, R.string.kinhi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q132);
        Question q133 = new Question(R.string.chopai_line23q3,
                R.string.bahut, R.string.metal, R.string.nurse, 1, Question.DIFFICULTY_EASY);
        addQuestion(q133);
        Question q134 = new Question(R.string.chopai_line23q4,
                R.string.island, R.string.badaai, R.string.jungle, 2, Question.DIFFICULTY_EASY);
        addQuestion(q134);

        // CHOPAI LINE N0 24.

        Question q135 = new Question(R.string.chopai_line24q1,
                R.string.wax, R.string.zoo, R.string.tum, 3, Question.DIFFICULTY_EASY);
        addQuestion(q135);
        Question q136 = new Question(R.string.chopai_line24q2,
                R.string.mam, R.string.gym, R.string.rim, 1, Question.DIFFICULTY_EASY);
        addQuestion(q136);
        Question q137 = new Question(R.string.chopai_line24q3,
                R.string.petal, R.string.priya, R.string.quite, 2, Question.DIFFICULTY_EASY);
        addQuestion(q137);
        Question q138 = new Question(R.string.chopai_line24q4,
                R.string.pistachio, R.string.cranberry, R.string.bharatahi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q138);
        Question q139 = new Question(R.string.chopai_line24q5,
                R.string.sam, R.string.van, R.string.tax, 1, Question.DIFFICULTY_EASY);
        addQuestion(q139);
        Question q140 = new Question(R.string.chopai_line24q6,
                R.string.raise, R.string.bhaai, R.string.sugar, 2, Question.DIFFICULTY_EASY);
        addQuestion(q140);

        // CHOPAI LINE N0 25.

        Question q141 = new Question(R.string.chopai_line25q1,
                R.string.scene, R.string.tempo, R.string.sahas, 3, Question.DIFFICULTY_EASY);
        addQuestion(q141);
        Question q142 = new Question(R.string.chopai_line25q2,
                R.string.badan, R.string.topaz, R.string.urban, 1, Question.DIFFICULTY_EASY);
        addQuestion(q142);
        Question q143 = new Question(R.string.chopai_line25q3,
                R.string.notepad, R.string.tumharo, R.string.opinion, 2, Question.DIFFICULTY_EASY);
        addQuestion(q143);
        Question q144 = new Question(R.string.chopai_line25q4,
                R.string.add, R.string.dam, R.string.jas, 3, Question.DIFFICULTY_EASY);
        addQuestion(q144);
        Question q145 = new Question(R.string.chopai_line25q5,
                R.string.gaavein, R.string.pacific, R.string.railway, 1, Question.DIFFICULTY_EASY);
        addQuestion(q145);

        // CHOPAI LINE N0 26.

        Question q146 = new Question(R.string.chopai_line26q1,
                R.string.dry, R.string.asa, R.string.ear, 2, Question.DIFFICULTY_EASY);
        addQuestion(q146);
        Question q147 = new Question(R.string.chopai_line26q2,
                R.string.slow, R.string.taxi, R.string.kahi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q147);
        Question q148 = new Question(R.string.chopai_line26q3,
                R.string.shripati, R.string.computer, R.string.fortress, 1, Question.DIFFICULTY_EASY);
        addQuestion(q148);
        Question q149 = new Question(R.string.chopai_line26q4,
                R.string.valet, R.string.kanth, R.string.young, 2, Question.DIFFICULTY_EASY);
        addQuestion(q149);
        Question q150 = new Question(R.string.chopai_line26q5,
                R.string.alligator, R.string.chameleon, R.string.lagaavein, 3, Question.DIFFICULTY_EASY);
        addQuestion(q150);

        // CHOPAI LINE N0 27.

        Question q151 = new Question(R.string.chopai_line27q1,
                R.string.sankaadik, R.string.orangutan, R.string.porcupine, 1, Question.DIFFICULTY_EASY);
        addQuestion(q151);
        Question q152 = new Question(R.string.chopai_line27q2,
                R.string.jellyfish, R.string.brahmaadi, R.string.raspberry, 2, Question.DIFFICULTY_EASY);
        addQuestion(q152);
        Question q153 = new Question(R.string.chopai_line27q3,
                R.string.sandman, R.string.textile, R.string.muneesa, 3, Question.DIFFICULTY_EASY);
        addQuestion(q153);

        // CHOPAI LINE N0 28.

        Question q154 = new Question(R.string.chopai_line28q1,
                R.string.narad, R.string.field, R.string.gland, 1, Question.DIFFICULTY_EASY);
        addQuestion(q154);
        Question q155 = new Question(R.string.chopai_line28q2,
                R.string.junior, R.string.saarad, R.string.keeper, 2, Question.DIFFICULTY_EASY);
        addQuestion(q155);
        Question q156 = new Question(R.string.chopai_line28q3,
                R.string.glare, R.string.ideal, R.string.sahit, 3, Question.DIFFICULTY_EASY);
        addQuestion(q156);
        Question q157 = new Question(R.string.chopai_line28q4,
                R.string.aheesa, R.string.keypad, R.string.maroon, 1, Question.DIFFICULTY_EASY);
        addQuestion(q157);

        // CHOPAI LINE N0 29.

        Question q158 = new Question(R.string.chopai_line29q1,
                R.string.dub, R.string.jam, R.string.fat, 2, Question.DIFFICULTY_EASY);
        addQuestion(q158);
        Question q159 = new Question(R.string.chopai_line29q2,
                R.string.craft, R.string.local, R.string.kuber, 3, Question.DIFFICULTY_EASY);
        addQuestion(q159);
        Question q160 = new Question(R.string.chopai_line29q3,
                R.string.digpaal, R.string.thermal, R.string.uranium, 1, Question.DIFFICULTY_EASY);
        addQuestion(q160);
        Question q161 = new Question(R.string.chopai_line29q4,
                R.string.marine, R.string.jahaan, R.string.newton, 2, Question.DIFFICULTY_EASY);
        addQuestion(q161);
        Question q162 = new Question(R.string.chopai_line29q5,
                R.string.pi, R.string.su, R.string.te, 3, Question.DIFFICULTY_EASY);
        addQuestion(q162);

        // CHOPAI LINE N0 30.

        Question q163 = new Question(R.string.chopai_line30q1,
                R.string.kabhi, R.string.march, R.string.night, 1, Question.DIFFICULTY_EASY);
        addQuestion(q163);
        Question q164 = new Question(R.string.chopai_line30q2,
                R.string.nubia, R.string.kovid, R.string.ocean, 2, Question.DIFFICULTY_EASY);
        addQuestion(q164);
        Question q165 = new Question(R.string.chopai_line30q3,
                R.string.padle, R.string.quota, R.string.kahin, 3, Question.DIFFICULTY_EASY);
        addQuestion(q165);
        Question q166 = new Question(R.string.chopai_line30q4,
                R.string.sake, R.string.tint, R.string.volt, 1, Question.DIFFICULTY_EASY);
        addQuestion(q166);
        Question q167 = new Question(R.string.chopai_line30q5,
                R.string.ranch, R.string.kahan, R.string.salad, 2, Question.DIFFICULTY_EASY);
        addQuestion(q167);
        Question q168 = new Question(R.string.chopai_line30q6,
                R.string.ku, R.string.by, R.string.te_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q168);

        // CHOPAI LINE N0 31.

        Question q169 = new Question(R.string.chopai_line31q1,
                R.string.tum_2, R.string.fin, R.string.gap, 1, Question.DIFFICULTY_EASY);
        addQuestion(q169);
        Question q170 = new Question(R.string.chopai_line31q2,
                R.string.saint, R.string.upkar, R.string.tarot, 2, Question.DIFFICULTY_EASY);
        addQuestion(q170);
        Question q171 = new Question(R.string.chopai_line31q3,
                R.string.chopstick, R.string.herculean, R.string.sugrivahi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q171);
        Question q172 = new Question(R.string.chopai_line31q4,
                R.string.keenha, R.string.nimble, R.string.online, 1, Question.DIFFICULTY_EASY);
        addQuestion(q172);

        // CHOPAI LINE N0 32.

        Question q173 = new Question(R.string.chopai_line32q1,
                R.string.tan, R.string.ram_3, R.string.son, 2, Question.DIFFICULTY_EASY);
        addQuestion(q173);
        Question q174 = new Question(R.string.chopai_line32q2,
                R.string.venture, R.string.zillion, R.string.milaaye, 3, Question.DIFFICULTY_EASY);
        addQuestion(q174);
        Question q175 = new Question(R.string.chopai_line32q3,
                R.string.rajpad, R.string.orchid, R.string.pickle, 1, Question.DIFFICULTY_EASY);
        addQuestion(q175);
        Question q176 = new Question(R.string.chopai_line32q4,
                R.string.pigeon, R.string.deenha, R.string.random, 2, Question.DIFFICULTY_EASY);
        addQuestion(q176);

        // CHOPAI LINE N0 33.

        Question q177 = new Question(R.string.chopai_line33q1,
                R.string.sparrow, R.string.abdomen, R.string.tumharo_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q177);
        Question q178 = new Question(R.string.chopai_line33q2,
                R.string.mantra, R.string.before, R.string.carbon, 1, Question.DIFFICULTY_EASY);
        addQuestion(q178);
        Question q179 = new Question(R.string.chopai_line33q3,
                R.string.hibernate, R.string.vibhishan, R.string.immigrant, 2, Question.DIFFICULTY_EASY);
        addQuestion(q179);
        Question q180 = new Question(R.string.chopai_line33q4,
                R.string.unify, R.string.valve, R.string.maana, 3, Question.DIFFICULTY_EASY);
        addQuestion(q180);

        // CHOPAI LINE N0 34.

        Question q181 = new Question(R.string.chopai_line34q1,
                R.string.lankeshwar, R.string.madagascar, R.string.bangladesh, 1, Question.DIFFICULTY_EASY);
        addQuestion(q181);
        Question q182 = new Question(R.string.chopai_line34q2,
                R.string.angle, R.string.bhaye, R.string.broom, 2, Question.DIFFICULTY_EASY);
        addQuestion(q182);
        Question q183 = new Question(R.string.chopai_line34q3,
                R.string.air, R.string.eye, R.string.sab, 3, Question.DIFFICULTY_EASY);
        addQuestion(q183);
        Question q184 = new Question(R.string.chopai_line34q4,
                R.string.jag_2, R.string.fan, R.string.hay, 1, Question.DIFFICULTY_EASY);
        addQuestion(q184);
        Question q185 = new Question(R.string.chopai_line34q5,
                R.string.japan, R.string.jaana, R.string.chile, 2, Question.DIFFICULTY_EASY);
        addQuestion(q185);

        // CHOPAI LINE N0 35.

        Question q186 = new Question(R.string.chopai_line35q1,
                R.string.army, R.string.boil, R.string.juug, 3, Question.DIFFICULTY_EASY);
        addQuestion(q186);
        Question q187 = new Question(R.string.chopai_line35q2,
                R.string.sahastra, R.string.cambodia, R.string.malaysia, 1, Question.DIFFICULTY_EASY);
        addQuestion(q187);
        Question q188 = new Question(R.string.chopai_line35q3,
                R.string.tu, R.string.jo, R.string.po, 2, Question.DIFFICULTY_EASY);
        addQuestion(q188);
        Question q189 = new Question(R.string.chopai_line35q4,
                R.string.hit, R.string.jet, R.string.jan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q189);
        Question q190 = new Question(R.string.chopai_line35q5,
                R.string.par, R.string.key, R.string.mac, 1, Question.DIFFICULTY_EASY);
        addQuestion(q190);
        Question q191 = new Question(R.string.chopai_line35q6,
                R.string.artist, R.string.bhaanu, R.string.berlin, 2, Question.DIFFICULTY_EASY);
        addQuestion(q191);

        // CHOPAI LINE N0 36.

        Question q192 = new Question(R.string.chopai_line36q1,
                R.string.caller, R.string.excuse, R.string.leelyo, 3, Question.DIFFICULTY_EASY);
        addQuestion(q192);
        Question q193 = new Question(R.string.chopai_line36q2,
                R.string.taahi, R.string.charm, R.string.dough, 1, Question.DIFFICULTY_EASY);
        addQuestion(q193);
        Question q194 = new Question(R.string.chopai_line36q3,
                R.string.finite, R.string.madhur, R.string.health, 2, Question.DIFFICULTY_EASY);
        addQuestion(q194);
        Question q195 = new Question(R.string.chopai_line36q4,
                R.string.chad, R.string.easy, R.string.phal, 3, Question.DIFFICULTY_EASY);
        addQuestion(q195);
        Question q196 = new Question(R.string.chopai_line36q5,
                R.string.jaanu, R.string.dress, R.string.ferry, 1, Question.DIFFICULTY_EASY);
        addQuestion(q196);

        // CHOPAI LINE N0 37.

        Question q197 = new Question(R.string.chopai_line37q1,
                R.string.hockey, R.string.prabhu_2, R.string.infant, 2, Question.DIFFICULTY_EASY);
        addQuestion(q197);
        Question q198 = new Question(R.string.chopai_line37q2,
                R.string.address, R.string.beneath, R.string.mudrika, 3, Question.DIFFICULTY_EASY);
        addQuestion(q198);
        Question q199 = new Question(R.string.chopai_line37q3,
                R.string.meli, R.string.drum, R.string.exam, 1, Question.DIFFICULTY_EASY);
        addQuestion(q199);
        Question q200 = new Question(R.string.chopai_line37q4,
                R.string.farm, R.string.mukh, R.string.good, 2, Question.DIFFICULTY_EASY);
        addQuestion(q200);
        Question q201 = new Question(R.string.chopai_line37q5,
                R.string.blender, R.string.central, R.string.maaheen, 3, Question.DIFFICULTY_EASY);
        addQuestion(q201);

        // CHOPAI LINE N0 38.

        Question q202 = new Question(R.string.chopai_line38q1,
                R.string.jaladhi, R.string.capsule, R.string.holland, 1, Question.DIFFICULTY_EASY);
        addQuestion(q202);
        Question q203 = new Question(R.string.chopai_line38q2,
                R.string.elevate, R.string.laanghi, R.string.farther, 2, Question.DIFFICULTY_EASY);
        addQuestion(q203);
        Question q204 = new Question(R.string.chopai_line38q3,
                R.string.hole, R.string.idol, R.string.gaye, 3, Question.DIFFICULTY_EASY);
        addQuestion(q204);
        Question q205 = new Question(R.string.chopai_line38q4,
                R.string.acharaj, R.string.furnace, R.string.glacier, 1, Question.DIFFICULTY_EASY);
        addQuestion(q205);
        Question q206 = new Question(R.string.chopai_line38q5,
                R.string.glamour, R.string.naaheen, R.string.forever, 2, Question.DIFFICULTY_EASY);
        addQuestion(q206);

        // CHOPAI LINE N0 39.

        Question q207 = new Question(R.string.chopai_line39q1,
                R.string.indigo, R.string.jumble, R.string.durgam, 3, Question.DIFFICULTY_EASY);
        addQuestion(q207);
        Question q208 = new Question(R.string.chopai_line39q2,
                R.string.kaaj_3, R.string.item, R.string.chew, 1, Question.DIFFICULTY_EASY);
        addQuestion(q208);
        Question q209 = new Question(R.string.chopai_line39q3,
                R.string.flake, R.string.jagat, R.string.gamer, 2, Question.DIFFICULTY_EASY);
        addQuestion(q209);
        Question q210 = new Question(R.string.chopai_line39q4,
                R.string.ci, R.string.ho, R.string.ke_3, 3, Question.DIFFICULTY_EASY);
        addQuestion(q210);
        Question q211 = new Question(R.string.chopai_line39q5,
                R.string.jete, R.string.king, R.string.lama, 1, Question.DIFFICULTY_EASY);
        addQuestion(q211);

        // CHOPAI LINE N0 40.

        Question q212 = new Question(R.string.chopai_line40q1,
                R.string.grand, R.string.sugam, R.string.house, 2, Question.DIFFICULTY_EASY);
        addQuestion(q212);
        Question q213 = new Question(R.string.chopai_line40q2,
                R.string.granite, R.string.hairpin, R.string.anugrah, 3, Question.DIFFICULTY_EASY);
        addQuestion(q213);
        Question q214 = new Question(R.string.chopai_line40q3,
                R.string.tumhare, R.string.harmony, R.string.iceberg, 1, Question.DIFFICULTY_EASY);
        addQuestion(q214);
        Question q215 = new Question(R.string.chopai_line40q4,
                R.string.late, R.string.tete, R.string.mail, 2, Question.DIFFICULTY_EASY);
        addQuestion(q215);

        // CHOPAI LINE N0 41.

        Question q216 = new Question(R.string.chopai_line41q1,
                R.string.lip, R.string.mom, R.string.ram_4, 3, Question.DIFFICULTY_EASY);
        addQuestion(q216);
        Question q217 = new Question(R.string.chopai_line41q2,
                R.string.duwaare, R.string.inspect, R.string.journey, 1, Question.DIFFICULTY_EASY);
        addQuestion(q217);
        Question q218 = new Question(R.string.chopai_line41q3,
                R.string.low, R.string.tum_3, R.string.oil, 2, Question.DIFFICULTY_EASY);
        addQuestion(q218);
        Question q219 = new Question(R.string.chopai_line41q4,
                R.string.carpenter, R.string.argentina, R.string.rakhwaare, 3, Question.DIFFICULTY_EASY);
        addQuestion(q219);

        // CHOPAI LINE N0 42.

        Question q220 = new Question(R.string.chopai_line42q1,
                R.string.hot, R.string.nap, R.string.oak, 1, Question.DIFFICULTY_EASY);
        addQuestion(q220);
        Question q221 = new Question(R.string.chopai_line42q2,
                R.string.ni, R.string.na, R.string.co, 2, Question.DIFFICULTY_EASY);
        addQuestion(q221);
        Question q222 = new Question(R.string.chopai_line42q3,
                R.string.image, R.string.jewel, R.string.aagya, 3, Question.DIFFICULTY_EASY);
        addQuestion(q222);
        Question q223 = new Question(R.string.chopai_line42q4,
                R.string.binu, R.string.mesh, R.string.nail, 1, Question.DIFFICULTY_EASY);
        addQuestion(q223);
        Question q224 = new Question(R.string.chopai_line42q5,
                R.string.portugal, R.string.paisaare, R.string.zimbabwe, 2, Question.DIFFICULTY_EASY);
        addQuestion(q224);

        // CHOPAI LINE N0 43.

        Question q225 = new Question(R.string.chopai_line43q1,
                R.string.one, R.string.pan, R.string.sab_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q225);
        Question q226 = new Question(R.string.chopai_line43q2,
                R.string.sukh, R.string.name, R.string.palm, 1, Question.DIFFICULTY_EASY);
        addQuestion(q226);
        Question q227 = new Question(R.string.chopai_line43q3,
                R.string.large, R.string.lahei, R.string.small, 2, Question.DIFFICULTY_EASY);
        addQuestion(q227);
        Question q228 = new Question(R.string.chopai_line43q4,
                R.string.kingdom, R.string.laundry, R.string.tumhari, 3, Question.DIFFICULTY_EASY);
        addQuestion(q228);
        Question q229 = new Question(R.string.chopai_line43q5,
                R.string.sarna, R.string.magma, R.string.oasis, 1, Question.DIFFICULTY_EASY);
        addQuestion(q229);

        // CHOPAI LINE N0 44.

        Question q230 = new Question(R.string.chopai_line44q1,
                R.string.owl, R.string.tum_4, R.string.pet, 2, Question.DIFFICULTY_EASY);
        addQuestion(q230);
        Question q231 = new Question(R.string.chopai_line44q2,
                R.string.lecture, R.string.magnify, R.string.rakshak, 3, Question.DIFFICULTY_EASY);
        addQuestion(q231);
        Question q232 = new Question(R.string.chopai_line44q3,
                R.string.kaahu, R.string.odour, R.string.pasta, 1, Question.DIFFICULTY_EASY);
        addQuestion(q232);
        Question q233 = new Question(R.string.chopai_line44q4,
                R.string.ty, R.string.ko, R.string.cu, 2, Question.DIFFICULTY_EASY);
        addQuestion(q233);
        Question q234 = new Question(R.string.chopai_line44q5,
                R.string.launch, R.string.matrix, R.string.darnaa, 3, Question.DIFFICULTY_EASY);
        addQuestion(q234);

        // CHOPAI LINE N0 45.

        Question q235 = new Question(R.string.chopai_line45q1,
                R.string.aapan, R.string.plane, R.string.remix, 1, Question.DIFFICULTY_EASY);
        addQuestion(q235);
        Question q236 = new Question(R.string.chopai_line45q2,
                R.string.rig, R.string.tej_2, R.string.shy, 2, Question.DIFFICULTY_EASY);
        addQuestion(q236);
        Question q237 = new Question(R.string.chopai_line45q3,
                R.string.thailand, R.string.mongolia, R.string.samhaaro, 3, Question.DIFFICULTY_EASY);
        addQuestion(q237);
        Question q238 = new Question(R.string.chopai_line45q4,
                R.string.aapei, R.string.robot, R.string.sharp, 1, Question.DIFFICULTY_EASY);
        addQuestion(q238);

        // CHOPAI LINE N0 46.

        Question q239 = new Question(R.string.chopai_line46q1,
                R.string.snail, R.string.teeno, R.string.tease, 2, Question.DIFFICULTY_EASY);
        addQuestion(q239);
        Question q240 = new Question(R.string.chopai_line46q2,
                R.string.sea, R.string.toy, R.string.lok_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q240);
        Question q241 = new Question(R.string.chopai_line46q3,
                R.string.haankte, R.string.mascara, R.string.narrate, 1, Question.DIFFICULTY_EASY);
        addQuestion(q241);
        Question q242 = new Question(R.string.chopai_line46q4,
                R.string.natural, R.string.kaanpei, R.string.outlook, 2, Question.DIFFICULTY_EASY);
        addQuestion(q242);

        // CHOPAI LINE N0 47.

        Question q243 = new Question(R.string.chopai_line47q1,
                R.string.teeth, R.string.union, R.string.bhoot, 3, Question.DIFFICULTY_EASY);
        addQuestion(q243);
        Question q244 = new Question(R.string.chopai_line47q2,
                R.string.pishaach, R.string.scotland, R.string.tanzania, 1, Question.DIFFICULTY_EASY);
        addQuestion(q244);
        Question q245 = new Question(R.string.chopai_line47q3,
                R.string.twist, R.string.nikat, R.string.vault, 2, Question.DIFFICULTY_EASY);
        addQuestion(q245);
        Question q246 = new Question(R.string.chopai_line47q4,
                R.string.peak, R.string.rack, R.string.nahi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q246);
        Question q247 = new Question(R.string.chopai_line47q5,
                R.string.aavei, R.string.vapor, R.string.watch, 1, Question.DIFFICULTY_EASY);
        addQuestion(q247);

        // CHOPAI LINE N0 48.

        Question q248 = new Question(R.string.chopai_line48q1,
                R.string.pancake, R.string.mahavir, R.string.quantum, 2, Question.DIFFICULTY_EASY);
        addQuestion(q248);
        Question q249 = new Question(R.string.chopai_line48q2,
                R.string.top, R.string.use, R.string.jab, 3, Question.DIFFICULTY_EASY);
        addQuestion(q249);
        Question q250 = new Question(R.string.chopai_line48q3,
                R.string.naam, R.string.rear, R.string.sand, 1, Question.DIFFICULTY_EASY);
        addQuestion(q250);
        Question q251 = new Question(R.string.chopai_line48q4,
                R.string.pendent, R.string.sunavei, R.string.radiate, 2, Question.DIFFICULTY_EASY);
        addQuestion(q251);

        // CHOPAI LINE N0 49.

        Question q252 = new Question(R.string.chopai_line49q1,
                R.string.mentor, R.string.needle, R.string.naasei, 3, Question.DIFFICULTY_EASY);
        addQuestion(q252);
        Question q253 = new Question(R.string.chopai_line49q2,
                R.string.rog, R.string.web, R.string.yes, 1, Question.DIFFICULTY_EASY);
        addQuestion(q253);
        Question q254 = new Question(R.string.chopai_line49q3,
                R.string.self, R.string.hare, R.string.thin, 2, Question.DIFFICULTY_EASY);
        addQuestion(q254);
        Question q255 = new Question(R.string.chopai_line49q4,
                R.string.win, R.string.yen, R.string.sab_3, 3, Question.DIFFICULTY_EASY);
        addQuestion(q255);
        Question q256 = new Question(R.string.chopai_line49q5,
                R.string.peera, R.string.wafer, R.string.xerox, 1, Question.DIFFICULTY_EASY);
        addQuestion(q256);

        // CHOPAI LINE N0 50.

        Question q257 = new Question(R.string.chopai_line50q1,
                R.string.yummy, R.string.japat, R.string.abort, 2, Question.DIFFICULTY_EASY);
        addQuestion(q257);
        Question q258 = new Question(R.string.chopai_line50q2,
                R.string.bulgaria, R.string.colombia, R.string.nirantar, 3, Question.DIFFICULTY_EASY);
        addQuestion(q258);
        Question q259 = new Question(R.string.chopai_line50q3,
                R.string.hanumat, R.string.realise, R.string.sawmill, 1, Question.DIFFICULTY_EASY);
        addQuestion(q259);
        Question q260 = new Question(R.string.chopai_line50q4,
                R.string.beera, R.string.adorn, R.string.board, 2, Question.DIFFICULTY_EASY);
        addQuestion(q260);

        // CHOPAI LINE N0 51.

        Question q261 = new Question(R.string.chopai_line51q1,
                R.string.bamboo, R.string.nature, R.string.sankat, 3, Question.DIFFICULTY_EASY);
        addQuestion(q261);
        Question q262 = new Question(R.string.chopai_line51q2,
                R.string.te, R.string.de, R.string.of, 1, Question.DIFFICULTY_EASY);
        addQuestion(q262);
        Question q263 = new Question(R.string.chopai_line51q3,
                R.string.secular, R.string.hanuman_2, R.string.thorium, 2, Question.DIFFICULTY_EASY);
        addQuestion(q263);
        Question q264 = new Question(R.string.chopai_line51q4,
                R.string.seychelles, R.string.tajikistan, R.string.chhudaavei, 3, Question.DIFFICULTY_EASY);
        addQuestion(q264);

        // CHOPAI LINE N0 52.

        Question q265 = new Question(R.string.chopai_line52q1,
                R.string.mann_3, R.string.tool, R.string.visa, 1, Question.DIFFICULTY_EASY);
        addQuestion(q265);
        Question q266 = new Question(R.string.chopai_line52q2,
                R.string.warm, R.string.kram, R.string.zoom, 2, Question.DIFFICULTY_EASY);
        addQuestion(q266);
        Question q267 = new Question(R.string.chopai_line52q3,
                R.string.narrow, R.string.object, R.string.vachan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q267);
        Question q268 = new Question(R.string.chopai_line52q4,
                R.string.dhyan, R.string.bread, R.string.cliff, 1, Question.DIFFICULTY_EASY);
        addQuestion(q268);
        Question q269 = new Question(R.string.chopai_line52q5,
                R.string.ae, R.string.jo_3, R.string.fi, 2, Question.DIFFICULTY_EASY);
        addQuestion(q269);
        Question q270 = new Question(R.string.chopai_line52q6,
                R.string.oxford, R.string.pallet, R.string.laavei, 3, Question.DIFFICULTY_EASY);
        addQuestion(q270);

        // CHOPAI LINE N0 53.

        Question q271 = new Question(R.string.chopai_line53q1,
                R.string.sab_4, R.string.ace, R.string.bed, 1, Question.DIFFICULTY_EASY);
        addQuestion(q271);
        Question q272 = new Question(R.string.chopai_line53q2,
                R.string.cap, R.string.par_2, R.string.dew, 2, Question.DIFFICULTY_EASY);
        addQuestion(q272);
        Question q273 = new Question(R.string.chopai_line53q3,
                R.string.era, R.string.fog, R.string.ram_5, 3, Question.DIFFICULTY_EASY);
        addQuestion(q273);
        Question q274 = new Question(R.string.chopai_line53q4,
                R.string.tapasvi, R.string.adapter, R.string.balcony, 1, Question.DIFFICULTY_EASY);
        addQuestion(q274);
        Question q275 = new Question(R.string.chopai_line53q5,
                R.string.atom, R.string.raja, R.string.beam, 2, Question.DIFFICULTY_EASY);
        addQuestion(q275);

        // CHOPAI LINE N0 54.

        Question q276 = new Question(R.string.chopai_line54q1,
                R.string.arrow, R.string.cargo, R.string.tinke, 3, Question.DIFFICULTY_EASY);
        addQuestion(q276);
        Question q277 = new Question(R.string.chopai_line54q2,
                R.string.kaaj_4, R.string.belt, R.string.exit, 1, Question.DIFFICULTY_EASY);
        addQuestion(q277);
        Question q278 = new Question(R.string.chopai_line54q3,
                R.string.depth, R.string.sakal, R.string.entry, 2, Question.DIFFICULTY_EASY);
        addQuestion(q278);
        Question q279 = new Question(R.string.chopai_line54q4,
                R.string.few, R.string.fry, R.string.tum_5, 3, Question.DIFFICULTY_EASY);
        addQuestion(q279);
        Question q280 = new Question(R.string.chopai_line54q5,
                R.string.saaja, R.string.extra, R.string.flame, 1, Question.DIFFICULTY_EASY);
        addQuestion(q280);

        // CHOPAI LINE N0 55.

        Question q281 = new Question(R.string.chopai_line55q1,
                R.string.gas, R.string.aur_2, R.string.hub, 2, Question.DIFFICULTY_EASY);
        addQuestion(q281);
        Question q282 = new Question(R.string.chopai_line55q2,
                R.string.accurate, R.string.birdseye, R.string.manorath, 3, Question.DIFFICULTY_EASY);
        addQuestion(q282);
        Question q283 = new Question(R.string.chopai_line55q3,
                R.string.jo, R.string.ji, R.string.qu, 1, Question.DIFFICULTY_EASY);
        addQuestion(q283);
        Question q284 = new Question(R.string.chopai_line55q4,
                R.string.ice, R.string.koi, R.string.jaw, 2, Question.DIFFICULTY_EASY);
        addQuestion(q284);
        Question q285 = new Question(R.string.chopai_line55q5,
                R.string.admire, R.string.beaver, R.string.laavei_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q285);

        // CHOPAI LINE N0 56.

        Question q286 = new Question(R.string.chopai_line56q1,
                R.string.soi, R.string.job, R.string.kin, 1, Question.DIFFICULTY_EASY);
        addQuestion(q286);
        Question q287 = new Question(R.string.chopai_line56q2,
                R.string.fire, R.string.amit, R.string.gama, 2, Question.DIFFICULTY_EASY);
        addQuestion(q287);
        Question q288 = new Question(R.string.chopai_line56q3,
                R.string.borrow, R.string.carton, R.string.jeevan, 3, Question.DIFFICULTY_EASY);
        addQuestion(q288);
        Question q289 = new Question(R.string.chopai_line56q4,
                R.string.phal_3, R.string.ghee, R.string.jeep, 1, Question.DIFFICULTY_EASY);
        addQuestion(q289);
        Question q290 = new Question(R.string.chopai_line56q5,
                R.string.flick, R.string.paave, R.string.gauge, 2, Question.DIFFICULTY_EASY);
        addQuestion(q290);

        // CHOPAI LINE N0 57.

        Question q291 = new Question(R.string.chopai_line57q1,
                R.string.barrage, R.string.centaur, R.string.chaaron, 3, Question.DIFFICULTY_EASY);
        addQuestion(q291);
        Question q292 = new Question(R.string.chopai_line57q2,
                R.string.jug, R.string.mug, R.string.jog, 1, Question.DIFFICULTY_EASY);
        addQuestion(q292);
        Question q293 = new Question(R.string.chopai_line57q3,
                R.string.cheese, R.string.partap, R.string.format, 2, Question.DIFFICULTY_EASY);
        addQuestion(q293);
        Question q294 = new Question(R.string.chopai_line57q4,
                R.string.basmati, R.string.descent, R.string.tumhara, 3, Question.DIFFICULTY_EASY);
        addQuestion(q294);

        // CHOPAI LINE N0 58.

        Question q295 = new Question(R.string.chopai_line58q1,
                R.string.hai, R.string.joy, R.string.leg, 1, Question.DIFFICULTY_EASY);
        addQuestion(q295);
        Question q296 = new Question(R.string.chopai_line58q2,
                R.string.australia, R.string.parsiddha, R.string.mauritius, 2, Question.DIFFICULTY_EASY);
        addQuestion(q296);
        Question q297 = new Question(R.string.chopai_line58q3,
                R.string.graph, R.string.happy, R.string.jagat_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q297);
        Question q298 = new Question(R.string.chopai_line58q4,
                R.string.ujiyara, R.string.eardrum, R.string.ferment, 1, Question.DIFFICULTY_EASY);
        addQuestion(q298);

        // CHOPAI LINE N0 59.

        Question q299 = new Question(R.string.chopai_line59q1,
                R.string.heavy, R.string.sadhu, R.string.inbox, 2, Question.DIFFICULTY_EASY);
        addQuestion(q299);
        Question q300 = new Question(R.string.chopai_line59q2,
                R.string.knee, R.string.limo, R.string.sant, 3, Question.DIFFICULTY_EASY);
        addQuestion(q300);
        Question q301 = new Question(R.string.chopai_line59q3,
                R.string.ke_4, R.string.nu, R.string.oe, 1, Question.DIFFICULTY_EASY);
        addQuestion(q301);
        Question q302 = new Question(R.string.chopai_line59q4,
                R.string.lit, R.string.tum_6, R.string.met, 2, Question.DIFFICULTY_EASY);
        addQuestion(q302);
        Question q303 = new Question(R.string.chopai_line59q5,
                R.string.gibraltar, R.string.guatemala, R.string.rakhvaare, 3, Question.DIFFICULTY_EASY);
        addQuestion(q303);

        // CHOPAI LINE N0 60.

        Question q304 = new Question(R.string.chopai_line60q1,
                R.string.asur_2, R.string.loop, R.string.mart, 1, Question.DIFFICULTY_EASY);
        addQuestion(q304);
        Question q305 = new Question(R.string.chopai_line60q2,
                R.string.broccoli, R.string.nikandan, R.string.cardamom, 2, Question.DIFFICULTY_EASY);
        addQuestion(q305);
        Question q306 = new Question(R.string.chopai_line60q3,
                R.string.ran, R.string.pay, R.string.ram_6, 3, Question.DIFFICULTY_EASY);
        addQuestion(q306);
        Question q307 = new Question(R.string.chopai_line60q4,
                R.string.dulaare, R.string.forsake, R.string.gesture, 1, Question.DIFFICULTY_EASY);
        addQuestion(q307);

        // CHOPAI LINE N0 61.

        Question q308 = new Question(R.string.chopai_line61q1,
                R.string.judge, R.string.ashta, R.string.known, 2, Question.DIFFICULTY_EASY);
        addQuestion(q308);
        Question q309 = new Question(R.string.chopai_line61q2,
                R.string.garage, R.string.geneva, R.string.siddhi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q309);
        Question q310 = new Question(R.string.chopai_line61q3,
                R.string.nau, R.string.red, R.string.rod, 1, Question.DIFFICULTY_EASY);
        addQuestion(q310);
        Question q311 = new Question(R.string.chopai_line61q4,
                R.string.knock, R.string.nidhi, R.string.laser, 2, Question.DIFFICULTY_EASY);
        addQuestion(q311);
        Question q312 = new Question(R.string.chopai_line61q5,
                R.string.fu, R.string.gi, R.string.ke_5, 3, Question.DIFFICULTY_EASY);
        addQuestion(q312);
        Question q313 = new Question(R.string.chopai_line61q6,
                R.string.data, R.string.mark, R.string.noun, 1, Question.DIFFICULTY_EASY);
        addQuestion(q313);

        // CHOPAI LINE N0 62.

        Question q314 = new Question(R.string.chopai_line62q1,
                R.string.rug, R.string.asa_2, R.string.map, 2, Question.DIFFICULTY_EASY);
        addQuestion(q314);
        Question q315 = new Question(R.string.chopai_line62q2,
                R.string.sir, R.string.tag, R.string.bar, 3, Question.DIFFICULTY_EASY);
        addQuestion(q315);
        Question q316 = new Question(R.string.chopai_line62q3,
                R.string.deen, R.string.paid, R.string.rice, 1, Question.DIFFICULTY_EASY);
        addQuestion(q316);
        Question q317 = new Question(R.string.chopai_line62q4,
                R.string.latch, R.string.janki, R.string.media, 2, Question.DIFFICULTY_EASY);
        addQuestion(q317);
        Question q318 = new Question(R.string.chopai_line62q5,
                R.string.read, R.string.size, R.string.mata, 3, Question.DIFFICULTY_EASY);
        addQuestion(q318);

        // CHOPAI LINE N0 63.

        Question q319 = new Question(R.string.chopai_line63q1,
                R.string.ram_7, R.string.sky, R.string.sun, 1, Question.DIFFICULTY_EASY);
        addQuestion(q319);
        Question q320 = new Question(R.string.chopai_line63q2,
                R.string.grocery, R.string.rasayan, R.string.harbour, 2, Question.DIFFICULTY_EASY);
        addQuestion(q320);
        Question q321 = new Question(R.string.chopai_line63q3,
                R.string.helpful, R.string.belgium, R.string.tumhare_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q321);
        Question q322 = new Question(R.string.chopai_line63q4,
                R.string.pasa, R.string.soak, R.string.tour, 1, Question.DIFFICULTY_EASY);
        addQuestion(q322);

        // CHOPAI LINE N0 64.

        Question q323 = new Question(R.string.chopai_line64q1,
                R.string.merge, R.string.sadaa, R.string.noose, 2, Question.DIFFICULTY_EASY);
        addQuestion(q323);
        Question q324 = new Question(R.string.chopai_line64q2,
                R.string.tram, R.string.urge, R.string.raho, 3, Question.DIFFICULTY_EASY);
        addQuestion(q324);
        Question q325 = new Question(R.string.chopai_line64q3,
                R.string.raghupati_2, R.string.indonesia, R.string.palestine, 1, Question.DIFFICULTY_EASY);
        addQuestion(q325);
        Question q326 = new Question(R.string.chopai_line64q4,
                R.string.ly, R.string.ke_6, R.string.no, 2, Question.DIFFICULTY_EASY);
        addQuestion(q326);
        Question q327 = new Question(R.string.chopai_line64q5,
                R.string.teak, R.string.wood, R.string.dasa, 3, Question.DIFFICULTY_EASY);
        addQuestion(q327);

        // CHOPAI LINE N0 65.

        Question q328 = new Question(R.string.chopai_line65q1,
                R.string.tumhare_3, R.string.holiday, R.string.jackpot, 1, Question.DIFFICULTY_EASY);
        addQuestion(q328);
        Question q329 = new Question(R.string.chopai_line65q2,
                R.string.russia, R.string.bhajan, R.string.europe, 2, Question.DIFFICULTY_EASY);
        addQuestion(q329);
        Question q330 = new Question(R.string.chopai_line65q3,
                R.string.thy, R.string.way, R.string.ram_8, 3, Question.DIFFICULTY_EASY);
        addQuestion(q330);
        Question q331 = new Question(R.string.chopai_line65q4,
                R.string.ko, R.string.bi, R.string.mu, 1, Question.DIFFICULTY_EASY);
        addQuestion(q331);
        Question q332 = new Question(R.string.chopai_line65q5,
                R.string.genius, R.string.paavei, R.string.hamlet, 2, Question.DIFFICULTY_EASY);
        addQuestion(q332);

        // CHOPAI LINE N0 66.

        Question q333 = new Question(R.string.chopai_line66q1,
                R.string.orbit, R.string.paste, R.string.janam, 3, Question.DIFFICULTY_EASY);
        addQuestion(q333);
        Question q334 = new Question(R.string.chopai_line66q2,
                R.string.janam_2, R.string.purse, R.string.quiet, 1, Question.DIFFICULTY_EASY);
        addQuestion(q334);
        Question q335 = new Question(R.string.chopai_line66q3,
                R.string.qi, R.string.ke_7, R.string.ry, 2, Question.DIFFICULTY_EASY);
        addQuestion(q335);
        Question q336 = new Question(R.string.chopai_line66q4,
                R.string.wind, R.string.yarn, R.string.dukh, 3, Question.DIFFICULTY_EASY);
        addQuestion(q336);
        Question q337 = new Question(R.string.chopai_line66q5,
                R.string.bisraavei, R.string.singapore, R.string.nicaragua, 1, Question.DIFFICULTY_EASY);
        addQuestion(q337);

        // CHOPAI LINE N0 67.

        Question q338 = new Question(R.string.chopai_line67q1,
                R.string.wing, R.string.anta, R.string.yoke, 2, Question.DIFFICULTY_EASY);
        addQuestion(q338);
        Question q339 = new Question(R.string.chopai_line67q2,
                R.string.quote, R.string.rapid, R.string.kaaal, 3, Question.DIFFICULTY_EASY);
        addQuestion(q339);
        Question q340 = new Question(R.string.chopai_line67q3,
                R.string.raghubar_2, R.string.carriage, R.string.divinity, 1, Question.DIFFICULTY_EASY);
        addQuestion(q340);
        Question q341 = new Question(R.string.chopai_line67q4,
                R.string.wet, R.string.pur, R.string.ago, 2, Question.DIFFICULTY_EASY);
        addQuestion(q341);
        Question q342 = new Question(R.string.chopai_line67q5,
                R.string.wire, R.string.year, R.string.jaai, 3, Question.DIFFICULTY_EASY);
        addQuestion(q342);

        // CHOPAI LINE N0 68.

        Question q343 = new Question(R.string.chopai_line68q1,
                R.string.jahan, R.string.ratio, R.string.scope, 1, Question.DIFFICULTY_EASY);
        addQuestion(q343);
        Question q344 = new Question(R.string.chopai_line68q2,
                R.string.wrap, R.string.janm, R.string.zone, 2, Question.DIFFICULTY_EASY);
        addQuestion(q344);
        Question q345 = new Question(R.string.chopai_line68q3,
                R.string.hero, R.string.axis, R.string.hari, 3, Question.DIFFICULTY_EASY);
        addQuestion(q345);
        Question q346 = new Question(R.string.chopai_line68q4,
                R.string.bhakt, R.string.sepoy, R.string.tempt, 1, Question.DIFFICULTY_EASY);
        addQuestion(q346);
        Question q347 = new Question(R.string.chopai_line68q5,
                R.string.hammer, R.string.kahaai, R.string.intent, 2, Question.DIFFICULTY_EASY);
        addQuestion(q347);

        // CHOPAI LINE N0 69.

        Question q348 = new Question(R.string.chopai_line69q1,
                R.string.aid, R.string.bag, R.string.aur_3, 3, Question.DIFFICULTY_EASY);
        addQuestion(q348);
        Question q349 = new Question(R.string.chopai_line69q2,
                R.string.devta, R.string.taste, R.string.unite, 1, Question.DIFFICULTY_EASY);
        addQuestion(q349);
        Question q350 = new Question(R.string.chopai_line69q3,
                R.string.water, R.string.chitt, R.string.arena, 2, Question.DIFFICULTY_EASY);
        addQuestion(q350);
        Question q351 = new Question(R.string.chopai_line69q4,
                R.string.hi, R.string.me, R.string.na_2, 3, Question.DIFFICULTY_EASY);
        addQuestion(q351);
        Question q352 = new Question(R.string.chopai_line69q5,
                R.string.dharai, R.string.jigsaw, R.string.labour, 1, Question.DIFFICULTY_EASY);
        addQuestion(q352);

        // CHOPAI LINE N0 70.

        Question q353 = new Question(R.string.chopai_line70q1,
                R.string.jodhpur, R.string.hanumat_2, R.string.kampala, 2, Question.DIFFICULTY_EASY);
        addQuestion(q353);
        Question q354 = new Question(R.string.chopai_line70q2,
                R.string.axe, R.string.big, R.string.sei, 3, Question.DIFFICULTY_EASY);
        addQuestion(q354);
        Question q355 = new Question(R.string.chopai_line70q3,
                R.string.sarva, R.string.aroma, R.string.babul, 1, Question.DIFFICULTY_EASY);
        addQuestion(q355);
        Question q356 = new Question(R.string.chopai_line70q4,
                R.string.bait, R.string.sukh_2, R.string.camp, 2, Question.DIFFICULTY_EASY);
        addQuestion(q356);
        Question q357 = new Question(R.string.chopai_line70q5,
                R.string.banjo, R.string.cadet, R.string.karai, 3, Question.DIFFICULTY_EASY);
        addQuestion(q357);

        // CHOPAI LINE N0 71.

        Question q358 = new Question(R.string.chopai_line71q1,
                R.string.sankat_2, R.string.laptop, R.string.magnet, 1, Question.DIFFICULTY_EASY);
        addQuestion(q358);
        Question q359 = new Question(R.string.chopai_line71q2,
                R.string.cause, R.string.katei, R.string.dream, 2, Question.DIFFICULTY_EASY);
        addQuestion(q359);
        Question q360 = new Question(R.string.chopai_line71q3,
                R.string.eases, R.string.fixed, R.string.mitei, 3, Question.DIFFICULTY_EASY);
        addQuestion(q360);
        Question q361 = new Question(R.string.chopai_line71q4,
                R.string.sab_5, R.string.bid, R.string.cot, 1, Question.DIFFICULTY_EASY);
        addQuestion(q361);
        Question q362 = new Question(R.string.chopai_line71q5,
                R.string.flood, R.string.peera_2, R.string.green, 2, Question.DIFFICULTY_EASY);
        addQuestion(q362);

        // CHOPAI LINE N0 72.

        Question q363 = new Question(R.string.chopai_line72q1,
                R.string.wi, R.string.jy, R.string.jo_5, 3, Question.DIFFICULTY_EASY);
        addQuestion(q363);
        Question q364 = new Question(R.string.chopai_line72q2,
                R.string.sumirei, R.string.lighten, R.string.martial, 1, Question.DIFFICULTY_EASY);
        addQuestion(q364);
        Question q365 = new Question(R.string.chopai_line72q3,
                R.string.mileage, R.string.hanumat_3, R.string.network, 2, Question.DIFFICULTY_EASY);
        addQuestion(q365);
        Question q366 = new Question(R.string.chopai_line72q4,
                R.string.cue, R.string.dye, R.string.bal_3, 3, Question.DIFFICULTY_EASY);
        addQuestion(q366);
        Question q367 = new Question(R.string.chopai_line72q5,
                R.string.beera_2, R.string.gross, R.string.habit, 1, Question.DIFFICULTY_EASY);
        addQuestion(q367);

        // CHOPAI LINE N0 73.

        Question q368 = new Question(R.string.chopai_line73q1,
                R.string.alp, R.string.jai_3, R.string.fax, 2, Question.DIFFICULTY_EASY);
        addQuestion(q368);
        Question q369 = new Question(R.string.chopai_line73q2,
                R.string.fix, R.string.gel, R.string.jai_4, 3, Question.DIFFICULTY_EASY);
        addQuestion(q369);
        Question q370 = new Question(R.string.chopai_line73q3,
                R.string.jai_5, R.string.gum, R.string.ink, 1, Question.DIFFICULTY_EASY);
        addQuestion(q370);
        Question q371 = new Question(R.string.chopai_line73q4,
                R.string.admiral, R.string.hanuman_3, R.string.banquet, 2, Question.DIFFICULTY_EASY);
        addQuestion(q371);
        Question q372 = new Question(R.string.chopai_line73q5,
                R.string.agent, R.string.birth, R.string.gosai, 3, Question.DIFFICULTY_EASY);
        addQuestion(q372);

        // CHOPAI LINE N0 74.

        Question q373 = new Question(R.string.chopai_line74q1,
                R.string.kripa, R.string.bound, R.string.carat, 1, Question.DIFFICULTY_EASY);
        addQuestion(q373);
        Question q374 = new Question(R.string.chopai_line74q2,
                R.string.afghan, R.string.karahu, R.string.bright, 2, Question.DIFFICULTY_EASY);
        addQuestion(q374);
        Question q375 = new Question(R.string.chopai_line74q3,
                R.string.billion, R.string.capital, R.string.gurudev, 3, Question.DIFFICULTY_EASY);
        addQuestion(q375);
        Question q376 = new Question(R.string.chopai_line74q4,
                R.string.ki, R.string.bo, R.string.ju, 1, Question.DIFFICULTY_EASY);
        addQuestion(q376);
        Question q377 = new Question(R.string.chopai_line74q5,
                R.string.axle, R.string.naai, R.string.barn, 2, Question.DIFFICULTY_EASY);
        addQuestion(q377);

        // CHOPAI LINE N0 75.

        Question q378 = new Question(R.string.chopai_line75q1,
                R.string.it, R.string.si, R.string.jo_6, 3, Question.DIFFICULTY_EASY);
        addQuestion(q378);
        Question q379 = new Question(R.string.chopai_line75q2,
                R.string.sat, R.string.jar, R.string.law, 1, Question.DIFFICULTY_EASY);
        addQuestion(q379);
        Question q380 = new Question(R.string.chopai_line75q3,
                R.string.best, R.string.baar, R.string.coin, 2, Question.DIFFICULTY_EASY);
        addQuestion(q380);
        Question q381 = new Question(R.string.chopai_line75q4,
                R.string.brave, R.string.chain, R.string.paath, 3, Question.DIFFICULTY_EASY);
        addQuestion(q381);
        Question q382 = new Question(R.string.chopai_line75q5,
                R.string.kar, R.string.men, R.string.own, 1, Question.DIFFICULTY_EASY);
        addQuestion(q382);
        Question q383 = new Question(R.string.chopai_line75q6,
                R.string.paw, R.string.koi_2, R.string.rib, 2, Question.DIFFICULTY_EASY);
        addQuestion(q383);

        // CHOPAI LINE N0 76.

        Question q384 = new Question(R.string.chopai_line76q1,
                R.string.activate, R.string.caffeine, R.string.chhutahi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q384);
        Question q385 = new Question(R.string.chopai_line76q2,
                R.string.bandi, R.string.chair, R.string.debit, 1, Question.DIFFICULTY_EASY);
        addQuestion(q385);
        Question q386 = new Question(R.string.chopai_line76q3,
                R.string.carnival, R.string.mahasukh, R.string.daughter, 2, Question.DIFFICULTY_EASY);
        addQuestion(q386);
        Question q387 = new Question(R.string.chopai_line76q4,
                R.string.sim, R.string.tip, R.string.hoi, 3, Question.DIFFICULTY_EASY);
        addQuestion(q387);

        // CHOPAI LINE N0 77.

        Question q388 = new Question(R.string.chopai_line77q1,
                R.string.jo_7, R.string.ta, R.string.di, 1, Question.DIFFICULTY_EASY);
        addQuestion(q388);
        Question q389 = new Question(R.string.chopai_line77q2,
                R.string.six, R.string.yah, R.string.tin, 2, Question.DIFFICULTY_EASY);
        addQuestion(q389);
        Question q390 = new Question(R.string.chopai_line77q3,
                R.string.depot, R.string.ethic, R.string.padhe, 3, Question.DIFFICULTY_EASY);
        addQuestion(q390);
        Question q391 = new Question(R.string.chopai_line77q4,
                R.string.hanuman_4, R.string.caravan, R.string.dictate, 1, Question.DIFFICULTY_EASY);
        addQuestion(q391);
        Question q392 = new Question(R.string.chopai_line77q5,
                R.string.deliver, R.string.chalisa, R.string.exotica, 2, Question.DIFFICULTY_EASY);
        addQuestion(q392);

        // CHOPAI LINE N0 78.

        Question q393 = new Question(R.string.chopai_line78q1,
                R.string.comb, R.string.east, R.string.hoye, 3, Question.DIFFICULTY_EASY);
        addQuestion(q393);
        Question q394 = new Question(R.string.chopai_line78q2,
                R.string.siddhi_2, R.string.bronze, R.string.dental, 1, Question.DIFFICULTY_EASY);
        addQuestion(q394);
        Question q395 = new Question(R.string.chopai_line78q3,
                R.string.dinner, R.string.saakhi, R.string.empire, 2, Question.DIFFICULTY_EASY);
        addQuestion(q395);
        Question q396 = new Question(R.string.chopai_line78q4,
                R.string.express, R.string.feature, R.string.gaurisa, 3, Question.DIFFICULTY_EASY);
        addQuestion(q396);

        // CHOPAI LINE N0 79.

        Question q397 = new Question(R.string.chopai_line79q1,
                R.string.tulsidas, R.string.cameroon, R.string.ethiopia, 1, Question.DIFFICULTY_EASY);
        addQuestion(q397);
        Question q398 = new Question(R.string.chopai_line79q2,
                R.string.fact, R.string.sada, R.string.gram, 2, Question.DIFFICULTY_EASY);
        addQuestion(q398);
        Question q399 = new Question(R.string.chopai_line79q3,
                R.string.hair, R.string.icon, R.string.hari, 3, Question.DIFFICULTY_EASY);
        addQuestion(q399);
        Question q400 = new Question(R.string.chopai_line79q4,
                R.string.chera, R.string.ether, R.string.faith, 1, Question.DIFFICULTY_EASY);
        addQuestion(q400);

        // CHOPAI LINE N0 80.

        Question q401 = new Question(R.string.chopai_line80q1,
                R.string.exceed, R.string.keejei, R.string.factor, 2, Question.DIFFICULTY_EASY);
        addQuestion(q401);
        Question q402 = new Question(R.string.chopai_line80q2,
                R.string.jean, R.string.lawn, R.string.nath, 3, Question.DIFFICULTY_EASY);
        addQuestion(q402);
        Question q403 = new Question(R.string.chopai_line80q3,
                R.string.hriday, R.string.falcon, R.string.heater, 1, Question.DIFFICULTY_EASY);
        addQuestion(q403);
        Question q404 = new Question(R.string.chopai_line80q4,
                R.string.leaf, R.string.maha, R.string.main, 2, Question.DIFFICULTY_EASY);
        addQuestion(q404);
        Question q405 = new Question(R.string.chopai_line80q5,
                R.string.mild, R.string.next, R.string.dera, 3, Question.DIFFICULTY_EASY);
        addQuestion(q405);

        // DOHA LINE N0 9.

        Question q406 = new Question(R.string.doha_line9q1,
                R.string.pavantanay, R.string.luxembourg, R.string.montenegro, 1, Question.DIFFICULTY_EASY);
        addQuestion(q406);
        Question q407 = new Question(R.string.doha_line9q2,
                R.string.helmet, R.string.sankat_3, R.string.inmate, 2, Question.DIFFICULTY_EASY);
        addQuestion(q407);
        Question q408 = new Question(R.string.doha_line9q3,
                R.string.faint, R.string.glide, R.string.haran, 3, Question.DIFFICULTY_EASY);
        addQuestion(q408);

        // DOHA LINE N0 10.

        Question q409 = new Question(R.string.doha_line10q1,
                R.string.mangal, R.string.insure, R.string.jacket, 1, Question.DIFFICULTY_EASY);
        addQuestion(q409);
        Question q410 = new Question(R.string.doha_line10q2,
                R.string.greet, R.string.murti, R.string.honey, 2, Question.DIFFICULTY_EASY);
        addQuestion(q410);
        Question q411 = new Question(R.string.doha_line10q3,
                R.string.nose, R.string.pack, R.string.roop_4, 3, Question.DIFFICULTY_EASY);
        addQuestion(q411);

        // DOHA LINE N0 11.

        Question q412 = new Question(R.string.doha_line11q1,
                R.string.ramlakhan, R.string.greenland, R.string.macedonia, 1, Question.DIFFICULTY_EASY);
        addQuestion(q412);
        Question q413 = new Question(R.string.doha_line11q2,
                R.string.head, R.string.sita_2, R.string.pave, 2, Question.DIFFICULTY_EASY);
        addQuestion(q413);
        Question q414 = new Question(R.string.doha_line11q3,
                R.string.inner, R.string.knead, R.string.sahit, 3, Question.DIFFICULTY_EASY);
        addQuestion(q414);

        // DOHA LINE N0 12.

        Question q415 = new Question(R.string.doha_line12q1,
                R.string.hriday_2, R.string.latest, R.string.manila, 1, Question.DIFFICULTY_EASY);
        addQuestion(q415);
        Question q416 = new Question(R.string.doha_line12q2,
                R.string.margin, R.string.basahu, R.string.napkin, 2, Question.DIFFICULTY_EASY);
        addQuestion(q416);
        Question q417 = new Question(R.string.doha_line12q3,
                R.string.cub, R.string.fun, R.string.sur, 3, Question.DIFFICULTY_EASY);
        addQuestion(q417);
        Question q418 = new Question(R.string.doha_line12q4,
                R.string.bhoop, R.string.lyric, R.string.marry, 3, Question.DIFFICULTY_EASY);
        addQuestion(q418);

        // DIFFICULTY LEVEL - MEDIUM

        // DOHA LINE N0 1.

        Question q419 = new Question(R.string.doha_line1q1,
                R.string.apple, R.string.shree, R.string.saroj, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q419);
        Question q420 = new Question(R.string.doha_line1q2,
                R.string.mann, R.string.bear, R.string.guru, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q420);
        Question q421 = new Question(R.string.doha_line1q3,
                R.string.charan, R.string.dayaku, R.string.banana, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q421);
        Question q422 = new Question(R.string.doha_line1q4,
                R.string.shark, R.string.saroj, R.string.mukur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q422);
        Question q423 = new Question(R.string.doha_line1q5,
                R.string.nij, R.string.rat, R.string.raj, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q423);

        // DOHA LINE N0 2.

        Question q424 = new Question(R.string.doha_line2q1,
                R.string.nij, R.string.bal, R.string.log, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q424);
        Question q425 = new Question(R.string.doha_line2q2,
                R.string.jump, R.string.mann, R.string.jasu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q425);
        Question q426 = new Question(R.string.doha_line2q3,
                R.string.bimal, R.string.pizza, R.string.mukur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q426);
        Question q427 = new Question(R.string.doha_line2q4,
                R.string.sudhaari, R.string.raghubar, R.string.cucumber, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q427);

        // DOHA LINE N0 .3

        Question q428 = new Question(R.string.doha_line3q1,
                R.string.garlic, R.string.barnau, R.string.janike, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q428);
        Question q429 = new Question(R.string.doha_line3q2,
                R.string.pavansut, R.string.beetroot, R.string.raghubar, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q429);
        Question q430 = new Question(R.string.doha_line3q3,
                R.string.bimal, R.string.chari, R.string.horse, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q430);
        Question q431 = new Question(R.string.doha_line3q4,
                R.string.goat, R.string.jasu, R.string.phal, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q431);

        // DOHA LINE N0 4.

        Question q432 = new Question(R.string.doha_line4q1,
                R.string.ke, R.string.go, R.string.jo, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q432);
        Question q433 = new Question(R.string.doha_line4q2,
                R.string.dayaku, R.string.buddhi, R.string.fennel, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q433);
        Question q434 = new Question(R.string.doha_line4q3,
                R.string.duck, R.string.phal, R.string.tanu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q434);
        Question q435 = new Question(R.string.doha_line4q4,
                R.string.pavan, R.string.grape, R.string.chari, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q435);

        // DOHA LINE N0 5.

        Question q436 = new Question(R.string.doha_line5q1,
                R.string.buddhiheen, R.string.ramchandra, R.string.sandstones, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q436);
        Question q437 = new Question(R.string.doha_line5q2,
                R.string.cool, R.string.tanu, R.string.dehu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q437);
        Question q438 = new Question(R.string.doha_line5q3,
                R.string.harahu, R.string.future, R.string.janike, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q438);

        // DOHA LINE N0 6.

        Question q439 = new Question(R.string.doha_line6q1,
                R.string.sumirow, R.string.hanuman, R.string.apricot, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q439);
        Question q440 = new Question(R.string.doha_line6q2,
                R.string.jumbo, R.string.pavan, R.string.vidya, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q440);
        Question q441 = new Question(R.string.doha_line6q3,
                R.string.kales, R.string.table, R.string.kumar, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q441);

        // DOHA LINE N0 7.

        Question q442 = new Question(R.string.doha_line7q1,
                R.string.bal, R.string.jai, R.string.car, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q442);
        Question q443 = new Question(R.string.doha_line7q2,
                R.string.papaya, R.string.buddhi, R.string.bikaar, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q443);
        Question q444 = new Question(R.string.doha_line7q3,
                R.string.sagar, R.string.zebra, R.string.vidya, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q444);
        Question q445 = new Question(R.string.doha_line7q4,
                R.string.dehu, R.string.gyan, R.string.crab, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q445);
        Question q446 = new Question(R.string.doha_line7q5,
                R.string.corn, R.string.mohi, R.string.kesa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q446);

        // DOHA LINE N0 8.

        Question q447 = new Question(R.string.doha_line8q1,
                R.string.atulit, R.string.pepper, R.string.harahu, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q447);
        Question q448 = new Question(R.string.doha_line8q2,
                R.string.kales, R.string.kapis, R.string.wheat, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q448);
        Question q449 = new Question(R.string.doha_line8q3,
                R.string.peanut, R.string.bikaar, R.string.dhamaa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q449);

        // CHOPAI LINE N0 1.

        Question q450 = new Question(R.string.chopai_line1q1,
                R.string.lok, R.string.bee, R.string.jai, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q450);
        Question q451 = new Question(R.string.chopai_line1q2,
                R.string.hanuman, R.string.ujaagar, R.string.jasmine, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q451);
        Question q452 = new Question(R.string.chopai_line1q3,
                R.string.pear, R.string.gyan, R.string.maha, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q452);
        Question q453 = new Question(R.string.chopai_line1q4,
                R.string.aur, R.string.run, R.string.gun, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q453);
        Question q454 = new Question(R.string.chopai_line1q5,
                R.string.sagar, R.string.tihun, R.string.peach, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q454);

        // CHOPAI LINE N0 2.

        Question q455 = new Question(R.string.chopai_line2q1,
                R.string.raw, R.string.jai_2, R.string.tej, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q455);
        Question q456 = new Question(R.string.chopai_line2q2,
                R.string.putra, R.string.davis, R.string.kapis, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q456);
        Question q457 = new Question(R.string.chopai_line2q3,
                R.string.tihun, R.string.sangi, R.string.point, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q457);
        Question q458 = new Question(R.string.chopai_line2q4,
                R.string.ray, R.string.lok, R.string.jag, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q458);
        Question q459 = new Question(R.string.chopai_line2q5,
                R.string.ramdoot, R.string.giraffe, R.string.ujaagar, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q459);

        // CHOPAI LINE N0 3.

        Question q460 = new Question(R.string.chopai_line3q1,
                R.string.ramdoot, R.string.kanchan, R.string.cheetah, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q460);
        Question q461 = new Question(R.string.chopai_line3q2,
                R.string.impala, R.string.atulit, R.string.anjani, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q461);
        Question q462 = new Question(R.string.chopai_line3q3,
                R.string.ati, R.string.zip, R.string.bal_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q462);
        Question q463 = new Question(R.string.chopai_line3q4,
                R.string.dhamaa, R.string.naamaa, R.string.quartz, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q463);

        // CHOPAI LINE N0 4.

        Question q464 = new Question(R.string.chopai_line4q1,
                R.string.heaven, R.string.anjani, R.string.bikram, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q464);
        Question q465 = new Question(R.string.chopai_line4q2,
                R.string.baran, R.string.craft, R.string.putra, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q465);
        Question q466 = new Question(R.string.chopai_line4q3,
                R.string.pavansut, R.string.mahaveer, R.string.colorful, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q466);
        Question q467 = new Question(R.string.chopai_line4q4,
                R.string.breath, R.string.naamaa, R.string.kumati, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q467);

        // CHOPAI LINE N0 5.

        Question q468 = new Question(R.string.chopai_line5q1,
                R.string.sanvaare, R.string.teammate, R.string.mahaveer, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q468);
        Question q469 = new Question(R.string.chopai_line5q2,
                R.string.bikram, R.string.nivaar, R.string.spirit, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q469);
        Question q470 = new Question(R.string.chopai_line5q3,
                R.string.extracts, R.string.bajrangi, R.string.raghubar, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q470);

        // CHOPAI LINE N0 6.

        Question q471 = new Question(R.string.chopai_line6q1,
                R.string.biraaj, R.string.barley, R.string.kumati, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q471);
        Question q472 = new Question(R.string.chopai_line6q2,
                R.string.nivaar, R.string.kaanan, R.string.shiver, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q472);
        Question q473 = new Question(R.string.chopai_line6q3,
                R.string.trivia, R.string.sumati, R.string.dhwaja, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q473);
        Question q474 = new Question(R.string.chopai_line6q4,
                R.string.ko, R.string.le, R.string.ke, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q474);
        Question q475 = new Question(R.string.chopai_line6q5,
                R.string.sangi, R.string.haath, R.string.shape, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q475);

        // CHOPAI LINE N0 7.

        Question q476 = new Question(R.string.chopai_line7q1,
                R.string.buffalo, R.string.kanchan, R.string.kunchit, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q476);
        Question q477 = new Question(R.string.chopai_line7q2,
                R.string.bajra, R.string.snake, R.string.baran, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q477);
        Question q478 = new Question(R.string.chopai_line7q3,
                R.string.biraaj, R.string.nandan, R.string.brazil, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q478);
        Question q479 = new Question(R.string.chopai_line7q4,
                R.string.dolphin, R.string.subesaa, R.string.birajai, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q479);

        // CHOPAI LINE N0 8.

        Question q480 = new Question(R.string.chopai_line8q1,
                R.string.pratap, R.string.cherry, R.string.kaanan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q480);
        Question q481 = new Question(R.string.chopai_line8q2,
                R.string.kundal, R.string.vandan, R.string.lentil, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q481);
        Question q482 = new Question(R.string.chopai_line8q3,
                R.string.meercat, R.string.kunchit, R.string.kaandhe, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q482);
        Question q483 = new Question(R.string.chopai_line8q4,
                R.string.guni, R.string.deer, R.string.kesa, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q483);

        // CHOPAI LINE N0 9.

        Question q484 = new Question(R.string.chopai_line9q1,
                R.string.haath, R.string.moonj, R.string.moose, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q484);
        Question q485 = new Question(R.string.chopai_line9q2,
                R.string.royal, R.string.bajra, R.string.janeu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q485);
        Question q486 = new Question(R.string.chopai_line9q3,
                R.string.tum, R.string.cat, R.string.aur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q486);
        Question q487 = new Question(R.string.chopai_line9q4,
                R.string.dhwaja, R.string.karibe, R.string.radish, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q487);
        Question q488 = new Question(R.string.chopai_line9q5,
                R.string.panther, R.string.birajai, R.string.chaatur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q488);

        // CHOPAI LINE N0 10.

        Question q489 = new Question(R.string.chopai_line10q1,
                R.string.sukshma, R.string.bicycle, R.string.kaandhe, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q489);
        Question q490 = new Question(R.string.chopai_line10q2,
                R.string.moonj, R.string.suvan, R.string.whale, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q490);
        Question q491 = new Question(R.string.chopai_line10q3,
                R.string.pulse, R.string.janeu, R.string.kesri, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q491);
        Question q492 = new Question(R.string.chopai_line10q4,
                R.string.aatur, R.string.berry, R.string.saaje, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q492);

        // CHOPAI LINE N0 11.

        Question q493 = new Question(R.string.chopai_line11q1,
                R.string.sankar, R.string.prabhu, R.string.ginger, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q493);
        Question q494 = new Question(R.string.chopai_line11q2,
                R.string.child, R.string.suvan, R.string.dhari, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q494);
        Question q495 = new Question(R.string.chopai_line11q3,
                R.string.bheem, R.string.dates, R.string.kesri, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q495);
        Question q496 = new Question(R.string.chopai_line11q4,
                R.string.nandan, R.string.sunibe, R.string.rocket, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q496);

        // CHOPAI LINE N0 12.

        Question q497 = new Question(R.string.chopai_line12q1,
                R.string.ape, R.string.tej, R.string.mam, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q497);
        Question q498 = new Question(R.string.chopai_line12q2,
                R.string.rasiya, R.string.citrus, R.string.pratap, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q498);
        Question q499 = new Question(R.string.chopai_line12q3,
                R.string.maha, R.string.kaaj, R.string.heir, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q499);
        Question q500 = new Question(R.string.chopai_line12q4,
                R.string.nut, R.string.jag, R.string.sam, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q500);
        Question q501 = new Question(R.string.chopai_line12q5,
                R.string.lakhan, R.string.income, R.string.vandan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q501);

        // CHOPAI LINE N0 13.

        Question q502 = new Question(R.string.chopai_line13q1,
                R.string.vidyavaan, R.string.charittra, R.string.invention, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q502);
        Question q503 = new Question(R.string.chopai_line13q2,
                R.string.seed, R.string.guni, R.string.roop, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q503);
        Question q504 = new Question(R.string.chopai_line13q3,
                R.string.jas, R.string.cow, R.string.ati, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q504);
        Question q505 = new Question(R.string.chopai_line13q4,
                R.string.chaatur, R.string.sanhare, R.string.harvest, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q505);

        // CHOPAI LINE N0 14.

        Question q506 = new Question(R.string.chopai_line14q1,
                R.string.row, R.string.ram, R.string.asa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q506);
        Question q507 = new Question(R.string.chopai_line14q2,
                R.string.lank, R.string.make, R.string.kaaj, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q507);
        Question q508 = new Question(R.string.chopai_line14q3,
                R.string.karibe, R.string.basiya, R.string.kernel, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q508);
        Question q509 = new Question(R.string.chopai_line14q4,
                R.string.ro, R.string.ko, R.string.ur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q509);
        Question q510 = new Question(R.string.chopai_line14q5,
                R.string.laaye, R.string.opera, R.string.aatur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q510);

        // CHOPAI LINE N0 15.

        Question q511 = new Question(R.string.chopai_line15q1,
                R.string.prabhu, R.string.jarawa, R.string.output, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q511);
        Question q512 = new Question(R.string.chopai_line15q2,
                R.string.muskmelon, R.string.charittra, R.string.raghupati, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q512);
        Question q513 = new Question(R.string.chopai_line15q3,
                R.string.badaai, R.string.result, R.string.sunibe, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q513);
        Question q514 = new Question(R.string.chopai_line15q4,
                R.string.ko, R.string.te, R.string.pe, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q514);
        Question q515 = new Question(R.string.chopai_line15q5,
                R.string.beetle, R.string.rasiya, R.string.saarad, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q515);

        // CHOPAI LINE N0 16.

        Question q516 = new Question(R.string.chopai_line16q1,
                R.string.jam, R.string.emu, R.string.ram_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q516);
        Question q517 = new Question(R.string.chopai_line16q2,
                R.string.lakhan, R.string.aheesa, R.string.marble, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q517);
        Question q518 = new Question(R.string.chopai_line16q3,
                R.string.puma, R.string.sita, R.string.shri, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q518);
        Question q519 = new Question(R.string.chopai_line16q4,
                R.string.kahi, R.string.seal, R.string.mann_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q519);
        Question q520 = new Question(R.string.chopai_line16q5,
                R.string.basiya, R.string.jahaan, R.string.radium, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q520);

        // CHOPAI LINE N0 17.

        Question q521 = new Question(R.string.chopai_line17q1,
                R.string.hamster, R.string.sukshma, R.string.sajivan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q521);
        Question q522 = new Question(R.string.chopai_line17q2,
                R.string.sake, R.string.bull, R.string.roop, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q522);
        Question q523 = new Question(R.string.chopai_line17q3,
                R.string.dhari, R.string.kanth, R.string.chief, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q523);
        Question q524 = new Question(R.string.chopai_line17q4,
                R.string.sodium, R.string.siyahi, R.string.keenha, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q524);
        Question q525 = new Question(R.string.chopai_line17q5,
                R.string.jiyaaye, R.string.spinach, R.string.dikhawa, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q525);

        // CHOPAI LINE N0 18.

        Question q526 = new Question(R.string.chopai_line18q1,
                R.string.vikat, R.string.kinhi, R.string.stove, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q526);
        Question q527 = new Question(R.string.chopai_line18q2,
                R.string.ring, R.string.roop_2, R.string.juug, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q527);
        Question q528 = new Question(R.string.chopai_line18q3,
                R.string.bahut, R.string.grain, R.string.dhari_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q528);
        Question q529 = new Question(R.string.chopai_line18q4,
                R.string.lank, R.string.meli, R.string.bank, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q529);
        Question q530 = new Question(R.string.chopai_line18q5,
                R.string.millet, R.string.jarawa, R.string.rajpad, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q530);

        // CHOPAI LINE N0 19.

        Question q531 = new Question(R.string.chopai_line19q1,
                R.string.priya, R.string.alarm, R.string.bheem, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q531);
        Question q532 = new Question(R.string.chopai_line19q2,
                R.string.roop_3, R.string.mukh, R.string.pass, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q532);
        Question q533 = new Question(R.string.chopai_line19q3,
                R.string.chalk, R.string.dhari_3, R.string.bhaai, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q533);
        Question q534 = new Question(R.string.chopai_line19q4,
                R.string.gaye, R.string.zinc, R.string.asur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q534);
        Question q535 = new Question(R.string.chopai_line19q5,
                R.string.sanhare, R.string.harashi, R.string.bagpipe, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q535);

        // CHOPAI LINE N0 20.

        Question q536 = new Question(R.string.chopai_line20q1,
                R.string.strawberry, R.string.ramchandra, R.string.lankeshwar, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q536);
        Question q537 = new Question(R.string.chopai_line20q2,
                R.string.na, R.string.li, R.string.ke, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q537);
        Question q538 = new Question(R.string.chopai_line20q3,
                R.string.kaaj_2, R.string.jete, R.string.rope, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q538);
        Question q539 = new Question(R.string.chopai_line20q4,
                R.string.broccoli, R.string.sanvaare, R.string.shripati, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q539);

        // CHOPAI LINE N0 21.

        Question q540 = new Question(R.string.chopai_line21q1,
                R.string.sahas, R.string.churn, R.string.laaye, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q540);
        Question q541 = new Question(R.string.chopai_line21q2,
                R.string.sajivan, R.string.tumharo, R.string.fishnet, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q541);
        Question q542 = new Question(R.string.chopai_line21q3,
                R.string.honest, R.string.lakhan_2, R.string.deenha, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q542);
        Question q543 = new Question(R.string.chopai_line21q4,
                R.string.gaavein, R.string.freedom, R.string.jiyaaye, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q543);

        // CHOPAI LINE N0 22.

        Question q544 = new Question(R.string.chopai_line22q1,
                R.string.shri, R.string.tete, R.string.shop, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q544);
        Question q545 = new Question(R.string.chopai_line22q2,
                R.string.chairman, R.string.raghuvir, R.string.sahastra, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q545);
        Question q546 = new Question(R.string.chopai_line22q3,
                R.string.muneesa, R.string.mercury, R.string.harashi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q546);
        Question q547 = new Question(R.string.chopai_line22q4,
                R.string.ur, R.string.ki, R.string.lu, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q547);
        Question q548 = new Question(R.string.chopai_line22q5,
                R.string.gloss, R.string.laaye_2, R.string.badan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q548);

        // CHOPAI LINE N0 23.

        Question q549 = new Question(R.string.chopai_line23q1,
                R.string.bharatahi, R.string.butterfly, R.string.raghupati, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q549);
        Question q550 = new Question(R.string.chopai_line23q2,
                R.string.kinhi, R.string.narad, R.string.learn, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q550);
        Question q551 = new Question(R.string.chopai_line23q3,
                R.string.nurse, R.string.bahut, R.string.sahit, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q551);
        Question q552 = new Question(R.string.chopai_line23q4,
                R.string.mantra, R.string.island, R.string.badaai, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q552);

        // CHOPAI LINE N0 24.

        Question q553 = new Question(R.string.chopai_line24q1,
                R.string.tum, R.string.sab, R.string.zoo, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q553);
        Question q554 = new Question(R.string.chopai_line24q2,
                R.string.rim, R.string.mam, R.string.jan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q554);
        Question q555 = new Question(R.string.chopai_line24q3,
                R.string.kuber, R.string.petal, R.string.priya, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q555);
        Question q556 = new Question(R.string.chopai_line24q4,
                R.string.bharatahi, R.string.lagaavein, R.string.cranberry, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q556);
        Question q557 = new Question(R.string.chopai_line24q5,
                R.string.tax, R.string.sam, R.string.par, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q557);
        Question q558 = new Question(R.string.chopai_line24q6,
                R.string.kabhi, R.string.raise, R.string.bhaai, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q558);

        // CHOPAI LINE N0 25.

        Question q559 = new Question(R.string.chopai_line25q1,
                R.string.sahas, R.string.kovid, R.string.tempo, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q559);
        Question q560 = new Question(R.string.chopai_line25q2,
                R.string.urban, R.string.badan, R.string.kahin, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q560);
        Question q561 = new Question(R.string.chopai_line25q3,
                R.string.digpaal, R.string.notepad, R.string.tumharo, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q561);
        Question q562 = new Question(R.string.chopai_line25q4,
                R.string.jas, R.string.par, R.string.dam, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q562);
        Question q563 = new Question(R.string.chopai_line25q5,
                R.string.railway, R.string.gaavein, R.string.milaaye, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q563);

        // CHOPAI LINE N0 26.

        Question q564 = new Question(R.string.chopai_line26q1,
                R.string.hot, R.string.dry, R.string.asa, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q564);
        Question q565 = new Question(R.string.chopai_line26q2,
                R.string.kahi, R.string.binu, R.string.taxi, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q565);
        Question q566 = new Question(R.string.chopai_line26q3,
                R.string.fortress, R.string.shripati, R.string.paisaare, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q566);
        Question q567 = new Question(R.string.chopai_line26q4,
                R.string.kahan, R.string.valet, R.string.kanth, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q567);
        Question q568 = new Question(R.string.chopai_line26q5,
                R.string.lagaavein, R.string.sankaadik, R.string.chameleon, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q568);

        // CHOPAI LINE N0 27.

        Question q569 = new Question(R.string.chopai_line27q1,
                R.string.porcupine, R.string.sankaadik, R.string.sugrivahi, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q569);
        Question q570 = new Question(R.string.chopai_line27q2,
                R.string.vibhishan, R.string.jellyfish, R.string.brahmaadi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q570);
        Question q571 = new Question(R.string.chopai_line27q3,
                R.string.muneesa, R.string.mudrika, R.string.textile, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q571);

        // CHOPAI LINE N0 28.

        Question q572 = new Question(R.string.chopai_line28q1,
                R.string.gland, R.string.narad, R.string.saaje, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q572);
        Question q573 = new Question(R.string.chopai_line28q2,
                R.string.bhaanu, R.string.junior, R.string.saarad, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q573);
        Question q574 = new Question(R.string.chopai_line28q3,
                R.string.sahit, R.string.upkar, R.string.ideal, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q574);
        Question q575 = new Question(R.string.chopai_line28q4,
                R.string.maroon, R.string.aheesa, R.string.leelyo, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q575);

        // CHOPAI LINE N0 29.

        Question q576 = new Question(R.string.chopai_line29q1,
                R.string.jab, R.string.dub, R.string.jam, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q576);
        Question q577 = new Question(R.string.chopai_line29q2,
                R.string.kuber, R.string.maana, R.string.local, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q577);
        Question q578 = new Question(R.string.chopai_line29q3,
                R.string.uranium, R.string.digpaal, R.string.maaheen, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q578);
        Question q579 = new Question(R.string.chopai_line29q4,
                R.string.madhur, R.string.marine, R.string.jahaan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q579);
        Question q580 = new Question(R.string.chopai_line29q5,
                R.string.te, R.string.jo, R.string.su, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q580);

        // CHOPAI LINE N0 30.

        Question q581 = new Question(R.string.chopai_line30q1,
                R.string.night, R.string.kabhi, R.string.bhaye, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q581);
        Question q582 = new Question(R.string.chopai_line30q2,
                R.string.jaana, R.string.nubia, R.string.kovid, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q582);
        Question q583 = new Question(R.string.chopai_line30q3,
                R.string.kahin, R.string.taahi, R.string.quota, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q583);
        Question q584 = new Question(R.string.chopai_line30q4,
                R.string.volt, R.string.sake, R.string.sukh, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q584);
        Question q585 = new Question(R.string.chopai_line30q5,
                R.string.jaanu, R.string.ranch, R.string.kahan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q585);
        Question q586 = new Question(R.string.chopai_line30q6,
                R.string.te_2, R.string.ke, R.string.by, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q586);

        // CHOPAI LINE N0 31.

        Question q587 = new Question(R.string.chopai_line31q1,
                R.string.gap, R.string.tum_2, R.string.rog, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q587);
        Question q588 = new Question(R.string.chopai_line31q2,
                R.string.jagat, R.string.saint, R.string.upkar, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q588);
        Question q589 = new Question(R.string.chopai_line31q3,
                R.string.sugrivahi, R.string.rakhwaare, R.string.herculean, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q589);
        Question q590 = new Question(R.string.chopai_line31q4,
                R.string.online, R.string.keenha, R.string.durgam, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q590);

        // CHOPAI LINE N0 32.

        Question q591 = new Question(R.string.chopai_line32q1,
                R.string.gun, R.string.tan, R.string.ram_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q591);
        Question q592 = new Question(R.string.chopai_line32q2,
                R.string.milaaye, R.string.jaladhi, R.string.zillion, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q592);
        Question q593 = new Question(R.string.chopai_line32q3,
                R.string.pickle, R.string.rajpad, R.string.darnaa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q593);
        Question q594 = new Question(R.string.chopai_line32q4,
                R.string.naasei, R.string.pigeon, R.string.deenha, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q594);

        // CHOPAI LINE N0 33.

        Question q595 = new Question(R.string.chopai_line33q1,
                R.string.tumharo_2, R.string.laanghi, R.string.abdomen, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q595);
        Question q596 = new Question(R.string.chopai_line33q2,
                R.string.carbon, R.string.mantra, R.string.sankat, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q596);
        Question q597 = new Question(R.string.chopai_line33q3,
                R.string.parsiddha, R.string.hibernate, R.string.vibhishan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q597);
        Question q598 = new Question(R.string.chopai_line33q4,
                R.string.maana, R.string.sugam, R.string.valve, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q598);

        // CHOPAI LINE N0 34.

        Question q599 = new Question(R.string.chopai_line34q1,
                R.string.bangladesh, R.string.lankeshwar, R.string.chhudaavei, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q599);
        Question q600 = new Question(R.string.chopai_line34q2,
                R.string.aagya, R.string.angle, R.string.bhaye, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q600);
        Question q601 = new Question(R.string.chopai_line34q3,
                R.string.sab, R.string.koi, R.string.eye, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q601);
        Question q602 = new Question(R.string.chopai_line34q4,
                R.string.hay, R.string.jag_2, R.string.soi, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q602);
        Question q603 = new Question(R.string.chopai_line34q5,
                R.string.lahei, R.string.japan, R.string.jaana, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q603);

        // CHOPAI LINE N0 35.

        Question q604 = new Question(R.string.chopai_line35q1,
                R.string.juug, R.string.nahi, R.string.boil, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q604);
        Question q605 = new Question(R.string.chopai_line35q2,
                R.string.malaysia, R.string.sahastra, R.string.samhaaro, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q605);
        Question q606 = new Question(R.string.chopai_line35q3,
                R.string.ko, R.string.tu, R.string.jo, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q606);
        Question q607 = new Question(R.string.chopai_line35q4,
                R.string.jan, R.string.hai, R.string.jet, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q607);
        Question q608 = new Question(R.string.chopai_line35q5,
                R.string.mac, R.string.par, R.string.nau, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q608);
        Question q609 = new Question(R.string.chopai_line35q6,
                R.string.vachan, R.string.artist, R.string.bhaanu, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q609);

        // CHOPAI LINE N0 36.

        Question q610 = new Question(R.string.chopai_line36q1,
                R.string.leelyo, R.string.laavei, R.string.excuse, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q610);
        Question q611 = new Question(R.string.chopai_line36q2,
                R.string.dough, R.string.taahi, R.string.sarna, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q611);
        Question q612 = new Question(R.string.chopai_line36q3,
                R.string.jeevan, R.string.finite, R.string.madhur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q612);
        Question q613 = new Question(R.string.chopai_line36q4,
                R.string.phal, R.string.naam, R.string.easy, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q613);
        Question q614 = new Question(R.string.chopai_line36q5,
                R.string.ferry, R.string.jaanu, R.string.kaahu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q614);

        // CHOPAI LINE N0 37.

        Question q615 = new Question(R.string.chopai_line37q1,
                R.string.pratap, R.string.hockey, R.string.prabhu_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q615);
        Question q616 = new Question(R.string.chopai_line37q2,
                R.string.mudrika, R.string.acharaj, R.string.beneath, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q616);
        Question q617 = new Question(R.string.chopai_line37q3,
                R.string.exam, R.string.meli, R.string.hare, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q617);
        Question q618 = new Question(R.string.chopai_line37q4,
                R.string.kram, R.string.farm, R.string.mukh, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q618);
        Question q619 = new Question(R.string.chopai_line37q5,
                R.string.maaheen, R.string.naaheen, R.string.central, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q619);

        // CHOPAI LINE N0 38.

        Question q620 = new Question(R.string.chopai_line38q1,
                R.string.holland, R.string.jaladhi, R.string.anugrah, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q620);
        Question q621 = new Question(R.string.chopai_line38q2,
                R.string.tumhare, R.string.elevate, R.string.laanghi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q621);
        Question q622 = new Question(R.string.chopai_line38q3,
                R.string.gaye, R.string.raja, R.string.idol, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q622);
        Question q623 = new Question(R.string.chopai_line38q4,
                R.string.glacier, R.string.acharaj, R.string.duwaare, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q623);
        Question q624 = new Question(R.string.chopai_line38q5,
                R.string.tumhari, R.string.glamour, R.string.naaheen, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q624);

        // CHOPAI LINE N0 39.

        Question q625 = new Question(R.string.chopai_line39q1,
                R.string.durgam, R.string.siddhi, R.string.jumble, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q625);
        Question q626 = new Question(R.string.chopai_line39q2,
                R.string.chew, R.string.kaaj_3, R.string.amit, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q626);
        Question q627 = new Question(R.string.chopai_line39q3,
                R.string.aapan, R.string.flake, R.string.jagat, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q627);
        Question q628 = new Question(R.string.chopai_line39q4,
                R.string.ke_3, R.string.ur, R.string.ho, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q628);
        Question q629 = new Question(R.string.chopai_line39q5,
                R.string.lama, R.string.jete, R.string.sant, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q629);

        // CHOPAI LINE N0 40.

        Question q630 = new Question(R.string.chopai_line40q1,
                R.string.aapei, R.string.grand, R.string.sugam, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q630);
        Question q631 = new Question(R.string.chopai_line40q2,
                R.string.anugrah, R.string.haankte, R.string.hairpin, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q631);
        Question q632 = new Question(R.string.chopai_line40q3,
                R.string.iceberg, R.string.tumhare, R.string.kaanpei, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q632);
        Question q633 = new Question(R.string.chopai_line40q4,
                R.string.data, R.string.late, R.string.tete, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q633);

        // CHOPAI LINE N0 41.

        Question q634 = new Question(R.string.chopai_line41q1,
                R.string.ram_4, R.string.bar, R.string.mom, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q634);
        Question q635 = new Question(R.string.chopai_line41q2,
                R.string.journey, R.string.duwaare, R.string.mahavir, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q635);
        Question q636 = new Question(R.string.chopai_line41q3,
                R.string.pur, R.string.low, R.string.tum_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q636);
        Question q637 = new Question(R.string.chopai_line41q4,
                R.string.rakhwaare, R.string.raghupati, R.string.argentina, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q637);

        // CHOPAI LINE N0 42.

        Question q638 = new Question(R.string.chopai_line42q1,
                R.string.oak, R.string.hot, R.string.sei, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q638);
        Question q639 = new Question(R.string.chopai_line42q2,
                R.string.te, R.string.ni, R.string.na, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q639);
        Question q640 = new Question(R.string.chopai_line42q3,
                R.string.aagya, R.string.teeno, R.string.jewel, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q640);
        Question q641 = new Question(R.string.chopai_line42q4,
                R.string.nail, R.string.binu, R.string.deen, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q641);
        Question q642 = new Question(R.string.chopai_line42q5,
                R.string.nirantar, R.string.portugal, R.string.paisaare, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q642);

        // CHOPAI LINE N0 43.

        Question q643 = new Question(R.string.chopai_line43q1,
                R.string.sab_2, R.string.sat, R.string.pan, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q643);
        Question q644 = new Question(R.string.chopai_line43q2,
                R.string.palm, R.string.sukh, R.string.mata, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q644);
        Question q645 = new Question(R.string.chopai_line43q3,
                R.string.nikat, R.string.large, R.string.lahei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q645);
        Question q646 = new Question(R.string.chopai_line43q4,
                R.string.tumhari, R.string.sunavei, R.string.laundry, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q646);
        Question q647 = new Question(R.string.chopai_line43q5,
                R.string.oasis, R.string.sarna, R.string.aavei, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q647);

        // CHOPAI LINE N0 44.

        Question q648 = new Question(R.string.chopai_line44q1,
                R.string.kar, R.string.owl, R.string.tum_4, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q648);
        Question q649 = new Question(R.string.chopai_line44q2,
                R.string.rakshak, R.string.hanumat, R.string.magnify, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q649);
        Question q650 = new Question(R.string.chopai_line44q3,
                R.string.pasta, R.string.kaahu, R.string.peera, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q650);
        Question q651 = new Question(R.string.chopai_line44q4,
                R.string.na, R.string.ty, R.string.ko, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q651);
        Question q652 = new Question(R.string.chopai_line44q5,
                R.string.darnaa, R.string.bhajan, R.string.matrix, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q652);

        // CHOPAI LINE N0 45.

        Question q653 = new Question(R.string.chopai_line45q1,
                R.string.remix, R.string.aapan, R.string.japat, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q653);
        Question q654 = new Question(R.string.chopai_line45q2,
                R.string.hoi, R.string.rig, R.string.tej_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q654);
        Question q655 = new Question(R.string.chopai_line45q3,
                R.string.samhaaro, R.string.manorath, R.string.mongolia, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q655);
        Question q656 = new Question(R.string.chopai_line45q4,
                R.string.sharp, R.string.aapei, R.string.beera, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q656);

        // CHOPAI LINE N0 46.

        Question q657 = new Question(R.string.chopai_line46q1,
                R.string.tinke, R.string.snail, R.string.teeno, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q657);
        Question q658 = new Question(R.string.chopai_line46q2,
                R.string.lok_2, R.string.yah, R.string.toy, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q658);
        Question q659 = new Question(R.string.chopai_line46q3,
                R.string.narrate, R.string.haankte, R.string.tapasvi, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q659);
        Question q660 = new Question(R.string.chopai_line46q4,
                R.string.chaaron, R.string.natural, R.string.kaanpei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q660);

        // CHOPAI LINE N0 47.

        Question q661 = new Question(R.string.chopai_line47q1,
                R.string.bhoot, R.string.sakal, R.string.union, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q661);
        Question q662 = new Question(R.string.chopai_line47q2,
                R.string.tanzania, R.string.pishaach, R.string.nikandan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q662);
        Question q663 = new Question(R.string.chopai_line47q3,
                R.string.saaja, R.string.twist, R.string.nikat, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q663);
        Question q664 = new Question(R.string.chopai_line47q4,
                R.string.nahi, R.string.pasa, R.string.rack, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q664);
        Question q665 = new Question(R.string.chopai_line47q5,
                R.string.watch, R.string.aavei, R.string.paave, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q665);

        // CHOPAI LINE N0 48.

        Question q666 = new Question(R.string.chopai_line48q1,
                R.string.tumhara, R.string.quantum, R.string.mahavir, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q666);
        Question q667 = new Question(R.string.chopai_line48q2,
                R.string.jab, R.string.sur, R.string.use, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q667);
        Question q668 = new Question(R.string.chopai_line48q3,
                R.string.sand, R.string.naam, R.string.raho, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q668);
        Question q669 = new Question(R.string.chopai_line48q4,
                R.string.ujiyara, R.string.pendent, R.string.sunavei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q669);

        // CHOPAI LINE N0 49.

        Question q670 = new Question(R.string.chopai_line49q1,
                R.string.naasei, R.string.paavei, R.string.needle, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q670);
        Question q671 = new Question(R.string.chopai_line49q2,
                R.string.yes, R.string.rog, R.string.raj, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q671);
        Question q672 = new Question(R.string.chopai_line49q3,
                R.string.dasa, R.string.self, R.string.hare, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q672);
        Question q673 = new Question(R.string.chopai_line49q4,
                R.string.sab_3, R.string.nij, R.string.yen, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q673);
        Question q674 = new Question(R.string.chopai_line49q5,
                R.string.xerox, R.string.peera, R.string.ashta, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q674);

        // CHOPAI LINE N0 50.

        Question q675 = new Question(R.string.chopai_line50q1,
                R.string.nidhi, R.string.yummy, R.string.japat, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q675);
        Question q676 = new Question(R.string.chopai_line50q2,
                R.string.nirantar, R.string.chhutahi, R.string.colombia, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q676);
        Question q677 = new Question(R.string.chopai_line50q3,
                R.string.sawmill, R.string.hanumat, R.string.dulaare, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q677);
        Question q678 = new Question(R.string.chopai_line50q4,
                R.string.adorn, R.string.sadaa, R.string.beera, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q678);

        // CHOPAI LINE N0 51.

        Question q679 = new Question(R.string.chopai_line51q1,
                R.string.sankat, R.string.kahaai, R.string.nature, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q679);
        Question q680 = new Question(R.string.chopai_line51q2,
                R.string.of, R.string.te, R.string.ki, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q680);
        Question q681 = new Question(R.string.chopai_line51q3,
                R.string.rasayan, R.string.secular, R.string.hanuman_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q681);
        Question q682 = new Question(R.string.chopai_line51q4,
                R.string.chhudaavei, R.string.pavantanay, R.string.tajikistan, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q682);

        // CHOPAI LINE N0 52.

        Question q683 = new Question(R.string.chopai_line52q1,
                R.string.visa, R.string.mann_3, R.string.anta, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q683);
        Question q684 = new Question(R.string.chopai_line52q2,
                R.string.jaai, R.string.warm, R.string.kram, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q684);
        Question q685 = new Question(R.string.chopai_line52q3,
                R.string.vachan, R.string.dharai, R.string.object, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q685);
        Question q686 = new Question(R.string.chopai_line52q4,
                R.string.cliff, R.string.dhyan, R.string.janam, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q686);
        Question q687 = new Question(R.string.chopai_line52q5,
                R.string.ke, R.string.ae, R.string.jo_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q687);
        Question q688 = new Question(R.string.chopai_line52q6,
                R.string.laavei, R.string.karahu, R.string.pallet, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q688);

        // CHOPAI LINE N0 53.

        Question q689 = new Question(R.string.chopai_line53q1,
                R.string.bed, R.string.sab_4, R.string.bal, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q689);
        Question q690 = new Question(R.string.chopai_line53q2,
                R.string.jai, R.string.cap, R.string.par_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q690);
        Question q691 = new Question(R.string.chopai_line53q3,
                R.string.ram_5, R.string.gun, R.string.fog, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q691);
        Question q692 = new Question(R.string.chopai_line53q4,
                R.string.balcony, R.string.tapasvi, R.string.sumirei, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q692);
        Question q693 = new Question(R.string.chopai_line53q5,
                R.string.janm, R.string.atom, R.string.raja, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q693);

        // CHOPAI LINE N0 54.

        Question q694 = new Question(R.string.chopai_line54q1,
                R.string.tinke, R.string.janki, R.string.cargo, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q694);
        Question q695 = new Question(R.string.chopai_line54q2,
                R.string.exit, R.string.kaaj, R.string.hari, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q695);
        Question q696 = new Question(R.string.chopai_line54q3,
                R.string.dhyan, R.string.depth, R.string.sakal, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q696);
        Question q697 = new Question(R.string.chopai_line54q4,
                R.string.tum_5, R.string.jug, R.string.fry, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q697);
        Question q698 = new Question(R.string.chopai_line54q5,
                R.string.flame, R.string.saaja, R.string.kaaal, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q698);

        // CHOPAI LINE N0 55.

        Question q699 = new Question(R.string.chopai_line55q1,
                R.string.lok, R.string.gas, R.string.aur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q699);
        Question q700 = new Question(R.string.chopai_line55q2,
                R.string.manorath, R.string.mahasukh, R.string.birdseye, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q700);
        Question q701 = new Question(R.string.chopai_line55q3,
                R.string.qu, R.string.jo, R.string.ko, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q701);
        Question q702 = new Question(R.string.chopai_line55q4,
                R.string.tej, R.string.ice, R.string.koi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q702);
        Question q703 = new Question(R.string.chopai_line55q5,
                R.string.laavei_2, R.string.saakhi, R.string.beaver, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q703);

        // CHOPAI LINE N0 56. start

        Question q704 = new Question(R.string.chopai_line56q1,
                R.string.kin, R.string.soi, R.string.aur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q704);
        Question q705 = new Question(R.string.chopai_line56q2,
                R.string.mohi, R.string.fire, R.string.amit, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q705);
        Question q706 = new Question(R.string.chopai_line56q3,
                R.string.jeevan, R.string.keejei, R.string.carton, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q706);
        Question q707 = new Question(R.string.chopai_line56q4,
                R.string.jeep, R.string.phal_3, R.string.baar, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q707);
        Question q708 = new Question(R.string.chopai_line56q5,
                R.string.jahan, R.string.flick, R.string.paave, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q708);

        // CHOPAI LINE N0 57.

        Question q709 = new Question(R.string.chopai_line57q1,
                R.string.chaaron, R.string.gurudev, R.string.centaur, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q709);
        Question q710 = new Question(R.string.chopai_line57q2,
                R.string.jog, R.string.jug, R.string.raj, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q710);
        Question q711 = new Question(R.string.chopai_line57q3,
                R.string.hriday, R.string.cheese, R.string.partap, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q711);
        Question q712 = new Question(R.string.chopai_line57q4,
                R.string.tumhara, R.string.chalisa, R.string.descent, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q712);

        // CHOPAI LINE N0 58.

        Question q713 = new Question(R.string.chopai_line58q1,
                R.string.leg, R.string.hai, R.string.jag, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q713);
        Question q714 = new Question(R.string.chopai_line58q2,
                R.string.bisraavei, R.string.australia, R.string.parsiddha, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q714);
        Question q715 = new Question(R.string.chopai_line58q3,
                R.string.jagat_2, R.string.bhakt, R.string.happy, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q715);
        Question q716 = new Question(R.string.chopai_line58q4,
                R.string.ferment, R.string.ujiyara, R.string.gaurisa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q716);

        // CHOPAI LINE N0 59.

        Question q717 = new Question(R.string.chopai_line59q1,
                R.string.devta, R.string.heavy, R.string.sadhu, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q717);
        Question q718 = new Question(R.string.chopai_line59q2,
                R.string.sant, R.string.hoye, R.string.limo, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q718);
        Question q719 = new Question(R.string.chopai_line59q3,
                R.string.oe, R.string.ke_4, R.string.ur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q719);
        Question q720 = new Question(R.string.chopai_line59q4,
                R.string.ati, R.string.lit, R.string.tum_6, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q720);
        Question q721 = new Question(R.string.chopai_line59q5,
                R.string.rakhvaare, R.string.ramlakhan, R.string.guatemala, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q721);

        // CHOPAI LINE N0 60.

        Question q722 = new Question(R.string.chopai_line60q1,
                R.string.mart, R.string.asur_2, R.string.sada, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q722);
        Question q723 = new Question(R.string.chopai_line60q2,
                R.string.sudhaari, R.string.broccoli, R.string.nikandan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q723);
        Question q724 = new Question(R.string.chopai_line60q3,
                R.string.ram_6, R.string.mam, R.string.pay, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q724);
        Question q725 = new Question(R.string.chopai_line60q4,
                R.string.gesture, R.string.dulaare, R.string.sumirow, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q725);

        // CHOPAI LINE N0 61.

        Question q726 = new Question(R.string.chopai_line61q1,
                R.string.judge, R.string.chitt, R.string.ashta, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q726);
        Question q727 = new Question(R.string.chopai_line61q2,
                R.string.siddhi, R.string.mangal, R.string.geneva, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q727);
        Question q728 = new Question(R.string.chopai_line61q3,
                R.string.rod, R.string.nau, R.string.sam, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q728);
        Question q729 = new Question(R.string.chopai_line61q4,
                R.string.katei, R.string.knock, R.string.nidhi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q729);
        Question q730 = new Question(R.string.chopai_line61q5,
                R.string.ke_5, R.string.te, R.string.gi, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q730);
        Question q731 = new Question(R.string.chopai_line61q6,
                R.string.noun, R.string.data, R.string.sada, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q731);

        // CHOPAI LINE N0 62.

        Question q732 = new Question(R.string.chopai_line62q1,
                R.string.jas, R.string.rug, R.string.asa_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q732);
        Question q733 = new Question(R.string.chopai_line62q2,
                R.string.bar, R.string.jam, R.string.tag, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q733);
        Question q734 = new Question(R.string.chopai_line62q3,
                R.string.rice, R.string.deen, R.string.nath, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q734);
        Question q735 = new Question(R.string.chopai_line62q4,
                R.string.mitei, R.string.latch, R.string.janki, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q735);
        Question q736 = new Question(R.string.chopai_line62q5,
                R.string.mata, R.string.dera, R.string.size, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q736);

        // CHOPAI LINE N0 63.

        Question q737 = new Question(R.string.chopai_line63q1,
                R.string.sun, R.string.ram_7, R.string.sab, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q737);
        Question q738 = new Question(R.string.chopai_line63q2,
                R.string.ujaagar, R.string.grocery, R.string.rasayan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q738);
        Question q739 = new Question(R.string.chopai_line63q3,
                R.string.tumhare_2, R.string.subesaa, R.string.belgium, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q739);
        Question q740 = new Question(R.string.chopai_line63q4,
                R.string.tour, R.string.pasa, R.string.guru, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q740);

        // CHOPAI LINE N0 64.

        Question q741 = new Question(R.string.chopai_line64q1,
                R.string.gosai, R.string.merge, R.string.sadaa, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q741);
        Question q742 = new Question(R.string.chopai_line64q2,
                R.string.raho, R.string.mann, R.string.urge, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q742);
        Question q743 = new Question(R.string.chopai_line64q3,
                R.string.palestine, R.string.raghupati_2, R.string.vidyavaan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q743);
        Question q744 = new Question(R.string.chopai_line64q4,
                R.string.na, R.string.ly, R.string.ke_6, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q744);
        Question q745 = new Question(R.string.chopai_line64q5,
                R.string.dasa, R.string.guru, R.string.wood, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q745);

        // CHOPAI LINE N0 65.

        Question q746 = new Question(R.string.chopai_line65q1,
                R.string.jackpot, R.string.tumhare_3, R.string.hanuman, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q746);
        Question q747 = new Question(R.string.chopai_line65q2,
                R.string.charan, R.string.russia, R.string.bhajan, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q747);
        Question q748 = new Question(R.string.chopai_line65q3,
                R.string.ram_8, R.string.asa, R.string.way, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q748);
        Question q749 = new Question(R.string.chopai_line65q4,
                R.string.mu, R.string.ko, R.string.jo, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q749);
        Question q750 = new Question(R.string.chopai_line65q5,
                R.string.barnau, R.string.genius, R.string.paavei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q750);

        // CHOPAI LINE N0 66.

        Question q751 = new Question(R.string.chopai_line66q1,
                R.string.janam, R.string.kripa, R.string.paste, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q751);
        Question q752 = new Question(R.string.chopai_line66q2,
                R.string.quiet, R.string.janam_2, R.string.paath, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q752);
        Question q753 = new Question(R.string.chopai_line66q3,
                R.string.ko, R.string.qi, R.string.ke_7, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q753);
        Question q754 = new Question(R.string.chopai_line66q4,
                R.string.dukh, R.string.jasu, R.string.yarn, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q754);
        Question q755 = new Question(R.string.chopai_line66q5,
                R.string.nicaragua, R.string.bisraavei, R.string.charittra, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q755);

        // CHOPAI LINE N0 67.

        Question q756 = new Question(R.string.chopai_line67q1,
                R.string.phal, R.string.wing, R.string.anta, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q756);
        Question q757 = new Question(R.string.chopai_line67q2,
                R.string.kaaal, R.string.shree, R.string.rapid, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q757);
        Question q758 = new Question(R.string.chopai_line67q3,
                R.string.divinity, R.string.raghubar_2, R.string.tulsidas, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q758);
        Question q759 = new Question(R.string.chopai_line67q4,
                R.string.jan, R.string.wet, R.string.pur, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q759);
        Question q760 = new Question(R.string.chopai_line67q5,
                R.string.jaai, R.string.tanu, R.string.year, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q760);

        // CHOPAI LINE N0 68.

        Question q761 = new Question(R.string.chopai_line68q1,
                R.string.scope, R.string.jahan, R.string.saroj, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q761);
        Question q762 = new Question(R.string.chopai_line68q2,
                R.string.dehu, R.string.wrap, R.string.janm, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q762);
        Question q763 = new Question(R.string.chopai_line68q3,
                R.string.hari, R.string.mohi, R.string.axis, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q763);
        Question q764 = new Question(R.string.chopai_line68q4,
                R.string.tempt, R.string.bhakt, R.string.mukur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q764);
        Question q765 = new Question(R.string.chopai_line68q5,
                R.string.dayaku, R.string.hammer, R.string.kahaai, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q765);

        // CHOPAI LINE N0 69.

        Question q766 = new Question(R.string.chopai_line69q1,
                R.string.aur_3, R.string.par, R.string.bag, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q766);
        Question q767 = new Question(R.string.chopai_line69q2,
                R.string.unite, R.string.devta, R.string.bimal, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q767);
        Question q768 = new Question(R.string.chopai_line69q3,
                R.string.chari, R.string.water, R.string.chitt, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q768);
        Question q769 = new Question(R.string.chopai_line69q4,
                R.string.na_2, R.string.ur, R.string.me, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q769);
        Question q770 = new Question(R.string.chopai_line69q5,
                R.string.labour, R.string.dharai, R.string.janike, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q770);

        // CHOPAI LINE N0 70.

        Question q771 = new Question(R.string.chopai_line70q1,
                R.string.subesaa, R.string.jodhpur, R.string.hanumat_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q771);
        Question q772 = new Question(R.string.chopai_line70q2,
                R.string.sei, R.string.hot, R.string.big, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q772);
        Question q773 = new Question(R.string.chopai_line70q3,
                R.string.babul, R.string.sarva, R.string.pavan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q773);
        Question q774 = new Question(R.string.chopai_line70q4,
                R.string.gyan, R.string.bait, R.string.sukh_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q774);
        Question q775 = new Question(R.string.chopai_line70q5,
                R.string.karai, R.string.kumar, R.string.cadet, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q775);

        // CHOPAI LINE N0 71.

        Question q776 = new Question(R.string.chopai_line71q1,
                R.string.magnet, R.string.sankat_2, R.string.buddhi, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q776);
        Question q777 = new Question(R.string.chopai_line71q2,
                R.string.vidya, R.string.cause, R.string.katei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q777);
        Question q778 = new Question(R.string.chopai_line71q3,
                R.string.mitei, R.string.kales, R.string.fixed, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q778);
        Question q779 = new Question(R.string.chopai_line71q4,
                R.string.cot, R.string.sab_5, R.string.jab, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q779);
        Question q780 = new Question(R.string.chopai_line71q5,
                R.string.sagar, R.string.flood, R.string.peera_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q780);

        // CHOPAI LINE N0 72.

        Question q781 = new Question(R.string.chopai_line72q1,
                R.string.jo_5, R.string.te, R.string.jy, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q781);
        Question q782 = new Question(R.string.chopai_line72q2,
                R.string.martial, R.string.sumirei, R.string.kanchan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q782);
        Question q783 = new Question(R.string.chopai_line72q3,
                R.string.kunchit, R.string.mileage, R.string.hanumat_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q783);
        Question q784 = new Question(R.string.chopai_line72q4,
                R.string.bal_3, R.string.koi, R.string.dye, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q784);
        Question q785 = new Question(R.string.chopai_line72q5,
                R.string.habit, R.string.beera_2, R.string.kapis, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q785);

        // CHOPAI LINE N0 73.

        Question q786 = new Question(R.string.chopai_line73q1,
                R.string.soi, R.string.alp, R.string.jai_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q786);
        Question q787 = new Question(R.string.chopai_line73q2,
                R.string.jai_4, R.string.jug, R.string.gel, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q787);
        Question q788 = new Question(R.string.chopai_line73q3,
                R.string.ink, R.string.jai_5, R.string.hai, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q788);
        Question q789 = new Question(R.string.chopai_line73q4,
                R.string.birajai, R.string.admiral, R.string.hanuman_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q789);
        Question q790 = new Question(R.string.chopai_line73q5,
                R.string.gosai, R.string.tihun, R.string.birth, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q790);

        // CHOPAI LINE N0 74.

        Question q791 = new Question(R.string.chopai_line74q1,
                R.string.carat, R.string.kripa, R.string.putra, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q791);
        Question q792 = new Question(R.string.chopai_line74q2,
                R.string.sumati, R.string.afghan, R.string.karahu, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q792);
        Question q793 = new Question(R.string.chopai_line74q3,
                R.string.gurudev, R.string.kaandhe, R.string.capital, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q793);
        Question q794 = new Question(R.string.chopai_line74q4,
                R.string.ju, R.string.ki, R.string.jo, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q794);
        Question q795 = new Question(R.string.chopai_line74q5,
                R.string.kesa, R.string.axle, R.string.naai, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q795);

        // CHOPAI LINE N0 75.

        Question q796 = new Question(R.string.chopai_line75q1,
                R.string.jo_6, R.string.na, R.string.si, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q796);
        Question q797 = new Question(R.string.chopai_line75q2,
                R.string.law, R.string.sat, R.string.nau, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q797);
        Question q798 = new Question(R.string.chopai_line75q3,
                R.string.maha, R.string.best, R.string.baar, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q798);
        Question q799 = new Question(R.string.chopai_line75q4,
                R.string.paath, R.string.sangi, R.string.chain, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q799);
        Question q800 = new Question(R.string.chopai_line75q5,
                R.string.own, R.string.kar, R.string.bar, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q800);
        Question q801 = new Question(R.string.chopai_line75q6,
                R.string.pur, R.string.paw, R.string.koi_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q801);

        // CHOPAI LINE N0 76.

        Question q802 = new Question(R.string.chopai_line76q1,
                R.string.chhutahi, R.string.sudhaari, R.string.caffeine, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q802);
        Question q803 = new Question(R.string.chopai_line76q2,
                R.string.debit, R.string.bandi, R.string.baran, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q803);
        Question q804 = new Question(R.string.chopai_line76q3,
                R.string.raghubar, R.string.carnival, R.string.mahasukh, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q804);
        Question q805 = new Question(R.string.chopai_line76q4,
                R.string.hoi, R.string.sei, R.string.tip, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q805);

        // CHOPAI LINE N0 77.

        Question q806 = new Question(R.string.chopai_line77q1,
                R.string.di, R.string.jo_7, R.string.ki, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q806);
        Question q807 = new Question(R.string.chopai_line77q2,
                R.string.sat, R.string.six, R.string.yah, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q807);
        Question q808 = new Question(R.string.chopai_line77q3,
                R.string.padhe, R.string.haath, R.string.ethic, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q808);
        Question q809 = new Question(R.string.chopai_line77q4,
                R.string.dictate, R.string.hanuman_4, R.string.chaatur, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q809);
        Question q810 = new Question(R.string.chopai_line77q5,
                R.string.sukshma, R.string.deliver, R.string.chalisa, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q810);

        // CHOPAI LINE N0 78.

        Question q811 = new Question(R.string.chopai_line78q1,
                R.string.hoye, R.string.guni, R.string.east, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q811);
        Question q812 = new Question(R.string.chopai_line78q2,
                R.string.dental, R.string.siddhi_2, R.string.harahu, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q812);
        Question q813 = new Question(R.string.chopai_line78q3,
                R.string.atulit, R.string.dinner, R.string.saakhi, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q813);
        Question q814 = new Question(R.string.chopai_line78q4,
                R.string.gaurisa, R.string.sanhare, R.string.feature, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q814);

        // CHOPAI LINE N0 79.

        Question q815 = new Question(R.string.chopai_line79q1,
                R.string.ethiopia, R.string.tulsidas, R.string.sanvaare, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q815);
        Question q816 = new Question(R.string.chopai_line79q2,
                R.string.kaaj, R.string.fact, R.string.sada, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q816);
        Question q817 = new Question(R.string.chopai_line79q3,
                R.string.hari, R.string.roop, R.string.icon, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q817);
        Question q818 = new Question(R.string.chopai_line79q4,
                R.string.faith, R.string.chera, R.string.bajra, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q818);

        // CHOPAI LINE N0 80.

        Question q819 = new Question(R.string.chopai_line80q1,
                R.string.dhamaa, R.string.exceed, R.string.keejei, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q819);
        Question q820 = new Question(R.string.chopai_line80q2,
                R.string.nath, R.string.shri, R.string.lawn, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q820);
        Question q821 = new Question(R.string.chopai_line80q3,
                R.string.heater, R.string.hriday, R.string.naamaa, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q821);
        Question q822 = new Question(R.string.chopai_line80q4,
                R.string.kahi, R.string.leaf, R.string.maha, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q822);
        Question q823 = new Question(R.string.chopai_line80q5,
                R.string.dera, R.string.sake, R.string.next, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q823);

        // DOHA LINE N0 9.

        Question q824 = new Question(R.string.doha_line9q1,
                R.string.montenegro, R.string.pavantanay, R.string.buddhiheen, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q824);
        Question q825 = new Question(R.string.doha_line9q2,
                R.string.kumati, R.string.helmet, R.string.sankat_3, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q825);
        Question q826 = new Question(R.string.doha_line9q3,
                R.string.haran, R.string.moonj, R.string.glide, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q826);

        // DOHA LINE N0 10.

        Question q827 = new Question(R.string.doha_line10q1,
                R.string.jacket, R.string.mangal, R.string.bikram, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q827);
        Question q828 = new Question(R.string.doha_line10q2,
                R.string.janeu, R.string.greet, R.string.murti, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q828);
        Question q829 = new Question(R.string.doha_line10q3,
                R.string.roop_4, R.string.juug, R.string.pack, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q829);

        // DOHA LINE N0 11.

        Question q830 = new Question(R.string.doha_line11q1,
                R.string.macedonia, R.string.ramlakhan, R.string.vidyavaan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q830);
        Question q831 = new Question(R.string.doha_line11q2,
                R.string.meli, R.string.head, R.string.sita_2, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q831);
        Question q832 = new Question(R.string.doha_line11q3,
                R.string.sahit, R.string.saaje, R.string.knead, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q832);

        // DOHA LINE N0 12.

        Question q833 = new Question(R.string.doha_line12q1,
                R.string.manila, R.string.hriday_2, R.string.sumati, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q833);
        Question q834 = new Question(R.string.doha_line12q2,
                R.string.biraaj, R.string.margin, R.string.basahu, 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q834);
        Question q835 = new Question(R.string.doha_line12q3,
                R.string.sur, R.string.kar, R.string.fun, 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q835);
        Question q836 = new Question(R.string.doha_line12q4,
                R.string.marry, R.string.bhoop, R.string.suvan, 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q836);

        // DIFFICULTY LEVEL - HARD

        // DOHA LINE N0 1.

        Question q837 = new Question(R.string.doha_line1q1,
                R.string.bimal, R.string.mukur, R.string.shree, 3, Question.DIFFICULTY_HARD);
        addQuestion(q837);
        Question q838 = new Question(R.string.doha_line1q2,
                R.string.guru, R.string.mann, R.string.jasu, 1, Question.DIFFICULTY_HARD);
        addQuestion(q838);
        Question q839 = new Question(R.string.doha_line1q3,
                R.string.barnau, R.string.charan, R.string.dayaku, 2, Question.DIFFICULTY_HARD);
        addQuestion(q839);
        Question q840 = new Question(R.string.doha_line1q4,
                R.string.pavan, R.string.chari, R.string.saroj, 3, Question.DIFFICULTY_HARD);
        addQuestion(q840);
        Question q841 = new Question(R.string.doha_line1q5,
                R.string.raj, R.string.nij, R.string.bal, 1, Question.DIFFICULTY_HARD);
        addQuestion(q841);

        // DOHA LINE N0 2.

        Question q842 = new Question(R.string.doha_line2q1,
                R.string.jai, R.string.nij, R.string.gun, 2, Question.DIFFICULTY_HARD);
        addQuestion(q842);
        Question q843 = new Question(R.string.doha_line2q2,
                R.string.tanu, R.string.phal, R.string.mann, 3, Question.DIFFICULTY_HARD);
        addQuestion(q843);
        Question q844 = new Question(R.string.doha_line2q3,
                R.string.mukur, R.string.kumar, R.string.vidya, 1, Question.DIFFICULTY_HARD);
        addQuestion(q844);
        Question q845 = new Question(R.string.doha_line2q4,
                R.string.raghubar, R.string.sudhaari, R.string.pavansut, 2, Question.DIFFICULTY_HARD);
        addQuestion(q845);

        // DOHA LINE N0 .3

        Question q846 = new Question(R.string.doha_line3q1,
                R.string.buddhi, R.string.janike, R.string.barnau, 3, Question.DIFFICULTY_HARD);
        addQuestion(q846);
        Question q847 = new Question(R.string.doha_line3q2,
                R.string.raghubar, R.string.mahaveer, R.string.bajrangi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q847);
        Question q848 = new Question(R.string.doha_line3q3,
                R.string.kales, R.string.bimal, R.string.sagar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q848);
        Question q849 = new Question(R.string.doha_line3q4,
                R.string.mohi, R.string.dehu, R.string.jasu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q849);

        // DOHA LINE N0 4.

        Question q850 = new Question(R.string.doha_line4q1,
                R.string.jo, R.string.ke, R.string.ko, 1, Question.DIFFICULTY_HARD);
        addQuestion(q850);
        Question q851 = new Question(R.string.doha_line4q2,
                R.string.harahu, R.string.dayaku, R.string.bikaar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q851);
        Question q852 = new Question(R.string.doha_line4q3,
                R.string.kesa, R.string.gyan, R.string.phal, 3, Question.DIFFICULTY_HARD);
        addQuestion(q852);
        Question q853 = new Question(R.string.doha_line4q4,
                R.string.chari, R.string.kapis, R.string.tihun, 1, Question.DIFFICULTY_HARD);
        addQuestion(q853);

        // DOHA LINE N0 5.

        Question q854 = new Question(R.string.doha_line5q1,
                R.string.ramchandra, R.string.buddhiheen, R.string.lankeshwar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q854);
        Question q855 = new Question(R.string.doha_line5q2,
                R.string.guni, R.string.maha, R.string.tanu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q855);
        Question q856 = new Question(R.string.doha_line5q3,
                R.string.janike, R.string.atulit, R.string.dhamaa, 1, Question.DIFFICULTY_HARD);
        addQuestion(q856);

        // DOHA LINE N0 6.

        Question q857 = new Question(R.string.doha_line6q1,
                R.string.hanuman, R.string.sumirow, R.string.ujaagar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q857);
        Question q858 = new Question(R.string.doha_line6q2,
                R.string.sangi, R.string.putra, R.string.pavan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q858);
        Question q859 = new Question(R.string.doha_line6q3,
                R.string.kumar, R.string.baran, R.string.haath, 1, Question.DIFFICULTY_HARD);
        addQuestion(q859);

        // DOHA LINE N0 7.

        Question q860 = new Question(R.string.doha_line7q1,
                R.string.lok, R.string.bal, R.string.aur, 2, Question.DIFFICULTY_HARD);
        addQuestion(q860);
        Question q861 = new Question(R.string.doha_line7q2,
                R.string.naamaa, R.string.anjani, R.string.buddhi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q861);
        Question q862 = new Question(R.string.doha_line7q3,
                R.string.vidya, R.string.bajra, R.string.moonj, 1, Question.DIFFICULTY_HARD);
        addQuestion(q862);
        Question q863 = new Question(R.string.doha_line7q4,
                R.string.kaaj, R.string.dehu, R.string.sita, 2, Question.DIFFICULTY_HARD);
        addQuestion(q863);
        Question q864 = new Question(R.string.doha_line7q5,
                R.string.lank, R.string.roop, R.string.mohi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q864);

        // DOHA LINE N0 8.

        Question q865 = new Question(R.string.doha_line8q1,
                R.string.harahu, R.string.bikram, R.string.kumati, 1, Question.DIFFICULTY_HARD);
        addQuestion(q865);
        Question q866 = new Question(R.string.doha_line8q2,
                R.string.janeu, R.string.kales, R.string.saaje, 2, Question.DIFFICULTY_HARD);
        addQuestion(q866);
        Question q867 = new Question(R.string.doha_line8q3,
                R.string.sumati, R.string.nivaar, R.string.bikaar, 3, Question.DIFFICULTY_HARD);
        addQuestion(q867);

        // CHOPAI LINE N0 1.

        Question q868 = new Question(R.string.chopai_line1q1,
                R.string.jai, R.string.tej, R.string.jag, 1, Question.DIFFICULTY_HARD);
        addQuestion(q868);
        Question q869 = new Question(R.string.chopai_line1q2,
                R.string.ramdoot, R.string.hanuman, R.string.kanchan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q869);
        Question q870 = new Question(R.string.chopai_line1q3,
                R.string.kahi, R.string.shri, R.string.gyan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q870);
        Question q871 = new Question(R.string.chopai_line1q4,
                R.string.gun, R.string.ati, R.string.tum, 1, Question.DIFFICULTY_HARD);
        addQuestion(q871);
        Question q872 = new Question(R.string.chopai_line1q5,
                R.string.suvan, R.string.sagar, R.string.kesri, 2, Question.DIFFICULTY_HARD);
        addQuestion(q872);

        // CHOPAI LINE N0 2.

        Question q873 = new Question(R.string.chopai_line2q1,
                R.string.sam, R.string.mam, R.string.jai_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q873);
        Question q874 = new Question(R.string.chopai_line2q2,
                R.string.kapis, R.string.aatur, R.string.dhari, 1, Question.DIFFICULTY_HARD);
        addQuestion(q874);
        Question q875 = new Question(R.string.chopai_line2q3,
                R.string.kanth, R.string.tihun, R.string.bheem, 2, Question.DIFFICULTY_HARD);
        addQuestion(q875);
        Question q876 = new Question(R.string.chopai_line2q4,
                R.string.asa, R.string.jas, R.string.lok, 3, Question.DIFFICULTY_HARD);
        addQuestion(q876);
        Question q877 = new Question(R.string.chopai_line2q5,
                R.string.ujaagar, R.string.subesaa, R.string.kunchit, 1, Question.DIFFICULTY_HARD);
        addQuestion(q877);

        // CHOPAI LINE N0 3.

        Question q878 = new Question(R.string.chopai_line3q1,
                R.string.birajai, R.string.ramdoot, R.string.kaandhe, 2, Question.DIFFICULTY_HARD);
        addQuestion(q878);
        Question q879 = new Question(R.string.chopai_line3q2,
                R.string.kaanan, R.string.biraaj, R.string.atulit, 3, Question.DIFFICULTY_HARD);
        addQuestion(q879);
        Question q880 = new Question(R.string.chopai_line3q3,
                R.string.bal_2, R.string.jam, R.string.sab, 1, Question.DIFFICULTY_HARD);
        addQuestion(q880);
        Question q881 = new Question(R.string.chopai_line3q4,
                R.string.kundal, R.string.dhamaa, R.string.dhwaja, 2, Question.DIFFICULTY_HARD);
        addQuestion(q881);

        // CHOPAI LINE N0 4.

        Question q882 = new Question(R.string.chopai_line4q1,
                R.string.nandan, R.string.sankar, R.string.anjani, 3, Question.DIFFICULTY_HARD);
        addQuestion(q882);
        Question q883 = new Question(R.string.chopai_line4q2,
                R.string.putra, R.string.laaye, R.string.kinhi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q883);
        Question q884 = new Question(R.string.chopai_line4q3,
                R.string.sanvaare, R.string.pavansut, R.string.raghuvir, 2, Question.DIFFICULTY_HARD);
        addQuestion(q884);
        Question q885 = new Question(R.string.chopai_line4q4,
                R.string.vandan, R.string.pratap, R.string.naamaa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q885);

        // CHOPAI LINE N0 5.

        Question q886 = new Question(R.string.chopai_line5q1,
                R.string.mahaveer, R.string.shripati, R.string.sahastra, 1, Question.DIFFICULTY_HARD);
        addQuestion(q886);
        Question q887 = new Question(R.string.chopai_line5q2,
                R.string.karibe, R.string.bikram, R.string.prabhu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q887);
        Question q888 = new Question(R.string.chopai_line5q3,
                R.string.samhaaro, R.string.paisaare, R.string.bajrangi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q888);

        // CHOPAI LINE N0 6.

        Question q889 = new Question(R.string.chopai_line6q1,
                R.string.kumati, R.string.sunibe, R.string.rasiya, 1, Question.DIFFICULTY_HARD);
        addQuestion(q889);
        Question q890 = new Question(R.string.chopai_line6q2,
                R.string.basiya, R.string.nivaar, R.string.jarawa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q890);
        Question q891 = new Question(R.string.chopai_line6q3,
                R.string.saarad, R.string.badaai, R.string.sumati, 3, Question.DIFFICULTY_HARD);
        addQuestion(q891);
        Question q892 = new Question(R.string.chopai_line6q4,
                R.string.ke, R.string.ur, R.string.te, 1, Question.DIFFICULTY_HARD);
        addQuestion(q892);
        Question q893 = new Question(R.string.chopai_line6q5,
                R.string.bahut, R.string.sangi, R.string.priya, 2, Question.DIFFICULTY_HARD);
        addQuestion(q893);

        // CHOPAI LINE N0 7.

        Question q894 = new Question(R.string.chopai_line7q1,
                R.string.sanhare, R.string.sukshma, R.string.kanchan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q894);
        Question q895 = new Question(R.string.chopai_line7q2,
                R.string.baran, R.string.sahas, R.string.bhaai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q895);
        Question q896 = new Question(R.string.chopai_line7q3,
                R.string.jahaan, R.string.biraaj, R.string.keenha, 2, Question.DIFFICULTY_HARD);
        addQuestion(q896);
        Question q897 = new Question(R.string.chopai_line7q4,
                R.string.jiyaaye, R.string.sajivan, R.string.subesaa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q897);

        // CHOPAI LINE N0 8.

        Question q898 = new Question(R.string.chopai_line8q1,
                R.string.kaanan, R.string.rajpad, R.string.deenha, 1, Question.DIFFICULTY_HARD);
        addQuestion(q898);
        Question q899 = new Question(R.string.chopai_line8q2,
                R.string.mantra, R.string.kundal, R.string.bhaanu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q899);
        Question q900 = new Question(R.string.chopai_line8q3,
                R.string.gaavein, R.string.harashi, R.string.kunchit, 3, Question.DIFFICULTY_HARD);
        addQuestion(q900);
        Question q901 = new Question(R.string.chopai_line8q4,
                R.string.kesa, R.string.sake, R.string.juug, 1, Question.DIFFICULTY_HARD);
        addQuestion(q901);

        // CHOPAI LINE N0 9.

        Question q902 = new Question(R.string.chopai_line9q1,
                R.string.narad, R.string.haath, R.string.sahit, 2, Question.DIFFICULTY_HARD);
        addQuestion(q902);
        Question q903 = new Question(R.string.chopai_line9q2,
                R.string.kabhi, R.string.kuber, R.string.bajra, 3, Question.DIFFICULTY_HARD);
        addQuestion(q903);
        Question q904 = new Question(R.string.chopai_line9q3,
                R.string.aur, R.string.jan, R.string.par, 1, Question.DIFFICULTY_HARD);
        addQuestion(q904);
        Question q905 = new Question(R.string.chopai_line9q4,
                R.string.leelyo, R.string.dhwaja, R.string.madhur, 2, Question.DIFFICULTY_HARD);
        addQuestion(q905);
        Question q906 = new Question(R.string.chopai_line9q5,
                R.string.muneesa, R.string.tumharo, R.string.birajai, 3, Question.DIFFICULTY_HARD);
        addQuestion(q906);

        // CHOPAI LINE N0 10.

        Question q907 = new Question(R.string.chopai_line10q1,
                R.string.kaandhe, R.string.digpaal, R.string.milaaye, 1, Question.DIFFICULTY_HARD);
        addQuestion(q907);
        Question q908 = new Question(R.string.chopai_line10q2,
                R.string.kovid, R.string.moonj, R.string.kahin, 2, Question.DIFFICULTY_HARD);
        addQuestion(q908);
        Question q909 = new Question(R.string.chopai_line10q3,
                R.string.upkar, R.string.kahan, R.string.janeu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q909);
        Question q910 = new Question(R.string.chopai_line10q4,
                R.string.saaje, R.string.maana, R.string.bhaye, 1, Question.DIFFICULTY_HARD);
        addQuestion(q910);

        // CHOPAI LINE N0 11.

        Question q911 = new Question(R.string.chopai_line11q1,
                R.string.naasei, R.string.sankar, R.string.sankat, 2, Question.DIFFICULTY_HARD);
        addQuestion(q911);
        Question q912 = new Question(R.string.chopai_line11q2,
                R.string.taahi, R.string.jaana, R.string.suvan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q912);
        Question q913 = new Question(R.string.chopai_line11q3,
                R.string.kesri, R.string.jaanu, R.string.jagat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q913);
        Question q914 = new Question(R.string.chopai_line11q4,
                R.string.vachan, R.string.nandan, R.string.laavei, 2, Question.DIFFICULTY_HARD);
        addQuestion(q914);

        // CHOPAI LINE N0 12.

        Question q915 = new Question(R.string.chopai_line12q1,
                R.string.jab, R.string.hot, R.string.tej, 3, Question.DIFFICULTY_HARD);
        addQuestion(q915);
        Question q916 = new Question(R.string.chopai_line12q2,
                R.string.pratap, R.string.jeevan, R.string.siddhi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q916);
        Question q917 = new Question(R.string.chopai_line12q3,
                R.string.meli, R.string.maha, R.string.mukh, 2, Question.DIFFICULTY_HARD);
        addQuestion(q917);
        Question q918 = new Question(R.string.chopai_line12q4,
                R.string.soi, R.string.koi, R.string.jag, 3, Question.DIFFICULTY_HARD);
        addQuestion(q918);
        Question q919 = new Question(R.string.chopai_line12q5,
                R.string.vandan, R.string.bhajan, R.string.paavei, 1, Question.DIFFICULTY_HARD);
        addQuestion(q919);

        // CHOPAI LINE N0 13.

        Question q920 = new Question(R.string.chopai_line13q1,
                R.string.charittra, R.string.vidyavaan, R.string.raghupati, 2, Question.DIFFICULTY_HARD);
        addQuestion(q920);
        Question q921 = new Question(R.string.chopai_line13q2,
                R.string.jete, R.string.gaye, R.string.guni, 3, Question.DIFFICULTY_HARD);
        addQuestion(q921);
        Question q922 = new Question(R.string.chopai_line13q3,
                R.string.ati, R.string.jug, R.string.hai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q922);
        Question q923 = new Question(R.string.chopai_line13q4,
                R.string.mudrika, R.string.chaatur, R.string.maaheen, 2, Question.DIFFICULTY_HARD);
        addQuestion(q923);

        // CHOPAI LINE N0 14.

        Question q924 = new Question(R.string.chopai_line14q1,
                R.string.pur, R.string.nau, R.string.ram, 3, Question.DIFFICULTY_HARD);
        addQuestion(q924);
        Question q925 = new Question(R.string.chopai_line14q2,
                R.string.kaaj, R.string.tete, R.string.sukh, 1, Question.DIFFICULTY_HARD);
        addQuestion(q925);
        Question q926 = new Question(R.string.chopai_line14q3,
                R.string.kahaai, R.string.karibe, R.string.dharai, 2, Question.DIFFICULTY_HARD);
        addQuestion(q926);
        Question q927 = new Question(R.string.chopai_line14q4,
                R.string.ki, R.string.na, R.string.ko, 3, Question.DIFFICULTY_HARD);
        addQuestion(q927);
        Question q928 = new Question(R.string.chopai_line14q5,
                R.string.aatur, R.string.sugam, R.string.aagya, 1, Question.DIFFICULTY_HARD);
        addQuestion(q928);

        // CHOPAI LINE N0 15.

        Question q929 = new Question(R.string.chopai_line15q1,
                R.string.karahu, R.string.prabhu, R.string.saakhi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q929);
        Question q930 = new Question(R.string.chopai_line15q2,
                R.string.lagaavein, R.string.bharatahi, R.string.charittra, 3, Question.DIFFICULTY_HARD);
        addQuestion(q930);
        Question q931 = new Question(R.string.chopai_line15q3,
                R.string.sunibe, R.string.keejei, R.string.hriday, 1, Question.DIFFICULTY_HARD);
        addQuestion(q931);
        Question q932 = new Question(R.string.chopai_line15q4,
                R.string.jo, R.string.ko, R.string.ke, 2, Question.DIFFICULTY_HARD);
        addQuestion(q932);
        Question q933 = new Question(R.string.chopai_line15q5,
                R.string.mangal, R.string.pratap, R.string.rasiya, 3, Question.DIFFICULTY_HARD);
        addQuestion(q933);

        // CHOPAI LINE N0 16.

        Question q934 = new Question(R.string.chopai_line16q1,
                R.string.ram_2, R.string.sei, R.string.sat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q934);
        Question q935 = new Question(R.string.chopai_line16q2,
                R.string.basahu, R.string.lakhan, R.string.barnau, 2, Question.DIFFICULTY_HARD);
        addQuestion(q935);
        Question q936 = new Question(R.string.chopai_line16q3,
                R.string.naam, R.string.nahi, R.string.sita, 3, Question.DIFFICULTY_HARD);
        addQuestion(q936);
        Question q937 = new Question(R.string.chopai_line16q4,
                R.string.mann_2, R.string.hare, R.string.kram, 1, Question.DIFFICULTY_HARD);
        addQuestion(q937);
        Question q938 = new Question(R.string.chopai_line16q5,
                R.string.dayaku, R.string.basiya, R.string.janike, 2, Question.DIFFICULTY_HARD);
        addQuestion(q938);

        // CHOPAI LINE N0 17.

        Question q939 = new Question(R.string.chopai_line17q1,
                R.string.laanghi, R.string.jaladhi, R.string.sukshma, 3, Question.DIFFICULTY_HARD);
        addQuestion(q939);
        Question q940 = new Question(R.string.chopai_line17q2,
                R.string.roop, R.string.raja, R.string.amit, 1, Question.DIFFICULTY_HARD);
        addQuestion(q940);
        Question q941 = new Question(R.string.chopai_line17q3,
                R.string.lahei, R.string.dhari, R.string.sarna, 2, Question.DIFFICULTY_HARD);
        addQuestion(q941);
        Question q942 = new Question(R.string.chopai_line17q4,
                R.string.atulit, R.string.buddhi, R.string.siyahi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q942);
        Question q943 = new Question(R.string.chopai_line17q5,
                R.string.dikhawa, R.string.acharaj, R.string.naaheen, 1, Question.DIFFICULTY_HARD);
        addQuestion(q943);

        // CHOPAI LINE N0 18.

        Question q944 = new Question(R.string.chopai_line18q1,
                R.string.kaahu, R.string.vikat, R.string.aapan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q944);
        Question q945 = new Question(R.string.chopai_line18q2,
                R.string.data, R.string.sant, R.string.roop_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q945);
        Question q946 = new Question(R.string.chopai_line18q3,
                R.string.dhari_2, R.string.aapei, R.string.teeno, 1, Question.DIFFICULTY_HARD);
        addQuestion(q946);
        Question q947 = new Question(R.string.chopai_line18q4,
                R.string.deen, R.string.lank, R.string.pasa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q947);
        Question q948 = new Question(R.string.chopai_line18q5,
                R.string.harahu, R.string.charan, R.string.jarawa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q948);

        // CHOPAI LINE N0 19.

        Question q949 = new Question(R.string.chopai_line19q1,
                R.string.bheem, R.string.nikat, R.string.aavei, 1, Question.DIFFICULTY_HARD);
        addQuestion(q949);
        Question q950 = new Question(R.string.chopai_line19q2,
                R.string.raho, R.string.roop_3, R.string.dasa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q950);
        Question q951 = new Question(R.string.chopai_line19q3,
                R.string.japat, R.string.peera, R.string.dhari_3, 3, Question.DIFFICULTY_HARD);
        addQuestion(q951);
        Question q952 = new Question(R.string.chopai_line19q4,
                R.string.asur, R.string.dukh, R.string.anta, 1, Question.DIFFICULTY_HARD);
        addQuestion(q952);
        Question q953 = new Question(R.string.chopai_line19q5,
                R.string.anugrah, R.string.sanhare, R.string.tumhare, 2, Question.DIFFICULTY_HARD);
        addQuestion(q953);

        // CHOPAI LINE N0 20.

        Question q954 = new Question(R.string.chopai_line20q1,
                R.string.chhudaavei, R.string.lankeshwar, R.string.ramchandra, 3, Question.DIFFICULTY_HARD);
        addQuestion(q954);
        Question q955 = new Question(R.string.chopai_line20q2,
                R.string.ke, R.string.ko, R.string.ur, 1, Question.DIFFICULTY_HARD);
        addQuestion(q955);
        Question q956 = new Question(R.string.chopai_line20q3,
                R.string.jaai, R.string.kaaj_2, R.string.janm, 2, Question.DIFFICULTY_HARD);
        addQuestion(q956);
        Question q957 = new Question(R.string.chopai_line20q4,
                R.string.manorath, R.string.nirantar, R.string.sanvaare, 3, Question.DIFFICULTY_HARD);
        addQuestion(q957);

        // CHOPAI LINE N0 21.

        Question q958 = new Question(R.string.chopai_line21q1,
                R.string.laaye, R.string.beera, R.string.dhyan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q958);
        Question q959 = new Question(R.string.chopai_line21q2,
                R.string.duwaare, R.string.sajivan, R.string.tumhari, 2, Question.DIFFICULTY_HARD);
        addQuestion(q959);
        Question q960 = new Question(R.string.chopai_line21q3,
                R.string.anjani, R.string.dhamaa, R.string.lakhan_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q960);
        Question q961 = new Question(R.string.chopai_line21q4,
                R.string.jiyaaye, R.string.rakshak, R.string.haankte, 1, Question.DIFFICULTY_HARD);
        addQuestion(q961);

        // CHOPAI LINE N0 22.

        Question q962 = new Question(R.string.chopai_line22q1,
                R.string.binu, R.string.shri, R.string.hari, 2, Question.DIFFICULTY_HARD);
        addQuestion(q962);
        Question q963 = new Question(R.string.chopai_line22q2,
                R.string.chhutahi, R.string.nikandan, R.string.raghuvir, 3, Question.DIFFICULTY_HARD);
        addQuestion(q963);
        Question q964 = new Question(R.string.chopai_line22q3,
                R.string.harashi, R.string.kaanpei, R.string.mahavir, 1, Question.DIFFICULTY_HARD);
        addQuestion(q964);
        Question q965 = new Question(R.string.chopai_line22q4,
                R.string.te, R.string.ur, R.string.na, 2, Question.DIFFICULTY_HARD);
        addQuestion(q965);
        Question q966 = new Question(R.string.chopai_line22q5,
                R.string.tinke, R.string.saroj, R.string.laaye_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q966);

        // CHOPAI LINE N0 23.

        Question q967 = new Question(R.string.chopai_line23q1,
                R.string.raghupati_2, R.string.sankaadik, R.string.brahmaadi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q967);
        Question q968 = new Question(R.string.chopai_line23q2,
                R.string.sakal, R.string.kinhi, R.string.saaja, 2, Question.DIFFICULTY_HARD);
        addQuestion(q968);
        Question q969 = new Question(R.string.chopai_line23q3,
                R.string.ashta, R.string.paave, R.string.bahut, 3, Question.DIFFICULTY_HARD);
        addQuestion(q969);
        Question q970 = new Question(R.string.chopai_line23q4,
                R.string.badaai, R.string.anjani, R.string.naamaa, 1, Question.DIFFICULTY_HARD);
        addQuestion(q970);

        // CHOPAI LINE N0 24.

        Question q971 = new Question(R.string.chopai_line24q1,
                R.string.kar, R.string.tum, R.string.hoi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q971);
        Question q972 = new Question(R.string.chopai_line24q2,
                R.string.sur, R.string.yah, R.string.mam, 3, Question.DIFFICULTY_HARD);
        addQuestion(q972);
        Question q973 = new Question(R.string.chopai_line24q3,
                R.string.priya, R.string.nidhi, R.string.janki, 1, Question.DIFFICULTY_HARD);
        addQuestion(q973);
        Question q974 = new Question(R.string.chopai_line24q4,
                R.string.sugrivahi, R.string.bharatahi, R.string.vibhishan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q974);
        Question q975 = new Question(R.string.chopai_line24q5,
                R.string.nij, R.string.raj, R.string.sam, 3, Question.DIFFICULTY_HARD);
        addQuestion(q975);
        Question q976 = new Question(R.string.chopai_line24q6,
                R.string.bhaai, R.string.sadaa, R.string.janam, 1, Question.DIFFICULTY_HARD);
        addQuestion(q976);

        // CHOPAI LINE N0 25.

        Question q977 = new Question(R.string.chopai_line25q1,
                R.string.kaaal, R.string.sahas, R.string.jahan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q977);
        Question q978 = new Question(R.string.chopai_line25q2,
                R.string.devta, R.string.bhakt, R.string.badan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q978);
        Question q979 = new Question(R.string.chopai_line25q3,
                R.string.tumharo, R.string.sunavei, R.string.hanumat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q979);
        Question q980 = new Question(R.string.chopai_line25q4,
                R.string.bal, R.string.jas, R.string.jai, 2, Question.DIFFICULTY_HARD);
        addQuestion(q980);
        Question q981 = new Question(R.string.chopai_line25q5,
                R.string.chaaron, R.string.tapasvi, R.string.gaavein, 3, Question.DIFFICULTY_HARD);
        addQuestion(q981);

        // CHOPAI LINE N0 26.

        Question q982 = new Question(R.string.chopai_line26q1,
                R.string.asa, R.string.gun, R.string.lok, 1, Question.DIFFICULTY_HARD);
        addQuestion(q982);
        Question q983 = new Question(R.string.chopai_line26q2,
                R.string.naai, R.string.kahi, R.string.baar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q983);
        Question q984 = new Question(R.string.chopai_line26q3,
                R.string.tulsidas, R.string.mahasukh, R.string.shripati, 3, Question.DIFFICULTY_HARD);
        addQuestion(q984);
        Question q985 = new Question(R.string.chopai_line26q4,
                R.string.kanth, R.string.chitt, R.string.sarva, 1, Question.DIFFICULTY_HARD);
        addQuestion(q985);
        Question q986 = new Question(R.string.chopai_line26q5,
                R.string.rakhwaare, R.string.lagaavein, R.string.parsiddha, 2, Question.DIFFICULTY_HARD);
        addQuestion(q986);

        // CHOPAI LINE N0 27.

        Question q987 = new Question(R.string.chopai_line27q1,
                R.string.bisraavei, R.string.raghupati, R.string.sankaadik, 3, Question.DIFFICULTY_HARD);
        addQuestion(q987);
        Question q988 = new Question(R.string.chopai_line27q2,
                R.string.brahmaadi, R.string.ramlakhan, R.string.vidyavaan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q988);
        Question q989 = new Question(R.string.chopai_line27q3,
                R.string.tumhara, R.string.muneesa, R.string.ujiyara, 2, Question.DIFFICULTY_HARD);
        addQuestion(q989);

        // CHOPAI LINE N0 28.

        Question q990 = new Question(R.string.chopai_line28q1,
                R.string.karai, R.string.bhoot, R.string.narad, 3, Question.DIFFICULTY_HARD);
        addQuestion(q990);
        Question q991 = new Question(R.string.chopai_line28q2,
                R.string.saarad, R.string.bikaar, R.string.bikram, 1, Question.DIFFICULTY_HARD);
        addQuestion(q991);
        Question q992 = new Question(R.string.chopai_line28q3,
                R.string.katei, R.string.sahit, R.string.mitei, 2, Question.DIFFICULTY_HARD);
        addQuestion(q992);
        Question q993 = new Question(R.string.chopai_line28q4,
                R.string.nivaar, R.string.kumati, R.string.aheesa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q993);

        // CHOPAI LINE N0 29.

        Question q994 = new Question(R.string.chopai_line29q1,
                R.string.jam, R.string.aur, R.string.tej, 1, Question.DIFFICULTY_HARD);
        addQuestion(q994);
        Question q995 = new Question(R.string.chopai_line29q2,
                R.string.gosai, R.string.kuber, R.string.kripa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q995);
        Question q996 = new Question(R.string.chopai_line29q3,
                R.string.rasayan, R.string.dulaare, R.string.digpaal, 3, Question.DIFFICULTY_HARD);
        addQuestion(q996);
        Question q997 = new Question(R.string.chopai_line29q4,
                R.string.jahaan, R.string.sumati, R.string.biraaj, 1, Question.DIFFICULTY_HARD);
        addQuestion(q997);
        Question q998 = new Question(R.string.chopai_line29q5,
                R.string.ki, R.string.te, R.string.jo, 2, Question.DIFFICULTY_HARD);
        addQuestion(q998);

        // CHOPAI LINE N0 30.

        Question q999 = new Question(R.string.chopai_line30q1,
                R.string.bandi, R.string.paath, R.string.kabhi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q999);
        Question q1000 = new Question(R.string.chopai_line30q2,
                R.string.kovid, R.string.padhe, R.string.chera, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1000);
        Question q1001 = new Question(R.string.chopai_line30q3,
                R.string.haran, R.string.kahin, R.string.murti, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1001);
        Question q1002 = new Question(R.string.chopai_line30q4,
                R.string.sada, R.string.hoye, R.string.sake, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1002);
        Question q1003 = new Question(R.string.chopai_line30q5,
                R.string.kahan, R.string.bhoop, R.string.shree, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1003);
        Question q1004 = new Question(R.string.chopai_line30q6,
                R.string.ke, R.string.te, R.string.ko, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1004);

        // CHOPAI LINE N0 31.

        Question q1005 = new Question(R.string.chopai_line31q1,
                R.string.ati, R.string.jag, R.string.tum_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1005);
        Question q1006 = new Question(R.string.chopai_line31q2,
                R.string.upkar, R.string.saroj, R.string.mukur, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1006);
        Question q1007 = new Question(R.string.chopai_line31q3,
                R.string.vidyavaan, R.string.sugrivahi, R.string.charittra, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1007);
        Question q1008 = new Question(R.string.chopai_line31q4,
                R.string.kundal, R.string.kaanan, R.string.keenha, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1008);

        // CHOPAI LINE N0 32.

        Question q1009 = new Question(R.string.chopai_line32q1,
                R.string.ram_3, R.string.tum, R.string.mam, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1009);
        Question q1010 = new Question(R.string.chopai_line32q2,
                R.string.sumirei, R.string.milaaye, R.string.gurudev, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1010);
        Question q1011 = new Question(R.string.chopai_line32q3,
                R.string.sankar, R.string.dhwaja, R.string.rajpad, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1011);
        Question q1012 = new Question(R.string.chopai_line32q4,
                R.string.deenha, R.string.nandan, R.string.pratap, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1012);

        // CHOPAI LINE N0 33.

        Question q1013 = new Question(R.string.chopai_line33q1,
                R.string.chalisa, R.string.tumharo_2, R.string.gaurisa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1013);
        Question q1014 = new Question(R.string.chopai_line33q2,
                R.string.karibe, R.string.vandan, R.string.mantra, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1014);
        Question q1015 = new Question(R.string.chopai_line33q3,
                R.string.vibhishan, R.string.raghupati, R.string.bharatahi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1015);
        Question q1016 = new Question(R.string.chopai_line33q4,
                R.string.bimal, R.string.maana, R.string.chari, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1016);

        // CHOPAI LINE N0 34.

        Question q1017 = new Question(R.string.chopai_line34q1,
                R.string.buddhiheen, R.string.chhudaavei, R.string.lankeshwar, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1017);
        Question q1018 = new Question(R.string.chopai_line34q2,
                R.string.bhaye, R.string.pavan, R.string.kumar, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1018);
        Question q1019 = new Question(R.string.chopai_line34q3,
                R.string.sam, R.string.sab, R.string.jas, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1019);
        Question q1020 = new Question(R.string.chopai_line34q4,
                R.string.jam, R.string.asa, R.string.jag_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1020);
        Question q1021 = new Question(R.string.chopai_line34q5,
                R.string.jaana, R.string.vidya, R.string.kales, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1021);

        // CHOPAI LINE N0 35.

        Question q1022 = new Question(R.string.chopai_line35q1,
                R.string.mata, R.string.juug, R.string.nath, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1022);
        Question q1023 = new Question(R.string.chopai_line35q2,
                R.string.raghubar, R.string.sudhaari, R.string.sahastra, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1023);
        Question q1024 = new Question(R.string.chopai_line35q3,
                R.string.jo, R.string.ur, R.string.te, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1024);
        Question q1025 = new Question(R.string.chopai_line35q4,
                R.string.sab, R.string.jan, R.string.hot, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1025);
        Question q1026 = new Question(R.string.chopai_line35q5,
                R.string.koi, R.string.jab, R.string.par, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1026);
        Question q1027 = new Question(R.string.chopai_line35q6,
                R.string.bhaanu, R.string.prabhu, R.string.sunibe, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1027);

        // CHOPAI LINE N0 36.

        Question q1028 = new Question(R.string.chopai_line36q1,
                R.string.rasiya, R.string.leelyo, R.string.lakhan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1028);
        Question q1029 = new Question(R.string.chopai_line36q2,
                R.string.kapis, R.string.sagar, R.string.taahi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1029);
        Question q1030 = new Question(R.string.chopai_line36q3,
                R.string.madhur, R.string.basiya, R.string.jarawa, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1030);
        Question q1031 = new Question(R.string.chopai_line36q4,
                R.string.dera, R.string.phal, R.string.guru, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1031);
        Question q1032 = new Question(R.string.chopai_line36q5,
                R.string.putra, R.string.tihun, R.string.jaanu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1032);

        // CHOPAI LINE N0 37.

        Question q1033 = new Question(R.string.chopai_line37q1,
                R.string.prabhu_2, R.string.badaai, R.string.saarad, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1033);
        Question q1034 = new Question(R.string.chopai_line37q2,
                R.string.sumirow, R.string.mudrika, R.string.ujaagar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1034);
        Question q1035 = new Question(R.string.chopai_line37q3,
                R.string.jasu, R.string.mann, R.string.meli, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1035);
        Question q1036 = new Question(R.string.chopai_line37q4,
                R.string.mukh, R.string.phal, R.string.tanu, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1036);
        Question q1037 = new Question(R.string.chopai_line37q5,
                R.string.ramdoot, R.string.maaheen, R.string.kanchan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1037);

        // CHOPAI LINE N0 38.

        Question q1038 = new Question(R.string.chopai_line38q1,
                R.string.kunchit, R.string.subesaa, R.string.jaladhi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1038);
        Question q1039 = new Question(R.string.chopai_line38q2,
                R.string.laanghi, R.string.birajai, R.string.kaandhe, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1039);
        Question q1040 = new Question(R.string.chopai_line38q3,
                R.string.dehu, R.string.gaye, R.string.mohi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1040);
        Question q1041 = new Question(R.string.chopai_line38q4,
                R.string.sukshma, R.string.chaatur, R.string.acharaj, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1041);
        Question q1042 = new Question(R.string.chopai_line38q5,
                R.string.naaheen, R.string.sanhare, R.string.sajivan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1042);

        // CHOPAI LINE N0 39.

        Question q1043 = new Question(R.string.chopai_line39q1,
                R.string.aheesa, R.string.durgam, R.string.jahaan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1043);
        Question q1044 = new Question(R.string.chopai_line39q2,
                R.string.kesa, R.string.gyan, R.string.kaaj_3, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1044);
        Question q1045 = new Question(R.string.chopai_line39q3,
                R.string.jagat, R.string.sangi, R.string.baran, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1045);
        Question q1046 = new Question(R.string.chopai_line39q4,
                R.string.na, R.string.ke_3, R.string.ki, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1046);
        Question q1047 = new Question(R.string.chopai_line39q5,
                R.string.guni, R.string.maha, R.string.jete, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1047);

        // CHOPAI LINE N0 40.

        Question q1048 = new Question(R.string.chopai_line40q1,
                R.string.sugam, R.string.haath, R.string.bajra, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1048);
        Question q1049 = new Question(R.string.chopai_line40q2,
                R.string.jiyaaye, R.string.anugrah, R.string.harashi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1049);
        Question q1050 = new Question(R.string.chopai_line40q3,
                R.string.gaavein, R.string.tumharo, R.string.tumhare, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1050);
        Question q1051 = new Question(R.string.chopai_line40q4,
                R.string.tete, R.string.kaaj, R.string.roop, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1051);

        // CHOPAI LINE N0 41.

        Question q1052 = new Question(R.string.chopai_line41q1,
                R.string.jan, R.string.ram_4, R.string.par, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1052);
        Question q1053 = new Question(R.string.chopai_line41q2,
                R.string.digpaal, R.string.muneesa, R.string.duwaare, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1053);
        Question q1054 = new Question(R.string.chopai_line41q3,
                R.string.tum_3, R.string.soi, R.string.jug, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1054);
        Question q1055 = new Question(R.string.chopai_line41q4,
                R.string.lagaavein, R.string.rakhwaare, R.string.sankaadik, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1055);

        // CHOPAI LINE N0 42.

        Question q1056 = new Question(R.string.chopai_line42q1,
                R.string.nau, R.string.hai, R.string.hot, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1056);
        Question q1057 = new Question(R.string.chopai_line42q2,
                R.string.na, R.string.jo, R.string.ke, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1057);
        Question q1058 = new Question(R.string.chopai_line42q3,
                R.string.moonj, R.string.aagya, R.string.janeu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1058);
        Question q1059 = new Question(R.string.chopai_line42q4,
                R.string.shri, R.string.lank, R.string.binu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1059);
        Question q1060 = new Question(R.string.chopai_line42q5,
                R.string.paisaare, R.string.pavansut, R.string.mahaveer, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1060);

        // CHOPAI LINE N0 43.

        Question q1061 = new Question(R.string.chopai_line43q1,
                R.string.pur, R.string.sab_2, R.string.sei, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1061);
        Question q1062 = new Question(R.string.chopai_line43q2,
                R.string.sake, R.string.kahi, R.string.sukh, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1062);
        Question q1063 = new Question(R.string.chopai_line43q3,
                R.string.lahei, R.string.saaje, R.string.suvan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1063);
        Question q1064 = new Question(R.string.chopai_line43q4,
                R.string.milaaye, R.string.tumhari, R.string.mudrika, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1064);
        Question q1065 = new Question(R.string.chopai_line43q5,
                R.string.aatur, R.string.kesri, R.string.sarna, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1065);

        // CHOPAI LINE N0 44.

        Question q1066 = new Question(R.string.chopai_line44q1,
                R.string.tum_4, R.string.sat, R.string.kar, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1066);
        Question q1067 = new Question(R.string.chopai_line44q2,
                R.string.maaheen, R.string.rakshak, R.string.jaladhi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1067);
        Question q1068 = new Question(R.string.chopai_line44q3,
                R.string.kanth, R.string.dhari, R.string.kaahu, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1068);
        Question q1069 = new Question(R.string.chopai_line44q4,
                R.string.ko, R.string.ur, R.string.te, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1069);
        Question q1070 = new Question(R.string.chopai_line44q5,
                R.string.keenha, R.string.darnaa, R.string.rajpad, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1070);

        // CHOPAI LINE N0 45.

        Question q1071 = new Question(R.string.chopai_line45q1,
                R.string.laaye, R.string.bheem, R.string.aapan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1071);
        Question q1072 = new Question(R.string.chopai_line45q2,
                R.string.tej_2, R.string.hoi, R.string.yah, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1072);
        Question q1073 = new Question(R.string.chopai_line45q3,
                R.string.bajrangi, R.string.samhaaro, R.string.sanvaare, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1073);
        Question q1074 = new Question(R.string.chopai_line45q4,
                R.string.bahut, R.string.kinhi, R.string.aapei, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1074);

        // CHOPAI LINE N0 46.

        Question q1075 = new Question(R.string.chopai_line46q1,
                R.string.teeno, R.string.priya, R.string.bhaai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1075);
        Question q1076 = new Question(R.string.chopai_line46q2,
                R.string.sur, R.string.lok_2, R.string.raj, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1076);
        Question q1077 = new Question(R.string.chopai_line46q3,
                R.string.acharaj, R.string.laanghi, R.string.haankte, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1077);
        Question q1078 = new Question(R.string.chopai_line46q4,
                R.string.kaanpei, R.string.naaheen, R.string.anugrah, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1078);

        // CHOPAI LINE N0 47.

        Question q1079 = new Question(R.string.chopai_line47q1,
                R.string.bahut, R.string.bhoot, R.string.sahas, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1079);
        Question q1080 = new Question(R.string.chopai_line47q2,
                R.string.samhaaro, R.string.paisaare, R.string.pishaach, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1080);
        Question q1081 = new Question(R.string.chopai_line47q3,
                R.string.nikat, R.string.badan, R.string.narad, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1081);
        Question q1082 = new Question(R.string.chopai_line47q4,
                R.string.juug, R.string.nahi, R.string.meli, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1082);
        Question q1083 = new Question(R.string.chopai_line47q5,
                R.string.kuber, R.string.sahit, R.string.aavei, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1083);

        // CHOPAI LINE N0 48.

        Question q1084 = new Question(R.string.chopai_line48q1,
                R.string.mahavir, R.string.tumhare, R.string.duwaare, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1084);
        Question q1085 = new Question(R.string.chopai_line48q2,
                R.string.ram, R.string.jab, R.string.raj, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1085);
        Question q1086 = new Question(R.string.chopai_line48q3,
                R.string.gaye, R.string.mukh, R.string.naam, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1086);
        Question q1087 = new Question(R.string.chopai_line48q4,
                R.string.sunavei, R.string.tumhari, R.string.rakshak, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1087);

        // CHOPAI LINE N0 49.

        Question q1088 = new Question(R.string.chopai_line49q1,
                R.string.charan, R.string.naasei, R.string.deenha, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1088);
        Question q1089 = new Question(R.string.chopai_line49q2,
                R.string.bal, R.string.nij, R.string.rog, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1089);
        Question q1090 = new Question(R.string.chopai_line49q3,
                R.string.hare, R.string.asur, R.string.jete, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1090);
        Question q1091 = new Question(R.string.chopai_line49q4,
                R.string.bar, R.string.sab_3, R.string.jai, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1091);
        Question q1092 = new Question(R.string.chopai_line49q5,
                R.string.kahin, R.string.kabhi, R.string.peera, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1092);

        // CHOPAI LINE N0 50.

        Question q1093 = new Question(R.string.chopai_line50q1,
                R.string.japat, R.string.kovid, R.string.kahan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1093);
        Question q1094 = new Question(R.string.chopai_line50q2,
                R.string.sahastra, R.string.nirantar, R.string.manorath, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1094);
        Question q1095 = new Question(R.string.chopai_line50q3,
                R.string.haankte, R.string.hanuman, R.string.hanumat, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1095);
        Question q1096 = new Question(R.string.chopai_line50q4,
                R.string.beera, R.string.upkar, R.string.maana, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1096);

        // CHOPAI LINE N0 51.

        Question q1097 = new Question(R.string.chopai_line51q1,
                R.string.mantra, R.string.sankat, R.string.bhaanu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1097);
        Question q1098 = new Question(R.string.chopai_line51q2,
                R.string.ki, R.string.na, R.string.te, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1098);
        Question q1099 = new Question(R.string.chopai_line51q3,
                R.string.hanuman_2, R.string.mahavir, R.string.hanumat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1099);
        Question q1100 = new Question(R.string.chopai_line51q4,
                R.string.pavantanay, R.string.chhudaavei, R.string.ramchandra, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1100);

        // CHOPAI LINE N0 52.

        Question q1101 = new Question(R.string.chopai_line52q1,
                R.string.binu, R.string.tete, R.string.mann_3, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1101);
        Question q1102 = new Question(R.string.chopai_line52q2,
                R.string.kram, R.string.guru, R.string.sita, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1102);
        Question q1103 = new Question(R.string.chopai_line52q3,
                R.string.lakhan, R.string.vachan, R.string.leelyo, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1103);
        Question q1104 = new Question(R.string.chopai_line52q4,
                R.string.cliff, R.string.bhaye, R.string.dhyan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1104);
        Question q1105 = new Question(R.string.chopai_line52q5,
                R.string.jo_3, R.string.ke, R.string.ko, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1105);
        Question q1106 = new Question(R.string.chopai_line52q6,
                R.string.madhur, R.string.laavei, R.string.naasei, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1106);

        // CHOPAI LINE N0 53.

        Question q1107 = new Question(R.string.chopai_line53q1,
                R.string.lok, R.string.gun, R.string.sab_4, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1107);
        Question q1108 = new Question(R.string.chopai_line53q2,
                R.string.par_2, R.string.aur, R.string.tej, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1108);
        Question q1109 = new Question(R.string.chopai_line53q3,
                R.string.jag, R.string.ram_5, R.string.ati, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1109);
        Question q1110 = new Question(R.string.chopai_line53q4,
                R.string.tumhara, R.string.chaaron, R.string.tapasvi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1110);
        Question q1111 = new Question(R.string.chopai_line53q5,
                R.string.raja, R.string.sukh, R.string.naam, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1111);

        // CHOPAI LINE N0 54.

        Question q1112 = new Question(R.string.chopai_line54q1,
                R.string.jaana, R.string.tinke, R.string.taahi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1112);
        Question q1113 = new Question(R.string.chopai_line54q2,
                R.string.raja, R.string.kram, R.string.kaaj, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1113);
        Question q1114 = new Question(R.string.chopai_line54q3,
                R.string.sakal, R.string.jaanu, R.string.jagat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1114);
        Question q1115 = new Question(R.string.chopai_line54q4,
                R.string.mam, R.string.tum_5, R.string.sam, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1115);
        Question q1116 = new Question(R.string.chopai_line54q5,
                R.string.aagya, R.string.sugam, R.string.saaja, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1116);

        // CHOPAI LINE N0 55.

        Question q1117 = new Question(R.string.chopai_line55q1,
                R.string.aur, R.string.jas, R.string.asa, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1117);
        Question q1118 = new Question(R.string.chopai_line55q2,
                R.string.sudhaari, R.string.manorath, R.string.raghuvir, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1118);
        Question q1119 = new Question(R.string.chopai_line55q3,
                R.string.ur, R.string.ko, R.string.jo, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1119);
        Question q1120 = new Question(R.string.chopai_line55q4,
                R.string.koi, R.string.ram, R.string.tum, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1120);
        Question q1121 = new Question(R.string.chopai_line55q5,
                R.string.vachan, R.string.laavei_2, R.string.jeevan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1121);

        // CHOPAI LINE N0 56.

        Question q1122 = new Question(R.string.chopai_line56q1,
                R.string.sab, R.string.jam, R.string.soi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1122);
        Question q1123 = new Question(R.string.chopai_line56q2,
                R.string.amit, R.string.sant, R.string.data, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1123);
        Question q1124 = new Question(R.string.chopai_line56q3,
                R.string.laavei, R.string.jeevan, R.string.pratap, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1124);
        Question q1125 = new Question(R.string.chopai_line56q4,
                R.string.mata, R.string.deen, R.string.phal_3, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1125);
        Question q1126 = new Question(R.string.chopai_line56q5,
                R.string.paave, R.string.lahei, R.string.sarna, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1126);

        // CHOPAI LINE N0 57.

        Question q1127 = new Question(R.string.chopai_line57q1,
                R.string.sumirow, R.string.chaaron, R.string.sunavei, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1127);
        Question q1128 = new Question(R.string.chopai_line57q2,
                R.string.par, R.string.jan, R.string.jug, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1128);
        Question q1129 = new Question(R.string.chopai_line57q3,
                R.string.partap, R.string.siddhi, R.string.bhajan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1129);
        Question q1130 = new Question(R.string.chopai_line57q4,
                R.string.tapasvi, R.string.tumhara, R.string.ujiyara, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1130);

        // CHOPAI LINE N0 58.

        Question q1131 = new Question(R.string.chopai_line58q1,
                R.string.jab, R.string.hot, R.string.hai, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1131);
        Question q1132 = new Question(R.string.chopai_line58q2,
                R.string.parsiddha, R.string.brahmaadi, R.string.sugrivahi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1132);
        Question q1133 = new Question(R.string.chopai_line58q3,
                R.string.kaahu, R.string.jagat_2, R.string.aapan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1133);
        Question q1134 = new Question(R.string.chopai_line58q4,
                R.string.hanumat, R.string.kaanpei, R.string.ujiyara, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1134);

        // CHOPAI LINE N0 59.

        Question q1135 = new Question(R.string.chopai_line59q1,
                R.string.sadhu, R.string.aapei, R.string.teeno, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1135);
        Question q1136 = new Question(R.string.chopai_line59q2,
                R.string.amit, R.string.sant, R.string.pasa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1136);
        Question q1137 = new Question(R.string.chopai_line59q3,
                R.string.na, R.string.te, R.string.ke_4, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1137);
        Question q1138 = new Question(R.string.chopai_line59q4,
                R.string.tum_6, R.string.koi, R.string.soi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1138);
        Question q1139 = new Question(R.string.chopai_line59q5,
                R.string.vibhishan, R.string.rakhvaare, R.string.parsiddha, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1139);

        // CHOPAI LINE N0 60.

        Question q1140 = new Question(R.string.chopai_line60q1,
                R.string.dasa, R.string.raho, R.string.asur_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1140);
        Question q1141 = new Question(R.string.chopai_line60q2,
                R.string.nikandan, R.string.chhutahi, R.string.sudhaari, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1141);
        Question q1142 = new Question(R.string.chopai_line60q3,
                R.string.jug, R.string.ram_6, R.string.hai, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1142);
        Question q1143 = new Question(R.string.chopai_line60q4,
                R.string.sumirei, R.string.rasayan, R.string.dulaare, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1143);

        // CHOPAI LINE N0 61.

        Question q1144 = new Question(R.string.chopai_line61q1,
                R.string.ashta, R.string.nikat, R.string.aavei, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1144);
        Question q1145 = new Question(R.string.chopai_line61q2,
                R.string.paavei, R.string.siddhi, R.string.kahaai, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1145);
        Question q1146 = new Question(R.string.chopai_line61q3,
                R.string.sei, R.string.pur, R.string.nau, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1146);
        Question q1147 = new Question(R.string.chopai_line61q4,
                R.string.nidhi, R.string.shree, R.string.japat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1147);
        Question q1148 = new Question(R.string.chopai_line61q5,
                R.string.ki, R.string.ke_5, R.string.jo, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1148);
        Question q1149 = new Question(R.string.chopai_line61q6,
                R.string.jaai, R.string.anta, R.string.data, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1149);

        // CHOPAI LINE N0 62.

        Question q1150 = new Question(R.string.chopai_line62q1,
                R.string.asa_2, R.string.nau, R.string.sat, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1150);
        Question q1151 = new Question(R.string.chopai_line62q2,
                R.string.kar, R.string.bar, R.string.hoi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1151);
        Question q1152 = new Question(R.string.chopai_line62q3,
                R.string.hari, R.string.janm, R.string.deen, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1152);
        Question q1153 = new Question(R.string.chopai_line62q4,
                R.string.janki, R.string.dhyan, R.string.tinke, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1153);
        Question q1154 = new Question(R.string.chopai_line62q5,
                R.string.naai, R.string.mata, R.string.hoye, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1154);

        // CHOPAI LINE N0 63.

        Question q1155 = new Question(R.string.chopai_line63q1,
                R.string.sur, R.string.yah, R.string.ram_7, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1155);
        Question q1156 = new Question(R.string.chopai_line63q2,
                R.string.rasayan, R.string.gurudev, R.string.chalisa, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1156);
        Question q1157 = new Question(R.string.chopai_line63q3,
                R.string.gaurisa, R.string.tumhare_2, R.string.sumirow, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1157);
        Question q1158 = new Question(R.string.chopai_line63q4,
                R.string.nath, R.string.sada, R.string.pasa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1158);

        // CHOPAI LINE N0 64.

        Question q1159 = new Question(R.string.chopai_line64q1,
                R.string.sadaa, R.string.beera, R.string.sakal, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1159);
        Question q1160 = new Question(R.string.chopai_line64q2,
                R.string.baar, R.string.raho, R.string.dera, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1160);
        Question q1161 = new Question(R.string.chopai_line64q3,
                R.string.ramlakhan, R.string.rakhwaare, R.string.raghupati_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1161);
        Question q1162 = new Question(R.string.chopai_line64q4,
                R.string.ke_6, R.string.jo, R.string.ko, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1162);
        Question q1163 = new Question(R.string.chopai_line64q5,
                R.string.mann, R.string.dasa, R.string.jasu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1163);

        // CHOPAI LINE N0 65.

        Question q1164 = new Question(R.string.chopai_line65q1,
                R.string.ujaagar, R.string.hanuman, R.string.tumhare_3, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1164);
        Question q1165 = new Question(R.string.chopai_line65q2,
                R.string.bhajan, R.string.dharai, R.string.karahu, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1165);
        Question q1166 = new Question(R.string.chopai_line65q3,
                R.string.raj, R.string.ram_8, R.string.nij, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1166);
        Question q1167 = new Question(R.string.chopai_line65q4,
                R.string.te, R.string.ur, R.string.ko, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1167);
        Question q1168 = new Question(R.string.chopai_line65q5,
                R.string.paavei, R.string.saakhi, R.string.keejei, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1168);

        // CHOPAI LINE N0 66.

        Question q1169 = new Question(R.string.chopai_line66q1,
                R.string.saaja, R.string.janam, R.string.paave, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1169);
        Question q1170 = new Question(R.string.chopai_line66q2,
                R.string.nidhi, R.string.ashta, R.string.janam_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1170);
        Question q1171 = new Question(R.string.chopai_line66q3,
                R.string.ke_7, R.string.na, R.string.ki, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1171);
        Question q1172 = new Question(R.string.chopai_line66q4,
                R.string.phal, R.string.dukh, R.string.tanu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1172);
        Question q1173 = new Question(R.string.chopai_line66q5,
                R.string.charittra, R.string.vidyavaan, R.string.bisraavei, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1173);

        // CHOPAI LINE N0 67.

        Question q1174 = new Question(R.string.chopai_line67q1,
                R.string.anta, R.string.guru, R.string.dehu, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1174);
        Question q1175 = new Question(R.string.chopai_line67q2,
                R.string.janki, R.string.kaaal, R.string.sadaa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1175);
        Question q1176 = new Question(R.string.chopai_line67q3,
                R.string.nirantar, R.string.shripati, R.string.raghubar_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1176);
        Question q1177 = new Question(R.string.chopai_line67q4,
                R.string.pur, R.string.bal, R.string.jai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1177);
        Question q1178 = new Question(R.string.chopai_line67q5,
                R.string.mohi, R.string.jaai, R.string.gyan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1178);

        // CHOPAI LINE N0 68.

        Question q1179 = new Question(R.string.chopai_line68q1,
                R.string.devta, R.string.kaaal, R.string.jahan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1179);
        Question q1180 = new Question(R.string.chopai_line68q2,
                R.string.janm, R.string.maha, R.string.guni, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1180);
        Question q1181 = new Question(R.string.chopai_line68q3,
                R.string.kaaj, R.string.hari, R.string.sita, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1181);
        Question q1182 = new Question(R.string.chopai_line68q4,
                R.string.sarva, R.string.chitt, R.string.bhakt, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1182);
        Question q1183 = new Question(R.string.chopai_line68q5,
                R.string.kahaai, R.string.hriday, R.string.mangal, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1183);

        // CHOPAI LINE N0 69.

        Question q1184 = new Question(R.string.chopai_line69q1,
                R.string.gun, R.string.aur_3, R.string.lok, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1184);
        Question q1185 = new Question(R.string.chopai_line69q2,
                R.string.jahan, R.string.janam, R.string.devta, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1185);
        Question q1186 = new Question(R.string.chopai_line69q3,
                R.string.chitt, R.string.bhakt, R.string.karai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1186);
        Question q1187 = new Question(R.string.chopai_line69q4,
                R.string.jo, R.string.na_2, R.string.ke, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1187);
        Question q1188 = new Question(R.string.chopai_line69q5,
                R.string.charan, R.string.basahu, R.string.dharai, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1188);

        // CHOPAI LINE N0 70.

        Question q1189 = new Question(R.string.chopai_line70q1,
                R.string.hanumat_2, R.string.ramdoot, R.string.hanuman, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1189);
        Question q1190 = new Question(R.string.chopai_line70q2,
                R.string.aur, R.string.sei, R.string.tej, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1190);
        Question q1191 = new Question(R.string.chopai_line70q3,
                R.string.mitei, R.string.katei, R.string.sarva, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1191);
        Question q1192 = new Question(R.string.chopai_line70q4,
                R.string.sukh_2, R.string.roop, R.string.lank, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1192);
        Question q1193 = new Question(R.string.chopai_line70q5,
                R.string.gosai, R.string.karai, R.string.kripa, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1193);

        // CHOPAI LINE N0 71.

        Question q1194 = new Question(R.string.chopai_line71q1,
                R.string.dayaku, R.string.barnau, R.string.sankat_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1194);
        Question q1195 = new Question(R.string.chopai_line71q2,
                R.string.katei, R.string.paath, R.string.bandi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1195);
        Question q1196 = new Question(R.string.chopai_line71q3,
                R.string.padhe, R.string.mitei, R.string.chera, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1196);
        Question q1197 = new Question(R.string.chopai_line71q4,
                R.string.rog, R.string.bar, R.string.sab_5, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1197);
        Question q1198 = new Question(R.string.chopai_line71q5,
                R.string.peera_2, R.string.haran, R.string.kales, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1198);

        // CHOPAI LINE N0 72.

        Question q1199 = new Question(R.string.chopai_line72q1,
                R.string.ke, R.string.jo_5, R.string.ko, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1199);
        Question q1200 = new Question(R.string.chopai_line72q2,
                R.string.subesaa, R.string.kanchan, R.string.sumirei, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1200);
        Question q1201 = new Question(R.string.chopai_line72q3,
                R.string.hanumat_3, R.string.hanuman, R.string.kunchit, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1201);
        Question q1202 = new Question(R.string.chopai_line72q4,
                R.string.jag, R.string.bal_3, R.string.ati, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1202);
        Question q1203 = new Question(R.string.chopai_line72q5,
                R.string.bhoop, R.string.murti, R.string.beera_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1203);

        // CHOPAI LINE N0 73.

        Question q1204 = new Question(R.string.chopai_line73q1,
                R.string.jai_3, R.string.tum, R.string.mam, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1204);
        Question q1205 = new Question(R.string.chopai_line73q2,
                R.string.ram, R.string.jai_4, R.string.sam, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1205);
        Question q1206 = new Question(R.string.chopai_line73q3,
                R.string.asa, R.string.jas, R.string.jai_5, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1206);
        Question q1207 = new Question(R.string.chopai_line73q4,
                R.string.hanuman_3, R.string.hanumat, R.string.birajai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1207);
        Question q1208 = new Question(R.string.chopai_line73q5,
                R.string.shree, R.string.gosai, R.string.saroj, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1208);

        // CHOPAI LINE N0 74.

        Question q1209 = new Question(R.string.chopai_line74q1,
                R.string.bimal, R.string.mukur, R.string.kripa, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1209);
        Question q1210 = new Question(R.string.chopai_line74q2,
                R.string.karahu, R.string.dayaku, R.string.janike, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1210);
        Question q1211 = new Question(R.string.chopai_line74q3,
                R.string.kaandhe, R.string.gurudev, R.string.chaatur, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1211);
        Question q1212 = new Question(R.string.chopai_line74q4,
                R.string.ur, R.string.ki, R.string.ki, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1212);
        Question q1213 = new Question(R.string.chopai_line74q5,
                R.string.naai, R.string.shri, R.string.kahi, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1213);

        // CHOPAI LINE N0 75.

        Question q1214 = new Question(R.string.chopai_line75q1,
                R.string.te, R.string.jo_6, R.string.na, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1214);
        Question q1215 = new Question(R.string.chopai_line75q2,
                R.string.sab, R.string.jam, R.string.sat, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1215);
        Question q1216 = new Question(R.string.chopai_line75q3,
                R.string.baar, R.string.sake, R.string.juug, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1216);
        Question q1217 = new Question(R.string.chopai_line75q4,
                R.string.chari, R.string.paath, R.string.pavan, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1217);
        Question q1218 = new Question(R.string.chopai_line75q5,
                R.string.par, R.string.jan, R.string.kar, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1218);
        Question q1219 = new Question(R.string.chopai_line75q6,
                R.string.koi_2, R.string.hot, R.string.jab, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1219);

        // CHOPAI LINE N0 76.

        Question q1220 = new Question(R.string.chopai_line76q1,
                R.string.nikandan, R.string.chhutahi, R.string.tulsidas, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1220);
        Question q1221 = new Question(R.string.chopai_line76q2,
                R.string.kales, R.string.kumar, R.string.bandi, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1221);
        Question q1222 = new Question(R.string.chopai_line76q3,
                R.string.mahasukh, R.string.raghubar, R.string.pavansut, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1222);
        Question q1223 = new Question(R.string.chopai_line76q4,
                R.string.koi, R.string.hoi, R.string.soi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1223);

        // CHOPAI LINE N0 77.

        Question q1224 = new Question(R.string.chopai_line77q1,
                R.string.ke, R.string.ki, R.string.jo_7, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1224);
        Question q1225 = new Question(R.string.chopai_line77q2,
                R.string.yah, R.string.jug, R.string.hai, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1225);
        Question q1226 = new Question(R.string.chopai_line77q3,
                R.string.vidya, R.string.padhe, R.string.sagar, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1226);
        Question q1227 = new Question(R.string.chopai_line77q4,
                R.string.sukshma, R.string.hanumat, R.string.hanuman_4, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1227);
        Question q1228 = new Question(R.string.chopai_line77q5,
                R.string.chalisa, R.string.sanhare, R.string.sajivan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1228);

        // CHOPAI LINE N0 78.

        Question q1229 = new Question(R.string.chopai_line78q1,
                R.string.meli, R.string.hoye, R.string.mukh, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1229);
        Question q1230 = new Question(R.string.chopai_line78q2,
                R.string.atulit, R.string.buddhi, R.string.siddhi_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1230);
        Question q1231 = new Question(R.string.chopai_line78q3,
                R.string.saakhi, R.string.dhamaa, R.string.anjani, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1231);
        Question q1232 = new Question(R.string.chopai_line78q4,
                R.string.jiyaaye, R.string.gaurisa, R.string.harashi, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1232);

        // CHOPAI LINE N0 79.

        Question q1233 = new Question(R.string.chopai_line79q1,
                R.string.bajrangi, R.string.mahaveer, R.string.tulsidas, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1233);
        Question q1234 = new Question(R.string.chopai_line79q2,
                R.string.sada, R.string.gaye, R.string.jete, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1234);
        Question q1235 = new Question(R.string.chopai_line79q3,
                R.string.tete, R.string.hari, R.string.binu, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1235);
        Question q1236 = new Question(R.string.chopai_line79q4,
                R.string.putra, R.string.tihun, R.string.chera, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1236);

        // CHOPAI LINE N0 80.

        Question q1237 = new Question(R.string.chopai_line80q1,
                R.string.keejei, R.string.bikram, R.string.sumati, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1237);
        Question q1238 = new Question(R.string.chopai_line80q2,
                R.string.nahi, R.string.nath, R.string.sukh, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1238);
        Question q1239 = new Question(R.string.chopai_line80q3,
                R.string.sumati, R.string.naamaa, R.string.hriday, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1239);
        Question q1240 = new Question(R.string.chopai_line80q4,
                R.string.maha, R.string.nahi, R.string.naam, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1240);
        Question q1241 = new Question(R.string.chopai_line80q5,
                R.string.kram, R.string.dera, R.string.raja, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1241);

        // DOHA LINE N0 9.

        Question q1242 = new Question(R.string.doha_line9q1,
                R.string.ramchandra, R.string.buddhiheen, R.string.pavantanay, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1242);
        Question q1243 = new Question(R.string.doha_line9q2,
                R.string.sankat_3, R.string.nivaar, R.string.sumati, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1243);
        Question q1244 = new Question(R.string.doha_line9q3,
                R.string.kapis, R.string.haran, R.string.baran, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1244);

        // DOHA LINE N0 10.

        Question q1245 = new Question(R.string.doha_line10q1,
                R.string.biraaj, R.string.anjani, R.string.mangal, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1245);
        Question q1246 = new Question(R.string.doha_line10q2,
                R.string.murti, R.string.haath, R.string.bajra, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1246);
        Question q1247 = new Question(R.string.doha_line10q3,
                R.string.amit, R.string.roop_4, R.string.sant, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1247);

        // DOHA LINE N0 11.

        Question q1248 = new Question(R.string.doha_line11q1,
                R.string.parsiddha, R.string.rakhwaare, R.string.ramlakhan, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1248);
        Question q1249 = new Question(R.string.doha_line11q2,
                R.string.sita_2, R.string.data, R.string.deen, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1249);
        Question q1250 = new Question(R.string.doha_line11q3,
                R.string.sangi, R.string.sahit, R.string.saaje, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1250);

        // DOHA LINE N0 12.

        Question q1251 = new Question(R.string.doha_line12q1,
                R.string.dhwaja, R.string.sankar, R.string.hriday_2, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1251);
        Question q1252 = new Question(R.string.doha_line12q2,
                R.string.basahu, R.string.kaanan, R.string.nandan, 1, Question.DIFFICULTY_HARD);
        addQuestion(q1252);
        Question q1253 = new Question(R.string.doha_line12q3,
                R.string.nau, R.string.sur, R.string.pur, 2, Question.DIFFICULTY_HARD);
        addQuestion(q1253);
        Question q1254 = new Question(R.string.doha_line12q4,
                R.string.suvan, R.string.moonj, R.string.bhoop, 3, Question.DIFFICULTY_HARD);
        addQuestion(q1254);

        // Hanuman Chalisa Sampurn.

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














