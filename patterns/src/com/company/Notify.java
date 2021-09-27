package com.company;
import java.util.ArrayList;

class Notify implements Subject{

    private String NotifyName;
    private ArrayList<Observer> followers;

    public Notify(String NotifyName) {
        this.NotifyName = NotifyName;
        followers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obs) {
        followers.add(obs);
        System.out.println(obs + " started to follow " + NotifyName);
    }

    @Override
    public void unregister(Observer obs) {
        followers.remove(obs);
        System.out.println(obs + " unfollowed " + NotifyName);
    }

    @Override
    public void notifyAllObserversPost(String post) {
        for(Observer follower : followers)
        {
            follower.update(NotifyName, post);
        }
        System.out.println();
    }

    public void post(String post)
    {
        System.out.println("\n" + NotifyName + " has posted: " + post + "\n");
        notifyAllObserversPost(post);
    }

    @Override
    public void notifyAllObserversImg(String img) {
        for(Observer follower : followers)
        {
            follower.update1(NotifyName, img);
        }
        System.out.println();
    }

    public void img(String img)
    {
        System.out.println("\n" + NotifyName + " has post a new photo: " + img + "\n");
        notifyAllObserversImg(img);
    }
}
