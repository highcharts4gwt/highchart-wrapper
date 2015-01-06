
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleHideEvent;

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
