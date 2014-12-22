
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateEvent;

public class MockBubbleAfterAnimateEvent
    implements BubbleAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}