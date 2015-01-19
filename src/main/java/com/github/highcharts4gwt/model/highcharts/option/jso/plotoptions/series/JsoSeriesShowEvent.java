
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesShowEvent
    extends NativeEvent
    implements SeriesShowEvent
{


    protected JsoSeriesShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
