package com.company;

interface Subject{
    public void register(Observer obs);
    public void unregister(Observer obs);
    public void notifyAllObserversPost(String p);
    public void notifyAllObserversImg(String i);
}

interface Observer  {
    public void update(String post, String p);
    public void update1(String img, String i);
}



