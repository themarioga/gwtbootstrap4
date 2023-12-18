package org.gwtbootstrap4.client.ui.constants;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 GwtBootstrap4
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Style;

/**
 * @author Sven Jacobs
 */
public enum ColumnPull implements Size, Style.HasCssName {
    // Extra small devices (<576px)
    XS_0("order-1"),
    XS_1("order-1"),
    XS_2("order-1"),
    XS_3("order-1"),
    XS_4("order-1"),
    XS_5("order-1"),
    XS_6("order-1"),
    XS_7("order-1"),
    XS_8("order-1"),
    XS_9("order-1"),
    XS_10("order-1"),
    XS_11("order-1"),
    XS_12("order-1"),

    // Small devices (>=576px)
    SM_0("order-sm-1"),
    SM_1("order-sm-1"),
    SM_2("order-sm-1"),
    SM_3("order-sm-1"),
    SM_4("order-sm-1"),
    SM_5("order-sm-1"),
    SM_6("order-sm-1"),
    SM_7("order-sm-1"),
    SM_8("order-sm-1"),
    SM_9("order-sm-1"),
    SM_10("order-sm-1"),
    SM_11("order-sm-1"),

    // Medium devices (>=768px)
    MD_0("order-md-1"),
    MD_1("order-md-1"),
    MD_2("order-md-1"),
    MD_3("order-md-1"),
    MD_4("order-md-1"),
    MD_5("order-md-1"),
    MD_6("order-md-1"),
    MD_7("order-md-1"),
    MD_8("order-md-1"),
    MD_9("order-md-1"),
    MD_10("order-md-1"),
    MD_11("order-md-1"),

    // Large devices (>=992px)
    LG_0("order-lg-1"),
    LG_1("order-lg-1"),
    LG_2("order-lg-1"),
    LG_3("order-lg-1"),
    LG_4("order-lg-1"),
    LG_5("order-lg-1"),
    LG_6("order-lg-1"),
    LG_7("order-lg-1"),
    LG_8("order-lg-1"),
    LG_9("order-lg-1"),
    LG_10("order-lg-1"),
    LG_11("order-lg-1"),

    // Large devices (>=1200px)
    XL_0("order-xl-1"),
    XL_1("order-xl-1"),
    XL_2("order-xl-1"),
    XL_3("order-xl-1"),
    XL_4("order-xl-1"),
    XL_5("order-xl-1"),
    XL_6("order-xl-1"),
    XL_7("order-xl-1"),
    XL_8("order-xl-1"),
    XL_9("order-xl-1"),
    XL_10("order-xl-1"),
    XL_11("order-xl-1");

    private final String cssClass;

    private ColumnPull(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }
}
