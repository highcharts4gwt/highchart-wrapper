
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallHideEvent
    extends NativeEvent
    implements WaterfallHideEvent
{


    protected JsoWaterfallHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
