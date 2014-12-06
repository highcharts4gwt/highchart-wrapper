
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;

public interface Pie
    extends Series
{


    String borderColor();

    Pie borderColor(String borderColor);

    double borderWidth();

    Pie borderWidth(double borderWidth);

    ArrayString centerAsArrayString();

    Pie centerAsArrayString(ArrayString centerAsArrayString);

    ArrayNumber centerAsArrayNumber();

    Pie centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    ArrayString colors();

    Pie colors(ArrayString colors);

    double depth();

    Pie depth(double depth);

    double endAngle();

    Pie endAngle(double endAngle);

    boolean ignoreHiddenPoint();

    Pie ignoreHiddenPoint(boolean ignoreHiddenPoint);

    String innerSizeAsString();

    Pie innerSizeAsString(String innerSizeAsString);

    double innerSizeAsNumber();

    Pie innerSizeAsNumber(double innerSizeAsNumber);

    double minSize();

    Pie minSize(double minSize);

    String sizeAsString();

    Pie sizeAsString(String sizeAsString);

    double sizeAsNumber();

    Pie sizeAsNumber(double sizeAsNumber);

    double slicedOffset();

    Pie slicedOffset(double slicedOffset);

    double startAngle();

    Pie startAngle(double startAngle);

}
