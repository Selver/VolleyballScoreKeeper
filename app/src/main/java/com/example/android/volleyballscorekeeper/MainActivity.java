package com.example.android.volleyballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.volleyballscorekeeper.R;

public class MainActivity extends AppCompatActivity {
    static final String STATE_SCOREHOME = "scoreHome";
    static final String STATE_SCOREVISITOR = "scoreVisitor";
    static final String STATE_SCORESETSWONHOME = "setsWonHome";
    static final String STATE_SCORESETSWONVISITOR = "setsWonVisitor";
    static final String STATE_SCOREHOMESET1 = "scoreHomeSet1";
    static final String STATE_SCOREVISITORSET1 = "scoreVisitorSet1";
    static final String STATE_SCOREHOMESET2 = "scoreHomeSet2";
    static final String STATE_SCOREVISITORSET2 = "scoreVisitorSet2";
    static final String STATE_SCOREHOMESET3 = "scoreHomeSet3";
    static final String STATE_SCOREVISITORSET3 = "scoreVisitorSet3";
    static final String STATE_SCOREHOMESET4 = "scoreHomeSet4";
    static final String STATE_SCOREVISITORSET4 = "scoreVisitorSet4";
    static final String STATE_SCOREHOMESET5 = "scoreHomeSet5";
    static final String STATE_SCOREVISITORSET5 = "scoreVisitorSet5";

    int scoreHome = 0;
    int scoreVisitor = 0;
    int setsWonHome = 0;
    int setsWonVisitor = 0;
    int scoreHomeSet1 = 0;
    int scoreVisitorSet1 = 0;
    int scoreHomeSet2 = 0;
    int scoreVisitorSet2 = 0;
    int scoreHomeSet3 = 0;
    int scoreVisitorSet3 = 0;
    int scoreHomeSet4 = 0;
    int scoreVisitorSet4 = 0;
    int scoreHomeSet5 = 0;
    int scoreVisitorSet5 = 0;
    private TextView scoreViewHome;
    private TextView scoreViewVisitor;
    private TextView scoreViewSetsWonHome;
    private TextView scoreViewSetsWonVisitor;
    private TextView scoreViewHomeSet1;
    private TextView scoreViewVisitorSet1;
    private TextView scoreViewHomeSet2;
    private TextView scoreViewVisitorSet2;
    private TextView scoreViewHomeSet3;
    private TextView scoreViewVisitorSet3;
    private TextView scoreViewHomeSet4;
    private TextView scoreViewVisitorSet4;
    private TextView scoreViewHomeSet5;
    private TextView scoreViewVisitorSet5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewHome = findViewById(R.id.home_score);
        scoreViewVisitor = findViewById(R.id.visitor_score);
        scoreViewSetsWonHome = findViewById(R.id.home_sets_won);
        scoreViewSetsWonVisitor = findViewById(R.id.visitor_sets_won);
        scoreViewHomeSet1 = findViewById(R.id.home_score_set1);
        scoreViewVisitorSet1 = findViewById(R.id.visitor_score_set1);
        scoreViewHomeSet2 = findViewById(R.id.home_score_set2);
        scoreViewVisitorSet2 = findViewById(R.id.visitor_score_set2);
        scoreViewHomeSet3 = findViewById(R.id.home_score_set3);
        scoreViewVisitorSet3 = findViewById(R.id.visitor_score_set3);
        scoreViewHomeSet4 = findViewById(R.id.home_score_set4);
        scoreViewVisitorSet4 = findViewById(R.id.visitor_score_set4);
        scoreViewHomeSet5 = findViewById(R.id.home_score_set5);
        scoreViewVisitorSet5 = findViewById(R.id.visitor_score_set5);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCOREHOME, scoreHome);
        savedInstanceState.putInt(STATE_SCOREVISITOR, scoreVisitor);
        savedInstanceState.putInt(STATE_SCORESETSWONHOME, setsWonHome);
        savedInstanceState.putInt(STATE_SCORESETSWONVISITOR, setsWonVisitor);
        savedInstanceState.putInt(STATE_SCOREHOMESET1, scoreHomeSet1);
        savedInstanceState.putInt(STATE_SCOREVISITORSET1, scoreVisitorSet1);
        savedInstanceState.putInt(STATE_SCOREHOMESET2, scoreHomeSet2);
        savedInstanceState.putInt(STATE_SCOREVISITORSET2, scoreVisitorSet2);
        savedInstanceState.putInt(STATE_SCOREHOMESET3, scoreHomeSet3);
        savedInstanceState.putInt(STATE_SCOREVISITORSET3, scoreVisitorSet3);
        savedInstanceState.putInt(STATE_SCOREHOMESET4, scoreHomeSet4);
        savedInstanceState.putInt(STATE_SCOREVISITORSET4, scoreVisitorSet4);
        savedInstanceState.putInt(STATE_SCOREHOMESET5, scoreHomeSet5);
        savedInstanceState.putInt(STATE_SCOREVISITORSET5, scoreVisitorSet5);


        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreHome = savedInstanceState.getInt(STATE_SCOREHOME);
        scoreVisitor = savedInstanceState.getInt(STATE_SCOREVISITOR);
        setsWonHome = savedInstanceState.getInt(STATE_SCORESETSWONHOME);
        setsWonVisitor = savedInstanceState.getInt(STATE_SCORESETSWONVISITOR);
        scoreHomeSet1 = savedInstanceState.getInt(STATE_SCOREHOMESET1);
        scoreVisitorSet1 = savedInstanceState.getInt(STATE_SCOREVISITORSET1);
        scoreHomeSet2 = savedInstanceState.getInt(STATE_SCOREHOMESET2);
        scoreVisitorSet2 = savedInstanceState.getInt(STATE_SCOREVISITORSET2);
        scoreHomeSet3 = savedInstanceState.getInt(STATE_SCOREHOMESET3);
        scoreVisitorSet3 = savedInstanceState.getInt(STATE_SCOREVISITORSET3);
        scoreHomeSet4 = savedInstanceState.getInt(STATE_SCOREHOMESET4);
        scoreVisitorSet4 = savedInstanceState.getInt(STATE_SCOREVISITORSET4);
        scoreHomeSet5 = savedInstanceState.getInt(STATE_SCOREHOMESET5);
        scoreVisitorSet5 = savedInstanceState.getInt(STATE_SCOREVISITORSET5);

        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
        displaySetsWonForHome(setsWonHome);
        displaySetsWonForVisitor(setsWonVisitor);
        displayScoreForHomeSet1(scoreHomeSet1);
        displayScoreForVisitorSet1(scoreVisitorSet1);
        displayScoreForHomeSet2(scoreHomeSet2);
        displayScoreForVisitorSet2(scoreVisitorSet2);
        displayScoreForHomeSet3(scoreHomeSet3);
        displayScoreForVisitorSet3(scoreVisitorSet3);
        displayScoreForHomeSet4(scoreHomeSet4);
        displayScoreForVisitorSet4(scoreVisitorSet4);
        displayScoreForHomeSet5(scoreHomeSet5);
        displayScoreForVisitorSet5(scoreVisitorSet5);
    }

    /**
     * This method is called when the main score button is clicked for Home.
     */

    public void addOnePointToHome(View v) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * This method is called when the main score button is clicked for Visitor.
     */

    public void addOnePointToVisitor(View v) {
        scoreVisitor = scoreVisitor + 1;
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the sets won button is clicked for Home.
     */

    public void addOneToSetsWonForHome(View v) {
        setsWonHome = setsWonHome + 1;
        displaySetsWonForHome(setsWonHome);
    }

    /**
     * This method is called when the sets won button is clicked for Visitor.
     */

    public void addOneToSetsWonForVisitor(View v) {
        setsWonVisitor = setsWonVisitor + 1;
        displaySetsWonForVisitor(setsWonVisitor);
    }

    /**
     * This method is called when the set1 button is clicked for Home.
     */

    public void addOneToHomeSet1(View v) {
        scoreHomeSet1 = scoreHomeSet1 + 1;
        displayScoreForHomeSet1(scoreHomeSet1);
    }

    /**
     * This method is called when the set2 button is clicked for Home.
     */

    public void addOneToHomeSet2(View v) {
        scoreHomeSet2 = scoreHomeSet2 + 1;
        displayScoreForHomeSet2(scoreHomeSet2);
    }

    /**
     * This method is called when the set3 button is clicked for Home.
     */

    public void addOneToHomeSet3(View v) {
        scoreHomeSet3 = scoreHomeSet3 + 1;
        displayScoreForHomeSet3(scoreHomeSet3);
    }

    /**
     * This method is called when the set4 button is clicked for Home.
     */

    public void addOneToHomeSet4(View v) {
        scoreHomeSet4 = scoreHomeSet4 + 1;
        displayScoreForHomeSet4(scoreHomeSet4);
    }

    /**
     * This method is called when the set5 button is clicked for Home.
     */

    public void addOneToHomeSet5(View v) {
        scoreHomeSet5 = scoreHomeSet5 + 1;
        displayScoreForHomeSet5(scoreHomeSet5);
    }

    /**
     * This method is called when the set1 button is clicked for Visitor.
     */

    public void addOneToVisitorSet1(View v) {
        scoreVisitorSet1 = scoreVisitorSet1 + 1;
        displayScoreForVisitorSet1(scoreVisitorSet1);
    }

    /**
     * This method is called when the set2 button is clicked for Visitor.
     */

    public void addOneToVisitorSet2(View v) {
        scoreVisitorSet2 = scoreVisitorSet2 + 1;
        displayScoreForVisitorSet2(scoreVisitorSet2);
    }

    /**
     * This method is called when the set3 button is clicked for Visitor.
     */

    public void addOneToVisitorSet3(View v) {
        scoreVisitorSet3 = scoreVisitorSet3 + 1;
        displayScoreForVisitorSet3(scoreVisitorSet3);
    }

    /**
     * This method is called when the set4 button is clicked for Visitor.
     */

    public void addOneToVisitorSet4(View v) {
        scoreVisitorSet4 = scoreVisitorSet4 + 1;
        displayScoreForVisitorSet4(scoreVisitorSet4);
    }

    /**
     * This method is called when the set5 button is clicked for Visitor.
     */

    public void addOneToVisitorSet5(View v) {
        scoreVisitorSet5 = scoreVisitorSet5 + 1;
        displayScoreForVisitorSet5(scoreVisitorSet5);
    }

    /**
     * This method is called when the RESET button is clicked.
     */
    public void resetScore(View v) {
        scoreHome = 0;
        scoreVisitor = 0;
        setsWonHome = 0;
        setsWonVisitor = 0;
        scoreHomeSet1 = 0;
        scoreHomeSet2 = 0;
        scoreHomeSet3 = 0;
        scoreHomeSet4 = 0;
        scoreHomeSet5 = 0;
        scoreVisitorSet1 = 0;
        scoreVisitorSet2 = 0;
        scoreVisitorSet3 = 0;
        scoreVisitorSet4 = 0;
        scoreVisitorSet5 = 0;

        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
        displaySetsWonForHome(setsWonHome);
        displaySetsWonForVisitor(setsWonVisitor);
        displayScoreForHomeSet1(scoreHomeSet1);
        displayScoreForHomeSet2(scoreHomeSet2);
        displayScoreForHomeSet3(scoreHomeSet3);
        displayScoreForHomeSet4(scoreHomeSet4);
        displayScoreForHomeSet5(scoreHomeSet5);
        displayScoreForVisitorSet1(scoreVisitorSet1);
        displayScoreForVisitorSet2(scoreVisitorSet2);
        displayScoreForVisitorSet3(scoreVisitorSet3);
        displayScoreForVisitorSet4(scoreVisitorSet4);
        displayScoreForVisitorSet5(scoreVisitorSet5);
    }

    /**
     * Displays the main score for Home.
     */

    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the main score for Visitor.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays sets won for Home.
     */

    public void displaySetsWonForHome(int num) {
        TextView setsWonForHomeView = (TextView) findViewById(R.id.home_sets_won);
        setsWonForHomeView.setText(String.valueOf(num));
    }

    /**
     * Displays sets won for Visitor.
     */

    public void displaySetsWonForVisitor(int num) {
        TextView setsWonForVisitorView = (TextView) findViewById(R.id.visitor_sets_won);
        setsWonForVisitorView.setText(String.valueOf(num));
    }

    /**
     * Displays set1 score for Home.
     */

    public void displayScoreForHomeSet1(int num) {
        TextView scoreForHomeSet1View = (TextView) findViewById(R.id.home_score_set1);
        scoreForHomeSet1View.setText(String.valueOf(num));
    }

    /**
     * Displays set2 score for Home.
     */

    public void displayScoreForHomeSet2(int num) {
        TextView scoreForHomeSet2View = (TextView) findViewById(R.id.home_score_set2);
        scoreForHomeSet2View.setText(String.valueOf(num));
    }

    /**
     * Displays set3 score for Home.
     */

    public void displayScoreForHomeSet3(int num) {
        TextView scoreForHomeSet3View = (TextView) findViewById(R.id.home_score_set3);
        scoreForHomeSet3View.setText(String.valueOf(num));
    }

    /**
     * Displays set4 score for Home.
     */

    public void displayScoreForHomeSet4(int num) {
        TextView scoreForHomeSet4View = (TextView) findViewById(R.id.home_score_set4);
        scoreForHomeSet4View.setText(String.valueOf(num));
    }

    /**
     * Displays set5 score for Home.
     */

    public void displayScoreForHomeSet5(int num) {
        TextView scoreForHomeSet5View = (TextView) findViewById(R.id.home_score_set5);
        scoreForHomeSet5View.setText(String.valueOf(num));
    }

    /**
     * Displays set1 score for Visitor.
     */

    public void displayScoreForVisitorSet1(int num) {
        TextView scoreForVisitorSet1View = (TextView) findViewById(R.id.visitor_score_set1);
        scoreForVisitorSet1View.setText(String.valueOf(num));
    }

    /**
     * Displays set2 score for Visitor.
     */

    public void displayScoreForVisitorSet2(int num) {
        TextView scoreForVisitorSet2View = (TextView) findViewById(R.id.visitor_score_set2);
        scoreForVisitorSet2View.setText(String.valueOf(num));
    }

    /**
     * Displays set3 score for Visitor.
     */

    public void displayScoreForVisitorSet3(int num) {
        TextView scoreForVisitorSet3View = (TextView) findViewById(R.id.visitor_score_set3);
        scoreForVisitorSet3View.setText(String.valueOf(num));
    }

    /**
     * Displays set4 score for Visitor.
     */

    public void displayScoreForVisitorSet4(int num) {
        TextView scoreForVisitorSet4View = (TextView) findViewById(R.id.visitor_score_set4);
        scoreForVisitorSet4View.setText(String.valueOf(num));
    }

    /**
     * Displays set5 score for Visitor.
     */

    public void displayScoreForVisitorSet5(int num) {
        TextView scoreForVisitorSet5View = (TextView) findViewById(R.id.visitor_score_set5);
        scoreForVisitorSet5View.setText(String.valueOf(num));
    }
}
