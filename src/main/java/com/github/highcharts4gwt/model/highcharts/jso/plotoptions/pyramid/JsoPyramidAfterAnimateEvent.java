
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidAfterAnimateEvent
    extends NativeEvent
    implements PyramidAfterAnimateEvent
{


    protected JsoPyramidAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
