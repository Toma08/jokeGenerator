package com.example.jokes;

public class Joke {
    public String jokeText;
    public String jokeType;
    public Joke(String jokeText, String jokeType){
        this.jokeText=jokeText;
        this.jokeType=jokeType;
    }

    public String getJokeText(){
      return jokeText;
    }
    public String getJokeType(){
        return jokeType;
    }
    public void setJokeText(String jokeText){
        this.jokeText=jokeText;
    }
    public void setJokeType(String jokeType){
        this.jokeType=jokeType;
    }
}
