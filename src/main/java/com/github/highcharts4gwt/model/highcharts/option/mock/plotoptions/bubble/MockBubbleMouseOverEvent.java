
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOverEvent;

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
