
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineMouseOverEvent
    extends NativeEvent
    implements SeriesLineMouseOverEvent
{


    protected JsoSeriesLineMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
