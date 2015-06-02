
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineHideEvent
    extends NativeEvent
    implements SeriesLineHideEvent
{


    protected JsoSeriesLineHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
