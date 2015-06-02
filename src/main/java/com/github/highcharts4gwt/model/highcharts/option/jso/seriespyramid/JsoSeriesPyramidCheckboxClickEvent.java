
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.SeriesPyramidCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPyramidCheckboxClickEvent
    extends NativeEvent
    implements SeriesPyramidCheckboxClickEvent
{


    protected JsoSeriesPyramidCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
