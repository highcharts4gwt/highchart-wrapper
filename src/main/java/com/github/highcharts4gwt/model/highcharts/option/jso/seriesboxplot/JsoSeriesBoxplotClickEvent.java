
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotClickEvent
    extends NativeEvent
    implements SeriesBoxplotClickEvent
{


    protected JsoSeriesBoxplotClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
