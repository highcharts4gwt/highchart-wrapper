
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;

public interface Navigation {


    ButtonOptions buttonOptions();

    Navigation buttonOptions(ButtonOptions buttonOptions);

    String menuItemHoverStyle();

    Navigation menuItemHoverStyle(String menuItemHoverStyleAsJsonString);

    String menuItemStyle();

    Navigation menuItemStyle(String menuItemStyleAsJsonString);

    String menuStyle();

    Navigation menuStyle(String menuStyleAsJsonString);

}
