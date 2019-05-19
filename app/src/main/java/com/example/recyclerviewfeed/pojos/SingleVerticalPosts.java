package com.example.recyclerviewfeed.pojos;

public class SingleVerticalPosts {

    private int imageProfile;
    private String nameProfile;
    private String timePost;
    private String descPost;
    private int imagePost;
    private String likesPost;
    public SingleVerticalPosts() {

    }

    public SingleVerticalPosts(int imageProfile,
                               String nameProfile,
                               String timePost,
                               String descPost,
                               int imagePost,
                               String likesPost) {

        this.imageProfile = imageProfile;
        this.nameProfile = nameProfile;
        this.timePost = timePost;
        this.descPost = descPost;
        this.imagePost = imagePost;
        this.likesPost = likesPost;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile= imageProfile;
    }

    public String getNameProfile() {
        return nameProfile;
    }

    public void setNameProfile(String nameProfile) {
        this.nameProfile = nameProfile;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost= timePost;
    }

    public String getDescPost() {
        return descPost;
    }

    public void setDescPost(String descPost) {
        this.descPost= descPost;
    }

    public int getImagePost() {
        return imagePost;
    }

    public void setImagePost(int imagePost) {
        this.imagePost= imagePost;
    }

    public String getLikesPost() {
        return likesPost;
    }

    public void setLikesPost(String likesPost) {
        this.likesPost= likesPost;
    }

}
