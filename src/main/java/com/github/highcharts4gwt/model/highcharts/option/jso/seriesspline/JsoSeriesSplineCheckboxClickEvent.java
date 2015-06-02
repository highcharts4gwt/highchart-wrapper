
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineCheckboxClickEvent
    extends NativeEvent
    implements SeriesSplineCheckboxClickEvent
{


    protected JsoSeriesSplineCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
