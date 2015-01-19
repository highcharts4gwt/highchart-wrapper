
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallMouseOverEvent
    extends NativeEvent
    implements WaterfallMouseOverEvent
{


    protected JsoWaterfallMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
