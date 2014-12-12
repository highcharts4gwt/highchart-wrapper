
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler;

public interface Line
    extends Series
{


    void addLineAfterAnimateHandler(LineAfterAnimateHandler lineAfterAnimateHandler);

    void addLineCheckboxClickHandler(LineCheckboxClickHandler lineCheckboxClickHandler);

    void addLineClickHandler(LineClickHandler lineClickHandler);

    void addLineHideHandler(LineHideHandler lineHideHandler);

    void addLineLegendItemClickHandler(LineLegendItemClickHandler lineLegendItemClickHandler);

    void addLineMouseOutHandler(LineMouseOutHandler lineMouseOutHandler);

    void addLineMouseOverHandler(LineMouseOverHandler lineMouseOverHandler);

    void addLineShowHandler(LineShowHandler lineShowHandler);

    String step();

    Line step(String step);

}
