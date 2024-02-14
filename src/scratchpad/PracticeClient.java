package scratchpad;

import patterns.topkelements.KClosestPointsToOrigin;
import patterns.topkelements.Point;

public class PracticeClient {

    public static void main(String[] args) {
        Point[] p = {new Point(1,2), new Point(1,3)};
        System.out.println(KClosestPointsToOrigin.findClosestPoints(p,1));
    }



    }

