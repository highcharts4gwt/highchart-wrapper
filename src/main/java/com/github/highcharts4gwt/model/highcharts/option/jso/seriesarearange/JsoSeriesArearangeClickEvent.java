
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeClickEvent
    extends NativeEvent
    implements SeriesArearangeClickEvent
{


    protected JsoSeriesArearangeClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
