
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;

public interface Labels {


    Array<Item> items();

    Labels items(Array<Item> items);

    String style();

    Labels style(String styleAsJsonString);

}
