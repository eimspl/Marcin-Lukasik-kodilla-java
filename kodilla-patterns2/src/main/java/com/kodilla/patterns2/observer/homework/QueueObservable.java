package com.kodilla.patterns2.observer.homework;

public interface QueueObservable {
    void registerObserver(MasterObserver observer);
    void notifyObservers();
    void removeObserver(MasterObserver observer);
}