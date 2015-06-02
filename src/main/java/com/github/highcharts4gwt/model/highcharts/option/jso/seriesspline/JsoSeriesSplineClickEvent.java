
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineClickEvent
    extends NativeEvent
    implements SeriesSplineClickEvent
{


    protected JsoSeriesSplineClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
