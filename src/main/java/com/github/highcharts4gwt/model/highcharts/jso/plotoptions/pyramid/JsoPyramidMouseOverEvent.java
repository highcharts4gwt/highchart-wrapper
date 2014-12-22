
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidMouseOverEvent
    extends NativeEvent
    implements PyramidMouseOverEvent
{


    protected JsoPyramidMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
