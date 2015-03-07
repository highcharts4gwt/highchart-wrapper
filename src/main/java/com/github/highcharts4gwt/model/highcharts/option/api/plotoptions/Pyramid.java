
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.Tooltip;

public interface Pyramid {


    boolean allowPointSelect();

    Pyramid allowPointSelect(boolean allowPointSelect);

    String borderColor();

    Pyramid borderColor(String borderColor);

    double borderWidth();

    Pyramid borderWidth(double borderWidth);

    ArrayString centerAsArrayString();

    Pyramid centerAsArrayString(ArrayString centerAsArrayString);

    ArrayNumber centerAsArrayNumber();

    Pyramid centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    ArrayString colors();

    Pyramid colors(ArrayString colors);

    String cursor();

    Pyramid cursor(String cursor);

    DataLabels dataLabels();

    Pyramid dataLabels(DataLabels dataLabels);

    double depth();

    Pyramid depth(double depth);

    boolean enableMouseTracking();

    Pyramid enableMouseTracking(boolean enableMouseTracking);

    void addPyramidAfterAnimateHandler(PyramidAfterAnimateHandler pyramidAfterAnimateHandler);

    void addPyramidCheckboxClickHandler(PyramidCheckboxClickHandler pyramidCheckboxClickHandler);

    void addPyramidClickHandler(PyramidClickHandler pyramidClickHandler);

    void addPyramidHideHandler(PyramidHideHandler pyramidHideHandler);

    void addPyramidLegendItemClickHandler(PyramidLegendItemClickHandler pyramidLegendItemClickHandler);

    void addPyramidMouseOutHandler(PyramidMouseOutHandler pyramidMouseOutHandler);

    void addPyramidMouseOverHandler(PyramidMouseOverHandler pyramidMouseOverHandler);

    void addPyramidShowHandler(PyramidShowHandler pyramidShowHandler);

    double heightAsNumber();

    Pyramid heightAsNumber(double heightAsNumber);

    String heightAsString();

    Pyramid heightAsString(String heightAsString);

    String linkedTo();

    Pyramid linkedTo(String linkedTo);

    double minSize();

    Pyramid minSize(double minSize);

    Point point();

    Pyramid point(Point point);

    boolean reversed();

    Pyramid reversed(boolean reversed);

    boolean selected();

    Pyramid selected(boolean selected);

    boolean shadowAsBoolean();

    Pyramid shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Pyramid shadowAsJsonString(String shadowAsJsonString);

    boolean showInLegend();

    Pyramid showInLegend(boolean showInLegend);

    double slicedOffset();

    Pyramid slicedOffset(double slicedOffset);

    States states();

    Pyramid states(States states);

    boolean stickyTracking();

    Pyramid stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Pyramid tooltip(Tooltip tooltip);

    boolean visible();

    Pyramid visible(boolean visible);

    double widthAsNumber();

    Pyramid widthAsNumber(double widthAsNumber);

    String widthAsString();

    Pyramid widthAsString(String widthAsString);

    String zoneAxis();

    Pyramid zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Pyramid zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Pyramid setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
