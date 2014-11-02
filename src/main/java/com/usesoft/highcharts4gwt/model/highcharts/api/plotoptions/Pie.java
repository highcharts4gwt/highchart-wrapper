
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;

public interface Pie
    extends Series
{


    String borderColor();

    Pie borderColor(String borderColor);

    Number borderWidth();

    Pie borderWidth(Number borderWidth);

    ArrayString center();

    Pie center(ArrayString center);

    Number depth();

    Pie depth(Number depth);

    Number endAngle();

    Pie endAngle(Number endAngle);

    boolean ignoreHiddenPoint();

    Pie ignoreHiddenPoint(boolean ignoreHiddenPoint);

    String innerSizeAsString();

    Pie innerSizeAsString(String innerSizeAsString);

    Number innerSizeAsNumber();

    Pie innerSizeAsNumber(Number innerSizeAsNumber);

    Number minSize();

    Pie minSize(Number minSize);

    String sizeAsString();

    Pie sizeAsString(String sizeAsString);

    Number sizeAsNumber();

    Pie sizeAsNumber(Number sizeAsNumber);

    Number slicedOffset();

    Pie slicedOffset(Number slicedOffset);

    Number startAngle();

    Pie startAngle(Number startAngle);

}
