
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeCheckboxClickEvent
    extends NativeEvent
    implements SeriesSolidgaugeCheckboxClickEvent
{


    protected JsoSeriesSolidgaugeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
