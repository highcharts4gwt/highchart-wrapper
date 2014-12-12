
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeShowHandler;

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
