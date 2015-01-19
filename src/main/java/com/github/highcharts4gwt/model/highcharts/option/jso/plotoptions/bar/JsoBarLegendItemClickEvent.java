
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarLegendItemClickEvent
    extends NativeEvent
    implements BarLegendItemClickEvent
{


    protected JsoBarLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
