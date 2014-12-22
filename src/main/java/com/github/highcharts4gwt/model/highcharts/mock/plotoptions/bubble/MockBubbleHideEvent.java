
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideEvent;

public class MockBubbleHideEvent
    implements BubbleHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}