package com.codewithty.springudemy;

import org.springframework.stereotype.Component;

@Component
public class CricketCouch implements Couch {

    @Override
    public String getDailyWorkout() {
        return "do bowling to make your hands stronger, do it for 20minutes";
    }

}
