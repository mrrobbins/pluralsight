package com.github.mrrobbins.pluralsight.kotlin.java;

import com.github.mrrobbins.pluralsight.kotlin.kotlin.Meeting;
import com.github.mrrobbins.pluralsight.kotlin.kotlin.MeetingException;

public class Program {

    public static void main(String[] args) {
        Meeting board = new Meeting("Monday Board Meeting");

        board.setLocation("London");

        board.description = "New Chairman vote";

        System.out.println("The meeting is in " + board.getLocation());

        // have to access kotlin companion objects through the companion object
        System.out.println(Meeting.Companion.getSOME_CONST1());

        System.out.println(Meeting.SOME_CONST2);

        System.out.println(Meeting.getSomeConst3());

        try {
            board.addAttendee("");
        } catch (MeetingException e) {
            e.printStackTrace();
        }

    }

}
