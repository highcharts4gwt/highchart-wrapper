
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleClickEvent;

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
