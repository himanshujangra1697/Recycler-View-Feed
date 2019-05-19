package com.example.recyclerviewfeed.pojos;

public class SingleHorizontalMatches {

    private int imageMatch;
    private int imageTeam1;
    private int imageTeam2;
    private String nameMatch;
    private String nameTeam1;
    private String nameTeam2;
    private String scoreTeam1;
    private String scoreTeam2;
    public SingleHorizontalMatches() {

    }

    public SingleHorizontalMatches(int imageMatch,
            int imageTeam1,
            int imageTeam2,
            String nameMatch,
            String nameTeam1,
            String nameTeam2,
            String scoreTeam1,
            String scoreTeam2) {

        this.imageMatch = imageMatch;
        this.imageTeam1 = imageTeam1;
        this.imageTeam2 = imageTeam2;
        this.nameMatch = nameMatch;
        this.nameTeam1 = nameTeam1;
        this.nameTeam2 = nameTeam2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public int getImageMatch() {
        return imageMatch;
    }

    public void setImageMatch(int imageMatch) {
        this.imageMatch = imageMatch;
    }

    public int getImageTeam1() {
        return imageTeam1;
    }

    public void setImageTeam1(int imageTeam1) { this.imageTeam1 = imageTeam1; }

    public int getImageTeam2() {
        return imageTeam2;
    }

    public void setImageTeam2(int imageTeam2) { this.imageTeam2 = imageTeam2; }

    public String getNameMatch() {
        return nameMatch;
    }

    public void setNameMatch(String nameMatch) {
        this.nameMatch = nameMatch;
    }

    public String getNameTeam1() {
        return nameTeam1;
    }

    public void setNameTeam1(String nameTeam1) {
        this.nameTeam1 = nameTeam1;
    }

    public String getNameTeam2() {
        return nameTeam2;
    }

    public void setNameTeam2(String nameTeam1) {
        this.nameTeam2 = nameTeam2;
    }

    public String getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(String scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public String getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(String scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }

}
