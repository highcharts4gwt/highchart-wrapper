
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidCheckboxClickEvent
    extends NativeEvent
    implements PyramidCheckboxClickEvent
{


    protected JsoPyramidCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
