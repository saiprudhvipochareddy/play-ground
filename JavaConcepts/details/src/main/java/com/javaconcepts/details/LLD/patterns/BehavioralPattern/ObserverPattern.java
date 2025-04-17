package com.javaconcepts.details.LLD.patterns.BehavioralPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ObserverPattern {

  public static void main(String[] args) {
    ScoreTrackerObserver scoreTrackerObserver = new ScoreTrackerObserver();
    OverTrackerObserver overTrackerObserver = new OverTrackerObserver();
    WicketTrackerObserver wicketTrackerObserver = new WicketTrackerObserver();

    /*Add all observers to subject tomorrow if we want to implement
    playerTrackerScore tracker or some this add it to subject
     */
    Subject subject = new ScoreCardSubject();
    subject.addObserver(scoreTrackerObserver);
    subject.addObserver(overTrackerObserver);
    subject.addObserver(wicketTrackerObserver);

    //first ball
    subject.notifyObserver(new TrackerDto(1, 1, 0));
    System.out.println(scoreTrackerObserver.getScore());
    System.out.println(overTrackerObserver.getOvers());
    System.out.println(wicketTrackerObserver.getWickets());
    System.out.println();

    subject.notifyObserver(new TrackerDto(1, 0, 1));
    System.out.println(scoreTrackerObserver.getScore());
    System.out.println(overTrackerObserver.getOvers());
    System.out.println(wicketTrackerObserver.getWickets());
    System.out.println();

    subject.notifyObserver(new TrackerDto(0, 2, 1)); // wide or no ball
    System.out.println(scoreTrackerObserver.getScore());
    System.out.println(overTrackerObserver.getOvers());
    System.out.println(wicketTrackerObserver.getWickets());
    System.out.println();
  }

}

//Model or DTO which have the details of tracking ball
class TrackerDto {
  private int ball;
  private int score;
  private int wicket;

  public TrackerDto(int ball, int score, int wicket) {
    this.ball = ball;
    this.score = score;
    this.wicket = wicket;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getWicket() {
    return wicket;
  }

  public void setWicket(int wicket) {
    this.wicket = wicket;
  }

  public void setBall(int ball) {
    this.ball = ball;
  }

  public int getBall() {
    return ball;
  }
}

//Observer
interface Observer {
  void update(TrackerDto trackerDto);
}

//Subject
interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObserver(TrackerDto trackerDto);
}

class ScoreCardSubject implements Subject {
  private List<Observer> observers;

  public ScoreCardSubject() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObserver(TrackerDto trackerDto) {
    for (Observer observer: observers) {
      observer.update(trackerDto);
    }
  }
}

class OverTrackerObserver implements Observer {
  private int totalBalls;

  @Override
  public void update(TrackerDto trackerDto) {
    this.totalBalls += trackerDto.getBall();
  }

  public String getOvers() {
    return "Over: " + totalBalls / 6 + "." + totalBalls % 6;
  }
}

class WicketTrackerObserver implements Observer {
  private int totalWickets;

  @Override
  public void update(TrackerDto trackerDto) {
    this.totalWickets += trackerDto.getWicket();
  }

  public String getWickets() {
    return "Wickets: " + this.totalWickets;
  }
}

class ScoreTrackerObserver implements Observer {
  private int totalScore;

  @Override
  public void update(TrackerDto trackerDto) {
    this.totalScore += trackerDto.getScore();
  }

  public String getScore() {
    return "Score: " + totalScore;
  }
}
