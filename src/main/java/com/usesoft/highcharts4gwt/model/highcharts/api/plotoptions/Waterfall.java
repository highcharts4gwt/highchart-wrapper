
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallShowHandler;

public interface Waterfall
    extends Column
{


    void addWaterfallAfterAnimateHandler(WaterfallAfterAnimateHandler waterfallAfterAnimateHandler);

    void addWaterfallCheckboxClickHandler(WaterfallCheckboxClickHandler waterfallCheckboxClickHandler);

    void addWaterfallClickHandler(WaterfallClickHandler waterfallClickHandler);

    void addWaterfallHideHandler(WaterfallHideHandler waterfallHideHandler);

    void addWaterfallLegendItemClickHandler(WaterfallLegendItemClickHandler waterfallLegendItemClickHandler);

    void addWaterfallMouseOutHandler(WaterfallMouseOutHandler waterfallMouseOutHandler);

    void addWaterfallMouseOverHandler(WaterfallMouseOverHandler waterfallMouseOverHandler);

    void addWaterfallShowHandler(WaterfallShowHandler waterfallShowHandler);

    String lineColor();

    Waterfall lineColor(String lineColor);

    String upColor();

    Waterfall upColor(String upColor);

}
