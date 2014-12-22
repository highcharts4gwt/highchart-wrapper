
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverEvent;

public class MockBubbleMouseOverEvent
    implements BubbleMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
