
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;

public class MockPoint
    implements Point
{

    private Series series;
    private double percentage;
    private boolean selected;
    private double x;
    private double y;
    private String categoryAsString;
    private double categoryAsNumber;

    public Series series() {
        return series;
    }

    public double percentage() {
        return percentage;
    }

    public boolean selected() {
        return selected;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public String categoryAsString() {
        return categoryAsString;
    }

    public double categoryAsNumber() {
        return categoryAsNumber;
    }

}
