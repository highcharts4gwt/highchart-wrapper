
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickEvent;

public class MockBubbleClickEvent
    implements BubbleClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
