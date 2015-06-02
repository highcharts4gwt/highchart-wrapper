
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeMouseOverEvent
    extends NativeEvent
    implements SeriesColumnrangeMouseOverEvent
{


    protected JsoSeriesColumnrangeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
