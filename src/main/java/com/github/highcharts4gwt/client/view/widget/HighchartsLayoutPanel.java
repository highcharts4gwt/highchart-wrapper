package com.github.highcharts4gwt.client.view.widget;

import com.github.highcharts4gwt.client.model.event.ChartRenderedEvent;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;

public class HighchartsLayoutPanel extends SimpleLayoutPanel
{
    private final DelayRenderingTimer timer;
    private final String id;
    private ChartOptions chartOptions;
    private Chart chartObject;
    private EventBus eventBus;
    
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

    private native Chart drawChart(String containerId, ChartOptions options)
    /*-{
        return $wnd.jQuery('#'+containerId).highcharts(options);
    }-*/;

    public void setEventBus(EventBus eventBus)
    {
        this.eventBus = eventBus;
    }

    private class DelayRenderingTimer extends Timer
    {
        @Override
        public void run()
        {
            if (chartOptions != null)
            {
                chartObject = drawChart(id, chartOptions);
                if (eventBus != null)
                    eventBus.fireEvent(new ChartRenderedEvent(chartObject));
            }
        }
    }
}
