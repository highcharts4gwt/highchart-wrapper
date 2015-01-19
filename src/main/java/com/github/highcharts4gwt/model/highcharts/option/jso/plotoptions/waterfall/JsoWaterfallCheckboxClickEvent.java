
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallCheckboxClickEvent
    extends NativeEvent
    implements WaterfallCheckboxClickEvent
{


    protected JsoWaterfallCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
