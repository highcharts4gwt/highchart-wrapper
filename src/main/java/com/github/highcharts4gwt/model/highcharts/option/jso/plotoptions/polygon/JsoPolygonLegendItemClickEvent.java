
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPolygonLegendItemClickEvent
    extends NativeEvent
    implements PolygonLegendItemClickEvent
{


    protected JsoPolygonLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
