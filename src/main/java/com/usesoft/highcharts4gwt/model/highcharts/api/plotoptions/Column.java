
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnShowHandler;

public interface Column
    extends Series
{


    String borderColor();

    Column borderColor(String borderColor);

    double borderRadius();

    Column borderRadius(double borderRadius);

    double borderWidth();

    Column borderWidth(double borderWidth);

    boolean colorByPoint();

    Column colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Column colors(ArrayString colors);

    double depth();

    Column depth(double depth);

    String edgeColor();

    Column edgeColor(String edgeColor);

    double edgeWidth();

    Column edgeWidth(double edgeWidth);

    void addColumnAfterAnimateHandler(ColumnAfterAnimateHandler columnAfterAnimateHandler);

    void addColumnCheckboxClickHandler(ColumnCheckboxClickHandler columnCheckboxClickHandler);

    void addColumnClickHandler(ColumnClickHandler columnClickHandler);

    void addColumnHideHandler(ColumnHideHandler columnHideHandler);

    void addColumnLegendItemClickHandler(ColumnLegendItemClickHandler columnLegendItemClickHandler);

    void addColumnMouseOutHandler(ColumnMouseOutHandler columnMouseOutHandler);

    void addColumnMouseOverHandler(ColumnMouseOverHandler columnMouseOverHandler);

    void addColumnShowHandler(ColumnShowHandler columnShowHandler);

    double groupPadding();

    Column groupPadding(double groupPadding);

    double groupZPadding();

    Column groupZPadding(double groupZPadding);

    boolean grouping();

    Column grouping(boolean grouping);

    double minPointLength();

    Column minPointLength(double minPointLength);

    double pointPadding();

    Column pointPadding(double pointPadding);

    double pointRange();

    Column pointRange(double pointRange);

    double pointWidth();

    Column pointWidth(double pointWidth);

}
