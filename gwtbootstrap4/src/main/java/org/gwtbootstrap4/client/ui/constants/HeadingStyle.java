package org.gwtbootstrap4.client.ui.constants;

/*
 * #%L
 * GwtBootstrap4
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap4
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

/**
 * @author Joshua Godi
 */
public enum HeadingStyle {
    H1("h1"),
    H2("h2"),
    H3("h3"),
    H4("h4"),
    H5("h5"),
    H6("h6");

    private final String cssClass;

    HeadingStyle(final String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return cssClass;
    }
}