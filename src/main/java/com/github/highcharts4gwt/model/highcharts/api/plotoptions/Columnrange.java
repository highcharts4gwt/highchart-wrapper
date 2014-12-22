
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeShowHandler;

public interface Columnrange
    extends Column
{


    void addColumnrangeAfterAnimateHandler(ColumnrangeAfterAnimateHandler columnrangeAfterAnimateHandler);

    void addColumnrangeCheckboxClickHandler(ColumnrangeCheckboxClickHandler columnrangeCheckboxClickHandler);

    void addColumnrangeClickHandler(ColumnrangeClickHandler columnrangeClickHandler);

    void addColumnrangeHideHandler(ColumnrangeHideHandler columnrangeHideHandler);

    void addColumnrangeLegendItemClickHandler(ColumnrangeLegendItemClickHandler columnrangeLegendItemClickHandler);

    void addColumnrangeMouseOutHandler(ColumnrangeMouseOutHandler columnrangeMouseOutHandler);

    void addColumnrangeMouseOverHandler(ColumnrangeMouseOverHandler columnrangeMouseOverHandler);

    void addColumnrangeShowHandler(ColumnrangeShowHandler columnrangeShowHandler);

}
