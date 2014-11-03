
package com.usesoft.highcharts4gwt.model.highcharts.api.exporting.buttons;

import com.usesoft.highcharts4gwt.model.highcharts.api.navigation.ButtonOptions;

public interface ContextButton
    extends ButtonOptions
{


    String menuItems();

    ContextButton menuItems(String menuItemsAsJsonStringArray);

    String symbol();

    ContextButton symbol(String symbol);

    double x();

    ContextButton x(double x);

}
