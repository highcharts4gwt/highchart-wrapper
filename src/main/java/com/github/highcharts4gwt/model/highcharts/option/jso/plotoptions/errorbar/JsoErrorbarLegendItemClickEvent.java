
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.errorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.ErrorbarLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoErrorbarLegendItemClickEvent
    extends NativeEvent
    implements ErrorbarLegendItemClickEvent
{


    protected JsoErrorbarLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
