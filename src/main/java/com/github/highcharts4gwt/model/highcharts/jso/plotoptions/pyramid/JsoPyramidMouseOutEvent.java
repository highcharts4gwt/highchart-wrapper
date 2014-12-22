
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidMouseOutEvent
    extends NativeEvent
    implements PyramidMouseOutEvent
{


    protected JsoPyramidMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
