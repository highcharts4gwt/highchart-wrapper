
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoTreemapLegendItemClickEvent
    extends NativeEvent
    implements TreemapLegendItemClickEvent
{


    protected JsoTreemapLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
