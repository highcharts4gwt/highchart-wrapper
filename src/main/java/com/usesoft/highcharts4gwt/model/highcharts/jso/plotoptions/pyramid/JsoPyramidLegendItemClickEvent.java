
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.pyramid;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidLegendItemClickEvent;

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
