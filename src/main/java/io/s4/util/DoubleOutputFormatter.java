/*
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 	        http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License. See accompanying LICENSE file. 
 */
package io.s4.util;

import io.s4.processor.OutputFormatter;

import org.apache.log4j.Logger;

public class DoubleOutputFormatter implements OutputFormatter {

    @Override
    public Object format(Object outputValue) {
        double doubleResult = 0.0;

        if (outputValue instanceof Double) {
            return outputValue;
        }

        try {
            doubleResult = ((Number) outputValue).doubleValue(); // outputValue
                                                                 // better be
                                                                 // convertible!!
        } catch (Exception e) {
            Logger.getLogger("s4")
                  .error("Exception converting value to double", e);
            return null;
        }
        return doubleResult;
    }

}
