
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;

public interface Legend {


    String align();

    Legend align(String align);

    String backgroundColor();

    Legend backgroundColor(String backgroundColor);

    String borderColor();

    Legend borderColor(String borderColor);

    double borderRadius();

    Legend borderRadius(double borderRadius);

    double borderWidth();

    Legend borderWidth(double borderWidth);

    boolean enabled();

    Legend enabled(boolean enabled);

    boolean floating();

    Legend floating(boolean floating);

    double itemDistance();

    Legend itemDistance(double itemDistance);

    String itemHiddenStyle();

    Legend itemHiddenStyle(String itemHiddenStyleAsJsonString);

    String itemHoverStyle();

    Legend itemHoverStyle(String itemHoverStyleAsJsonString);

    double itemMarginBottom();

    Legend itemMarginBottom(double itemMarginBottom);

    double itemMarginTop();

    Legend itemMarginTop(double itemMarginTop);

    String itemStyle();

    Legend itemStyle(String itemStyleAsJsonString);

    double itemWidth();

    Legend itemWidth(double itemWidth);

    String labelFormat();

    Legend labelFormat(String labelFormat);

    String layout();

    Legend layout(String layout);

    double lineHeight();

    Legend lineHeight(double lineHeight);

    double margin();

    Legend margin(double margin);

    double maxHeight();

    Legend maxHeight(double maxHeight);

    Navigation navigation();

    Legend navigation(Navigation navigation);

    double padding();

    Legend padding(double padding);

    boolean reversed();

    Legend reversed(boolean reversed);

    boolean rtl();

    Legend rtl(boolean rtl);

    boolean shadowAsBoolean();

    Legend shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Legend shadowAsJsonString(String shadowAsJsonString);

    String style();

    Legend style(String styleAsJsonString);

    double symbolHeight();

    Legend symbolHeight(double symbolHeight);

    double symbolPadding();

    Legend symbolPadding(double symbolPadding);

    double symbolRadius();

    Legend symbolRadius(double symbolRadius);

    double symbolWidth();

    Legend symbolWidth(double symbolWidth);

    Title title();

    Legend title(Title title);

    boolean useHTML();

    Legend useHTML(boolean useHTML);

    String verticalAlign();

    Legend verticalAlign(String verticalAlign);

    double width();

    Legend width(double width);

    double x();

    Legend x(double x);

    double y();

    Legend y(double y);

    String getFieldAsJsonObject(String fieldName);

    Legend setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
