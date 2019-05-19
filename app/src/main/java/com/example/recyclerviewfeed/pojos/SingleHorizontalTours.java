package com.example.recyclerviewfeed.pojos;

public class SingleHorizontalTours {

    private int imageTour;
    private String tTitle;
    private String tStatus;
    private String tSport;
    private String tLocation;
    public SingleHorizontalTours() {

    }

    public SingleHorizontalTours(int imageTour,
                                   String tTitle,
                                   String tStatus,
                                   String tSport,
                                   String tLocation) {

        this.imageTour = imageTour;
        this.tTitle = tTitle;
        this.tStatus = tStatus;
        this.tSport = tSport;
        this.tLocation = tLocation;
    }

    public int getImageTour() {
        return imageTour;
    }

    public void setImageTour(int imageTour) {
        this.imageTour = imageTour;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String gettStatus() {
        return tStatus;
    }

    public void settStatus(String tStatus) {
        this.tStatus = tStatus;
    }

    public String gettSport() {
        return tSport;
    }

    public void settSport(String tSport) {
        this.tSport = tSport;
    }

    public String gettLocation() {
        return tLocation;
    }

    public void setgtocation(String tLocation) {
        this.tLocation= tLocation;
    }

}
