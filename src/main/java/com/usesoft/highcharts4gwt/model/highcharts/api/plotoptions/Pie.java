
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowHandler;

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

    void addPieAfterAnimateHandler(PieAfterAnimateHandler pieAfterAnimateHandler);

    void addPieCheckboxClickHandler(PieCheckboxClickHandler pieCheckboxClickHandler);

    void addPieClickHandler(PieClickHandler pieClickHandler);

    void addPieHideHandler(PieHideHandler pieHideHandler);

    void addPieLegendItemClickHandler(PieLegendItemClickHandler pieLegendItemClickHandler);

    void addPieMouseOutHandler(PieMouseOutHandler pieMouseOutHandler);

    void addPieMouseOverHandler(PieMouseOverHandler pieMouseOverHandler);

    void addPieShowHandler(PieShowHandler pieShowHandler);

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
