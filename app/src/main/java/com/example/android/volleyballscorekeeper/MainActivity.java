package com.example.android.volleyballscorekeeper;

import android.graphics.drawable.Drawable;
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
    static final String STATE_YELLOWCARDHOME = "yellowCardHome";
    static final String STATE_YELLOWCARDVISITOR = "yellowCardVisitor";
    static final String STATE_REDCARDHOME = "redCardHome";
    static final String STATE_REDCARDVISITOR = "redCardVisitor";

    int scoreHome = 0;
    int scoreVisitor = 0;
    int setsWonHome = 0;
    int setsWonVisitor = 0;
    int yellowCardHome = 0;
    int yellowCardVisitor = 0;
    int redCardHome = 0;
    int redCardVisitor = 0;

    private TextView scoreViewHome;
    private TextView scoreViewVisitor;
    private TextView scoreViewSetsWonHome;
    private TextView scoreViewSetsWonVisitor;
    private TextView yellowCardHomeView;
    private TextView yellowCardVisitorView;
    private TextView redCardHomeView;
    private TextView redCardVisitorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewHome = findViewById(R.id.home_score);
        scoreViewVisitor = findViewById(R.id.visitor_score);
        scoreViewSetsWonHome = findViewById(R.id.home_sets_won);
        scoreViewSetsWonVisitor = findViewById(R.id.visitor_sets_won);
        yellowCardHomeView = findViewById(R.id.yellow_card_home);
        yellowCardVisitorView = findViewById(R.id.yellow_card_visitor);
        redCardHomeView = findViewById(R.id.red_card_home);
        redCardVisitorView = findViewById(R.id.red_card_visitor);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCOREHOME, scoreHome);
        savedInstanceState.putInt(STATE_SCOREVISITOR, scoreVisitor);
        savedInstanceState.putInt(STATE_SCORESETSWONHOME, setsWonHome);
        savedInstanceState.putInt(STATE_SCORESETSWONVISITOR, setsWonVisitor);
        savedInstanceState.putInt(STATE_YELLOWCARDHOME, yellowCardHome);
        savedInstanceState.putInt(STATE_YELLOWCARDVISITOR, yellowCardVisitor);
        savedInstanceState.putInt(STATE_REDCARDHOME, redCardHome);
        savedInstanceState.putInt(STATE_REDCARDVISITOR, redCardVisitor);

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
        yellowCardHome = savedInstanceState.getInt(STATE_YELLOWCARDHOME);
        yellowCardVisitor = savedInstanceState.getInt(STATE_YELLOWCARDVISITOR);
        redCardHome = savedInstanceState.getInt(STATE_REDCARDHOME);
        redCardVisitor = savedInstanceState.getInt(STATE_REDCARDVISITOR);

        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
        displaySetsWonForHome(setsWonHome);
        displaySetsWonForVisitor(setsWonVisitor);
        displayYellowCardHome(yellowCardHome);
        displayYellowCardVisitor(yellowCardVisitor);
        displayRedCardHome(redCardHome);
        displayRedCardVisitor(redCardVisitor);
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
     * This method is called when the yellow card button is clicked for Home.
     */
    public void addOneToYellowCardsForHome(View v) {
        yellowCardHome = yellowCardHome + 1;
        displayYellowCardHome(yellowCardHome);
    }

    /**
     * This method is called when the yellow card button is clicked for Visitor.
     */
    public void addOneToYellowCardsForVisitor(View v) {
        yellowCardVisitor = yellowCardVisitor + 1;
        displayYellowCardVisitor(yellowCardVisitor);
    }

    /**
     * This method is called when the red card button is clicked for Home.
     */
    public void addOneToRedCardsForHome(View v) {
        redCardHome = redCardHome + 1;
        displayRedCardHome(redCardHome);
    }

    /**
     * This method is called when the red card button is clicked for Visitor.
     */
    public void addOneToRedCardsForVisitor(View v) {
        redCardVisitor = redCardVisitor + 1;
        displayRedCardVisitor(redCardVisitor);
    }

    /**
     * This method is called when the RESET score button is clicked.
     */
    public void resetScore(View v) {
        scoreHome = 0;
        scoreVisitor = 0;

        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
    }

    /**
     * This method is called when the RESET all button is clicked.
     */
    public void resetAll(View v) {
        scoreHome = 0;
        scoreVisitor = 0;
        setsWonHome = 0;
        setsWonVisitor = 0;
        yellowCardHome = 0;
        yellowCardVisitor = 0;
        redCardHome = 0;
        redCardVisitor = 0;

        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);
        displaySetsWonForHome(setsWonHome);
        displaySetsWonForVisitor(setsWonVisitor);
        displayYellowCardHome(yellowCardHome);
        displayYellowCardVisitor(yellowCardVisitor);
        displayRedCardHome(redCardHome);
        displayRedCardVisitor(redCardVisitor);
    }

    /**
     * Displays the main score for Home.
     */

    public void displayForHome(int score) {
        scoreViewHome.setText(String.valueOf(score));
    }

    /**
     * Displays the main score for Visitor.
     */
    public void displayForVisitor(int score) {
        scoreViewVisitor.setText(String.valueOf(score));
    }

    /**
     * Displays sets won for Home.
     */

    public void displaySetsWonForHome(int num) {
        scoreViewSetsWonHome.setText(String.valueOf(num));
    }

    /**
     * Displays sets won for Visitor.
     */

    public void displaySetsWonForVisitor(int num) {
        scoreViewSetsWonVisitor.setText(String.valueOf(num));
    }

    /**
     * Displays yellow card for Home.
     */

    public void displayYellowCardHome(int num) {
        yellowCardHomeView.setText(String.valueOf(num));
    }

    /**
     * Displays yellow card for Visitor.
     */

    public void displayYellowCardVisitor(int num) {
        yellowCardVisitorView.setText(String.valueOf(num));
    }

    /**
     * Displays red card for Home.
     */

    public void displayRedCardHome(int num) {
        redCardHomeView.setText(String.valueOf(num));
    }

    /**
     * Displays red card for Visitor.
     */

    public void displayRedCardVisitor(int num) {
        redCardVisitorView.setText(String.valueOf(num));
    }

}
