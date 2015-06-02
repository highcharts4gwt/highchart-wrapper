
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotShowEvent
    extends NativeEvent
    implements SeriesBoxplotShowEvent
{


    protected JsoSeriesBoxplotShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
