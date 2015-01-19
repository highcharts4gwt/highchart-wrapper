
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallMouseOutEvent
    extends NativeEvent
    implements WaterfallMouseOutEvent
{


    protected JsoWaterfallMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
