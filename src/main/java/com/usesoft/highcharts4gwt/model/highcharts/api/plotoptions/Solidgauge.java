
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Gauge;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeShowHandler;

public interface Solidgauge
    extends Gauge
{


    void addSolidgaugeAfterAnimateHandler(SolidgaugeAfterAnimateHandler solidgaugeAfterAnimateHandler);

    void addSolidgaugeCheckboxClickHandler(SolidgaugeCheckboxClickHandler solidgaugeCheckboxClickHandler);

    void addSolidgaugeClickHandler(SolidgaugeClickHandler solidgaugeClickHandler);

    void addSolidgaugeHideHandler(SolidgaugeHideHandler solidgaugeHideHandler);

    void addSolidgaugeLegendItemClickHandler(SolidgaugeLegendItemClickHandler solidgaugeLegendItemClickHandler);

    void addSolidgaugeMouseOutHandler(SolidgaugeMouseOutHandler solidgaugeMouseOutHandler);

    void addSolidgaugeMouseOverHandler(SolidgaugeMouseOverHandler solidgaugeMouseOverHandler);

    void addSolidgaugeShowHandler(SolidgaugeShowHandler solidgaugeShowHandler);

}
