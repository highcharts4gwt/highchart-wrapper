package com.github.highcharts4gwt.client.view.widget;

import com.github.highcharts4gwt.model.highcharts.api.ChartOptions;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;

public class HighchartsLayoutPanel extends SimpleLayoutPanel
{
    private final DelayRenderingTimer timer;
    private final String id;
    private ChartOptions chartOptions;
    
    public HighchartsLayoutPanel()
    {
        id = HTMLPanel.createUniqueId();
        this.getElement().setId(id);

        timer = new DelayRenderingTimer();
    }

    public void renderChart(ChartOptions options)
    {
        this.chartOptions = options;

        timer.schedule(100); // hack to let the dom the time to render first to have the parent container size...
    }

    private native JavaScriptObject drawChart(String containerId, ChartOptions options)
    /*-{
        return $wnd.jQuery('#'+containerId).highcharts(options);
    }-*/;

    private class DelayRenderingTimer extends Timer
    {
        @Override
        public void run()
        {
            if (chartOptions != null)
            {
                drawChart(id, chartOptions);
            }
        }
    }
}
