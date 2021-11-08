package com.example.firstassg.model;

import java.util.ArrayList;
import java.util.List;

public class DA implements Interface{
    ArrayList<world> world =new ArrayList<>();
    ArrayList<champions> champions =new ArrayList<>();
    ArrayList<String> BAinfo =new ArrayList<>();
    ArrayList<String> RMinfo =new ArrayList<>();
    ArrayList<String> CHinfo =new ArrayList<>();
    ArrayList<String> PSinfo =new ArrayList<>();
    ArrayList<String> ACinfo =new ArrayList<>();



    public DA() {
        world.add(new world("2018","France BEAT Croatia (4-2)"));
        world.add(new world("2014","Germany BEAT Argentian (1-0)"));
        world.add(new world("2010","Spain BEAT Netherland (1-0)"));
        world.add(new world("2006","Italy BEAT France (5-3)"));
        world.add(new world("2002","Brazil BEAT Germany (2-0)"));
        world.add(new world("1998","France BEAT Brazil (3-0)"));
        //***********************************
        BAinfo.add("2014-15 Barcelona VS Juventus (3-1)");
        BAinfo.add("2011-11 Barcelona VS Man United (3-1)");
        BAinfo.add("2005-06 Barcelona VS Arsenal (2-1)");
        BAinfo.add("2014-15 Barcelona VS Juventus (3-1)");

        RMinfo.add("Thirteen time by referees HAHAHAHA");

        CHinfo.add("2020-21 Chelsea VS Man City (1-0)");
        CHinfo.add("2011-12 Chelsea VS Bayern Munich (4-3)");

        PSinfo.add("ZEROOOOOO :') ");

        ACinfo.add("2006-07 Milan VS Liverpool (2-1)");
        ACinfo.add("2002-03 Milan VS Juventus (3-2)");
        ACinfo.add("1993-94 Milan VS Barcelona (4-0)");
        ACinfo.add("1989-90 Milan VS Benfica (1-0)");
        ACinfo.add("1988-89 Milan VS FCSB (4-0)");
        ACinfo.add("1968-69 Milan VS Ajax (4-1) ");


        champions.add(new champions("Barcelona",BAinfo));
        champions.add(new champions("Real Madrid",RMinfo));
        champions.add(new champions("Chelsea ",CHinfo));
        champions.add(new champions("paris saint germain  ",PSinfo));
        champions.add(new champions("AC Milan ",ACinfo));



        //champions.add(new champions("Barcelona",));
        //champions.add(new champions("",""));
        //champions.add(new champions("",""));

    }

    @Override
    public List<world> getWorld(String str) {
        ArrayList<world> data = new ArrayList<>();
        for (world w : world)
        {
            if (w.getYear().equals(str))
            {
                data.add(w);
            }
        }
        return data;
    }

    @Override
    public List<champions> getChampions(String str) {
        ArrayList<champions> data = new ArrayList<>();
        for (champions c : champions)
        {
            if (c.getName().equals(str))
            {
                data.add(c);
            }
        }
        return data;
    }

    @Override
    public List<world> getAllWorld() {
        return world;
    }

    @Override
    public List<champions> getAllChampions() {
        return champions;
    }
}
