
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieMouseOverEvent
    extends NativeEvent
    implements PieMouseOverEvent
{


    protected JsoPieMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
