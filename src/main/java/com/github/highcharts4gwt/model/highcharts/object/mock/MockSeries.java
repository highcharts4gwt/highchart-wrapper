
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;

public class MockSeries
    implements Series
{

    private String name;
    private boolean selected;
    private String type;
    private boolean visible;
    private Chart chart;
    private Axis xAxis;
    private Axis yAxis;

    public String name() {
        return name;
    }

    public boolean selected() {
        return selected;
    }

    public String type() {
        return type;
    }

    public boolean visible() {
        return visible;
    }

    public Chart chart() {
        return chart;
    }

    public Axis xAxis() {
        return xAxis;
    }

    public Axis yAxis() {
        return yAxis;
    }

}
