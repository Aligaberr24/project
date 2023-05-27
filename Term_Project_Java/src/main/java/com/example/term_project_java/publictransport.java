package com.example.term_project_java;

import java.util.ArrayList;

public abstract class publictransport {

        protected double price;
        protected int no_of_tickets;
        protected String ticket_ID;
        protected ArrayList<String> ticket_class= new ArrayList<>();
        protected double distance;
        protected double route_time;
        protected String destination;
        protected abstract String getroute();
        protected abstract String getduration();

        protected boolean extraluggage()
        {
            return false;
        }


}
