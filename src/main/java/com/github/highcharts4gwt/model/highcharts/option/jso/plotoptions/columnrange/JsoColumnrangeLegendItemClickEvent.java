
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeLegendItemClickEvent
    extends NativeEvent
    implements ColumnrangeLegendItemClickEvent
{


    protected JsoColumnrangeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
