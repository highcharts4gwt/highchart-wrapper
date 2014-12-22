
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterShowHandler;

public interface Scatter
    extends Series
{


    void addScatterAfterAnimateHandler(ScatterAfterAnimateHandler scatterAfterAnimateHandler);

    void addScatterCheckboxClickHandler(ScatterCheckboxClickHandler scatterCheckboxClickHandler);

    void addScatterClickHandler(ScatterClickHandler scatterClickHandler);

    void addScatterHideHandler(ScatterHideHandler scatterHideHandler);

    void addScatterLegendItemClickHandler(ScatterLegendItemClickHandler scatterLegendItemClickHandler);

    void addScatterMouseOutHandler(ScatterMouseOutHandler scatterMouseOutHandler);

    void addScatterMouseOverHandler(ScatterMouseOverHandler scatterMouseOverHandler);

    void addScatterShowHandler(ScatterShowHandler scatterShowHandler);

}
