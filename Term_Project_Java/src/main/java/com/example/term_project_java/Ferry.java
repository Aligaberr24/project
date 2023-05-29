package com.example.term_project_java;

import java.util.ArrayList;
import java.sql.*;

class Ferry extends publictransport{


    protected int FerryID;
    protected ArrayList<String> Stations=new ArrayList<String>();
    protected String Starting_Station;
    protected String Ending_Station;
    protected double FerrySpeed;
    protected int stops;
    protected double LoadTime;
    protected Ferry()
    {
        Stations.add("Egypt");
        Stations.add("France");
        Stations.add("Italy");
        Stations.add("UK");
    }


    protected Boolean onWater() {
        return true;

    }
    protected  String getroute(){return null;}
    protected String getduration(){return null;}


}
