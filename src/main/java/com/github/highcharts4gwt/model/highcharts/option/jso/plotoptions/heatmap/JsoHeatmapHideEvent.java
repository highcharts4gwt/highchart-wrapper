
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoHeatmapHideEvent
    extends NativeEvent
    implements HeatmapHideEvent
{


    protected JsoHeatmapHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
