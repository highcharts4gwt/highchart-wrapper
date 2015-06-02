
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarMouseOverEvent
    extends NativeEvent
    implements SeriesErrorbarMouseOverEvent
{


    protected JsoSeriesErrorbarMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
