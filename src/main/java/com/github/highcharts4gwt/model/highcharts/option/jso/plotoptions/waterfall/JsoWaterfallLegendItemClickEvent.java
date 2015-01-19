
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallLegendItemClickEvent
    extends NativeEvent
    implements WaterfallLegendItemClickEvent
{


    protected JsoWaterfallLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
