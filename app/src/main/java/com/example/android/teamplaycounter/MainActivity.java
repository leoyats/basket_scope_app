package com.example.android.teamplaycounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int teamAScope = 0;
    public int teamBScope = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView teamACounter = (TextView) findViewById(R.id.teamA_scope);
        teamACounter.setText(String.valueOf(score));
    }

    /**
     *
     * onClick buttons sets to scope for team A
     */

    public void teamAThreeScopeClick (View view) {
        teamAScope = teamAScope + 3;
        displayForTeamA(teamAScope);
    }

    public void teamATwoScopeClick (View view) {
        teamAScope = teamAScope + 2;
        displayForTeamA(teamAScope);
    }

    public void teamAOneScopeClick (View view) {
        teamAScope = teamAScope + 1;
        displayForTeamA(teamAScope);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView teamACounter = (TextView) findViewById(R.id.teamB_scope);
        teamACounter.setText(String.valueOf(score));
    }

    /**
     *
     * onClick buttons sets to scope for team B
     */

    public void teamBThreeScopeClick (View view) {
        teamAScope = teamAScope + 3;
        displayForTeamB(teamAScope);
    }

    public void teamBTwoScopeClick (View view) {
        teamAScope = teamAScope + 2;
        displayForTeamB(teamAScope);
    }

    public void teamBOneScopeClick (View view) {
        teamAScope = teamAScope + 1;
        displayForTeamB(teamAScope);
    }

    public void resetButton(View view) {
        teamAScope = 0;
        teamBScope = 0;
        displayForTeamA(teamAScope);
        displayForTeamB(teamBScope);
    }

}
