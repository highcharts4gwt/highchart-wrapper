
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeClickEvent
    extends NativeEvent
    implements SeriesColumnrangeClickEvent
{


    protected JsoSeriesColumnrangeClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
