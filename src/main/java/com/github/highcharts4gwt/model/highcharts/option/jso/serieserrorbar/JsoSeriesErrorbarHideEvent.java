
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarHideEvent
    extends NativeEvent
    implements SeriesErrorbarHideEvent
{


    protected JsoSeriesErrorbarHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
