
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreaLegendItemClickEvent
    extends NativeEvent
    implements AreaLegendItemClickEvent
{


    protected JsoAreaLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
