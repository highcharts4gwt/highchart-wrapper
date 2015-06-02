
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarClickEvent
    extends NativeEvent
    implements SeriesErrorbarClickEvent
{


    protected JsoSeriesErrorbarClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
