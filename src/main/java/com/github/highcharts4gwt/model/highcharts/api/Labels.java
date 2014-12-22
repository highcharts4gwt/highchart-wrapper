
package com.github.highcharts4gwt.model.highcharts.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.api.labels.Item;

public interface Labels {


    Array<Item> items();

    Labels items(Array<Item> items);

    String style();

    Labels style(String styleAsJsonString);

}
