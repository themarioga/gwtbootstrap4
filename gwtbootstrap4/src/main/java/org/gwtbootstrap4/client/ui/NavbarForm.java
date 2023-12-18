package org.gwtbootstrap4.client.ui;

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

import org.gwtbootstrap4.client.ui.base.HasPull;
import org.gwtbootstrap4.client.ui.base.form.AbstractForm;
import org.gwtbootstrap4.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap4.client.ui.constants.FloatCSS;
import org.gwtbootstrap4.client.ui.constants.NavbarPull;
import org.gwtbootstrap4.client.ui.constants.Styles;

/**
 * @author Sven Jacobs
 * @see Navbar
 */
public class NavbarForm extends AbstractForm implements HasPull {

    public NavbarForm() {
        setStyleName(Styles.NAVBAR_FORM);
    }

    @Override
    public void setPull(final FloatCSS aFloatCSS) {
        final NavbarPull navbarPull;

        if (aFloatCSS == FloatCSS.LEFT_XS) {
            navbarPull = NavbarPull.LEFT;
        } else {
            navbarPull = NavbarPull.RIGHT;
        }

        StyleHelper.addUniqueEnumStyleName(this, NavbarPull.class, navbarPull);
    }

    @Override
    public FloatCSS getPull() {
        final NavbarPull navbarPull = NavbarPull.fromStyleName(getStyleName());

        if (navbarPull == NavbarPull.NONE) {
            return FloatCSS.NONE_XS;
        }

        return navbarPull == NavbarPull.RIGHT ? FloatCSS.RIGHT_XS : FloatCSS.LEFT_XL;
    }
}
