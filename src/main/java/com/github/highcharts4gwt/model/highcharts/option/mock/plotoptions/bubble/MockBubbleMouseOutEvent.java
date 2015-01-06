
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOutEvent;

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
