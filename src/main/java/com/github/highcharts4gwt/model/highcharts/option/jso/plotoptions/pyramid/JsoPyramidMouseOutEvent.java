
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidMouseOutEvent
    extends NativeEvent
    implements PyramidMouseOutEvent
{


    protected JsoPyramidMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
