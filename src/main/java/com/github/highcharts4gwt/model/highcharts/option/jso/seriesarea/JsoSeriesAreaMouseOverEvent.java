
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaMouseOverEvent
    extends NativeEvent
    implements SeriesAreaMouseOverEvent
{


    protected JsoSeriesAreaMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
