package com.example.recyclerviewfeed.pojos;

public class SingleHorizontalGrounds {

    private int imageGround;
    private String gTitle;
    private String gStatus;
    private String gSport;
    private String gLocation;
    public SingleHorizontalGrounds() {

    }

    public SingleHorizontalGrounds(int imageGround,
                                   String gTitle,
                                   String gStatus,
                                   String gSport,
                                   String gLocation) {

        this.imageGround = imageGround;
        this.gTitle = gTitle;
        this.gStatus = gStatus;
        this.gSport = gSport;
        this.gLocation = gLocation;
    }

    public int getImageGround() {
        return imageGround;
    }

    public void setImageGround(int imageGround) {
        this.imageGround = imageGround;
    }

    public String getgTitle() {
        return gTitle;
    }

    public void setgTitle(String gTitle) {
        this.gTitle = gTitle;
    }

    public String getgStatus() {
        return gStatus;
    }

    public void setgStatus(String gStatus) {
        this.gStatus = gStatus;
    }

    public String getgSport() {
        return gSport;
    }

    public void setgSport(String gSport) {
        this.gSport = gSport;
    }

    public String getgLocation() {
        return gLocation;
    }

    public void setgLocation(String gLocation) {
        this.gLocation= gLocation;
    }

}
