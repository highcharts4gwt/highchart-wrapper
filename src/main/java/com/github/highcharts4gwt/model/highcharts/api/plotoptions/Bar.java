
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarShowHandler;

public interface Bar
    extends Column
{


    void addBarAfterAnimateHandler(BarAfterAnimateHandler barAfterAnimateHandler);

    void addBarCheckboxClickHandler(BarCheckboxClickHandler barCheckboxClickHandler);

    void addBarClickHandler(BarClickHandler barClickHandler);

    void addBarHideHandler(BarHideHandler barHideHandler);

    void addBarLegendItemClickHandler(BarLegendItemClickHandler barLegendItemClickHandler);

    void addBarMouseOutHandler(BarMouseOutHandler barMouseOutHandler);

    void addBarMouseOverHandler(BarMouseOverHandler barMouseOverHandler);

    void addBarShowHandler(BarShowHandler barShowHandler);

}
