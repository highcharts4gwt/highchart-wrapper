
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaHideEvent
    extends NativeEvent
    implements SeriesAreaHideEvent
{


    protected JsoSeriesAreaHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
