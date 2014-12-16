
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutEvent;

public class MockBubbleMouseOutEvent
    implements BubbleMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
