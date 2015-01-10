
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;

public class MockSeries
    implements Series
{

    private String name;
    private boolean selected;
    private String type;
    private boolean visible;

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

}
