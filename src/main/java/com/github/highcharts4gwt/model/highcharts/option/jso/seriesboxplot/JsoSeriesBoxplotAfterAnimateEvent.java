
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotAfterAnimateEvent
    extends NativeEvent
    implements SeriesBoxplotAfterAnimateEvent
{


    protected JsoSeriesBoxplotAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
