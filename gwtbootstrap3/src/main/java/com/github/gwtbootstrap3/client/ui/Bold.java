package com.github.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 Sven Jacobs
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

import com.github.gwtbootstrap3.client.ui.base.AbstractTextWidget;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasHTML;

/**
 * Simple {@code <strong>} tag to emphasize words
 *
 * @author Joshua Godi
 */
public class Bold extends AbstractTextWidget implements HasHTML {

    public Bold() {
        super(DOM.createElement("strong"));
    }

    public Bold(String text) {
        this();
        setText(text);
    }

    @Override
    public String getHTML() {
        return getElement().getInnerHTML();
    }

    @Override
    public void setHTML(final String html) {
        getElement().setInnerHTML(html);
    }
}