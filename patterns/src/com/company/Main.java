package com.company;

public class Main {

    public static void main(String[] args) {
        Notify user1 = new Notify("user1");
        Notify user2 = new Notify("user2");

        Follower follower1 = new Follower("follower1");
        Follower follower2 = new Follower("follower2");
        Follower follower3 = new Follower("follower3");
        Follower follower4 =  new Follower("follower4");
        Follower follower5 = new Follower("follower5");

        user1.register(follower1);
        user1.register(follower2);
        user1.register(follower3);

        user2.register(follower4);
        user2.register(follower5);

        user1.post("It is my Instragam page, follow me");
        user2.post("Hello everyone");
        user1.img("Folder1/Folder2/image.png");

        user1.unregister(follower2);
        user2.unregister(follower5);

        user1.post("Do not unfollow me");
        user2.post("Goodbye everyone");
    }
}
