/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessonsix;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;

/**
 *
 * @author amith
 */
import javax.swing.*;
import java.awt.*;

public class BarGraphExample extends JFrame {
   public BarGraphExample() {
        initUI();
    }

    private void initUI() {
        DefaultCategoryDataset dataset = createDataset();
        
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar Chart Example", // Chart title
                "Category", // Domain axis label
                "Score", // Range axis label
                dataset, // Data
                PlotOrientation.VERTICAL, // Orientation
                true, // Include legend
                true, // Tooltips
                false // URLs?
        );

        ChartPanel chartPanel = new ChartPanel(barChart);
        // Sets an empty border around the chart for aesthetic reasons
        chartPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(java.awt.Color.white);
        add(chartPanel);
        
        // Frame resized to neatly contain all elements
        // Ensures that the window is correctly sized to accommodate chart
        pack();
        setTitle("Bar Chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(1.0, "Series1", "Category1");
        dataset.addValue(4.0, "Series1", "Category2");
        dataset.addValue(3.0, "Series1", "Category3");
        dataset.addValue(5.0, "Series1", "Category4");

        dataset.addValue(5.0, "Series2", "Category1");
        dataset.addValue(3.0, "Series2", "Category2");
        dataset.addValue(2.0, "Series2", "Category3");
        dataset.addValue(6.0, "Series2", "Category4");
        
        return dataset;
    }
}

