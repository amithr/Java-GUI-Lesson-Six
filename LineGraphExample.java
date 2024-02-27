/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonsix;

/**
 *
 * @author amith
 */
import javax.swing.*;
import java.awt.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.JFrame;


public class LineGraphExample extends JFrame {
    public LineGraphExample() {
        initUI();
    }
    
    private void initUI() {
        XYSeriesCollection dataset = createDataset();
        JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Line Chart Example", // Chart title
                "X", // X-Axis Label
                "Y", // Y-Axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL,
                true, // Include legend
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();
        
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(java.awt.Color.white);
        add(chartPanel);

        pack();
        setTitle("XY Line Chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private XYSeriesCollection createDataset() {
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);
        series1.add(3.5, 2.8);
        series1.add(4.0, 6.0);

        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, 4.0);
        series2.add(2.0, 5.0);
        series2.add(3.0, 4.5);
        series2.add(3.5, 4.8);
        series2.add(4.0, 7.0);
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
        return dataset;
    }
}