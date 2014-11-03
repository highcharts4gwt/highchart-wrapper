
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;

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

    double depth();

    Column depth(double depth);

    String edgeColor();

    Column edgeColor(String edgeColor);

    double edgeWidth();

    Column edgeWidth(double edgeWidth);

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
