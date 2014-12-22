
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineShowHandler;

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
