
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowEvent;

public class MockBubbleShowEvent
    implements BubbleShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
