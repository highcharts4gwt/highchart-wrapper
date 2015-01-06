
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleAfterAnimateEvent;

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
