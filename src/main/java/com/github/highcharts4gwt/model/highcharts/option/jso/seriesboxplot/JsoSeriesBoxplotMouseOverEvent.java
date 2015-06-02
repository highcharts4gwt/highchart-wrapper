
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotMouseOverEvent
    extends NativeEvent
    implements SeriesBoxplotMouseOverEvent
{


    protected JsoSeriesBoxplotMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
