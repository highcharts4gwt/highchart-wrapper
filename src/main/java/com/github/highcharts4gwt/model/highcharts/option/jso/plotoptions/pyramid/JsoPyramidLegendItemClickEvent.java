
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidLegendItemClickEvent
    extends NativeEvent
    implements PyramidLegendItemClickEvent
{


    protected JsoPyramidLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
