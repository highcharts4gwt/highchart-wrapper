
package com.github.highcharts4gwt.model.highcharts.api.exporting.buttons;


public interface ContextButton {


    String align();

    ContextButton align(String align);

    boolean enabled();

    ContextButton enabled(boolean enabled);

    double height();

    ContextButton height(double height);

    String menuItems();

    ContextButton menuItems(String menuItemsAsJsonStringArray);

    String symbol();

    ContextButton symbol(String symbol);

    String symbolFill();

    ContextButton symbolFill(String symbolFill);

    double symbolSize();

    ContextButton symbolSize(double symbolSize);

    String symbolStroke();

    ContextButton symbolStroke(String symbolStroke);

    double symbolStrokeWidth();

    ContextButton symbolStrokeWidth(double symbolStrokeWidth);

    double symbolX();

    ContextButton symbolX(double symbolX);

    double symbolY();

    ContextButton symbolY(double symbolY);

    String text();

    ContextButton text(String text);

    String theme();

    ContextButton theme(String themeAsJsonString);

    String verticalAlign();

    ContextButton verticalAlign(String verticalAlign);

    double width();

    ContextButton width(double width);

    double x();

    ContextButton x(double x);

    double y();

    ContextButton y(double y);

}
