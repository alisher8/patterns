package com.company;

class Follower implements Observer{

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String NotifyName, String post) {
        System.out.println(followerName + " has received "+ NotifyName + "'s post: "+  post);
    }

    @Override
    public void update1(String NotifyName, String img) {
        System.out.println(followerName + " has received "+ NotifyName + "'s img: "+  img);
    }

    @Override
    public String toString() {
        return followerName;
    }
}
