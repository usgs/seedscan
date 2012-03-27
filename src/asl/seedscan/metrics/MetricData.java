/*
 * Copyright 2012, United States Geological Survey or
 * third-party contributors as indicated by the @author tags.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/  >.
 *
 */
package asl.seedscan.metrics;

import asl.seedreader.DataSet;
import asl.metadata.StationData;

import java.util.ArrayList;
import java.util.Hashtable;

public abstract class MetricData
{
    private Hashtable<String, ArrayList<DataSet>> data;
    private Hashtable<String, StationData> metadata;
    private Hashtable<String, String> synthetics;

    public MetricData(Hashtable<String, ArrayList<DataSet>> data, 
                      Hashtable<String, StationData> metadata,
                      Hashtable<String, String> synthetics)
    {
        this.data = data;
        this.metadata = metadata;
        this.synthetics = synthetics;
    }
}

