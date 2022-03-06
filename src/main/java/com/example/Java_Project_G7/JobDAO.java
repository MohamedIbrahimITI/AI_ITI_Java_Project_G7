package com.example.Java_Project_G7;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public interface JobDAO {


    public void readcsv();

    public void displayHeader();

    public void dfStructure();

    public void dataSummary();

    public void removeDuplicate();

    public void removeNull();

    public void count_jobs_company();

    public void most_demanding_comp();





}
